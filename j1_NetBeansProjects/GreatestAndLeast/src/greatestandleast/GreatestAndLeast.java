
package greatestandleast;
import java.util.Scanner;   // Needed for Scanner class
/**
 *
 * @author Natalia Solar
 */
public class GreatestAndLeast {


    public static void main(String[] args) {
        boolean go = true;  //needed for while loop
        int n;              //to hold the user's input
        int greatest;       //to hold the greatest number
        int smallest;       //to hold the smallest number
        // create scanner object to read input
        Scanner keyboard = new Scanner(System.in);
        // prompt the user to input the first number
        System.out.println("Enter a series of positive integer; enter -99 to signal the end of the series:");
        greatest=keyboard.nextInt();
        //set this value to be the smallest and greatest
        smallest = greatest;
        //check if if the firts number is -99
        if (greatest == -99)
        {
            //output the message
            System.out.println("No numbers were entered");            
        } else // if the input is not -99, do the following:
        {
            while(go) //start the input the input loop
            {            
                //prompt the user to input the next number
                System.out.println("Enter the next number:");
                n=keyboard.nextInt();                
                if (n== -99)//check if the number is -99
                {
                    go = false;//stop input loop
                }
                else if (n>greatest)//check if the number is bigger than the previous number
                {
                    greatest = n;//set the number to be the greatest
                }
                else if (n<smallest) //check if the number is smaller tha the previous number
                {
                   smallest = n; //set the number to be the smallest
                }
            }
            //print the output
            System.out.printf("The greatest number is: %2d\n",greatest);
            System.out.printf("The smallest number is: %2d\n",smallest);
        }
    }
    
}
