import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class calculatormain extends JFrame implements ActionListener
{
    JPanel calcpanel;
    calculatormain()
    {
        setTitle("Calculator");
        setLocationRelativeTo(null);
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        calcpanel = new JPanel();
        calcpanel.setLayout(null);
        add(calcpanel);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae)
    {

    }

    public static void main(String[] args)
    {
        new calculatormain();

    }
}
