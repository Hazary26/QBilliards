package classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Contribution extends JFrame implements ActionListener
{
	JLabel lbl1,lbl2,lbl3,lbl4,lbl5,lbl6,lbl7;
	JPanel panel;
	JButton btn3;
	ImageIcon img , image;
	Color color1;
	Font f1;
	
	public Contribution()
	{
	super("Contribution");
	this.setBounds(0,0,1366, 768);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	color1 = new Color(	255,255,153);

	panel = new JPanel();
    panel.setLayout(null);
    panel.setBackground(Color.cyan);

	lbl7 = new JLabel("Group 3 members");
	lbl7.setBounds(500,5,500,50);
	lbl7.setFont(new Font("Rockwell", Font.BOLD, 45));
	panel.add(lbl7);

	lbl1 = new JLabel();
	lbl1.setBounds(150,65,250,200);
	image =new ImageIcon("image/nabil.jpg");
	lbl1.setIcon(image);
	panel.add(lbl1);

	lbl2 = new JLabel("<html>MD MAZHARUL ISLAM NABIL<br>Student ID: 23-50025-1</html>");
	lbl2.setBounds(410,65,900,200);
	lbl2.setFont(new Font("Rockwell", Font.BOLD, 35));
	panel.add(lbl2);


	lbl3 = new JLabel();
	lbl3.setBounds(150,280,250,200);
	image =new ImageIcon("image/hazary.jpg");
	lbl3.setIcon(image);
	panel.add(lbl3);

	lbl4 = new JLabel("<html>MD JOBAYED HOSSEN HAZARY<br>Student ID: 23-50147-1</html>");
	lbl4.setBounds(410,280,900,200);
	lbl4.setFont(new Font("Rockwell", Font.BOLD, 35));
	panel.add(lbl4);

	lbl3 = new JLabel();
	lbl3.setBounds(150,490,250,200);
	image =new ImageIcon("image/sudad.png");
	lbl3.setIcon(image);
	panel.add(lbl3);

	lbl6 = new JLabel("<html>SUDAD BASHAR<br>Student ID: 22-48544-3</html>");
	lbl6.setBounds(410,500,900,200);
	lbl6.setFont(new Font("Rockwell", Font.BOLD, 35));
	panel.add(lbl6);

	btn3 = new JButton("Back");
	btn3.setBounds(1220,20,100,30);
	f1 = new Font("Rockwell", Font.BOLD,25);
	btn3.setFont(f1);
	btn3.setBackground(Color.WHITE);
	btn3.setForeground(Color.black);
	btn3.addActionListener(this);
	panel.add(btn3);
	this.add(panel);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == btn3 )
		{
		Home home = new Home(); 
		home.setVisible(true);
		this.setVisible(false);
		}
	}

}