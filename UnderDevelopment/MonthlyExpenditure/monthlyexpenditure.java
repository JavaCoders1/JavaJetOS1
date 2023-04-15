import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class monthlyexpenditure
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
            String filename = "med.txt";

            try {
                File file = new File(filename);
                Scanner reader = new Scanner(file);
                System.out.println("The previous content was:\n");
                while (reader.hasNextLine()) {
                    String line = reader.nextLine();
                    System.out.println(line);
                }
                

                System.out.println("Do you want to replace the content of the file? (y/n)");
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
                    int tms = salaryText - (renttext+Materialob+foodtext);
                    String tms1 = "Your Savings: "+tms;

                    FileWriter myWriter = new FileWriter(file);
                    myWriter.write(salarytext1+"\n"+renttext1+"\n"+materialob1+"\n"+foodtext1+"\n"+tms1);
                    myWriter.close();
                    System.out.println("Successfully wrote to the file.");
                }
                if(replace.equalsIgnoreCase("n"))
                {   
                    while (reader.hasNextLine()) 
                    {

                        reader.close();
                        
                    }
                    sc.close();
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