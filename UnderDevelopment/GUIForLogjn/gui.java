package UnderDevelopment.GUIForLogjn;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class gui extends JFrame
{
    private static JLabel directionsLabel = new JLabel("Enter username: ");
    private static JLabel outputLabel1 = new JLabel();
    private static JTextField usernamebox = new JTextField(10);
    public static void main(String[] args)
    {

        gui window = new gui();
        window.setSize(500,500);
        window.setVisible(true);
        window.setTitle("Login Window");
        window.setLayout(new FlowLayout());
        window.getContentPane().add(directionsLabel);
        window.getContentPane().add(usernamebox);
        window.getContentPane().add(outputLabel1);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        

    }
}
