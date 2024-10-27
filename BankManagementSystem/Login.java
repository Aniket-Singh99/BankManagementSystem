import java.awt.*;

import javax.swing.*;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener{
 
    Login(){
        setTitle("ATM");
        setLayout(null);
        setSize(800,400);
        
        setLocation(350,200);

        String path="c:/Users/anike/Desktop/JavaProject/BankManagementSystem/Icons/logo.jpeg";
        
        ImageIcon i1=new ImageIcon(path);
        
        Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel label=new JLabel(i3);
        label.setBounds(70,10,100,100);
        add(label);
     
        JLabel text=new JLabel("Welcome to ATM");
        text.setBounds(200,40,400,40);
        text.setFont(new Font("osward",Font.BOLD,38));
        add(text);


        JLabel cardno=new JLabel("Card No:");
        cardno.setBounds(120,150,150,30);
        cardno.setFont(new Font("Raleway",Font.BOLD,28));
        add(cardno);

        JTextField cardTextField=new JTextField();
        cardTextField.setBounds(300,150,230,30);
        add(cardTextField);


        JLabel pin=new JLabel("PIN:");
        pin.setBounds(120,220,230,30);
        pin.setFont(new Font("Raleway",Font.BOLD,28));
        add(pin);


        JTextField pinTextField=new JTextField();
        pinTextField.setBounds(300,220,250,30);
        add(pinTextField);

        JButton login=new JButton("SIGN IN");
        login.setBounds(300,300,100,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        add(login);

        
        JButton clear=new JButton("CLEAR");
        clear.setBounds(430,300,100,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        add(clear);


        JButton signup=new JButton("SIGN UP");
        signup.setBounds(300,350,230,30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        add(signup); 





        getContentPane().setBackground(Color.white); 
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){

    }
    public static void main(String[] args){
       new Login();
    }
}


