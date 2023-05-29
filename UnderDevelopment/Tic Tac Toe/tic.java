import java.util.Scanner;

import javax.net.ssl.X509TrustManager;

public class tic {
    static String[] table(String[] boxes, String[] box) {
        String player = "X";
        System.out.println("      A    |    B    |    C    \n   ________|_________|_______\n           |         |\n1" + boxes[0] + boxes[3] + boxes[6] + "\n   ________|_________|_______\n           |         |\n2" + boxes[1] + boxes[4] + boxes[7] + "\n   ________|_________|_______\n           |         | \n3" + boxes[2] + boxes[5] + boxes[8] + "\n           |         |       ");
        System.out.println("Please enter the box no. of the square you want to place an " + player + " in.");
        return boxes;
    }
    
    
    public static void main(String[] args){
        System.out.println("Welcome to Tic Tac Toe! \n");
        String[] boxes = new String[9];
        String[] box = new String[9];
        boxes[0] = "          |";
        boxes[1] = "          |";
        boxes[2] = "          |";
        boxes[3] = "         |";
        boxes[4] = "         |";
        boxes[5] = "         |";
        boxes[6] = "          ";
        boxes[7] = "          ";
        boxes[8] = "          ";
        box[0] = " ";
        box[1] = " ";
        box[2] = " ";
        box[3] = " ";
        box[4] = " ";
        box[5] = " ";
        box[6] = " ";
        box[7] = " ";
        box[8] = " ";
        
        table(boxes, box);
        boolean xTurn = true;
        Scanner sc = new Scanner(System.in);
        boolean runGame = true;
        while (runGame == true){
            if (xTurn == true){
                String BoxNo = sc.nextLine();
                if (BoxNo.equals("A1")){
                    boxes[0] = "     X    |";
                    box[0] = "full";
                    }
                if (BoxNo.equals("A2")){
                    boxes[1] = "     X    |";
                    box[1] = "full";
                }
                if (BoxNo.equals("A3")){
                    boxes[2] = "     X    |";
                    box[2] = "full";
                }
                if (BoxNo.equals("B1")){
                    boxes[3] = "    X    |";
                    box[3] = "full";
                }
                if (BoxNo.equals("B2")){
                    boxes[4] = "    X    |";
                    box[4] = "full";
                }
                if (BoxNo.equals("B3")){
                    boxes[5] = "    X    |";
                    box[5] = "full";
                }
                if (BoxNo.equals("C1")){
                    boxes[6] = "   X   ";
                    box[6] = "full";
                }
                if (BoxNo.equals("C2")){
                    boxes[7] = "   X   ";
                    box[7] = "full";
                }
                if (BoxNo.equals("C3")){
                    boxes[8] = "   X   ";
                    box[8] = "full";
                }
            }else{
                String BoxNo = sc.nextLine();
                if (BoxNo.equals("A1")){
                    boxes[0] = "     O    |";
                    box[0] = "full";
                    
                }
                if (BoxNo.equals("A2")){
                    boxes[1] = "     O    |";
                    box[1] = "full";
                }
                if (BoxNo.equals("A3")){
                    boxes[2] = "     O    |";
                    box[2] = "full";
                }
                if (BoxNo.equals("B1")){
                    boxes[3] = "    O    |";
                    box[3] = "full";
                }
                if (BoxNo.equals("B2")){
                    boxes[4] = "    O    |";
                    box[4] = "full";
                }
                if (BoxNo.equals("B3")){
                    boxes[5] = "    O    |";
                    box[5] = "full";
                }
                if (BoxNo.equals("C1")){
                    boxes[6] = "   O   ";
                    box[6] = "full";
                }
                if (BoxNo.equals("C2")){
                    boxes[7] = "   O   ";
                    box[7] = "full";
                }
                if (BoxNo.equals("C3")){
                    boxes[8] = "   O   ";
                    box[8] = "full";
                }
            }
            if(xTurn == true){
                xTurn = false;
            }else{
                xTurn = true;
            }
            table(boxes, box);
            if((boxes[0].equals("     X    |") && boxes[1].equals("     X    |") && boxes[2].equals("     X    |")) || (boxes[3].equals("    X    |") && boxes[4].equals("    X    |") && boxes[5].equals("    X    |") ) || (boxes[6].equals("   X   ") && boxes[7].equals("   X   ") && boxes[8].equals("   X   ") ) || (boxes[0].equals("     X    |") && boxes[3].equals("    X    |") && boxes[6].equals("   X   ")) || (boxes[1].equals("     X    |") && boxes[4].equals("    X    |") && boxes[7].equals("   X   ") ) || (boxes[2].equals("     X    |") && boxes[5].equals("    X    |") && boxes[8].equals("   X   ") ) || (boxes[0].equals("     X    |") && boxes[4].equals("    X    |") && boxes[8].equals("   X   ") ) || (boxes[6].equals("   X   ") && boxes[4].equals("    X    |") && boxes[2].equals("     X    |") )){
                System.out.println("X wins!!");
                runGame = false;
            }else if((boxes[0].equals("     O    |") && boxes[1].equals("     O    |") && boxes[2].equals("     O    |")) || (boxes[3].equals("    O    |") && boxes[4].equals("    O    |") && boxes[5].equals("    O    |") ) || (boxes[6].equals("   O   ") && boxes[7].equals("   O   ") && boxes[8].equals("   O   ") ) || (boxes[0].equals("     O    |") && boxes[3].equals("    O    |") && boxes[6].equals("   O   ")) || (boxes[1].equals("     O    |") && boxes[4].equals("    O    |") && boxes[7].equals("   O   ") ) || (boxes[2].equals("     O    |") && boxes[5].equals("    O    |") && boxes[8].equals("   O   ") ) || (boxes[0].equals("     O    |") && boxes[4].equals("    O    |") && boxes[8].equals("   O   ") ) || (boxes[6].equals("   O   ") && boxes[4].equals("    O    |") && boxes[2].equals("     O    |") )){
                System.out.println("O wins!!");
                runGame = false;
            }else if (box[0].equals("full") && box[1].equals("full") && box[2].equals("full") && box[3].equals("full") && box[4].equals("full") && box[5].equals("full") && box[6].equals("full") && box[7].equals("full") && box[8].equals("full")){
                System.out.println("Tie!!");
                runGame = false;
            }
        }
    }
}
// eeeee