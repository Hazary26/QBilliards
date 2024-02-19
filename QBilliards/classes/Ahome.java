package classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ahome extends JFrame implements ActionListener{
    JPanel panel;
	JLabel label1, label2, label3, label4, ll3;
    JButton l1, l2, l3, l4, l5, l6, l7, l8, bl4,bkbtn,back;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11;
    ImageIcon i1,img;
	Color color1;
	Font f1;
	public Ahome()
	{
		super("Admin Home page");
		this.setBounds(0,0,1366,768);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		color1 = new Color(0,0,153); 
		
		panel=new JPanel();
		panel.setLayout(null);
		panel.setBackground(color1);
		
        label2 = new JLabel("Admin DashBoard");
        label2.setBounds(500, 30, 750, 80);
        label2.setFont(new Font("Segoe UI", Font.BOLD, 50));
		panel.add(label2);

		b4 = new JButton();
        b4.setIcon(new ImageIcon("image/addadmin.png"));
        b4.setBounds(60, 460, 300, 220);
		b4.addActionListener(this);

		panel.add(b4);
        l1 = new JButton("Add Admin");
        l1.setBounds(60, 685, 300, 35);
        l1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        panel.add(l1);
		

		b5 = new JButton();
        b5.setIcon(new ImageIcon("image/adduser.png"));
        b5.setBounds(380, 460, 300, 220);
		b5.addActionListener(this);
		panel.add(b5);
        
        l2 = new JButton("Add User");
        l2.setBounds(380, 685, 300, 35);
        l2.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		panel.add(l2);
		

		
		b6 = new JButton();
        b6.setIcon(new ImageIcon("image/admininfo.jpg"));
        b6.setBounds(700, 460, 300, 220);
		b6.addActionListener(this);
		panel.add(b6);
      
        l3 = new JButton("Admin Information");
        l3.setBounds(700, 685, 300, 35);
        l3.setFont(new Font("Segoe UI", Font.PLAIN, 20));
	
		panel.add(l3);
		
		
		b7 = new JButton();
        b7.setIcon(new ImageIcon("image/userinfo.jpg"));
        b7.setBounds(1020, 460, 300, 220);
		b7.addActionListener(this);
		panel.add(b7);
		
        l4 = new JButton("User Information");
        l4.setBounds(1020, 685, 300, 35);
        l4.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		
		panel.add(l4);

		bkbtn = new JButton();
        bkbtn.setIcon(new ImageIcon("image/rsz_logo.png"));
        bkbtn.setBounds(80, 10, 120, 120);
        bkbtn.setBorderPainted(false);
		panel.add(bkbtn);
		
		
		back = new JButton("BACK");
		back.setBounds(1150,40,170,40);
		back.setForeground(Color.BLACK);
		f1 = new Font("Arial", Font.BOLD,25);
		back.addActionListener(this);
		back.setFont(f1);
		panel.add(back);
		
	this.add(panel);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == back)
		{
		Adminlogin obj1=new Adminlogin();
		obj1.setVisible(true);
		this.setVisible(false);
		}
		else if(ae.getSource() == b4)
		{
		AddAdmin adm = new AddAdmin();
		adm.setVisible(true);
		this.setVisible(false);
		}		
		else if(ae.getSource() == b5)
		{
		AddUser usr = new AddUser();
		usr.setVisible(true);
		this.setVisible(false);
		}		
		else if(ae.getSource() == b6)
		{
		AdminInfoFrame user = new AdminInfoFrame();
		user.setVisible(true);
		this.setVisible(false);
		}		
		else if(ae.getSource() == b7) 
		{
		UserInfoFrame user = new UserInfoFrame();
		user.setVisible(true);
		this.setVisible(false);
        }

		
	}
}