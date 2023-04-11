import java.time.LocalDateTime;
import java.util.Scanner;

import javax.print.attribute.standard.DateTimeAtProcessing;
import javax.swing.table.DefaultTableCellRenderer;


public class AgeCalc{
    public static void main(String[] args)
    {
        LocalDateTime now = LocalDateTime.now();
        String CurrentTime = now.toString();
        Scanner sc=new Scanner(System.in);
        String DOB;
        System.out.println("Please enter your date of birth in the format [DD-MM-YYYY]: ");
        DOB = sc.nextLine();
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
        System.out.println("You are " + ageInYears + " years, " + ageInMonths + " months, and " + ageInDays + " days old.");
    }
}