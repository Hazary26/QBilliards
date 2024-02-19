package classes;
import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class AdminInfoFrame extends JFrame {

    private JTable adminTable;

    public AdminInfoFrame() {
        setTitle("Admin Information");
        setSize(1366, 800); 
        String[] columnNames = {"Username", "Password"};
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
        readAdminDataFromFile("data/./admindata.txt", tableModel);
        adminTable = new JTable(tableModel);
        adminTable.setBackground(Color.PINK);
        JScrollPane scrollPane = new JScrollPane(adminTable);
        JButton deleteButton = new JButton("Delete");
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = adminTable.getSelectedRow();
                if (selectedRow != -1) {
                    tableModel.removeRow(selectedRow);
                    saveAdminDataToFile("data/./admin_data.txt", tableModel);
                } else {
                    JOptionPane.showMessageDialog(AdminInfoFrame.this, "Please select a row to delete.");
                }
            }
        });

        JButton backButton = new JButton("Back");
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); 
                Ahome ahome = new Ahome();
                ahome.setVisible(true);
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(deleteButton);
        buttonPanel.add(backButton);
        JPanel tablePanel = new JPanel(new BorderLayout());
        tablePanel.add(scrollPane, BorderLayout.CENTER);
        JPanel mainPanel = new JPanel(new GridLayout(1, 2));
        mainPanel.add(buttonPanel);
        mainPanel.add(tablePanel);
        getContentPane().add(mainPanel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private void readAdminDataFromFile(String filePath, DefaultTableModel tableModel) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split("\t");
                tableModel.addRow(fields);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void saveAdminDataToFile(String filePath, DefaultTableModel tableModel) {
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
        }
    }
}
