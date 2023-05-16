package UnderDevelopment.filter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ttt extends JFrame
{
    char playersign = 'X';
    JPanel tpanel;
    JButton[] buttons = new JButton[9];

    ttt()
    {
        setTitle("Tic Tac Toe");
        setLayout(new GridLayout(3,3));
        setLocationRelativeTo(null);
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
        
        initbut();
        setVisible(true);
    }

    public void initbut() 
    {
        for(int i = 0; i <= 8; i++) 
        {
            buttons[i] = new JButton();
            buttons[i].addActionListener(new ActionListener() 
            {
                public void actionPerformed(ActionEvent ae)
                {
                    
                    JButton buttoncl = (JButton) ae.getSource();
                    buttoncl.setText(String.valueOf(playersign));
                    if(playersign == 'X')
                    {
                        playersign = 'O';
                        
                    }
                    else
                    {
                        playersign = 'X';
                    }
                    victory();
                }
                
            });
            add(buttons[i]);
        }

        
    }
    public boolean checkrows()
        {
            int i = 0;
            int j;
            for(j=0; j<3;j++)
            return true;
            
            
        }

    public void victory()
    {
        
    }
    
    public static void main(String[] args)
    {
        new ttt();
    }
}