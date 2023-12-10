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
import javax.swing.*;
import javax.swing.border.Border;



//Changes to be made in main code are: 
//Panel size to be set to 900(width),500(height)(line 26)
// Background of panel to be set to white(255,255,255)(line 27)
//Position of Vice greencap label(line 36)


public class greencap extends JFrame 
{
    BufferedImage oldimage3;
    Image nimage2;
    ImageIcon image3;
    JLabel imgl3;
    Border r3;
    String gcvar;
   

    JPanel greencap = new JPanel()
    {
        protected void paintComponent(Graphics g)
            {
                super.paintComponent(g);
                
                g.fillRect(0,0,500,50);

                Graphics2D g2d = (Graphics2D) g.create();
                g2d.setColor(Color.BLACK);

                // Specify the length and coordinates of the line
                

                Color blue = new Color(54,116,179);
                g2d.setColor(blue);
                g2d.fillRoundRect(0,0,900,65,20,20);

                g.drawImage(oldimage3,690,380,200,70,this);
            
            }

    };
    


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
    public greencap()
    {
        
        setLayout(null);
        setTitle("Vice-greencap Panel");
        setSize(900, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        
        greencap.setLayout(null);
        greencap.setBounds(0, 0, 900, 500);
        Color color = new Color(242,253,255);
        greencap.setBackground(color);
        greencap.repaint();
        

       //Label 
       JLabel vp = new JLabel("Green House Captain", JLabel.CENTER);
       Color purple = new Color(54,116,179);
       Font vpfont = new Font("Arial",Font.BOLD, 32);
       vp.setOpaque(true);
       vp.setBackground(purple);
       vp.setFont(vpfont);
       vp.setBounds(-10,10,900,50);
       greencap.add(vp);

       //Button 1
       JButton buttonvp1 = new JButton("Button1");
       buttonvp1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)
        {
            gcvar = "1";
            System.out.println("Check1");
        }
       });
       buttonvp1.setBounds(247,125,170,50);
       greencap.add(buttonvp1);
 

       //Button 2
       JButton buttonvp2 = new JButton("Button 2");
       buttonvp2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)
        {
            gcvar = "2";
        }
       });
       buttonvp2.setBounds(483,125,170,50);
       greencap.add(buttonvp2);


       //Button 3
       JButton buttonvp3 = new JButton("Button 3");
       buttonvp3.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)
        {
            gcvar = "3";
        }
       });
       buttonvp3.setBounds(360,210,170,50);
       greencap.add(buttonvp3);


       //Button Next 
       JButton to_ghvc = new JButton("Next");
       to_ghvc.setBounds(557,255,100,50);
       greencap.add(to_ghvc);

       //Image1

       insertImage("/Users/ojaswin/VotingDatabase/img1.jpg", 50, 65, 150, 150,true, false);
       insertimgtext("Image 1", 100, 205, 100, 50,true);

       //Image2
       insertImage("/Users/ojaswin/VotingDatabase/img2.jpg", 50, 265, 150, 150,true, false);
       insertimgtext("Image 2", 100, 405, 100, 50,true);

       //Image3
       insertImage("/Users/ojaswin/VotingDatabase/img3.jpg",700, 65, 150, 150,true, false);
       insertimgtext("Image 3", 750, 205, 100, 50,true);

       //Image4
       insertImage("/Users/ojaswin/VotingDatabase/img4.jpg", 700,265,150,150,false, false);
       insertimgtext("Image 4", 750,405,100,50,false);
       //Vibgyor image
       insertImage("/Users/ojaswin/VotingDatabase/vib.png", 690, 380, 200, 70,true, true);

       add(greencap);
       greencap.setVisible(true);
       //greencap.setOpaque(false);

       to_ghvc.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent ae)
        {
            insertdata("greencaptain_data", gcvar);
            new greenvicecap();
        }
       });
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

       greencap.add(imgl3);

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
    } 
       
       
       

       

    }
    private void insertimgtext(String imgtext, int x1,int y1,int w1,int h1, boolean check1)
    {
        JLabel img3 = new JLabel(imgtext);
       img3.setBounds(x1,y1,w1,h1);
       greencap.add(img3);

       if(check1 ==false)
       {
        img3.setVisible(false);
       }
       else{img3.setVisible(true);}

    }

   
            
    public JPanel getgreencapPanel() {
        return greencap;
    }

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(() -> {
            new greencap();
        });

        
    }
    
}


