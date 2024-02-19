package classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Product1 extends JFrame implements ActionListener {
    JPanel panel;
    JLabel lbl1, lbl2, lbl3, lbl4, lbl5, lbl6, lbl7, lbl8;
    JButton btn1, btn2;
    ImageIcon img;
    JComboBox cb;
    Color c1;
    double basePrice = 275000.0; // Initial price
    double totalPrice;


    public Product1() {
        super("Product");
        this.setBounds(0, 0, 1366, 800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(null);
        c1 = new Color(81, 131, 153);
        panel.setBackground(c1);

        lbl1 = new JLabel("Erin Solid");
        lbl1.setBounds(600, 190, 1400, 40);
        lbl1.setFont(new Font("Rockwell", Font.BOLD, 25));
        panel.add(lbl1);

        lbl2 = new JLabel(new ImageIcon("image/13.png"));
        lbl2.setBounds(100, 180, 450, 400);
        panel.add(lbl2);

        lbl3 = new JLabel("play field measures 254x127 cm,external measurements 290x163 cm");
        lbl3.setBounds(610, 230, 4000, 40);
        lbl3.setFont(new Font("Rockwell", Font.BOLD, 15));
        panel.add(lbl3);

        lbl4 = new JLabel("playing field height: 75/77 cm,slate: 3 pcs, thickness 25 mm");
        lbl4.setBounds(610, 270, 2400, 40);
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

        String quantity[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };
        cb = new JComboBox(quantity);
        cb.setBounds(690, 340, 60, 20);
        panel.add(cb);

        // Add ActionListener to the JComboBox
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

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == btn2) {
            catagory1 cat = new catagory1();
            cat.setVisible(true);
            this.setVisible(false);
        } else if (ae.getSource() == btn1) {
            Payment pay = new Payment(totalPrice);
            pay.setVisible(true);
            this.setVisible(false);
        }
    }
}
