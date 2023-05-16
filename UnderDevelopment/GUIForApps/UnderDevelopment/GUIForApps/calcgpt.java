package UnderDevelopment.GUIForApps;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class calcgpt extends JFrame {
    private JTextField display = new JTextField("0", 20);
    private JButton[] buttons = new JButton[16];
    private String[] labels = {"7", "8", "9", "/",
                               "4", "5", "6", "*",
                               "1", "2", "3", "-",
                               "0", ".", "=", "+"};
    private double result = 0;
    private String operator = "=";
    private boolean calculating = true;

    public calcgpt() {
        setLayout(new BorderLayout());

        add(display, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        for (int i = 0; i < labels.length; i++) {
            buttons[i] = new JButton(labels[i]);
            buttonPanel.add(buttons[i]);
            buttons[i].addActionListener(new ButtonHandler());
        }

        add(buttonPanel, BorderLayout.CENTER);

        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private class ButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String label = ((JButton) e.getSource()).getText();
            if (label.equals("C")) {
                result = 0;
                operator = "=";
                display.setText("0");
                calculating = true;
            } else if ("0123456789.".indexOf(label) >= 0) {
                if (calculating) {
                    display.setText(label);
                    calculating = false;
                } else {
                    display.setText(display.getText() + label);
                }
            } else {
                if (operator.equals("/")) {
                    result /= Double.parseDouble(display.getText());
                } else if (operator.equals("*")) {
                    result *= Double.parseDouble(display.getText());
                } else if (operator.equals("-")) {
                    result -= Double.parseDouble(display.getText());
                } else if (operator.equals("+")) {
                    result += Double.parseDouble(display.getText());
                } else if (operator.equals("=")) {
                    result = Double.parseDouble(display.getText());
                }
                display.setText("" + result);
                operator = label;
                calculating = true;
            }
        }
    }

    public static void main(String[] args) {
        new calcgpt();
    }
}
