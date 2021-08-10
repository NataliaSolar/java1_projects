
package approximations;
import java.util.Scanner;   // Needed for Scanner class
/**
 *
 * @author Natalia Solar
 */
public class Approximations {


    public static void main(String[] args) {
        
        boolean go =true;       //needed go while loop
        int x = 0;              // to hold the user's input
        double total;           // to hold the total
        double currentTerm;     // to hold the current term for for loop
        
        // Create a Scanner object to read input.
        Scanner keyboard= new Scanner(System.in);
        
        while (go)  // input validation loop
        {               
            //prompt the user to input an integer
            System.out.println("Enter an integer:");       
            String input  = keyboard.nextLine();
            try // trying to convert string to integer, expecting exceptions
            {
                x = Integer.parseInt(input); //converts string into an integer  
                // At this point exception may happen. Exception will throw execution into the "catch" block right away
                //If convertion went well, execution coninues to the next statement below
                go = false;// stop input validation loop
                // continue with the program
            }
            catch (NumberFormatException e) // handle the exception below
            {
                  System.out.println("The string you entered failed to parse into integer." + e.getMessage());
            }
        } // end of validation loop
        total = 1; //set total to be 1
        currentTerm =  x;//set current term to be x
        System.out.printf("e^x = 1 + x + x^2/2! + x^3/3! + ... + x^n/n!\nx=%d\n",x);//output the message
        
        for (int n=1; n<=100; n++)//total calculation
        {
            total += currentTerm;
            currentTerm = currentTerm *x* 1.0/(n+1);                                  
            switch (n)//output the result when the n is 5,10,50 and 100 with a switch statement
            {
                case 5:
                    System.out.printf("e^%d (n=5) = %.10f\n", x, total);
                break;
                case 10:
                    System.out.printf("e^%d (n=10) = %.10f\n", x, total);
                break;
                case 50:
                    System.out.printf("e^%d (n=50) = %.10f\n", x, total);
                break;
                case 100:
                    System.out.printf("e^%d (n=100) = %.10f\n", x, total);
                break;
            }  
        }
    }    
}
