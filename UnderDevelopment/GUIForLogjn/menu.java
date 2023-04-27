package UnderDevelopment.GUIForLogjn;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class menu extends JFrame implements ActionListener
{
    JPanel menuWin;
    JLabel searchlabel;
    static JTextField searchbar;
    JButton textEditor, calc, ageCalc, numGame, monExp;
    String[] apps = new String[10];
    apps[0] = "1"; // Agecalc
    apps[1] = "1"; // Calculator
    apps[2] = "1"; // Monthly Expenditure
    apps[3] = "1"; // Number Guessing Game
    apps[4] = "1"; // Text Editor
    menu()
    {
        setTitle("Menu");
        setSize(400, 275);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setResizable(false);

        menuWin = new JPanel();
        menuWin.setLayout(null);
        add(menuWin);

        searchlabel = new JLabel("Enter Application Name:");
        searchlabel.setBounds(10,205,200,25);
        menuWin.add(searchlabel);

        searchbar = new JTextField();
        searchbar.setBounds(175, 205, 120, 25);
        menuWin.add(searchbar);

        textEditor = new JButton("Text Editor");
        textEditor.addActionListener(this);

        calc = new JButton("Calculator");
        calc.addActionListener(this);

        ageCalc = new JButton("Age Calculator");
        ageCalc.addActionListener(this);

        numGame = new JButton("Number Game");
        numGame.addActionListener(this);

        monExp = new JButton("Monthly Expenditure");
        monExp.addActionListener(this);

        if (apps[0].equals("0")){
            menuWin.remove(ageCalc);
        }
        if (apps[1].equals("0")){
            menuWin.remove(calc);
        }
        if (apps[2].equals("0")){
            menuWin.remove(monExp);
        }
        if (apps[3].equals("0")){
            menuWin.remove(numGame);
        }
        if (apps[4].equals("0")){
            menuWin.remove(textEditor)
        }


        setVisible(true);
    }

    public static void main(String[] args)
    {
        
        
        boolean run = true;
        new menu();
        while (run == true){
            String searchText = searchbar.getText();
            apps[0] = "0";
            if (!"Age Calculator".startsWith(searchText)){
                apps[0] = "1;"
            }
               
            
        }
    }

}
