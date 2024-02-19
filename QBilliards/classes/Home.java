package classes;
import javax.swing.*;
import java.lang.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
public class Home extends JFrame implements ActionListener
{
	JPanel panel;
	JLabel lbl1,lbl2,lbl3,lbl4 ,Tlbl, lbl5,lbl6;
	JButton btn1,btn2,btn3,btn4;
	ImageIcon img;
	Color c1;
	Font f1;
	
	public Home()
	{
		super("Home Page");
		this.setBounds(0,0,1366,800);
		this.setUndecorated(true);
		//this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		c1= new Color(255,255,255);
		panel = new JPanel();
		panel.setLayout(null);
		ImageIcon img = new ImageIcon("image/rsz_logo.png");
		this.setIconImage(img.getImage());

		lbl5= new JLabel("WELCOME TO OUR ONLINE BILLIARD SHOP PROJECT");
		lbl5.setBounds(130, 150, 1120, 40);
		lbl5.setBackground(Color.BLACK);
		lbl5.setForeground(Color.CYAN);
		lbl5.setOpaque(true);
        lbl5.setFont(new Font("Rockwell", Font.BOLD, 40));
        panel.add(lbl5);

		lbl6= new JLabel("WE ARE GROUP 3");
		lbl6.setBounds(540, 230, 320, 40);
		lbl6.setBackground(Color.BLACK);
		lbl6.setForeground(Color.CYAN);
		lbl6.setOpaque(true);
        lbl6.setFont(new Font("Rockwell", Font.BOLD, 35));
        panel.add(lbl6);
		
		img = new ImageIcon("image/home1.jpg");
		lbl1= new JLabel(img);
		lbl1.setBounds(0,0,1366,800);
		panel.add(lbl1);

		
		
		
		//lbl2 = new JLabel();
		btn1 = new JButton("GET START");
		btn1.setBounds(650,400,400,40);
		btn1.setBackground(Color.BLACK);
		btn1.setForeground(Color.WHITE);
		f1 = new Font("Rockwell", Font.BOLD,25);
		btn1.setFont(f1);
		btn1.addActionListener(this);
		panel.add(btn1);
		
		//lbl3 = new JLabel();
		btn2 = new JButton("About US");
		btn2.setBounds(650,450,400,40);
		btn2.setBackground(Color.BLACK);
		btn2.setForeground(Color.WHITE);
		f1 = new Font("Rockwell", Font.BOLD,25);
		btn2.addActionListener(this);
		btn2.setFont(f1);
		panel.add(btn2);
		
		//lbl4 = new JLabel();
		btn3 = new JButton("EXIT");
		btn3.setBounds(650,500,400,40);
		btn3.setBackground(Color.BLACK);
		btn3.setForeground(Color.WHITE);
		f1 = new Font("Rockwell", Font.BOLD,25);
		btn3.setFont(f1);
		btn3.addActionListener(this);
		panel.add(btn3);
		
		btn4 = new JButton("X");
        btn4.setBounds(1320, 0, 45, 45);
		btn4.setBackground(Color.BLACK);
		btn4.setForeground(Color.WHITE);
		f1 = new Font("Rockwell", Font.BOLD,25);
		btn4.addActionListener(this);
		panel.add(btn4);
		
		
		
		
		
		
		
		
		
		
		this.add(panel);
		
		
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == btn3)
		{
			System.exit(0);
			
		}		
		else if(ae.getSource() == btn4)
		{
			System.exit(0);
			
		}
		else if(ae.getSource() == btn2)
		{
			Contribution contro = new Contribution();
		    contro.setVisible(true);
			this.setVisible(false);
		}	
		else if(ae.getSource() == btn1 )
		{
		Lgad log = new Lgad();
		log.setVisible(true);
		this.setVisible(false);
		}
	}
}