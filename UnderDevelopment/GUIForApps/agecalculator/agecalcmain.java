package agecalculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalDateTime;


public class agecalcmain extends JFrame implements ActionListener

{
    JPanel apanel;
    JButton enter;
    JLabel bdLabel, bmLabel, byLabel;
    JTextField bdTextField, bmTextField, byTextField;


    public agecalcmain()
    {
        setTitle("Age Calculator");
        setSize(350, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        apanel = new JPanel();
        apanel.setLayout(null);
        add(apanel);

        bdLabel = new JLabel("Enter Birth Day:");
        bdLabel.setBounds(15, 10, 120, 25);
        apanel.add(bdLabel);

        bmLabel = new JLabel("Enter Birth Month: ");
        bmLabel.setBounds(15,50,120,25);
        apanel.add(bmLabel);

        byLabel = new JLabel("Enter Birth Year: ");
        byLabel.setBounds(15,90,120,25);
        apanel.add(byLabel);

        bdTextField = new JTextField();
        bdTextField.setBounds(140, 10, 120, 25);
        apanel.add(bdTextField);

        bmTextField = new JTextField();
        bmTextField.setBounds(140,50,120,25);
        apanel.add(bmTextField);

        byTextField = new JTextField();
        byTextField.setBounds(140, 90, 120,25);
        apanel.add(byTextField);

        enter = new JButton("Enter");
        enter.addActionListener(this);
        enter.setBounds(275,130,60,25);
        apanel.add(enter);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae)
    {
        String bd = bdTextField.getText();
        String bm = bmTextField.getText();
        String by = byTextField.getText();

        String DOB = bd+"-"+bm+"-"+by;
        LocalDateTime now = LocalDateTime.now();
        String CurrentTime = now.toString();
        if(ae.getSource() == enter)
        {
            String[] parts = DOB.split("-");
        int DateOfB;
        int YearofB;
        int MonthOfB;
        int ageInDays = 0;
        int ageInMonths = 0;
        boolean BirthDayThisYear = true;
        DateOfB = Integer.parseInt(parts[0]);
        MonthOfB = Integer.parseInt(parts[1]);
        YearofB = Integer.parseInt(parts[2]);
        String[] PartsOfNow = CurrentTime.split("-");
        int CurrentYear = Integer.parseInt(PartsOfNow[0]);
        int CurrentMonth = Integer.parseInt(PartsOfNow[1]);
        String[] FindCurrentDate = PartsOfNow[2].split("T");
        int CurrentDate = Integer.parseInt(FindCurrentDate[0]);
        if (MonthOfB > CurrentMonth){
            BirthDayThisYear = false;
        }
        if (CurrentDate < DateOfB){
            if (CurrentMonth == 01 || CurrentMonth == 03 || CurrentMonth == 05 || CurrentMonth == 07 || CurrentMonth == 8 || CurrentMonth == 10 || CurrentMonth == 12){
                CurrentDate += 31;
                CurrentMonth -= 1;
            }
            else if (CurrentMonth == 04 || CurrentMonth == 06 || CurrentMonth == 9 || CurrentMonth == 11){
                CurrentDate += 30;
                CurrentMonth -= 1;
            }
            else{
                if (CurrentYear%100==0){
                    if (CurrentYear%400==0){
                        DateOfB -= 1;
                    }
                    else if (CurrentDate%400!=0){
                        
                    }
                }
            }
        }
        if (CurrentDate >= DateOfB){ // finding the age of the user in days
            ageInDays = CurrentDate - DateOfB;
        }
        if (CurrentMonth < MonthOfB){ // carrying over a year for month subtration
            CurrentMonth +=12;
            CurrentYear -= 1;
        }
        if (CurrentMonth >= MonthOfB){
            ageInMonths = CurrentMonth - MonthOfB;
        }
        int ageInYears = CurrentYear - YearofB;
        ageInDays += (ageInYears/4) - 1;
        ageInDays -= 1;
        if (BirthDayThisYear == false){
            ageInYears -= 1;
        }
        JOptionPane.showMessageDialog(this,"You are " + ageInYears + " years, " + ageInMonths + " months, and " + ageInDays + " days old.");
        }
    }

    public static void main(String[] args)
    {
        new agecalcmain();
    }
}
