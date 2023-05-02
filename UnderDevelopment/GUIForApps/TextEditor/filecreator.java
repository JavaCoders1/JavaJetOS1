package TextEditor;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;





public class filecreator extends JFrame implements ActionListener
{
    JPanel cpanel;
    JButton createfile, save;
    JLabel filename, textentry;
    JTextField filenamefield,textentryfield;


    filecreator()
    {
        
        setTitle("Create File");
        setSize(500,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);    
        setResizable(false);

        cpanel = new JPanel();
        add(cpanel);
        cpanel.setLayout(null);

        filename = new JLabel("File Name:");
        filename.setBounds(15,15,70,25);
        cpanel.add(filename);

        filenamefield = new JTextField();
        filenamefield.setBounds(90, 15,150, 25);
        cpanel.add(filenamefield);

        textentry = new JLabel("Enter Text");
        textentry.setBounds(15,100,100,25);
        cpanel.add(textentry);

        textentryfield = new JTextField();
        textentryfield.setBounds(120,100, 220, 100);
        cpanel.add(textentryfield);

        save = new JButton("Save");
        save.addActionListener(this);
        save.setBounds(345,100,100,25);
        cpanel.add(save);

        createfile = new JButton("Create File");
        createfile.addActionListener(this);
        createfile.setBounds(270,15,100,25);
        cpanel.add(createfile);

        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae)
    {
        String filename1 = filenamefield.getText();
        if(ae.getSource()== createfile)
        {
            
                File file = new File(filename1);
                if (file.createNewFile()) {
                    JOptionPane.showMessageDialog(this,"File created: " + file.getName());
                } else {
                    JOptionPane.showMessageDialog(this,"File already exists.");
                }

                if(ae.getSource()== save)
                {String text = textentryfield.getText();

                FileWriter myWriter = new FileWriter(file);
                myWriter.write(text);
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
            } 
            }
                
       
            
        }
        public static void main(String[] args)
    {
        new filecreator();
    }
    }

    

