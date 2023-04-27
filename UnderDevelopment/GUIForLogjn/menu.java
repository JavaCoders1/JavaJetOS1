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
    String apps0 = "1"; // Agecalc
    String apps1 = "1"; // Calculator
    String apps2 = "1"; // Monthly Expenditure
    String apps3 = "1"; // Number Guessing Game
    String apps4 = "1"; // Text Editor
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
        textEditor.setBounds(15,25,50,25);
        add(textEditor);

        calc = new JButton("Calculator");
        calc.addActionListener(this);
        calc.setBounds(15,25,50,25);
        add(calc);

        ageCalc = new JButton("Age Calculator");
        ageCalc.addActionListener(this);

        numGame = new JButton("Number Game");
        numGame.addActionListener(this);

        monExp = new JButton("Monthly Expenditure");
        monExp.addActionListener(this);

        if (apps0.equals("0")){
            menuWin.remove(ageCalc);
        }
        if (apps1.equals("0")){
            menuWin.remove(calc);
        }
        if (apps2.equals("0")){
            menuWin.remove(monExp);
        }
        if (apps3.equals("0")){
            menuWin.remove(numGame);
        }
        if (apps4.equals("0")){
            menuWin.remove(textEditor);
        }


        setVisible(true);
    }

<<<<<<< HEAD
    public static void main(String[] args; String apps0, apps1, apps2, apps3, apps4)
    {
        
=======
    public static void main(String[] args) {
        String apps0 = args[0];
        String apps1 = args[1];
        String apps2 = args[2];
        String apps3 = args[3];
        String apps4 = args[4];        
>>>>>>> 96ed1185434db23e0811d84fd11b6a7a9d906773
        
        boolean run = true;
        new menu();
        while (run == true){
            String searchText = searchbar.getText();
            // apps0 = "0";
            if(!"Age Calculator".startsWith(searchText)){
                apps0 = "0";
            }
               
            
        }
    }

}
