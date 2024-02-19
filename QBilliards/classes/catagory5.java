 package classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class catagory5 extends JFrame implements ActionListener
{
	JPanel panel;
	JLabel lbl1,lbl2,lbl3,lbl4,lbl5,lbl6,lbl7,lbl8;
	JLabel t1,t2,logo;
	JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,bkbtn;
	ImageIcon img;
	Color c1;
	public catagory5()
	{
		super("Catagory");
		this.setBounds(0,0,1366,800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon img = new ImageIcon("image/framelogo.png");
		this.setIconImage(img.getImage());
	
		panel = new JPanel();
		panel.setLayout(null);
		c1 = new Color(74, 137, 165);
		panel.setBackground(c1);
		
		//d1
		btn1 = new JButton();
        btn1.setIcon(new ImageIcon("image/01.jpg"));
        btn1.setBounds(60, 160, 300, 220);
        btn1.setBackground(Color.white);
		btn1.addActionListener(this);
		panel.add(btn1);
       
        lbl1 = new JLabel("<html>CueGuard<br>BDT 7500</html>");
        lbl1.setBounds(60, 395, 300, 45);
        lbl1.setFont(new Font("Rockwell", Font.BOLD, 20));
		panel.add(lbl1);
		
		//d2
		btn2 = new JButton();
        btn2.setIcon(new ImageIcon("image/02.jpg"));
        btn2.setBounds(380, 160, 300, 220);
        btn2.setBackground(Color.white);
		btn2.addActionListener(this);
		panel.add(btn2);

        lbl2 = new JLabel("<html>ProPocketGear<br>BDT 5500</html>");
        lbl2.setBounds(380, 395, 300, 45);
        lbl2.setFont(new Font("Rockwell", Font.BOLD, 20));
		panel.add(lbl2);
		
		//d3
		btn3 = new JButton();
        btn3.setIcon(new ImageIcon("image/03.jpg"));
        btn3.setBounds(700, 160, 300, 220);
        btn3.setBackground(Color.white);
		btn3.addActionListener(this);
		panel.add(btn3);
       
        lbl3 = new JLabel("<html>CueArmor<br>BDT 6500</html>");
        lbl3.setBounds(700, 395, 300, 45);
        lbl3.setFont(new Font("Rockwell", Font.BOLD, 20));
		panel.add(lbl3);
		
		
		
		//TitledBorder
		t1 = new JLabel("Welcome to Q Billiard");
        t1.setBounds(200, 30, 800, 80);
        t1.setFont(new Font("Rockwell", Font.BOLD, 50));
		panel.add(t1);
        t2 = new JLabel("There are three combo pool packages for you....");
        t2.setBounds(205, 80, 500, 60);
        t2.setFont(new Font("Rockwell", Font.BOLD, 20));
		panel.add(t2);
		
		//logo error
		logo = new JLabel();
        logo.setIcon(new ImageIcon("image/rsz_logo.png"));
        logo.setBounds(80, 10, 120, 120);
		panel.add(logo);
		
		
		bkbtn = new JButton("Back");
        bkbtn.setBounds(1150,40,170,40);
        bkbtn.setForeground(Color.black);
        bkbtn.setFont(new Font("Serif", Font.BOLD, 30));
        bkbtn.setBackground(Color.orange);
		bkbtn.setContentAreaFilled(false);
		bkbtn.addActionListener(this);
		panel.add(bkbtn);
		
		
		
		
		
        
		
		
		this.add(panel);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == btn1)
		{
		Product11111 p1 = new Product11111();
		p1.setVisible(true);
		this.setVisible(false);
		}	
		
		else if(ae.getSource() == btn2)
		{
		Product22222 p1 = new Product22222();
		p1.setVisible(true);
		this.setVisible(false);
		}		
		
		else if(ae.getSource() == btn3)
		{
		Product33333 p1 = new Product33333();
		p1.setVisible(true);
		this.setVisible(false);
		}
			
		else if(ae.getSource() == bkbtn)
		{
		Uhome home = new Uhome();
		home.setVisible(true);
		this.setVisible(false);
		}
		
		
		
		
		
	}
	
	
	
	
	
}