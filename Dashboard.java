package grocery_billing_system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener{
    Dashboard(){
        setBounds(0, 0, 1550, 1000);
        setLayout(null);
        
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Dashboard.jpg"));
       Image i2 = i1.getImage().getScaledInstance(1550, 1000,Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
       JLabel image = new JLabel(i3);
       image.setBounds(0, 0, 1550, 1000);
       add(image);
       
       JLabel text = new JLabel("THE D-MART WELCOMES YOU");
       text.setBounds(450, 60, 1000, 50);
       text.setFont(new Font("Tahoma", Font.PLAIN, 46));
       text.setForeground(Color.GREEN);
       image.add(text);
       
       JMenuBar mb = new JMenuBar();
       mb.setBounds(0, 0, 1550, 30);
       image.add(mb);
       
       JMenu grocery = new JMenu("GROCERY MANAGMENT");
       grocery.setForeground(Color.red);
       mb.add(grocery);
       
//       MenuItem Save = new JMenuItem("ADD ITEM");
//       grocery.add(Save);

//        JMenuItem Add = new JMenuItem("ADD NEW ITEM");
//	grocery.add(Add);
//
//	JMenuItem Edit = new JMenuItem("EDIT ITEM");
//	grocery.add(Edit);

	JMenuItem Bill = new JMenuItem("BILL");
        Bill.addActionListener(this);
	grocery.add(Bill);
        
       JMenu admin = new JMenu("ADMIN");
       admin.setForeground(Color.BLUE);
       mb.add(admin);
       
       JMenuItem adduser = new JMenuItem("ADD NEW USER");
       adduser.addActionListener(this);
	admin.add(adduser);

//	JMenuItem Edit1 = new JMenuItem("EDIT USER");
//	admin.add(Edit1);
       
       setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getActionCommand().equals("ADD NEW USER")){
            new adduser();
        }
//        else if(ae.getActionCommand().equals("BILL")){
//            new Bill();
//        }
        else{
        Bill bill = new Bill();
        bill.show();
        dispose();
        }
    }

    public static void main(String[] args){
        new Dashboard();
    }
}
