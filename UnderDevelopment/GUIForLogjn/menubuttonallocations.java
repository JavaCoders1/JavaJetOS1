package UnderDevelopment.GUIForLogjn;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class menubuttonallocations extends JFrame implements ActionListener
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
    menubuttonallocations()
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
        textEditor.setBounds(15,25,120,25);
        menuWin.add(textEditor);

        calc = new JButton("Calculator");
        calc.addActionListener(this);
        calc.setBounds(15,35,10,1);
        

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

    public static void main(String[] args)
    {
        new menubuttonallocations();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

}
