package UnderDevelopment.GUIForLogjn;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class guichat extends JFrame implements ActionListener {

    JLabel userLabel, passwordLabel;
    JTextField userTextField;
    JPasswordField passwordField;
    JButton loginButton, cancelButton;

    guichat() {
        setTitle("Login Screen");
        setSize(300, 150);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(3, 2));
        add(panel);

        userLabel = new JLabel("Username:");
        panel.add(userLabel);

        userTextField = new JTextField();
        panel.add(userTextField);

        passwordLabel = new JLabel("Password:");
        panel.add(passwordLabel);

        passwordField = new JPasswordField();
        panel.add(passwordField);

        loginButton = new JButton("Login");
        loginButton.addActionListener(this);
        panel.add(loginButton);

        cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(this);
        panel.add(cancelButton);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String username = userTextField.getText();
        String password = new String(passwordField.getPassword());
        if (ae.getSource() == loginButton) {
            if (username.equals("admin") && password.equals("password")) {
                JOptionPane.showMessageDialog(this, "Login successful!");
            } else {
                JOptionPane.showMessageDialog(this, "Invalid username or password!");
            }
        } else if (ae.getSource() == cancelButton) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new guichat();
    }
}
