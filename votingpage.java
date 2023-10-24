import javax.swing.*;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class votingpage extends JFrame {
    JPanel mainpanel, votingpanel1, vibgyorpanel, presidentpanel, typanel;
    JButton swichvibgyorpanel, swichpresidentpanel, swichtypanel;

    public votingpage() {

        CardLayout cl = new CardLayout();
        mainpanel = new JPanel();
        vibgyorpanel = new JPanel();
        votingpanel1 = new JPanel();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("E-Voting Poll");
        setSize(500, 500);

        mainpanel.setLayout(cl);

        //MainPanel panel indexing
        mainpanel.add(votingpanel1, "1");
        mainpanel.add(vibgyorpanel, "2");
        cl.show(mainpanel, "1");

        //Voting Panel Components
        votingpanel1.setBackground(Color.GREEN);

        JLabel welcome = new JLabel("Vibgyor High Magarpatta E-Voting");
        Font wfont = new Font("Arial", Font.BOLD, 32);
        welcome.setFont(wfont);
        welcome.setBounds(200, 100, 150, 100);
        vibgyorpanel.add(welcome);

        swichvibgyorpanel = new JButton("Switch to Vibgyor Panel");
        votingpanel1.add(swichvibgyorpanel);

        //Vibgyor Panel Components
        vibgyorpanel.setLayout(null);
        vibgyorpanel.setBackground(Color.BLUE);

        

        

        swichvibgyorpanel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cl.show(mainpanel, "2");
            }
        });

        add(mainpanel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new votingpage();
    }
}
