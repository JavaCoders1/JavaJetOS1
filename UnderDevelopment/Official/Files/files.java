import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;


public class files {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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
                String replace = sc.nextLine();

                if (replace.equalsIgnoreCase("y")) {
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

        sc.close();
    }
}
