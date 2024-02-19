package classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddAdmin extends JFrame implements  ActionListener{
    JPanel panel;
	JLabel userlable,passlable;
	JTextField tfield;
	JLabel label2,label3;
	JPasswordField pfield;
	JButton signbtn,backbtn;
	Color mycolor, mycolor1,color1;
	Font myfont;
	
	
	
	public AddAdmin ()
	{
		super("Add Admin");
		this.setBounds(0,0,1366,768);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		color1 = new Color(25,118,211);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(color1);
		
		label2 = new JLabel("Welcome to QBilliards");
        label2.setBounds(200, 30, 800, 80);
        label2.setFont(new Font("Segoe UI", Font.BOLD, 50));
		panel.add(label2);
		
		
		userlable = new JLabel("Username");
		userlable.setBounds(250,350,80,30);
		userlable.setBackground(Color.green);
		userlable.setOpaque(true);
		userlable.setForeground(Color.WHITE);
		userlable.setFont(myfont);
		panel.add(userlable);
		
		
	    tfield = new JTextField();
		tfield.setBounds(350,350,350,30);
		panel.add(tfield);
		
		passlable = new JLabel("Password");
		passlable.setBounds(250,450,80,30);
		passlable.setBackground(Color.green);
		passlable.setForeground(Color.WHITE);
		passlable.setOpaque(true);
		panel.add(passlable);
		
		pfield = new JPasswordField();
		pfield.setBounds(350,450,350,30);
		panel.add(pfield);
		
		signbtn= new JButton("Add");
		signbtn.setBounds(480,500,80,30);
		signbtn.setBackground(Color.orange);
		signbtn.addActionListener(this);
		panel.add(signbtn);
		
		backbtn = new JButton("Back");
		backbtn.setBounds(580,500,80,30);
		backbtn.setBackground(Color.ORANGE);
		backbtn.addActionListener(this);
		panel.add(backbtn);
		
		this.add(panel);
	}
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me){}
	public void mouseExited(MouseEvent me){}
	public void actionPerformed(ActionEvent ae)
	{
		if (ae.getSource() == signbtn)
		{
			String name=tfield.getText();
			String pass=pfield.getText();
				
			if(name.isEmpty()||pass.isEmpty())
			{
				JOptionPane.showMessageDialog(this,"Fill All");
			}
			else
			{		
				AAccount acc= new AAccount(name,pass);
				acc.addaccount();
					
				JOptionPane.showMessageDialog(this,"Added");
					
				tfield.setText("");
				pfield.setText("");
			}
		}
		else if(ae.getSource() == backbtn)
		{
			Ahome home = new Ahome();
			this.setVisible(false);
			home.setVisible(true);

		}
	}
}
