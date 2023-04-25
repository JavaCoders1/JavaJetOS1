package UnderDevelopment.GUIForLogjn;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class gui extends JFrame
{

    public static void main(String[] args)
    {

        gui window = new gui();
        window.setSize(500,500);
        window.setVisible(true);
        window.setTitle("Login Window");
        window.setLayout(new FlowLayout());

        JLabel userlabel = new JLabel("Enter username: ");
        window.getContentPane().add(userlabel);

        JTextField usernamebox = new JTextField(10);
        window.getContentPane().add(usernamebox);

        JLabel passlabel = new JLabel("Enter password: ");
        window.getContentPane().add(passlabel);

        JTextField passbox = new JTextField(10);
        window.getContentPane().add(passbox);





        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        

    }
}
