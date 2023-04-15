import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class monthlyexpenditure
{
    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in)) {
            String filename = "med.txt";

            try {
                File file = new File(filename);
                Scanner reader = new Scanner(file);
                while (reader.hasNextLine()) {
                    String line = reader.nextLine();
                    System.out.println(line);
                }
                

                System.out.println("Do you want to replace the content of the file? (y/n)");
                String replace = sc.nextLine();

                if (replace.equalsIgnoreCase("y")) {
                    System.out.println("Enter the new text: ");
                    String newText = sc.nextLine();

                    FileWriter myWriter = new FileWriter(file);
                    myWriter.write(newText);
                    myWriter.close();
                    System.out.println("Successfully wrote to the file.");
                }
                if(replace.equalsIgnoreCase("n"))
                {   String filenamen = "med.txt";
                    File filen = new File(filenamen);
                    Scanner readern = new Scanner(filen);
                    while (readern.hasNextLine()) 
                    {
                        
                        String linen = readern.nextLine();
                        System.out.println(linen);
                        reader.close();
                        readern.close();
                        
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
}