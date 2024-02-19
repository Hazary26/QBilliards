package classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import static javax.swing.JOptionPane.showMessageDialog;
public class Product33333 extends JFrame implements ActionListener
{
	JPanel panel;
	JLabel lbl1,lbl2,lbl3,lbl4,lbl5,lbl6,lbl7,lbl8;
	JButton btn1,btn2;
	ImageIcon img;
	JComboBox cb;
	Color c1;
	double basePrice = 6500.0;
	double totalPrice;
	public Product33333()
	{
		super("Product");
		this.setBounds(0,0,1366,800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		panel = new JPanel();
		panel.setLayout(null);
		c1 = new Color(74, 137, 165);
		panel.setBackground(c1);
		ImageIcon img = new ImageIcon("image/framelogo.png");
		this.setIconImage(img.getImage());
		
		lbl1 = new JLabel("Pool Package");
		lbl1.setBounds(600,190,1400,40);
		lbl1.setFont(new Font("Rockwell", Font.BOLD, 25));
		panel.add(lbl1);
		 
		 
		lbl2 = new JLabel(new ImageIcon("image/03.jpg"));
		lbl2.setBounds(100,180,450,400);
		panel.add(lbl2);
		
		lbl3 = new JLabel("Affordable pool package");
        lbl3.setBounds(610, 230, 4000, 40);
        lbl3.setFont(new Font("Rockwell", Font.BOLD, 15));
		panel.add(lbl3);

        lbl4 = new JLabel("gloubs,bag and tip");
        lbl4.setBounds(610, 270, 240, 40);
        lbl4.setFont(new Font("Rockwell", Font.BOLD, 15));
		panel.add(lbl4);

        lbl5 = new JLabel("BDT " + basePrice);
        lbl5.setBounds(610, 380, 270, 40);
        lbl5.setFont(new Font("Rockwell", Font.BOLD, 35));
        panel.add(lbl5);
		
		lbl6 = new JLabel("Quantity");
        lbl6.setBounds(610, 330, 240, 40);
		panel.add(lbl6);
        lbl6.setFont(new Font("Rockwell", Font.BOLD, 18));

        String quantity[] = { "1", "2", "3", "4", "4", "5", "6", "7", "8", "9", "10" };
        cb = new JComboBox(quantity);
        cb.setBounds(690, 340, 60, 20);
		panel.add(cb);

		cb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updatePrice(); // Update the price when the quantity changes
            }
        });

		
		btn1 = new JButton("Buy Now");
        btn1.setBounds(610, 490, 250, 60);
        btn1.setForeground(Color.black);
        btn1.setFont(new Font("Rockwell", Font.BOLD, 30));
        btn1.setBackground(Color.orange);
		btn1.addActionListener(this);
		panel.add(btn1);
		
		btn2 = new JButton("Back");
        btn2.setBounds(1010, 490, 250, 60);
        btn2.setForeground(Color.black);
        btn2.setFont(new Font("Rockwell", Font.BOLD, 30));
        btn2.setBackground(Color.orange);
		btn2.addActionListener(this);
		panel.add(btn2);
		
		this.add(panel);
	}

	private void updatePrice() {
        // Get the selected quantity from the JComboBox
        int quantity = Integer.parseInt(cb.getSelectedItem().toString());

        // Calculate the total price based on the quantity
        totalPrice = basePrice * quantity;

        // Update the price label
        lbl5.setText("BDT " + totalPrice);
    }

		public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == btn2)
		{
        catagory5 cat = new catagory5();
		cat.setVisible(true);
		this.setVisible(false);
		}
		else if(ae.getSource() == btn1)
		{
        Payment pay = new Payment(totalPrice);
		pay.setVisible(true);
		this.setVisible(false);
		}
		
	}		
}