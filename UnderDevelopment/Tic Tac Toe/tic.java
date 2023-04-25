import java.util.Scanner;

import javax.net.ssl.X509TrustManager;

public class tic {
    static String[] table(String[] boxes) {
        String player = "X";
        System.out.println("      A    |    B    |    C    \n   ________|_________|_______\n           |         |\n1" + boxes[0] + boxes[3] + boxes[6] + "\n   ________|_________|_______\n           |         |\n2" + boxes[1] + boxes[4] + boxes[7] + "\n   ________|_________|_______\n           |         | \n3" + boxes[2] + boxes[5] + boxes[8] + "\n           |         |       ");
        System.out.println("Please enter the box no. of the square you want to place an " + player + " in.");
        return boxes;
    }
    
    /**
     * @param args
     */
    public static void main(String[] args){
        System.out.println("Welcome to Tic Tac Toe! \n");
        String[] boxes = new String[9];
        boxes[0] = "          |";
        boxes[1] = "          |";
        boxes[2] = "          |";
        boxes[3] = "         |";
        boxes[4] = "         |";
        boxes[5] = "         |";
        boxes[6] = "          ";
        boxes[7] = "          ";
        boxes[8] = "          ";
        table(boxes);
        boolean xTurn = true;
        Scanner sc = new Scanner(System.in);
        boolean runGame = true;
        while (runGame = true){
            if (xTurn == true){
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
                    boxes[3] = "    X    |";
                    
                }
                if (BoxNo.equals("B2")){
                    boxes[4] = "    X    |";
                    
                }
                if (BoxNo.equals("B3")){
                    boxes[5] = "    X    |";
                    
                }
                if (BoxNo.equals("C1")){
                    boxes[6] = "   X   ";
                    
                }
                if (BoxNo.equals("C2")){
                    boxes[7] = "   X   ";
                    
                }
                if (BoxNo.equals("C3")){
                    boxes[8] = "   X   ";
                    
                }
            }else{
                String BoxNo = sc.nextLine();
                if (BoxNo.equals("A1")){
                    boxes[0] = "     O    |";
                    
                }
                if (BoxNo.equals("A2")){
                    boxes[1] = "     O    |";
                    
                }
                if (BoxNo.equals("A3")){
                    boxes[2] = "     O    |";
                    
                }
                if (BoxNo.equals("B1")){
                    boxes[3] = "    O    |";
                    
                }
                if (BoxNo.equals("B2")){
                    boxes[4] = "    O    |";
                    
                }
                if (BoxNo.equals("B3")){
                    boxes[5] = "    O    |";
                    
                }
                if (BoxNo.equals("C1")){
                    boxes[6] = "   O   ";
                    
                }
                if (BoxNo.equals("C2")){
                    boxes[7] = "   O   ";
                    
                }
                if (BoxNo.equals("C3")){
                    boxes[8] = "   O   ";
                    
                }
            }
            if(xTurn == true){
                xTurn = false;
            }else{
                xTurn = true;
            }
            table(boxes);
            if((boxes[0].equals("     X    |") && boxes[1].equals("     X    |") && boxes[2].equals("   X   ")) || (boxes[3].equals("     X    |") && boxes[4].equals("     X    |") && boxes[5].equals("   X   ") ) || (boxes[6].equals("     X    |") && boxes[7].equals("     X    |") && boxes[8].equals("   X   ") ) || (boxes[0].equals("     X    |") && boxes[3].equals("     X    |") && boxes[6].equals("     X    |") ) || (boxes[1].equals("     X    |") && boxes[4].equals("     X    |") && boxes[7].equals("     X    |") ) || (boxes[2].equals("   X   ") && boxes[5].equals("   X   ") && boxes[8].equals("   X   ") ) || (boxes[0].equals("     X    |") && boxes[4].equals("     X    |") && boxes[8].equals("   X   ") ) || (boxes[6].equals("     X    |") && boxes[4].equals("     X    |") && boxes[2].equals("   X   ") )){
                System.out.println("X wins!!");
                runGame = false;
            }
        }
    }
}
