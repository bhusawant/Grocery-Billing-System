package grocery_billing_system;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Grocery_Billing_System extends JFrame implements ActionListener{
    Grocery_Billing_System(){
//        setSize(1366, 565);
//        setLocation(100, 100);
        setBounds(100, 100, 1366, 565);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Image1.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 1366, 565);
        add(image);
        JLabel text = new JLabel("GROCERY BILLING SYSTEM");
        text.setBounds(20, 430, 1000, 90);
        text.setForeground(Color.red);
        text.setFont(new Font("serit", Font.BOLD, 40));
        image.add(text);
        JButton next = new JButton("Next");
        next.setBounds(1150, 450, 150, 50);
//        next.setBackground(Color.WHITE);
        next.setForeground(Color.MAGENTA);
        next.addActionListener(this);
        next.setFont(new Font("serit", Font.PLAIN, 24));
        image.add(next);
        setVisible(true);
        
        while(true){
            text.setVisible(false);
            try{
                Thread.sleep(500);
            } catch (Exception e){
                e.printStackTrace();
            }
            text.setVisible(true);
            try{
                Thread.sleep(500);
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    }
    public static void main(String[] args) {
        new Grocery_Billing_System();
    }
    
}
