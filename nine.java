import java.util.Scanner;

public class nine
{
  public static void main(String args[])
  {
    
    Scanner input = new Scanner(System.in);
    int num;  //Declare a variable
    System.out.println("Enter a number:");
    num = input.nextInt();

   
    if ( num % 9 == 0 )
        System.out.println("The entered number is divisable by 9");
     else
        System.out.println("The entered number is not divisable by 9");
  }
}