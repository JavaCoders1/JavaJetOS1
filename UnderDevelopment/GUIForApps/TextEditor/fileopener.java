package TextEditor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileopener extends JFrame implements ActionListener

{
    JPanel fpanel;
    JLabel filename, textentry;
    JTextField filenamefield, textentryfield;
    JButton createfile, save;
    fileopener()
    {
        setTitle("Open File");
        setSize(500,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        fpanel = new JPanel();
        add(fpanel);
        fpanel.setLayout(null);

        filename = new JLabel("File Name:");
        filename.setBounds(15, 15, 70, 25);
        fpanel.add(filename);

        filenamefield = new JTextField();
        filenamefield.setBounds(90, 15, 150, 25);
        fpanel.add(filenamefield);

        textentry = new JLabel("Enter Text");
        textentry.setBounds(15, 100, 100, 25);
        fpanel.add(textentry);

        textentryfield = new JTextField();
        textentryfield.setBounds(120, 100, 220, 100);
        fpanel.add(textentryfield);

        save = new JButton("Save");
        save.addActionListener(this);
        save.setBounds(345, 100, 100, 25);
        fpanel.add(save);

        createfile = new JButton("Open/Edit File");
        createfile.addActionListener(this);
        createfile.setBounds(270, 15, 150, 25);
        fpanel.add(createfile);

        setVisible(true);
    } 

   

    public void actionPerformed(ActionEvent ae) 
    {
        String filename1 = filenamefield.getText();
        File file = new File(filename1);
        String rtext = textentryfield.getText();

        if (ae.getSource() == createfile) 
        {
            try
            {
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                StringBuilder stringBuilder = new StringBuilder();
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    line = line.replaceAll("old_text", rtext);
                    stringBuilder.append(line).append("\n");
                }
                bufferedReader.close();
                String modifiedText = stringBuilder.toString();
                textentryfield.setText(modifiedText);
            }

            catch(IOException e)
            {
                e.printStackTrace();
            }
        }
        else if (ae.getSource() == save) 
        {
            String text = textentryfield.getText();
            try 
            {
                FileWriter myWriter = new FileWriter(file);
                myWriter.write(text);
                myWriter.close();
                JOptionPane.showMessageDialog(this, "Successfully wrote to the file.");
            } 
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        }
        
    }

    public static void main(String[] args)
    {
        new fileopener();
    }

    
}
