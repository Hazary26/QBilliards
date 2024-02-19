package classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class Custom extends JFrame implements ActionListener
{
	JPanel panel;
	JLabel lbl1;
	Font f1;
	Color c1;
	JButton btn, btn1;
	public Custom()
	{
		super("Product");
		this.setBounds(0,0,1366,768);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		panel = new JPanel();
		panel.setLayout(null);
		c1 = new Color(116, 215, 103);
		panel.setBackground(c1);
		//ImageIcon img = new ImageIcon("framelogo.png");
		//this.setIconImage(img.getImage());
		
		lbl1 = new JLabel("Coming Soon . . .");
		lbl1.setBounds(450,290,1400,200);
		f1=new Font("Segoe UI Black",Font.BOLD,60);
		lbl1.setFont(f1);
		panel.add(lbl1);
		
		btn = new JButton("EXIT");
		btn.setBounds(550,590,140,40);
		btn.setBackground(Color.RED);
		btn.setForeground(Color.WHITE);
		f1 = new Font("Arial", Font.BOLD,25);
		btn.setFont(f1);
		btn.addActionListener(this);
		panel.add(btn);
		
		
		this.add(panel);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == btn)
		{
			System.exit(0);
			
		}

	}
}