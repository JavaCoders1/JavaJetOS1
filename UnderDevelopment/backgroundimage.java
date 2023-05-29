package UnderDevelopment;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class backgroundimage {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JPanel Background Image Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hi");
        
        
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                try {
                    BufferedImage image = ImageIO.read(new File("/Users/ojaswin/Desktop/Mac/-5678/coffeeimg1.jpg")); // Replace with your image path
                    g.drawImage(image, 0, 0, null);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };
        
        panel.add(label);
        panel.setOpaque(false); // Make the panel transparent
        
        frame.getContentPane().add(panel);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
