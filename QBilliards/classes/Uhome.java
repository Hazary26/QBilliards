package classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import static javax.swing.JOptionPane.showMessageDialog;
public class Uhome extends JFrame implements ActionListener
{
	JPanel panel;
	JLabel label1, label2, label3, label4, ll3;
    JButton l1, l2, l3, l4, l5, l6, l7, l8, bl4,logobtn,back;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11;
    ImageIcon i1,img;
	Color color1;
	Font f1;
	public Uhome()
	{
		super("User Home Page");
		this.setBounds(0,0,1366,800); //(x,y,width,height)
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		color1 = new Color(81, 131, 153); //(Red,Green,Blue)
		
		panel=new JPanel();
		panel.setLayout(null);
		panel.setBackground(color1);
		ImageIcon img = new ImageIcon("image/rsz_logo.png");
		this.setIconImage(img.getImage());
		
		
		
		label2 = new JLabel("Welcome to Q-Billiard");
        label2.setBounds(250, 50, 900, 80);
        label2.setFont(new Font("Rockwell", Font.BOLD, 60));
		panel.add(label2);

        label3 = new JLabel("Find your all billiard accessories need here in one place");
        label3.setBounds(250, 115, 600, 60);
        label3.setFont(new Font("Rockwell", Font.BOLD, 20));
		panel.add(label3);

        label4 = new JLabel("Select which catagory product you need ");
        label4.setBounds(250, 150, 500, 60);
        label4.setFont(new Font("Rockwell", Font.BOLD, 20));
		panel.add(label4);
		
		//Board
		
		b4 = new JButton();
        b4.setIcon(new ImageIcon("image/bb.png"));
        b4.setBounds(60, 460, 300, 220);
        b4.setContentAreaFilled(false);
		b4.addActionListener(this);
        //b4.setBorderPainted(false);
		panel.add(b4);
        l1 = new JButton("Billiard Board");
        l1.setBounds(60, 685, 300, 35);
        l1.setFont(new Font("Rockwell", Font.BOLD, 20));
        panel.add(l1);
		
		//Cue
		
		b5 = new JButton();
        b5.setIcon(new ImageIcon("image/cu.jpg"));
        b5.setBounds(380, 460, 300, 220);
		b5.setContentAreaFilled(false);
		b5.addActionListener(this);
        //b5.setBorderPainted(false);
		panel.add(b5);
        
        l2 = new JButton("Cue");
        l2.setBounds(380, 685, 300, 35);
        l2.setFont(new Font("Rockwell", Font.BOLD, 20));
		panel.add(l2);
		
		//Ball
		
		b6 = new JButton();
        b6.setIcon(new ImageIcon("image/H.jpg"));
        b6.setBounds(700, 460, 300, 220);
		b6.setContentAreaFilled(false);
        //b6.setBorderPainted(false);
		b6.addActionListener(this);
		panel.add(b6);
      
        l3 = new JButton("Billiard Ball");
        l3.setBounds(700, 685, 300, 35);
        l3.setFont(new Font("Rockwell", Font.BOLD, 20));
		panel.add(l3);
		
		//CUE BAG
		b7 = new JButton();
        b7.setIcon(new ImageIcon("image/bagg.jpg"));
        b7.setBounds(1020, 460, 300, 220);
		b7.setContentAreaFilled(false);
		b7.addActionListener(this);
        //b7.setBorderPainted(false);
		panel.add(b7);
		
		l4 = new JButton("Cue Bag");
        l4.setBounds(1020, 685, 300, 35);
        l4.setFont(new Font("Rockwell", Font.BOLD, 20));
		panel.add(l4);
		
		//Combo Offer
		b8 = new JButton();
        b8.setIcon(new ImageIcon("image/0000.jpg"));
        b8.setBounds(1020, 160, 300, 220);
		b8.setContentAreaFilled(false);
		b8.addActionListener(this);
        //b8.setBorderPainted(false);
		panel.add(b8);
		
		l5 = new JButton("Combo Offer");
        l5.setBounds(1020, 385, 300, 35);
        l5.setFont(new Font("Rockwell", Font.BOLD, 20));
		panel.add(l5);		
		
		
		//Custom Build
		b9 = new JButton();
        b9.setIcon(new ImageIcon("image/cuss.jpg"));
        b9.setBounds(700, 160, 300, 220);
		b9.setContentAreaFilled(false);
		b9.addActionListener(this);
        //b8.setBorderPainted(false);
		panel.add(b9);
		
		l6 = new JButton("Custom Cue Build");
        l6.setBounds(700, 385, 300, 35);
        l6.setFont(new Font("Rockwell", Font.BOLD, 20));
		panel.add(l6);

		

		
		
		
		//logo
		logobtn = new JButton();
        logobtn.setIcon(new ImageIcon("image/logo.png"));
        logobtn.setBounds(0, 0,300,300);
        logobtn.setContentAreaFilled(false);
        logobtn.setBorderPainted(false);
		panel.add(logobtn);
		
		
		back = new JButton("BACK");
		back.setBounds(1150,40,170,40);
		back.setForeground(Color.BLACK);
		f1 = new Font("Arial", Font.BOLD,25);
		back.addActionListener(this);
		back.setContentAreaFilled(false);
		back.setFont(f1);
		panel.add(back);
		
	this.add(panel);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == back)
		{
		ULogin obj1=new ULogin();
		obj1.setVisible(true);
		this.setVisible(false);
		}
		else if(ae.getSource() == b4)
		{
		catagory1 cat = new catagory1();
		cat.setVisible(true);
		this.setVisible(false);
		}		
		else if(ae.getSource() == b5)
		{
		catagory2 cat = new catagory2();
		cat.setVisible(true);
		this.setVisible(false);
		}		
		else if(ae.getSource() == b6)
		{
		catagory3 cat = new catagory3();
		cat.setVisible(true);
		this.setVisible(false);
		}		
		else if(ae.getSource() == b7)
		{
		catagory4 cat = new catagory4();
		cat.setVisible(true);
		this.setVisible(false);
		}
		else if(ae.getSource() == b8)
		{
		catagory5 cat = new catagory5();
		cat.setVisible(true);
		this.setVisible(false);
		}		
		else if(ae.getSource() == b9)
		{
		CustomCue cat = new CustomCue();
		cat.setVisible(true);
		this.setVisible(false);
		}
		
	}

	}