package UnderDevelopment;
import javax.swing.*;

import TextEditor.texteditor;
import UnderDevelopment.GUIForApps.numgame;
import agecalculator.agecalcmain;

import java.awt.*;
import java.awt.event.*;

public class cc extends JFrame implements ActionListener {
    JPanel menuWin;
    JLabel searchlabel;
    static JTextField searchbar;
    JButton searchbutton, textEditor, calc, ageCalc, numGame, monExp;
    String apps0 = "1"; // Agecalc
    String apps1 = "1"; // Calculator
    String apps2 = "1"; // Monthly Expenditure
    String apps3 = "1"; // Number Guessing Game
    String apps4 = "1"; // Text Editor

    public cc() {
        setTitle("Menu");
        setSize(400, 275);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setResizable(false);

        menuWin = new JPanel();
        menuWin.setLayout(null);
        add(menuWin);

        searchlabel = new JLabel("Enter Application Name:");
        searchlabel.setBounds(10, 220, 200, 25);
        menuWin.add(searchlabel);

        searchbar = new JTextField();
        searchbar.setBounds(175, 220, 120, 25);
        menuWin.add(searchbar);

        searchbutton = new JButton("Search");
        searchbutton.addActionListener(this);
        searchbutton.setBounds(175,120,100,25);
        menuWin.add(searchbutton);

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

        if (apps0.equals("0")) {
            menuWin.remove(ageCalc);
        }
        if (apps1.equals("0")) {
            menuWin.remove(calc);
        }
        if (apps2.equals("0")) {
            menuWin.remove(monExp);
        }
        if (apps3.equals("0")) {
            menuWin.remove(numGame);
        }
        if (apps4.equals("0")) {
            menuWin.remove(textEditor);
        }

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae)
    {
        String seresults = searchbar.getText();
        if (ae.getSource() == searchbutton)
        {
            if (seresults.equalsIgnoreCase("numbergame"))
            {
                numgame numgame= new numgame();
                numgame.setVisible(true);
                dispose();
            }

            if(seresults.equalsIgnoreCase("texteditor"))
            {
                texteditor texteditor = new texteditor();
                texteditor.setVisible(true);
                dispose();
            }
            if(seresults.equalsIgnoreCase("agecalc"))
            {
                agecalcmain agecalcmain = new agecalcmain();
                agecalcmain.setVisible(true);
                dispose();
            }
        }
    }

    public static void main(String[] args)
    {
        new cc();
       
    }
}
