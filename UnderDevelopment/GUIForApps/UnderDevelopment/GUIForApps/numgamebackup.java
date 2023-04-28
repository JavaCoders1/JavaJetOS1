package UnderDevelopment.GUIForApps;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class numgamebackup extends JFrame implements ActionListener {
    JPanel numpanel;
    JLabel numlabel;
    JTextField num;
    JButton numcheck;
    int number = 1 + (int) (100 * Math.random());
    int remainingTries = 10; // added a variable to keep track of remaining tries

    numgamebackup() {
        
        setTitle("Number Game");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(250, 300);
        setResizable(true);

        numpanel = new JPanel();
        numpanel.setLayout(null);
        add(numpanel);

        numlabel = new JLabel("Enter Number");
        numlabel.setBounds(10, 10, 120, 25);
        numpanel.add(numlabel);

        num = new JTextField();
        num.setBounds(135, 10, 70, 25);
        numpanel.add(num);

        numcheck = new JButton("Check");
        numcheck.addActionListener(this);
        numcheck.setBounds(140, 40, 120, 25);
        numpanel.add(numcheck);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String num2 = num.getText();
        int num1 = Integer.parseInt(num2);

        if (num1 == number) { // if the number is guessed correctly
            JOptionPane.showMessageDialog(this, "You guessed the number!");
        } else if (Math.abs(num1 - number) <= 5) { // if the number is within 5 of the correct answer
            JOptionPane.showMessageDialog(this, "You are extremely near the number!");
        } else if (Math.abs(num1 - number) <= 10) { // if the number is within 10 of the correct answer
            JOptionPane.showMessageDialog(this, "You are near the number");
        } else if (num1 > number) { // if the number is greater than the correct answer
            JOptionPane.showMessageDialog(this, "Your number is greater than the number");
        } else { // if the number is smaller than the correct answer
            JOptionPane.showMessageDialog(this, "Your number is smaller than the number");
        }
        
        remainingTries--; // decrement the remaining tries after each guess

        if (remainingTries == 0) { // if there are no remaining tries left
            JOptionPane.showMessageDialog(this, "You have exhausted all trials" + "\nThe number was: " + number);
            numcheck.setEnabled(false); // disable the "Check" button
        }
    }

    public static void main(String[] args) {
        new numgamebackup();
    }
}
