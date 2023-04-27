package UnderDevelopment.GUIForApps;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class numgame extends JFrame implements ActionListener
{
    JPanel numpanel;
    JLabel numlabel;
    JTextField num;
    JButton numcheck;

    numgame()
    {
        setTitle("Number Game");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(250,300);
        setResizable(true);

        numpanel = new JPanel();
        numpanel.setLayout(null);
        add(numpanel);

        numlabel =new JLabel("Enter Number");
        numlabel.setBounds(10, 10, 120, 25);
        numpanel.add(numlabel);

        num = new JTextField();
        num.setBounds(135, 10, 70, 25);
        numpanel.add(num);

        numcheck = new JButton("Check");
        numcheck.addActionListener(this);
        numcheck.setBounds(140, 40, 120, 25);
        numpanel.add(numcheck);

    }

    

    public void actionperformed (ActionEvent ae)
    {
        int num1 = new int(num.getText());
        
    }
    
}
