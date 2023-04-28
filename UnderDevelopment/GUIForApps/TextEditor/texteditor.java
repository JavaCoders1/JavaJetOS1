package TextEditor;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class texteditor extends JFrame implements ActionListener
{
    JPanel textpanel ;
    JLabel fileenter;
    JButton createfile, openfile;

    texteditor()
    {
        setTitle("Text Editor");
        setSize(400,200);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        textpanel =new JPanel();
        textpanel.setLayout(null);
        add(textpanel);

        fileenter = new JLabel("Create or Open File: ");
        fileenter.setBounds(15, 15, 120, 25);
        textpanel.add(fileenter);

        createfile = new JButton("Create a File");
        createfile.addActionListener(this);
        createfile.setBounds(140,15,120,25);
        textpanel.add(createfile);

        openfile = new JButton("Open a File");
        openfile.addActionListener(this);
        openfile.setBounds(265, 15,120,25);
        textpanel.add(openfile);



        

    }

    
}
