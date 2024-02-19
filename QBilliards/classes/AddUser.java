package classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddUser extends JFrame implements ActionListener {
    JPanel panel;
    JLabel label2, userLabel, passLabel, firstNameLabel, secondNameLabel, religionLabel, retypePassLabel;
    JTextField firstNameField, secondNameField, religionField, captchaField, userfield;
    JPasswordField passField, retypePassField;
    JButton signBtn, backbtn;
    Color color1;

    public AddUser() {
        super("Add User");
        this.setBounds(0, 0, 1366, 768);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        color1 = new Color(25, 118, 211);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(color1);

        label2 = new JLabel("Welcome to QBilliards");
        label2.setBounds(200, 30, 800, 80);
        label2.setFont(new Font("Segoe UI", Font.BOLD, 50));
        label2.setForeground(Color.WHITE);
        panel.add(label2);

        firstNameLabel = new JLabel("First Name");
        firstNameLabel.setBounds(250, 150, 100, 30); 
        firstNameLabel.setForeground(Color.WHITE);
        panel.add(firstNameLabel);

        firstNameField = new JTextField();
        firstNameField.setBounds(350, 150, 350, 30);
        panel.add(firstNameField);

        secondNameLabel = new JLabel("Second Name");
        secondNameLabel.setBounds(250, 200, 120, 30); 
        secondNameLabel.setForeground(Color.WHITE);
        panel.add(secondNameLabel);

        secondNameField = new JTextField();
        secondNameField.setBounds(350, 200, 350, 30);
        panel.add(secondNameField);

        religionLabel = new JLabel("Religion");
        religionLabel.setBounds(250, 250, 80, 30);
        religionLabel.setForeground(Color.WHITE);
        panel.add(religionLabel);

        religionField = new JTextField();
        religionField.setBounds(350, 250, 350, 30);
        panel.add(religionField);

        userLabel = new JLabel("USER");
        userLabel.setBounds(250, 300, 80, 30);
        userLabel.setBackground(new Color(255, 140, 0)); 
        userLabel.setOpaque(true);
        userLabel.setForeground(Color.WHITE);
        panel.add(userLabel);

        userfield = new JTextField();
        userfield.setBounds(350, 300, 350, 30);
        panel.add(userfield);

        passLabel = new JLabel("Password");
        passLabel.setBounds(250, 350, 100, 30); 
        passLabel.setBackground(new Color(255, 140, 0)); 
        passLabel.setForeground(Color.WHITE);
        passLabel.setOpaque(true);
        panel.add(passLabel);

        passField = new JPasswordField();
        passField.setBounds(350, 350, 350, 30);
        panel.add(passField);

        retypePassLabel = new JLabel("Retype Password");
        retypePassLabel.setBounds(250, 400, 150, 30);
        retypePassLabel.setBackground(new Color(255, 140, 0));
        retypePassLabel.setForeground(Color.WHITE);
        retypePassLabel.setOpaque(true);
        panel.add(retypePassLabel);

        retypePassField = new JPasswordField();
        retypePassField.setBounds(400, 400, 300, 30);
        panel.add(retypePassField);

        signBtn = new JButton("Add");
        signBtn.setBounds(450, 520, 120, 40); 
        signBtn.setBackground(new Color(255, 140, 0));
        signBtn.setForeground(Color.WHITE);
        signBtn.addActionListener(this);
        panel.add(signBtn);

        backbtn = new JButton("Back");
        backbtn.setBounds(600, 520, 120, 40); 
        backbtn.setBackground(new Color(255, 140, 0)); 
        backbtn.setForeground(Color.WHITE);
        backbtn.addActionListener(this);
        panel.add(backbtn);

        this.add(panel);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == signBtn) {
            String firstName = firstNameField.getText();
            String secondName = secondNameField.getText();
            String religion = religionField.getText();
            String password = passField.getText();
            String retypePassword = retypePassField.getText();
            String captcha = captchaField.getText();

            if (firstName.isEmpty() || secondName.isEmpty() || religion.isEmpty() || password.isEmpty()
                    || retypePassword.isEmpty() || captcha.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Fill All");
            } else {
                if (!password.equals(retypePassword)) {
                    JOptionPane.showMessageDialog(this, "Passwords do not match");
                    return;
                }
                String name=userfield.getText();
			    String pass=passField.getText();
                JOptionPane.showMessageDialog(this, "Added");
                UAccount acc= new UAccount(name,pass);
				acc.addaccount();
                firstNameField.setText("");
                secondNameField.setText("");
                religionField.setText("");
                passField.setText("");
                userfield.setText("");
                retypePassField.setText("");
            }
        } else if (ae.getSource() == backbtn) {
            Ahome home = new Ahome();
			this.setVisible(false);
			home.setVisible(true);
        }
    }
}
