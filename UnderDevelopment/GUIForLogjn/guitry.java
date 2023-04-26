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
        setSize(300, 150);
        setLocationRelativeTo(null);
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel(new GridLayout(3, 4));
        add(panel);

        userlabel = new JLabel("Enter username: ");
        panel.add(userlabel);

        usernamebox = new JTextField(10);
        panel.add(usernamebox);

        passlabel = new JLabel("Enter password: ");
        panel.add(passlabel);

        passbox = new JTextField(10);
        panel.add(passbox);

        loginbutton = new JButton("Login");
        loginbutton.addActionListener((ActionListener) this);
        panel.add(loginbutton,3);

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
