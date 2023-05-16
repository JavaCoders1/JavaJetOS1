package MonthlyExpenditureJava;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class monthlymain extends JFrame implements ActionListener
{
    JPanel mpanel;
    JLabel salaryLabel, rentlabel, extralabel, foodlabel;
    JTextField salaryTextField, rentTextField, extraTextField,foodTextField;
    JButton salaryButton, rentButton, extraButton, foodButton, reader;
    String filename;
    private FileWriter myWriter;
    private Scanner reader1;
    private File file;
    private String allLines;

    monthlymain()
    {
        setTitle("Monthly Expenditure");
        setSize(325,250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        mpanel = new JPanel();
        mpanel.setLayout(null);
        add(mpanel);

        salaryLabel = new JLabel("Enter Salary:");
        salaryLabel.setBounds(15,10,120, 25);
        mpanel.add(salaryLabel);

        salaryTextField = new JTextField();
        salaryTextField.setBounds(140,10,100,25);
        mpanel.add(salaryTextField);

        salaryButton = new JButton("Add");
        salaryButton.addActionListener(this);
        salaryButton.setBounds(80, 170, 60, 25);
        mpanel.add(salaryButton);

        rentlabel = new JLabel("Enter Rent/EMI:");
        rentlabel.setBounds(15,50,120,25);
        mpanel.add(rentlabel);

        rentTextField = new JTextField();
        rentTextField.setBounds(140,50,100,25);
        mpanel.add(rentTextField);

        rentButton = new JButton("Add");
        rentButton.addActionListener(this);
        rentButton.setBounds(245,50,60,25);
        

        extralabel = new JLabel("Enter Extra Exp.:");
        extralabel.setBounds(15,90,120,25);
        mpanel.add(extralabel);

        extraTextField = new JTextField();
        extraTextField.setBounds(140,90,100,25);
        mpanel.add(extraTextField);

        extraButton = new JButton("Add");
        extraButton.addActionListener(this);
        extraButton.setBounds(245,90,60,25);
        

        foodlabel = new JLabel("Enter Food Exp.:");
        foodlabel.setBounds(15,130, 120, 25);
        mpanel.add(foodlabel);

        foodTextField = new JTextField();
        foodTextField.setBounds(140,130,100,25);
        mpanel.add(foodTextField);

        foodButton = new JButton("Add");
        foodButton.addActionListener(this);
        foodButton.setBounds(245,130,60,25);

        reader = new JButton("Read Prev Content");
        reader.addActionListener(this);
        reader.setBounds(170,170,100,25);
        mpanel.add(reader);
        

        setVisible(true);
        try {
            filename = "meb.txt";
            file = new File(filename);
            myWriter = new FileWriter(file, true); // append to file
            
        } catch (IOException e) {
            e.printStackTrace();
        }
       
    }

    public void actionPerformed(ActionEvent ae)
    {
        String salary1 = salaryTextField.getText();
        double salaryint = Integer.parseInt(salary1);
        String salary = "Salary: " + salaryint;
        

        String rent1 = rentTextField.getText();
        double rentint = Integer.parseInt(rent1);
        String rent = "Rent/EMI: " + rentint;
        

        String extra1 = extraTextField.getText();
        double extraint = Integer.parseInt(extra1);
        String extra = "Extra: " + extraint;
        

        String food1 = foodTextField.getText();
        double foodint = Integer.parseInt(food1);
        String food = "Food: " + foodint;
        

        double taxint = 0.5*salaryint;
        String tax = "Tax: " + taxint;

        double totalint = rentint + extraint + foodint + taxint ;

        double savingsint = salaryint - totalint;
        String savings = "Savings: "+savingsint;
        



        String total = salary+"\n" + rent +"\n" + extra +"\n"+ food + "\n"+tax + "\n"+savings+ ".";
        String msgtotal = salary+"\n" + rent +"\n" + extra +"\n"+ food + "\n"+tax + ".";


    
        if(ae.getSource() == salaryButton)
        {
            JOptionPane.showMessageDialog(this,msgtotal);
            try {
                myWriter.write(total);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
        }

        

        if(ae.getSource() == rentButton)
        {
            try
            {
                myWriter.write(rent);
                JOptionPane.showMessageDialog(this, rent1);
            }

            catch(IOException e)
            {
                e.printStackTrace();
            }
            
        }

        


        if(ae.getSource() == extraButton)
        {
            try
            {
                myWriter.write(extra);
                
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
            
        }
        
        
        if(ae.getSource() == foodButton)
        {
            try
            {
                myWriter.write(food);
                
            }

            catch(IOException e)
            {
                e.printStackTrace();
            }
            
        }
        try {
            myWriter.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        if(ae.getSource()== reader)
        {
            try 
            {
            reader1 = new Scanner(file);
            } 
            catch (FileNotFoundException e) 

            {
            // TODO Auto-generated catch block
            e.printStackTrace();
            }
            
            while (reader1.hasNextLine()) 
            {
            String line = reader1.next(" .");
            allLines += reader1.nextLine() + "\n";
            }
            reader1.close();
            JOptionPane.showMessageDialog(null, allLines, "File Contents", JOptionPane.INFORMATION_MESSAGE);
        }
        
    } 
    
    public static void main(String[] args)
    {
        new monthlymain();
    }
    
}
