package UnderDevelopment;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class homepagetry extends JFrame implements ActionListener
{
    JButton sup;
    JPanel npanel;
    JPanel intermediatePanel;
    JPanel panel;
    homepagetry()
    {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("HomePage");
        setSize(500,500);

        panel = new JPanel()
        {
                protected void paintComponent(Graphics g)
            {
                super.paintComponent(g);
                g.setColor(Color.GRAY);
                g.fillRect(0,0,500,50);

                Graphics2D g2d = (Graphics2D) g.create();
                g2d.setColor(Color.BLACK);

                // Specify the length and coordinates of the line
                float thickness = (float) 3.0;
                int lineLength = 350;
                int startX = 0;
                int startY = 335;
                int endX = startX + lineLength;
                int endY = startY;

                g2d.setStroke(new BasicStroke(thickness));

                // Draw the line
                g2d.drawLine(startX, startY, endX, endY);

                try {
                    BufferedImage bgimage = ImageIO.read(new File("/Users/ojaswin/Desktop/Mac/-5678/coffeebg1.jpg"));

                    int x = 0;
                    int y = 50;
                    int bgwidth = 500;
                    int bgheight = 440;

                    g.drawImage(bgimage, x, y,bgwidth, bgheight, null);
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                
                
                

                
            }
                
        };
        
        panel.setOpaque(false);

        
        JLabel label = new JLabel("Welcome!");
        label.setForeground(Color.black);
        label.setFont(new Font("Arial", Font.BOLD, 18));
        label.setBounds(210,20,120,15);

        sup = new JButton("Menu");
        sup.addActionListener(this);
        sup.setBounds(400,13,90,25);

        JLabel aboutus = new JLabel("About Us");
        Font font = new Font("Arial", Font.BOLD, 22);
        aboutus.setFont(font);
        aboutus.setBounds(10,305,120,20);
        panel.add(aboutus);

        ImageIcon oldimage = new ImageIcon("/Users/ojaswin/Desktop/Mac/-5678/coffee2.jpg");
        Image olimage = oldimage.getImage();
        int dwidth = 200;
        int dheight = 200;
        Image image = olimage.getScaledInstance(dwidth,dheight, Image.SCALE_FAST);
        ImageIcon imageicon = new ImageIcon(image);
        JLabel imagelabel = new JLabel(imageicon);
        
        
        imagelabel.setBounds(15,70,dwidth,dheight);
        
        setVisible(true);


        JTextPane textPane = new JTextPane();
        textPane.setBounds(5,350,455,150);
        textPane.setFont(new Font("Arial", Font.PLAIN, 12));
        textPane.setForeground(Color.BLACK);
        Color backgroundColor = panel.getBackground();
        textPane.setBackground(backgroundColor);
        textPane.setText("Our story begins in 1971 along the cobblestone streets of Seattle’s historic Pike Place Market. It was here where Starbucks opened its first store, offering fresh-roasted coffee beans, tea and spices from around the world for our customers to take home. Our name was inspired by the classic tale, “Moby-Dick,” evoking the seafaring tradition of the early coffee traders.");
        String content = textPane.getText();
        StyledDocument doc = textPane.getStyledDocument();
        Style style = doc.addStyle("bold", null);
        StyleConstants.setBold(style, true);
        MutableAttributeSet paragraphAttributes = new SimpleAttributeSet();
        paragraphAttributes.addAttributes(doc.getParagraphElement(0).getAttributes());
        float lineSpacing = 0.5f; // Desired line spacing factor
        StyleConstants.setLineSpacing(paragraphAttributes, lineSpacing);
        doc.setParagraphAttributes(0, doc.getLength(), paragraphAttributes, false);
        textPane.setEditable(false);
        textPane.setOpaque(false);

        panel.add(textPane);

        panel.add(sup);
        panel.setLayout(null);
        panel.add(label);

        add(panel);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) 
    {
        if(ae.getSource() == sup)
        {
            if(npanel == null || !npanel.isVisible())
            {
                menu();
                npanel.setVisible(true);
                intermediatePanel.setVisible(true);
            }
        }
        else if(ae.getSource()==intermediatePanel.getComponent(2))
        {
            npanel.setVisible(false);
            intermediatePanel.setVisible(false);

        }
            
    }
    private void menu()
    {
        intermediatePanel = new JPanel();
        panel.add(intermediatePanel);
        intermediatePanel.setBounds(380, 50, 120, 423);
        intermediatePanel.setBackground(Color.DARK_GRAY);
        
        // Set BevelBorder to the intermediatePanel
        intermediatePanel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, Color.BLACK, Color.black));

        npanel = new JPanel();
        panel.add(npanel);
        npanel.setLayout(null);
        npanel.setBackground(Color.darkGray);

        JButton beverages = new JButton("Beverages");
        beverages.addActionListener(this);
        beverages.setBounds(10,70,100,25);
        intermediatePanel.add(beverages);

        JButton food = new JButton("Food");
        food.addActionListener(this);
        food. setBounds(10, 110,100,25);
        intermediatePanel.add(food);

        JButton close = new JButton("Close Menu");
        close.addActionListener(this);
        close.setBounds(10, 200, 100, 25);
        intermediatePanel.add(close);

    
       
        intermediatePanel.add(npanel);
        panel.add(intermediatePanel);
        panel.add(npanel);

        intermediatePanel.setVisible(true);
        npanel.setVisible(true);

    }
    


public static void main(String[] args)
    {
    
        new homepagetry();
    
    }
    
}