package classes;

import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class UserInfoFrame extends JFrame {

    private JTable userTable;

    public UserInfoFrame() {
        setTitle("User Information");
        setSize(800, 600);  // Increased size for better visibility

        // Create column names
        String[] columnNames = {"Username", "Password"};

        // Create the table model
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);

        // Read user information from the text file and populate the table model
        readUserDataFromFile("data/data.txt", tableModel);

        // Create the JTable
        userTable = new JTable(tableModel);

        // Set the background color of the JTable to pink
        userTable.setBackground(Color.PINK);

        // Add the table to a JScrollPane
        JScrollPane scrollPane = new JScrollPane(userTable);

        // Create a delete button
        JButton deleteButton = new JButton("Delete");
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = userTable.getSelectedRow();
                if (selectedRow != -1) {
                    // Remove the selected row from the table
                    tableModel.removeRow(selectedRow);

                    // Update the text file by saving the modified data
                    saveUserDataToFile("data/./data.txt", tableModel);
                } else {
                    JOptionPane.showMessageDialog(UserInfoFrame.this, "Please select a row to delete.");
                }
            }
        });

        // Create a back button
        JButton backButton = new JButton("Back");
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle the back button click (navigate back to Ahome class)
                dispose(); // Close the current frame
                Ahome ahome = new Ahome();
                ahome.setVisible(true);
            }
        });

        // Create a panel to hold the buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(deleteButton);
        buttonPanel.add(backButton);

        // Create a panel to hold the table
        JPanel tablePanel = new JPanel(new BorderLayout());
        tablePanel.add(scrollPane, BorderLayout.CENTER);

        // Create a main panel to hold both the button panel and the table panel
        JPanel mainPanel = new JPanel(new GridLayout(1, 2));  // GridLayout with 1 row and 2 columns
        mainPanel.add(buttonPanel);
        mainPanel.add(tablePanel);

        // Add the main panel to the content pane
        getContentPane().add(mainPanel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private void readUserDataFromFile(String filePath, DefaultTableModel tableModel) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Split the line into fields (assuming tab-separated values)
                String[] fields = line.split("\t");

                // Add a new row to the table model with the fields
                tableModel.addRow(fields);
            }
        } catch (IOException e) {
            e.printStackTrace();
            // Handle the exception appropriately
        }
    }

    private void saveUserDataToFile(String filePath, DefaultTableModel tableModel) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (int row = 0; row < tableModel.getRowCount(); row++) {
                for (int col = 0; col < tableModel.getColumnCount(); col++) {
                    writer.write(tableModel.getValueAt(row, col).toString());
                    if (col < tableModel.getColumnCount() - 1) {
                        writer.write("\t");
                    }
                }
                writer.write("\n");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
            // Handle the exception appropriately
        }
    }
}
