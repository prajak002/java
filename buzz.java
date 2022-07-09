import java.util.Scanner;

public class buzz
{
  public static void main(String args[])
  {
    
    Scanner input = new Scanner(System.in);
    int num;  //Declare a variable
    System.out.println("Enter a number:");
    num = input.nextInt();

   
    if ( num % 7 == 0 )
        System.out.println("The entered number is buzz");
     else
        System.out.println("The entered number is not buzz");
  }
}