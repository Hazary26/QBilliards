package classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Lgad extends JFrame  implements ActionListener
{
	JPanel panel;
	JLabel lbl0;
	JButton btn1,btn2,btn3,btn4;
	Color color1;
	ImageIcon img;
	Font f1;
	Color c1;
	
	
	public Lgad()
	{
		super("LG AD");
		this.setBounds(0,0,1366,768); //(x,y,width,height)
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		color1 = new Color(25,118,211); //(Red,Green,Blue)
		
		
		panel=new JPanel();
		panel.setLayout(null);
		panel.setBackground(color1);
		ImageIcon img = new ImageIcon("framelogo.png");
		this.setIconImage(img.getImage());
		
		
		btn1 = new JButton("Admin Login");
		btn1.setBounds(900,110,300,30);
		f1 = new Font("Rockwell", Font.BOLD,25);
		btn1.setFont(f1);
		btn1.setBackground(c1 = new Color(23, 61, 123));
		btn1.setForeground(c1 = new Color (255, 255, 255));
		btn1.addActionListener(this);
		panel.add(btn1);
		
		btn2 = new JButton("User Login");
		btn2.setBounds(900,150,300,30);
		f1 = new Font("Rockwell", Font.BOLD,25);
		btn2.setFont(f1);
		btn2.setBackground(c1 = new Color(23, 61, 123));
		btn2.setForeground(c1 = new Color (255, 255, 255));
		btn2.addActionListener(this);
		panel.add(btn2);
		
		btn3 = new JButton("Back");
		btn3.setBounds(130,600,200,30);
		f1 = new Font("Rockwell", Font.BOLD,25);
		btn3.setFont(f1);
		btn3.setBackground(c1 = new Color(23, 61, 123));
		btn3.setForeground(c1 = new Color (255, 255, 255));
		btn3.addActionListener(this);
		panel.add(btn3);
		
		btn4 = new JButton("EXIT");
		btn4.setBounds(1000,600,200,30);
		f1 = new Font("Rockwell", Font.BOLD,25);
		btn4.setFont(f1);
		btn4.setBackground(c1 = new Color(23, 61, 123));
		btn4.setForeground(c1 = new Color (255, 255, 255));
		btn4.addActionListener(this);
		panel.add(btn4);
		
		
		img = new ImageIcon("image/bbbb.jpg");
		lbl0= new JLabel(img);
		lbl0.setBounds(0,0,1366,768);
		panel.add(lbl0);
		



		this.add(panel);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == btn4)
		{
			System.exit(0);
			
		}
		else if(ae.getSource() == btn3 )
		{
		Home home = new Home(); 
		home.setVisible(true);
		this.setVisible(false);
		}		
		else if(ae.getSource() == btn2 )
		{
		ULogin obj1=new ULogin();
		obj1.setVisible(true);
		this.setVisible(false);
		}		
		else if(ae.getSource() == btn1 )
		{
		Adminlogin cus = new Adminlogin();
		this.setVisible(false);
		cus.setVisible(true);
		
		}
	}
	
	
}