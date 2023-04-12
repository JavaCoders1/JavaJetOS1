import java.util.Scanner;

import javax.xml.crypto.dsig.SignedInfo;

import java.time.LocalDateTime;

import javax.print.attribute.standard.DateTimeAtProcessing;
import javax.swing.table.DefaultTableCellRenderer;





public class JavaJetOS1
{
    public static void main(String[] args)
    {
        int AppToRun;
        double a;
        double b;
        double x;
        double y;
        LocalDateTime now = LocalDateTime.now();
        String CurrentTime = now.toString();
        Scanner sc=new Scanner(System.in);
        String DOB = "19-03-2009";
        int DateOfB = 0;
        int YearofB = 0;
        int MonthOfB = 0;
        int ageInDays = 0;
        int ageInMonths = 0;
        boolean BirthDayThisYear = true;
        String[] PartsOfNow = CurrentTime.split("-");
        int CurrentYear = Integer.parseInt(PartsOfNow[0]);
        int CurrentMonth = Integer.parseInt(PartsOfNow[1]);
        String[] FindCurrentDate = PartsOfNow[2].split("T");
        int CurrentDate = Integer.parseInt(FindCurrentDate[0]);
        int RunCalcAgain;
        String[] parts;
        
        System.out.println("Welcome to JavaJetOS! Please enter your username: ");
        String username = sc.nextLine();
        System.out.println("Please enter your password: ");
        String password = sc.nextLine();
        if (username.equals("default") && password.equals("Pass@123") )
        {
            System.out.println("Logged in and validated successfully! ");
            int RunAppAgain = 1;
            while (RunAppAgain == 1){
                System.out.println("Please enter the number of the application you would like to run: \n1)Calculator\n2)Age Calculator");
                AppToRun= sc.nextInt();
                if (AppToRun==1)
                {
                

                    System.out.println("Which operation do you want to use: \n1.Multiplacation\n2.Divison\n3.Addition\n4.Substraction\n5.Square\n6.Sqaure Root\nEnter the Option Number: ");
                    double op1 = (double)sc.nextInt();
        
                    if (op1 == 1) {
                        System.out.println("Enter your first value(a): ");
                        a = sc.nextDouble();
                        System.out.println("Enter your second value(b): ");
                        b = sc.nextDouble();
                        x = a * b;
                        System.out.println("Your product is: " + x);
                    }

                    if (op1 == 2.0) 
                    {
                        System.out.println("Enter your first value(a): ");
                        a = sc.nextDouble();
                        System.out.println("Enter your second value(b): ");
                        b = sc.nextDouble();
                        x = a / b;
                        y = a % b;
                        System.out.println("The quotient is: " + x + "while the remainder is: " + y);
                    }

                    if (op1 == 3.0) {
                        System.out.println("Enter your first value(a): ");
                        a = sc.nextDouble();
                        System.out.println("Enter your second value(b): ");
                        b = sc.nextDouble();
                        x = a + b;
                        System.out.println("The sum is: " + x);
                    }

                    if (op1 == 4.0) {
                        System.out.println("Enter your first value(a): ");
                        a = sc.nextDouble();
                        System.out.println("Enter your second value(b): ");
                        b = sc.nextDouble();
                        x = a - b;
                        System.out.println("The answer is: " + x);
                    }

                    if (op1 == 5.0) {
                        System.out.println("Enter your value(a): ");
                        a = sc.nextDouble();
                        x = a * a;
                        System.out.println("The square is: " + x);
                    }

                    if (op1 == 6.0) {
                        System.out.println("Enter your value(a): ");
                        a = sc.nextDouble();
                        x = Math.sqrt(a);
                        System.out.println("The answer is:  " + x);
                    }
                    System.out.println("Would you like to repeat the program?1.Yes or 2.No\nEnter Option No: ");
                    RunCalcAgain = sc.nextInt();

                    while(RunCalcAgain==1)
                    {
                        System.out.println("Which operation would you want to use: \n1.Multiplacation\n2.Divison\n3.Addition\n4.Substraction\n5.Square\n6.Sqaure Root\nEnter the Option Number: ");
                        op1=sc.nextInt();
                        if (op1==1)
                        {
                            System.out.println("Enter your first value(a): ");
                            a = sc.nextDouble();
                            System.out.println("Enter your second value(b): ");
                            b = sc.nextDouble();
                            x = a * b;
                            System.out.println("Your product is: " + x);
                        }

                        if (op1 == 2.0) {
                            System.out.println("Enter your first value(a): ");
                            a = sc.nextDouble();
                            System.out.println("Enter your second valueb): ");
                            b = sc.nextDouble();
                            x = a / b;
                            y = a % b;
                            System.out.println("The quotient is: " + x + "while the remainder is: " + y);
                        }

                        if (op1 == 3.0) {
                            System.out.println("Enter your first value(a): ");
                            a = sc.nextDouble();
                            System.out.println("Enter your second value(b): ");
                            b = sc.nextDouble();
                            x = a + b;
                            System.out.println("The sum is: " + x);
                        }

                        if (op1 == 4.0) {
                            System.out.println("Enter your first value(a): ");
                            a = sc.nextDouble();
                            System.out.println("Enter your second value(b): ");
                            b = sc.nextDouble();
                            x = a - b;
                            System.out.println("The answer is: " + x);
                        }

                        if (op1 == 5.0) {
                            System.out.println("Enter your value(a): ");
                            a = sc.nextDouble();
                            x = a * a;
                            System.out.println("The square is: " + x);
                        }

                        if (op1 == 6.0) {
                            System.out.println("Enter your value(a): ");
                            a = sc.nextDouble();
                            x = Math.sqrt(a);
                            System.out.println("The answer is:  " + x);
                        }
                        System.out.println("Would you like to repeat the program?1.Yes or 2.No\nEnter Option No: ");
                        RunCalcAgain = sc.nextInt();
                    }

                    if(RunCalcAgain==2){
                        System.out.println("Would you like to run another app or shut down the OS?\nPress 1 to run another app and press 0 to shut down the OS.");
                        RunAppAgain = sc.nextInt();
                    }
                }
                if (AppToRun == 2){
                    System.out.println("Please enter your date of birth in the format [DD-MM-YYYY]: ");
                    DOB = sc.next();
                    parts = DOB.split("-");
                    System.out.println(parts[0]);
                    DateOfB = Integer.parseInt(parts[0]);
                    MonthOfB = Integer.parseInt(parts[1]);
                    YearofB = Integer.parseInt(parts[2]);
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
                    System.out.println("You are " + ageInYears + " years, " + ageInMonths + " months, and " + ageInDays + " days old.");
                }
            }
        }
        System.out.println("Shutting down JavaJetOS.");
    }
}



       



