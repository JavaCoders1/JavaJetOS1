import java.util.Scanner;

public class tic {
    static String[] table(String[] boxes) {
        String player = "X";
        System.out.println("      A    |    B    |    C    \n   ________|_________|_______\n           |         |\n1" + boxes[0] + boxes[3] + "\n   ________|_________|_______\n           |         |\n2" + boxes[1] + "         |\n   ________|_________|_______\n           |         | \n3" + boxes[2] + "         |\n           |         |       ");
        System.out.println("Please enter the box no. of the square you want to place an " + player + " in.");
        return boxes;
    }
    
    public static void main(String[] args){
        System.out.println("Welcome to Tic Tac Toe! \n");
        String[] boxes = new String[9];
        boxes[0] = "          |";
        boxes[1] = "          |";
        boxes[2] = "          |";
        boxes[3] = "         |";
        table(boxes);
        Scanner sc = new Scanner(System.in);
        String BoxNo = sc.nextLine();
        if (BoxNo.equals("A1")){
            boxes[0] = "     X    |";
            
        }
        if (BoxNo.equals("A2")){
            boxes[1] = "     X    |";
            
        }
        if (BoxNo.equals("A3")){
            boxes[2] = "     X    |";
            
        }
        if (BoxNo.equals("B1")){
            boxes[3] = "     X    |";
            
        }
        if (BoxNo.equals("B2")){
            boxes[4] = "     X    |";
            
        }
        if (BoxNo.equals("B3")){
            boxes[5] = "     X    |";
            
        }
        if (BoxNo.equals("C1")){
            boxes[6] = "     X    |";
            
        }
        if (BoxNo.equals("C2")){
            boxes[7] = "     X    |";
            
        }
        if (BoxNo.equals("C3")){
            boxes[8] = "     X    |";
            
        }
        table(boxes);
    }
}
