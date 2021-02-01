package assignment1;
import java.util.Scanner;
public class assign5
{
     public static void main( String[] args )
     {
         Scanner keyboard = new Scanner(System.in);
         System.out.println( " \n" );

         System.out.println( "Number: " );
         int number = keyboard.nextInt();
         int sum = 0;

         for (int run=1; run<=number; run=run+1)
         {
             System.out.print( run + " " );
             sum = sum + 1 ;
         }

         System.out.println( "The sum is . " );
    }
}