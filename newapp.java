import java.util.Scanner;

public class newapp
{
  public static void main(String[] args);
  Scanner sc = new Scanner(System.in);
  int number= 1 +(int)(100*Math.random);
  int k=5;
  int i,guess;
  for(i=0,i<k,i++)
  {
    System.out.println("Guess the number: ");
    guess = sc.nextInt();
    if(number == guess)
    {
      System.out.println("Congratulations you guessed the number in"+i+"tries");
      break;
    }
    else if(number > guess && i!==k-1)
    {
      System.out.println("Your guess is greater than the number!")
    }
    else if(number < guess && i!==k-1)
    {
      System.out.println("Your guess is lesser than the number!")
    }
  }
}
