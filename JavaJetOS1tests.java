import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import javax.xml.crypto.dsig.SignedInfo;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import javax.print.attribute.standard.DateTimeAtProcessing;
import javax.swing.table.DefaultTableCellRenderer;





public class JavaJetOS1tests
{
    public static void main(String[] args)
    {
        int AppToRun = 0;
        int AgeCalcFinal;
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
        int FinalRun2 = 0;
        boolean askForApp = true;
        
        System.out.println("Welcome to JavaJetOS! Please enter your username: ");
        String username = sc.nextLine();
        System.out.println("Please enter your password: ");
        String password = sc.nextLine();
        if (username.equals("default") && password.equals("Pass@123") )
        {
            System.out.println("Logged in and validated successfully! ");
            int RunAppAgain = 1;
            while (RunAppAgain == 1){
                if(askForApp == true){
                    System.out.println("Please enter the number of the application you would like to run[Enter 0 to Shut Down]: \n1)Calculator\n2)Age Calculator\n3)Number Guessing Game\n4)Make Files\n5)Calculate Monthly Expenditure");
                    AppToRun= sc.nextInt();
                }
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
                    ageInDays -= 0;
                    System.out.println("You are " + ageInYears + " years, " + ageInMonths + " months, and " + ageInDays + " days old.");
                    System.out.println("Would you like to choose another app to run, re-run Age Calculator, or shut down the OS? \nPlease choose the corresponding option number:\n1) Re-run the Program.\n2)Exit to Main Menu.\n3)Shut down the OS.");
                    FinalRun2 = sc.nextInt();
                    askForApp = true;
                    if (FinalRun2 == 1){
                        AppToRun = 2;
                        askForApp = false;
                    }
                    else if (FinalRun2 == 3){
                        RunAppAgain = 0;
                    }

                }
                else if (AppToRun==3){
                    // Java program for the above approach

                    // Scanner Class
                        // Scanner sc = new Scanner(System.in)){
                    // Generate the numbers
                    int number = 1 + (int)(100
                                        * Math.random());

                    // Given K trials
                    //System.out.println("How many guesses do you need: ");
                    int K = 10;
                    //K = sc.nextInt();
                    int i = 0; 
                    int guess = 0;

                    System.out.println
                    (
                        "A number is chosen"
                        + " between 1 to 100."
                        + "Guess the number."
                        );

                    // Iterate over K Trials
                    for (i = 0; i < K; i++) 
                    {

                        System.out.println(
                            "Guess the number: ");

                        // Take input for guessing
                        guess = sc.nextInt();

                        // If the number is guessed
                        if (number == guess) {
                            System.out.println(
                                " Congratulations!"
                                + " \nYou guessed the number.");
                            break;
                        }
                        if(guess > number - 5 && guess < number + 5 && i!= K-1)
                        {
                        System.out.println("You are extremely near the number.");
                        }
                        else if (guess > number - 10 && guess < number + 10
                                && i != K - 1) {
                            System.out.println(
                                " You are near it");
                        }
                        else if(number > guess && i!=K - 1)
                        {
                        System.out.println("The number is greater than your guess");
                        }
                        else if(number<guess && i!=K)
                        {
                        System.out.println("The number is smaller than your guess");
                        }
                    }

                    if (i == K) 
                    {
                        System.out.println(
                            "You have exhausted"
                            + " K trials.");

                        System.out.println(
                            "The number was " + number);
                    }
                    }
                else if (AppToRun==0){
                    RunAppAgain = 0;
                }else if(AppToRun==4){
                     System.out.println("Do you want to 1. Create a File or 2. Open a File");
        int option = sc.nextInt();
        sc.nextLine();

        if (option == 1) {
            System.out.println("Enter the filename: ");
            String filename = sc.nextLine();

            try {
                File file = new File(filename);
                if (file.createNewFile()) {
                    System.out.println("File created: " + file.getName());
                } else {
                    System.out.println("File already exists.");
                }

                System.out.println("Enter the text you want to save: ");
                String text = sc.nextLine();

                FileWriter myWriter = new FileWriter(file);
                myWriter.write(text);
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        } else if (option == 2) {
            System.out.println("Enter the filename: ");
            String filename = sc.nextLine();

            try {
                File file = new File(filename);
                Scanner reader = new Scanner(file);
                while (reader.hasNextLine()) {
                    String line = reader.nextLine();
                    System.out.println(line);
                }
                reader.close();

                System.out.println("Do you want to replace the content of the file? (y/n)");
                String replace1 = sc.next();

                if (replace1.equalsIgnoreCase("y")) {
                    System.out.println("Enter the new text: ");
                    String newText = sc.nextLine();

                    FileWriter myWriter = new FileWriter(file);
                    myWriter.write(newText);
                    myWriter.close();
                    System.out.println("Successfully wrote to the file.");
                }
            } catch (FileNotFoundException e) {
                System.out.println("File not found.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        } else {
            System.out.println("Invalid option.");
        }

            }
        else if (AppToRun==5)
        {
            String filename1 = "med.txt";

            try {
                File file = new File(filename1);
                Scanner reader = new Scanner(file);
                System.out.println("The previous content was:\n");
                while (reader.hasNextLine()) {
                    String line = reader.nextLine();
                    System.out.println(line);
                }
                

                System.out.print("\nDo you want to replace the content of the file? (y/n)");
                String replace = sc.nextLine();

                if (replace.equalsIgnoreCase("y")) {
                    System.out.println("All costs are to be shared in terms of Expenditure per Month\nEnter your salary: ");
                    int salaryText = sc.nextInt();
                    String salarytext1 = "Salary: "+salaryText;
                    System.out.println("Enter money spent over Rent or EMI for House: ");
                    int renttext = sc.nextInt();
                    String renttext1 = "Rent: "+renttext;
                    System.out.println("Enter money spent on Clothes and other Materialistic Objects:  ");
                    int Materialob = sc.nextInt();
                    String materialob1 = "Extra Expenditure: "+Materialob;
                    System.out.println("Enter money spent on food: ");
                    int foodtext = sc.nextInt();
                    String foodtext1 = "Food: "+foodtext;
                    float num = (float) 0.5;
                    int tax = salaryText - (50/100*salaryText);
                    int tms = salaryText - (renttext+Materialob+foodtext+tax);
                    String tms1 = "Your Savings: "+tms;
                    String tax1 = "Tax: "+tax;
                    


                    FileWriter myWriter = new FileWriter(file);
                    myWriter.write(salarytext1+"\n"+renttext1+"\n"+materialob1+"\n"+foodtext1+"\n"+tax1+"\n"+tms1);
                    myWriter.close();
                    System.out.println("Successfully wrote to the file.");
                }
                if(replace.equalsIgnoreCase("n"))
                {   
                    while (reader.hasNextLine()) 
                    {

                        reader.close();
                        
                    }
                    
                }
            } catch (FileNotFoundException e) {
                System.out.println("File not found.");
            }
            catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }

        }
        }
        System.out.println("Shutting down JavaJetOS.");
    }
}
}



       



