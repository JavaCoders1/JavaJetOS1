import java.awt.CardLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;


public class votepage extends JFrame implements ActionListener
{
    JPanel panelframe, vibgyorpanel, president, vicepresident,greencaptain;
    JButton to_p, to_vp,to_ghc;
    String pvar = "0";
    String vpvar = "0";
    String gcvar = "0";
    JButton buttonp1, buttonp2, buttonp3, buttonvp1, buttonvp2, buttonvp3,buttongc1,buttongc2,buttongc3;

    

    public votepage()
    {
       CardLayout cl = new CardLayout();
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setTitle("Voting Page");
       setSize(500,500);
       setLayout(cl);
       
       
       panelframe = new JPanel();//Main Frame init
       panelframe.setLayout(cl);
       

       //Panel Indexing
       vibgyorpanel = new JPanel();
       vicepresident = new JPanel();
       president = new JPanel();
       greencaptain = new JPanel();

       panelframe.add(vibgyorpanel,"1");
       cl.show(panelframe,"1");
       
       
       

       //Vibgyor Panel Customization
       
       vibgyorpanel.setLayout(null);
       vibgyorpanel.setBounds(0,0,500,500);

       JLabel schoollabel = new JLabel("Vibgyor High Magarpatta E-Voting");
       Font schoollfont = new Font("Arial", Font.BOLD, 36);
       schoollabel.setFont(schoollfont);
       schoollabel.setBounds(90,30,400,70);
       vibgyorpanel.add(schoollabel);

       to_p = new JButton("Next");
       to_p.setBounds(125,200,100,50);
       vibgyorpanel.add(to_p);

       //President Customization
       panelframe.add(president,"2");
       president.setLayout(null);
       president.setBounds(0,0,500,500);

       JLabel p = new JLabel("President");
       Font pfont = new Font("Arial", Font.BOLD, 32);
       p.setFont(pfont);
       p.setBounds(220,30,300,50);
       president.add(p);

       buttonp1 = new JButton("Button1");
       buttonp1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)
        {
            pvar = "1";
            System.out.println("Button1 Clicked");
        }
       });
       buttonp1.setBounds(155,145,170,50);
       president.add(buttonp1);

       buttonp2 = new JButton("Button 2");
       buttonp2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)
        {
            pvar = "2";
        }
       });
       buttonp2.setBounds(155,205,170,50);
       president.add(buttonp2);

       buttonp3 = new JButton("Button 3");
       buttonp3.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)
        {
            pvar = "3";
        }
       });
       buttonp3.setBounds(155,265,170,50);
       president.add(buttonp3);

       to_vp = new JButton("Next");
       to_vp.setBounds(300,300,100,50);
       president.add(to_vp);


       //Vicepresident Customization
       
       panelframe.add(vicepresident,"3");
       vicepresident.setLayout(null);
       vicepresident.setBounds(0, 0, 500, 500);


       JLabel vp = new JLabel("Vice-President");
       Font vpfont = new Font("Arial",Font.BOLD, 32);
       vp.setFont(vpfont);
       vp.setBounds(120,30,400,50);
       vicepresident.add(vp);

       buttonvp1 = new JButton("Button1");
       buttonvp1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)
        {
            vpvar = "1";
            System.out.println("Check1");
        }
       });
       buttonvp1.setBounds(155,145,170,50);
       vicepresident.add(buttonvp1);
 
       buttonvp2 = new JButton("Button 2");
       buttonvp2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)
        {
            vpvar = "2";
        }
       });
       buttonvp2.setBounds(155,205,170,50);
       vicepresident.add(buttonvp2);

       buttonvp3 = new JButton("Button 3");
       buttonvp3.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)
        {
            vpvar = "3";
        }
       });
       buttonvp3.setBounds(155,265,170,50);
       vicepresident.add(buttonvp3);

       to_ghc = new JButton("Next");
       to_ghc.setBounds(300,300,100,50);
       vicepresident.add(to_ghc);

       //Greenhouse Captain Panel
       panelframe.add(greencaptain,"4");
       greencaptain.setLayout(null);
       greencaptain.setBounds(0,0,500,500);
       
       JLabel gc = new JLabel("GreenHouse Captain");
       Font gcfont = new Font("Arial",Font.BOLD, 32);
       gc.setFont(gcfont);
       gc.setBounds(120,30,400,50);
       greencaptain.add(gc);

       buttongc1 = new JButton("Button1");
       buttongc1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)
        {
            gcvar = "1";
        }
       });
       buttongc1.setBounds(155,145,170,50);
       greencaptain.add(buttongc1);

       buttongc2 = new JButton("Button 2");
       buttongc2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)
        {
            gcvar = "2";
        }
       });
       buttongc2.setBounds(155,205,170,50);
       greencaptain.add(buttongc2);

       buttongc3 = new JButton("Button 3");
       buttongc3.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)
        {
            gcvar = "3";
        }
       });
       buttongc3.setBounds(155,265,170,50);
       greencaptain.add(buttongc3);

       


       //Transitioning Components and Methods
       vicepresident.setVisible(true);

       to_p.addActionListener(new ActionListener() 
       {
        public void actionPerformed(ActionEvent e)
        {
            cl.show(panelframe,"2");
            vibgyorpanel.setVisible(false);
            president.setVisible(true);
        }
       });

       to_vp.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e )
        {
            System.out.println("To_VP button clicked");
            cl.show(panelframe,"3");
            president.setVisible(false);
            vicepresident.setVisible(true);
            System.out.println("Insertion of B1 value done");
            if( pvar.equals("1"))
            {
                try
                {
                    String url = "jdbc:mysql://localhost:3306/votingdata?useSSL=false"; // Disable SSL
                    String user = "root";
                    String password = "Ojas@080109";

                    Connection connection = DriverManager.getConnection(url, user,password);
                    String name = "Button 1";
                    String query = "INSERT INTO president_data VALUES('"+name+"')";
                    Statement sta = connection.createStatement();
                    int x = sta.executeUpdate(query);
                    sta.close();
                    
                    connection.close();
                    
                }
                catch(Exception exception)
                {
                    exception.printStackTrace();
                }
            }
            if(pvar.equals("2"))
            {
                try
                {
                    String url = "jdbc:mysql://localhost:3306/votingdata?useSSL=false"; // Disable SSL
                    String user = "root";
                    String password = "Ojas@080109";

                    Connection connection = DriverManager.getConnection(url, user,password);
                    String name = "Button 2";
                    String query = "INSERT INTO president_data VALUES('"+name+"')";
                    Statement sta = connection.createStatement();
                    int x = sta.executeUpdate(query);
                    sta.close();
                    
                    connection.close();

                }
                catch(Exception exception)
                {
                    exception.printStackTrace();
                }
                    
            }
            if(pvar.equals("3"))
            {
                try
                {
                    String url = "jdbc:mysql://localhost:3306/votingdata?useSSL=false"; // Disable SSL
                    String user = "root";
                    String password = "Ojas@080109";

                    Connection connection = DriverManager.getConnection(url, user,password);
                    String name = "Button 3";
                    String query = "INSERT INTO president_data VALUES('"+name+"')";
                    Statement sta = connection.createStatement();
                    int x = sta.executeUpdate(query);
                    sta.close();
                    
                    connection.close();

                }
                catch(Exception exception)
                {
                    exception.printStackTrace();
                }
            }
        }
       });

       to_ghc.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)
        {
            cl.show(panelframe,"4");
            vicepresident.setVisible(false);
            greencaptain.setVisible(true);

            if( vpvar.equals("1"))
            {
                try
                {
                    String url = "jdbc:mysql://localhost:3306/votingdata?useSSL=false"; // Disable SSL
                    String user = "root";
                    String password = "Ojas@080109";

                    Connection connection = DriverManager.getConnection(url, user,password);
                    String name = "Button 1";
                    String query = "INSERT INTO vicepresident_data VALUES('"+name+"')";
                    
                    Statement sta = connection.createStatement();
                    int x = sta.executeUpdate(query);
                    sta.close();
                    
                    connection.close();
                }
                catch(Exception exception)
                {
                    exception.printStackTrace();
                }
            }
            if(vpvar.equals("2"))
            {
                try
                {
                    String url = "jdbc:mysql://localhost:3306/votingdata?useSSL=false"; // Disable SSL
                    String user = "root";
                    String password = "Ojas@080109";

                    Connection connection = DriverManager.getConnection(url, user,password);
                    String name = "Button 2";
                    String query = "INSERT INTO vicepresident_data VALUES('"+name+"')";
                    Statement sta = connection.createStatement();
                    int x = sta.executeUpdate(query);
                    sta.close();
                    
                    connection.close();

                }
                catch(Exception exception)
                {
                    exception.printStackTrace();
                }
                    
            }
            if(vpvar.equals("3"))
            {
                try
                {
                    String url = "jdbc:mysql://localhost:3306/votingdata?useSSL=false"; // Disable SSL
                    String user = "root";
                    String password = "Ojas@080109";

                    Connection connection = DriverManager.getConnection(url, user,password);
                    
                    String name = "Button 3";
                    String query = "INSERT INTO vicepresident_data VALUES('"+name+"')";
                    System.out.println("Check6");
                    Statement sta = connection.createStatement();
                    int x = sta.executeUpdate(query);
                    sta.close();
                    
                    connection.close();

                }
                catch(Exception exception)
                {
                    exception.printStackTrace();
                }
            }

        }
       });;

       
       
       add(panelframe);

       setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) 
    {
        
        
        
        
    }

    public static void main(String[] args)
    {
        new votepage();   
    }
    
}
