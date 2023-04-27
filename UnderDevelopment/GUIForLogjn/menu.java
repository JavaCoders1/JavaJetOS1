package UnderDevelopment.GUIForLogjn;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class menu extends JFrame{
    JPanel panel1;
    JLabel searchlabel;
    JTextField searchbar;
    menu(){
        setTitle("Menu");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel1 = new JPanel();
        panel1.setLayout(null);
        add(panel1);

        searchlabel = new JLabel("Enter Application Name:");
        searchlabel.setBounds(10,205,160,25);
        panel1.add(searchlabel);

        searchbar = new JTextField();
        searchbar.setBounds(175, 205, 120, 25);
        panel1.add(searchbar);

        setVisible(true);
    }

    public static void main(String[] args)
    {
        new menu();
    }
}
