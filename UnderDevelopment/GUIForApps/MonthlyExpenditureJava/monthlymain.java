package MonthlyExpenditureJava;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class monthlymain extends JFrame implements ActionListener
{
    JPanel mpanel;
    JLabel salaryLabel, rentlabel, extralabel, foodlabel;
    JTextField salaryTextField, rentTextField, extraTextField,foodTextField;
    JButton salaryButton, rentButton, extraButton, foodButton;

    monthlymain()
    {
        setTitle("Monthly Expenditure");
        setSize(300,100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel mpanel = new JPanel();
        mpanel.setLayout(null);
        add(mpanel);

        JLabel salaryLabel = new JLabel("Enter Salary:");
        salaryLabel.setBounds(15,10,120, 25);
        mpanel.add(salaryLabel);

        JTextField salaryTextField = new JTextField();
        salaryTextField.setBounds(140,10,100,25);
        mpanel.add(salaryTextField);

        JButton salaryButton = new JButton("Add");
        salaryButton.addActionListener(this);
        salaryButton.setBounds(245, 10, 60, 25);
        mpanel.add(salaryButton);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae)
    {

    }
    public static void main(String[] args)
    {
        new monthlymain();
    }
    
}
