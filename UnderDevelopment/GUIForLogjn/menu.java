package UnderDevelopment.GUIForLogjn;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class menu extends JFrame implements ActionListener
{
    JPanel panel1;
    JLabel searchlabel;
    JTextField searchbar;
    JButton searchb;
    menu(){
        setTitle("Menu");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel1 = new JPanel();
        panel1.setLayout(null);
        add(panel1);

        searchlabel = new JLabel("Enter Application Name:");
        searchlabel.setBounds(10,205,200,25);
        panel1.add(searchlabel);

        searchbar = new JTextField();
        searchbar.setBounds(175, 205, 120, 25);
        panel1.add(searchbar);

        searchb = new JButton("Search");
        searchb.addActionListener(this);
        searchb.setBounds(175, 235, 100,25);
        panel1.add(searchb);


        setVisible(true);
    }

    public static void main(String[] args)
    {
        new menu();
    }

}
