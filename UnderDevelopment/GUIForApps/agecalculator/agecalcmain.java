package agecalculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class agecalcmain extends JFrame implements ActionListener

{
    JPanel apanel;
    JButton enter;
    JLabel bdLabel, bmLabel, byLabel;
    JTextField bdTextField, bmTextField, byTextField;


    agecalcmain()
    {
        setTitle("Age Calculator");
        setSize(350, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        apanel = new JPanel();
        apanel.setLayout(null);
        add(apanel);

        bdLabel = new JLabel("Enter Birth Day:");
        bdLabel.setBounds(15, 10, 120, 25);
        apanel.add(bdLabel);

        bmLabel = new JLabel("Enter Birth Month: ");
        bmLabel.setBounds(15,50,120,25);
        apanel.add(bmLabel);

        byLabel = new JLabel("Enter Birth Year: ");
        byLabel.setBounds(15,100,120,25);
        apanel.add(byLabel);

        bdTextField = new JTextField();
        bdTextField.setBounds(140, 10, 120, 25);
        apanel.add(bdTextField);

        bmTextField = new JTextField();
        bmTextField.setBounds(140,50,120,25);
        apanel.add(bmTextField);

        byTextField = new JTextField();
        byTextField.setBounds(140, 100, 120,25);
        apanel.add(byTextField);

        enter = new JButton("Enter");
        enter.addActionListener(this);
        enter.setBounds(275,130,60,25);
        apanel.add(enter);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae)
    {}

    public static void main(String[] args)
    {
        new agecalcmain();
    }
}
