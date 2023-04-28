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
        String num2 = num.getText();
        int num1 = Integer.parseInt(num2);
        int number = 1 + (int)(100* Math.random());
        int K = 10;
        //K = sc.nextInt();
        int i = 0; 
        int guess = 0;
        for (i = 0; i < K; i++) 
        {

            

            // If the number is guessed
            if (number == num1) {
                JOptionPane.showMessageDialog(this, "You guessed the number!");
            break;
            }
            if(num1 > number - 5 && num1 < number + 5 && i!= K-1)
            {
                JOptionPane.showMessageDialog(this, "You are extremely near the number!");;
            }
            else if (guess > number - 10 && guess < number + 10
            && i != K - 1) {
                JOptionPane.showMessageDialog(this, "You are near the number");
            }
            else if(number > guess && i!=K - 1)
            {
                JOptionPane.showMessageDialog(this, "Your number is greater than the number");
            }
            else if(number<guess && i!=K)
            {
                JOptionPane.showMessageDialog(this, "Your number is smaller than the number");
            }
            }

            if (i == K) 
            {
                JOptionPane.showMessageDialog(this, "You have exhausted all trials"+"\nThe number was: "+number);
        }
        
    }
    
}
