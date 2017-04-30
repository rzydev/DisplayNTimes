import java.util.Scanner;

public class DisplayNTimes
{
  public static void main(String[] args)
  {
    Scanner kb = new Scanner(System.in);
    
    System.out.print("Enter a positive integer: ");
    int n = kb.nextInt();
    kb.nextLine();
    
    System.out.print("Enter a line of text: ");
    String text = kb.nextLine();
    
    System.out.println("I'm using a while loop: ");
    //- write a while loop
    int q = 4; //- initialization
    //- relational operator
    while(q <= (n+4)) //- condition
    {
      System.out.println(text);
      q++; //- change or increment
    }
  }
}