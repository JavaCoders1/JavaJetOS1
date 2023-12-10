import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.imageio.ImageIO;
import javax.sound.midi.VoiceStatus;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.CardLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;




//Changes to be made in main code are: 
//Panel size to be set to 900(width),500(height)(line 26)
// Background of panel to be set to white(255,255,255)(line 27)
//Position of Vice President label(line 36)


public class combclass extends JFrame 
{
    BufferedImage oldimage3;
    Image nimage2;
    ImageIcon image3;
    JLabel imgl3;
    Border r3;
    String pvar;
    JFrame mainframe = new JFrame();
    
    

    JPanel vibgyorpanel = new JPanel()
    {
        protected void paintComponent(Graphics g)
            {
                super.paintComponent(g);
                
                g.fillRect(0,0,500,50);

                Graphics2D g2d = (Graphics2D) g.create();
                g2d.setColor(Color.BLACK);

                // Specify the length and coordinates of the line
                

                Color blue = new Color(44,174,122);
                g2d.setColor(blue);
                g2d.fillRoundRect(0,0,900,65,20,20);

                
            
            }
    };
    

    private void insertimgtext(String imgtext, int x1,int y1,int w1,int h1, boolean check1)
    {
        JLabel img3 = new JLabel(imgtext);
       img3.setBounds(x1,y1,w1,h1);
       vibgyorpanel.add(img3);

       if(check1 ==false)
       {
        img3.setVisible(false);
       }
       else{img3.setVisible(true);}

    }

    private void insertImage(String link, int x, int y, int width, int height, boolean check, boolean check2)
    {
     
       
    try {
        oldimage3 = ImageIO.read(new File(link));
        nimage2 = oldimage3.getScaledInstance(width, height, Image.SCALE_FAST);

       image3 = new ImageIcon(nimage2);
       imgl3 = new JLabel(image3);
       r3 = BorderFactory.createLineBorder(Color.BLACK,2);
       imgl3.setBounds(x,y,width,height);

       vibgyorpanel.add(imgl3);

       //if img wants to be displayed
       if(check == false)
       {
        imgl3.setVisible(false);
       }
       else{imgl3.setVisible(true);}


       if(check2 == false)
       {

        imgl3.setBorder(r3);
       }
       else{}
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    } }

    private void insertdata(String tableName, String var)
    {
        try {
            String url = "jdbc:mysql://192.168.1.9:3306/votingdata?";
            String user = "root";
            String password = "Ojas@080109";

            Connection connection = DriverManager.getConnection(url, user, password);
            String name = var;
            String query = "INSERT INTO " + tableName + " VALUES('" + name + "')";
            Statement sta = connection.createStatement();
            int x = sta.executeUpdate(query);
            sta.close();
            connection.close();

        } catch (SQLException e) {
            System.err.println("SQL Exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
    


    public combclass()
    {
        
        setLayout(null);
        setTitle("E-Voting Poll");
        setSize(900, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        
        vibgyorpanel.setLayout(null);
        vibgyorpanel.setBounds(0, 0, 900, 500);
        Color color = new Color(255,255,255);
        vibgyorpanel.setBackground(color);
        vibgyorpanel.repaint();
        

       //Label 
       JLabel vp = new JLabel("E-Voting Poll", JLabel.CENTER);
       Color purple = new Color(44,174,122);
       Font vpfont = new Font("Arial",Font.BOLD, 33);
       vp.setOpaque(true);
       vp.setBackground(purple);
       vp.setFont(vpfont);
       vp.setBounds(0,10,900,50);
       vibgyorpanel.add(vp);

  
       //Main JLabel
       JLabel main1 = new JLabel("Vibgyor E-Voting", JLabel.CENTER);
       main1.setOpaque(true);
       main1.setBackground(Color.WHITE);
       main1.setFont(vpfont);
       main1.setBounds(260,180,400,50);
       vibgyorpanel.add(main1);

       JLabel main2 = new JLabel("AY 2023-24",JLabel.CENTER);
       main2.setOpaque(true);
       main2.setBackground(Color.WHITE);
       main2.setFont(new Font("Arial",Font.BOLD,32));
       main2.setBounds(263,245,400,50);
       vibgyorpanel.add(main2);

       //Button Next 
       JButton to_p = new JButton("Next");
       to_p.setFont(new Font("Arial",Font.ITALIC,20));
       to_p.setBounds(657,355,130,60);
       to_p.revalidate();
       to_p.repaint();
       vibgyorpanel.add(to_p);


       add(vibgyorpanel);
       vibgyorpanel.setVisible(true);
       //vibgyorpanel.setOpaque(false);

       to_p.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent ae)
        {
           new president();
            
        }
       });

       insertImage("/Users/ojaswin/Desktop/-087.png", 365, 80, 190, 70, true, true);
    }

    

    
       
       
       

    
   

   
            
    
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(() -> {
            new combclass();
        });

        
        
    }
    
}


