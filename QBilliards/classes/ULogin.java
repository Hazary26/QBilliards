package classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ULogin extends JFrame implements ActionListener
{
	
	JPanel panel;
	JLabel user,pass ,name1, name2, name3, name4, name6, name8, name9, name99,lbl1;
	JTextField text,txt2;
	JPasswordField passfield, pf;
	JButton login,signup;
	ButtonGroup bt1;
	JCheckBox c1;
	ImageIcon image , img;
	
	JButton jb, btn1,btn2,btn3;
	Color color1;
	Font f1, f2, f3, f4;
	public ULogin()
	{
		super("Login Page");
		this.setBounds(0,0,1366,768);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		color1 = new Color(19, 134, 78);
		
		
		panel=new JPanel();
		panel.setLayout(null);

		
		ImageIcon img = new ImageIcon("image/rsz_logo.png");
		this.setIconImage(img.getImage());
		
		img = new ImageIcon("image/uloginpage.jpg");
		lbl1= new JLabel(img);
		lbl1.setBounds(0,0,1366,768);
		panel.add(lbl1);
		
		name1 = new JLabel("WELCOME TO Q-Billiard");
		name1.setBounds(450,70,600,80);
		f1 = new Font("Rockwell",Font.BOLD, 40);
		name1.setFont(f1);
		name1.setForeground(Color.BLACK); 
		panel.add(name1);
		
		name2 = new JLabel("USER LOGIN");
		name2.setBounds(600,150,200,60);
		f2 = new Font("Rockwell", Font.BOLD, 25);
		name2.setFont(f2);
		name2.setForeground(Color.BLACK);
		panel.add(name2);
		


		name3 = new JLabel("User Name");
		name3.setBounds(450,280,300,40);
		f3 = new Font("Rockwell", Font.BOLD, 20);
		name3.setFont(f3);
		panel.add(name3);

		text = new JTextField();
		text.setBounds(580,285,300,40);
		panel.add(text);
		
		name4 = new JLabel("Password");
		name4.setBounds(450,350,300,40);
		f4 = new Font("Rockwell", Font.BOLD, 20);
		name4.setFont(f4);
		panel.add(name4);
		
		
		passfield = new JPasswordField();
		passfield.setBounds(580,350,300,40);
		passfield.setEchoChar('*');
		panel.add(passfield);

		
		name6 = new JLabel("Don't have an account?");
		name6.setBounds(590 ,530,300,40);
		panel.add(name6);
		
		signup = new JButton("Signup");
		signup.setBounds(620 ,530,300,40);
		signup.setBorder(BorderFactory.createEmptyBorder(4,4,4,4));
		signup.setContentAreaFilled(false);
		signup.setBackground(Color.WHITE);
		signup.setForeground(Color.BLACK);
		f1 = new Font("Rockwell", Font.BOLD, 15);
		signup.addActionListener(this);
		signup.setFont(f1);
		panel.add(signup);
		
		btn2 = new JButton("BACK");
		btn2.setBounds(450,600,170,40);
		btn2.setBackground(Color.BLACK);
		btn2.setForeground(Color.WHITE);
		f1 = new Font("Rockwell", Font.BOLD,25);
		btn2.addActionListener(this);
		btn2.setFont(f1);
		panel.add(btn2);
		
		btn3 = new JButton("EXIT");
		btn3.setBounds(717,600,170,40);
		btn3.setBackground(Color.BLACK);
		btn3.setForeground(Color.WHITE);
		f1 = new Font("Rockwell", Font.BOLD,25);
		btn3.setFont(f1);
		btn3.addActionListener(this);
		panel.add(btn3);
		
		
		login = new JButton("Login");
		login.setBounds(520 ,460,300,40);
		login.setBackground(Color.BLACK);
		login.setForeground(Color.WHITE);
		f1 = new Font("Rockwell", Font.BOLD,25);
		login.setFont(f1);
		login.addActionListener(this);
		panel.add(login);



		panel.setComponentZOrder(name1, 0);
		panel.setComponentZOrder(name2, 0);
		panel.setComponentZOrder(name3, 0);
		panel.setComponentZOrder(text, 0);
		panel.setComponentZOrder(name4, 0);
		panel.setComponentZOrder(passfield, 0);
		panel.setComponentZOrder(name6, 0);
		panel.setComponentZOrder(signup, 0);
		panel.setComponentZOrder(btn2, 0);
		panel.setComponentZOrder(btn3, 0);
		panel.setComponentZOrder(login, 0);
	
		this.add(panel);
	}
	public void actionPerformed(ActionEvent ae)
	{
			
		if(ae.getSource() == signup)
		{
			URegistration r1=new URegistration();
			r1.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource() == btn3)
		{
			System.exit(0);
			
		}
		else if(ae.getSource() == btn2 )
		{
		Lgad log = new Lgad();
		log.setVisible(true);
		this.setVisible(false);
		}
		else if(ae.getSource() == login )
		{
			String name=text.getText();
			String pass=passfield.getText();
			
			UAccount acc=new UAccount();
			
			if(acc.getAccount(name,pass)==true)
			{
				Adpsbar2 ad = new Adpsbar2();
				ad.setVisible(true);
				this.setVisible(false);
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Incorrect");
			}
		}	
	}
}