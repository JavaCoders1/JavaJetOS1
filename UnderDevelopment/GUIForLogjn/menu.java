package UnderDevelopment.GUIForLogjn;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class menu extends JFrame implements ActionListener
{
    JPanel menuWIndow;
    JLabel searchlabel;
    static JTextField searchbar;
    menu(){
        setTitle("Menu");
        setSize(400, 275);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setResizable(false);

        menuWIndow = new JPanel();
        menuWIndow.setLayout(null);
        add(menuWIndow);

        searchlabel = new JLabel("Enter Application Name:");
        searchlabel.setBounds(10,205,200,25);
        menuWIndow.add(searchlabel);

        searchbar = new JTextField();
        searchbar.setBounds(175, 205, 120, 25);
        menuWIndow.add(searchbar);


        setVisible(true);
    }

    public static void main(String[] args)
    {
        
        JButton files, calc, ageCalc, numGame, monExp;
        boolean run = true;
        new menu();
        while (run == true){
            String searchText = searchbar.getText();
            
        files = new JButton("Text Editor");
        files.addActionListener(this);

        calc = new JButton("Calculator");
        calc.addActionListener(this);

        ageCalc = new JButton("Age Calculator");
        ageCalc.addActionListener(this);

        numGame = new JButton("Number Game");
        numGame.addActionListener(this);

        monExp = new JButton("Monthly Expenditure");
        monExp.addActionListener(this);
            
        }
    }

}
