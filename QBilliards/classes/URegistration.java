package classes;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class URegistration extends JFrame implements ActionListener {
    JPanel panel;
    JLabel firstNameLabel, lastNameLabel, userLabel, phoneLabel, emailLabel, passLabel, retypePassLabel;
    JTextField firstNameField, lastNameField, userField, phoneField, emailField;
    JPasswordField passField, retypePassField;
    JButton signBtn, exitBtn, backbtn, logobtn;
    Color color1;

    public URegistration() {
        super("Registration");
        this.setBounds(0, 0, 1366, 768);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        color1 = new Color(25, 118, 211);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(color1);

        JLabel label2 = new JLabel("Welcome to QBilliards");
        label2.setBounds(250, 30, 800, 80);
        label2.setFont(new Font("Segoe UI", Font.BOLD, 50));
        label2.setForeground(Color.WHITE);
        panel.add(label2);

        JLabel label3 = new JLabel("Cue the thrill,pocket the skill");
        label3.setBounds(250, 80, 500, 60);
        label3.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        label3.setForeground(Color.WHITE);
        panel.add(label3);

        firstNameLabel = new JLabel("First Name");
        firstNameLabel.setBounds(250, 180, 100, 30);
        firstNameLabel.setBackground(new Color(255, 140, 0)); // Orange color
        firstNameLabel.setOpaque(true);
        firstNameLabel.setForeground(Color.WHITE);
        panel.add(firstNameLabel);

        firstNameField = new JTextField();
        firstNameField.setBounds(350, 180, 350, 30);
        panel.add(firstNameField);

        lastNameLabel = new JLabel("Last Name");
        lastNameLabel.setBounds(250, 230, 100, 30);
        lastNameLabel.setBackground(new Color(255, 140, 0)); // Orange color
        lastNameLabel.setOpaque(true);
        lastNameLabel.setForeground(Color.WHITE);
        panel.add(lastNameLabel);

        lastNameField = new JTextField();
        lastNameField.setBounds(350, 230, 350, 30);
        panel.add(lastNameField);

        userLabel = new JLabel("Username");
        userLabel.setBounds(250, 280, 100, 30);
        userLabel.setBackground(new Color(255, 140, 0)); // Orange color
        userLabel.setOpaque(true);
        userLabel.setForeground(Color.WHITE);
        panel.add(userLabel);

        userField = new JTextField();
        userField.setBounds(350, 280, 350, 30);
        panel.add(userField);

        phoneLabel = new JLabel("Phone Number");
        phoneLabel.setBounds(250, 330, 120, 30);
        phoneLabel.setBackground(new Color(255, 140, 0)); // Orange color
        phoneLabel.setOpaque(true);
        phoneLabel.setForeground(Color.WHITE);
        panel.add(phoneLabel);

        phoneField = new JTextField();
        phoneField.setBounds(350, 330, 350, 30);
        panel.add(phoneField);

        emailLabel = new JLabel("Email");
        emailLabel.setBounds(250, 380, 100, 30);
        emailLabel.setBackground(new Color(255, 140, 0)); // Orange color
        emailLabel.setOpaque(true);
        emailLabel.setForeground(Color.WHITE);
        panel.add(emailLabel);

        emailField = new JTextField();
        emailField.setBounds(350, 380, 350, 30);
        panel.add(emailField);

        passLabel = new JLabel("Password");
        passLabel.setBounds(250, 430, 100, 30);
        passLabel.setBackground(new Color(255, 140, 0)); // Orange color
        passLabel.setOpaque(true);
        passLabel.setForeground(Color.WHITE);
        panel.add(passLabel);

        passField = new JPasswordField();
        passField.setBounds(350, 430, 350, 30);
        panel.add(passField);

        retypePassLabel = new JLabel("Re-type Password");
        retypePassLabel.setBounds(250, 480, 150, 30);
        retypePassLabel.setBackground(new Color(255, 140, 0)); // Orange color
        retypePassLabel.setOpaque(true);
        retypePassLabel.setForeground(Color.WHITE);
        panel.add(retypePassLabel);

        retypePassField = new JPasswordField();
        retypePassField.setBounds(400, 480, 300, 30);
        panel.add(retypePassField);

        signBtn = new JButton("Signup");
        signBtn.setBounds(480, 550, 120, 40);
        signBtn.setBackground(new Color(255, 140, 0)); // Orange color
        signBtn.setForeground(Color.WHITE);
        signBtn.addActionListener(this);
        panel.add(signBtn);

        exitBtn = new JButton("Exit");
        exitBtn.setBounds(610, 550, 120, 40);
        exitBtn.setBackground(new Color(255, 140, 0)); // Orange color
        exitBtn.setForeground(Color.WHITE);
        exitBtn.addActionListener(this);
        panel.add(exitBtn);

        logobtn = new JButton();
        logobtn.setIcon(new ImageIcon("image/rsz_logo.png"));
        logobtn.setBounds(0, 0,150,150);
        logobtn.setContentAreaFilled(false);
        logobtn.setBorderPainted(false);
		panel.add(logobtn);

        backbtn = new JButton("Back");
		backbtn.setBounds(1200,100,80,30);
		backbtn.setBackground(new Color(255, 140, 0)); // Orange color
		backbtn.setForeground(Color.WHITE);
		backbtn.addActionListener(this);
		panel.add(backbtn);

        this.add(panel);
    }
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == signBtn) {
            String firstName = firstNameField.getText();
            String lastName = lastNameField.getText();
            String username = userField.getText();
            String phoneNumber = phoneField.getText();
            String email = emailField.getText();
            String password = passField.getText();
            String retypePassword = retypePassField.getText();

            if (firstName.isEmpty() || lastName.isEmpty() || username.isEmpty() || phoneNumber.isEmpty()
                    || email.isEmpty() || password.isEmpty() || retypePassword.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Fill All");
            } else {
                // Add your account creation logic here
                UAccount acc= new UAccount(username,password);
				acc.addaccount();
                JOptionPane.showMessageDialog(this, "Added");

                firstNameField.setText("");
                lastNameField.setText("");
                userField.setText("");
                phoneField.setText("");
                emailField.setText("");
                passField.setText("");
                retypePassField.setText("");

                ULogin obj1 = new ULogin();
                obj1.setVisible(true);
                this.setVisible(false);
            }
        } else if(ae.getSource() == backbtn){
            ULogin log =new ULogin();
            this.setVisible(false);
            log.setVisible(true);
        }
        
        else if (ae.getSource() == exitBtn) {
            System.exit(0);
        }

    }

    
}
