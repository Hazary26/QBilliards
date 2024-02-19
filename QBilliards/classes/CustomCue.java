package classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class CustomCue extends JFrame implements ActionListener {

    private JComboBox<String> cueComboBox;
    private JComboBox<String> tipComboBox;
    private JComboBox<String> gripComboBox;
    private JComboBox<String> extensionComboBox;
    private JLabel cueLabel, tipLabel, gripLabel, extensionLabel, lbl1;
    JButton generateButton, back;
    ImageIcon img;

    public CustomCue() {
        setTitle("CREATE YOUR CUSTOM CUE!");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1366,800);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(11, 2));
        panel.setBackground(new Color(81, 131, 153));
    

        JLabel subtitleLabel = new JLabel("CREATE YOUR CUSTOM CUE!");
        subtitleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        panel.add(subtitleLabel);
        panel.add(new JLabel());

        cueLabel = new JLabel("          CUE:");
        cueLabel.setFont(new Font("Rockwell", Font.BOLD, 18));
        cueLabel.setOpaque(true);
        cueLabel.setBackground(Color.WHITE);
        cueLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panel.add(cueLabel);

        String[] cueItems = {"Select", "Diamond d4", "Thiba 2b", "prediator 43", "Mesh e7", "Leadsuper", "None"};
        cueComboBox = new JComboBox<>(cueItems);
        styleComboBox(cueComboBox, 200, 30);
        panel.add(cueComboBox);

        tipLabel = new JLabel("          TIP:");
        tipLabel.setFont(new Font("Rockwell", Font.BOLD, 18));
        tipLabel.setOpaque(true);
        tipLabel.setBackground(Color.WHITE);
        tipLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panel.add(tipLabel);

        String[] tipItems = {"Select", "Camui 2", "Camui Clear", "Camui Sharp", "Xiguan x1", "Xiguan Clear", "None"};
        tipComboBox = new JComboBox<>(tipItems);
        styleComboBox(tipComboBox, 200, 30);
        panel.add(tipComboBox);

        gripLabel = new JLabel("          GRIP:");
        gripLabel.setFont(new Font("Rockwell", Font.BOLD, 18));
        gripLabel.setOpaque(true);
        gripLabel.setBackground(Color.WHITE);
        gripLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panel.add(gripLabel);

        String[] gripItems = {"Select", "Mixica Grip", "Blended Grip", "OverStuck Grip", "None"};
        gripComboBox = new JComboBox<>(gripItems);
        styleComboBox(gripComboBox, 200, 30);
        panel.add(gripComboBox);

        extensionLabel = new JLabel("          CUE EXTENSION:");
        extensionLabel.setFont(new Font("Rockwell", Font.BOLD, 18));
        extensionLabel.setOpaque(true);
        extensionLabel.setBackground(Color.WHITE);
        extensionLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panel.add(extensionLabel);

        String[] extensionItems = {"Select", "MetalWood", "BinsatWood", "CharWood", "None"};
        extensionComboBox = new JComboBox<>(extensionItems);
        styleComboBox(extensionComboBox, 200, 30);
        panel.add(extensionComboBox);

        generateButton = new JButton("Get Print Out");
        generateButton.setFont(new Font("Rockwell", Font.BOLD, 20));
        generateButton.addActionListener(e -> Customcue());
        generateButton.setToolTipText("Click to generate custom cue");
        panel.add(generateButton);

        back = new JButton("Back");
        back.setFont(new Font("Rockwell", Font.BOLD, 20));
        back.addActionListener(this);
        back.setToolTipText("Go back to the main page");
        panel.add(back);

        add(panel);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void styleComboBox(JComboBox<String> comboBox, int width, int height) {
        comboBox.setFont(new Font("Rockwell", Font.BOLD, 18));
        comboBox.setPreferredSize(new Dimension(width, height));
        comboBox.setBackground(Color.PINK);
    }

    private void Customcue() {
        String selectedCue = (String) cueComboBox.getSelectedItem();
        String selectedTip = (String) tipComboBox.getSelectedItem();
        String selectedGrip = (String) gripComboBox.getSelectedItem();
        String selectedExtension = (String) extensionComboBox.getSelectedItem();

        if ("Select".equals(selectedCue) || "Select".equals(selectedTip) || "Select".equals(selectedGrip) || "Select".equals(selectedExtension)) {
            JOptionPane.showMessageDialog(this, "Please select a valid option for all fields.", "Invalid Selection", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String configurationText = getGeneratedConfiguration();

        JOptionPane optionPane = new JOptionPane("Your Customize Cue:\n" + configurationText,
                JOptionPane.INFORMATION_MESSAGE);
        JDialog dialog = optionPane.createDialog("Custom Cue Configuration");
        dialog.setSize(700, 700);
        dialog.setVisible(true);

        writeConfigurationToFile(configurationText);
    }

    private void writeConfigurationToFile(String configurationText) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("data/customcue.txt"));
            writer.write(configurationText);
            writer.close();
            JOptionPane.showMessageDialog(this, "Configuration saved to customcue.txt");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error saving configuration to file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    private String getGeneratedConfiguration() {
        return "CUE: " + cueComboBox.getSelectedItem() +
                "\nTIP: " + tipComboBox.getSelectedItem() +
                "\nGRIP: " + gripComboBox.getSelectedItem() +
                "\nExtension: " + extensionComboBox.getSelectedItem();
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == back) {
            Uhome obj1 = new Uhome();
            obj1.setVisible(true);
            this.setVisible(false);
        }
    }
}
