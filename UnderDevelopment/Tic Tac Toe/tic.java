import java.util.Scanner;

public class tic{
    static void table() {
        String A1 = "          |";
        String A2 = "          |";
        String A3 = "          |";
        String player = "X";
        System.out.println("Welcome to Tic Tac Toe! \n      A    |    B    |    C    \n   ________|_________|_______\n           |         |\n1" + A1 + "         |\n   ________|_________|_______\n           |         |\n2" + A2 + "         |\n   ________|_________|_______\n           |         | \n3" + A3 + "         |\n           |         |       ");
        System.out.println("Please enter the box no. of the square you want to place an " + player + "in.");
        }
    public static void main(String[] args){
        table();
    }

}
