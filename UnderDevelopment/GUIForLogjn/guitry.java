package UnderDevelopment.GUIForLogjn;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class guitry extends JFrame implements ActionListener
{
    JLabel userlabel, passlabel;
    JTextField usernamebox, passbox;
    JButton loginbutton;
    JPanel panel;

    guitry() {
        setTitle("Login Screen");
        setSize(260, 150);
        setLocationRelativeTo(null);
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(null);
        add(panel);

        userlabel = new JLabel("Enter username: ");
        userlabel.setBounds(10,10,110,25);
        panel.add(userlabel);

        usernamebox = new JTextField(10);
        usernamebox.setBounds(125,10,120,25);
        panel.add(usernamebox);

        passlabel = new JLabel("Enter password: ");
        passlabel.setBounds(10,40,120,25);
        panel.add(passlabel);

        passbox = new JTextField(10);
        passbox.setBounds(125,40,120,25);
        panel.add(passbox);

        loginbutton = new JButton("Login");
        loginbutton.addActionListener((ActionListener) this);
        loginbutton.setBounds(100,90,90,25);
        panel.add(loginbutton);

        setVisible(true);
        }
    
    public void actionPerformed(ActionEvent ae)
    {
        
        String username = new String(usernamebox.getText());
        
        String password = new String(passbox.getText());
       

        if(ae.getSource() == loginbutton)
        {
            if(username.equals("default")&& password.equals("password"))
            {
                JOptionPane.showMessageDialog(this, "Logged in successfully!");
                menubuttonallocations menubuttonallocations = new menubuttonallocations();
                menubuttonallocations.setVisible(true);
                dispose();
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Login Unsuccesfull!");
            }
        }
    }

    public static void main(String[] args)
    {
        new guitry(); 

    }
}
