
package inputvalidationmethods;

import java.util.Scanner;        // For the Scanner class

/**
 *
 * @author Natalia Solar
 */
public class InputValidationMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a;      //to hold integer 
        double b;   // to hold real number
        // test1
        a = validateInt("Please enter an integer: ");
        //test2
        b = validateDouble("Please enter a real number: ");
        System.out.printf("a = %d\nb = %.2f\n", a, b);
    }
    /**
     * Asks user for input using the prompt sting provided and validates input, making sure the type of the numeric value provided by the user is integer
     * @param prompt the prompt for the user
     * @return entered integer
     */
    public static int validateInt(String prompt)
    {
        String input;       //holds user's input
        boolean go = true;  //needed for validation loop
        int n = 0;          // holds string parsed into integer
        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);
        while (go) //input validation loop for user's input
        {
            //prompt the user to enter the number
            System.out.print(prompt);
            input = keyboard.nextLine();
            try // trying to convert string to integer, expecting exceptions
            {
                n = Integer.parseInt(input);  // convertion. 
                // At this point exception may happen. Exception will throw execution into the "catch" block right away
                //If convertion went well, execution coninues to the next statement below
                go = false; // stop input validation loop
                // continue with the program
            }
            catch(NumberFormatException e)  // handle the exception below
            {
                System.out.println("The string you entered failed to parse into integer" + e.getMessage());
            }
        }       
        return n;
    }

    /**
     * Asks user for input using the prompt sting provided and validates input, making sure the type of the numeric value provided by the user is a double
     * @param prompt the prompt for the user
     * @return entered double
     */
    public static double validateDouble(String prompt)
    {
      
        double n = 0;       //to hold string parsed into double
        String input;       //to hold user's input
        boolean go = true;  //needed for input validation loop
        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);
        while (go) //input validation loop for user's input
        {
            //prompt the user to enter the double
            System.out.print(prompt);
            input = keyboard.nextLine();
            try // trying to convert string to double, expecting exceptions
            {
                n = Double.parseDouble(input);  // convertion. 
                // At this point exception may happen. Exception will throw execution into the "catch" block right away
                //If convertion went well, execution coninues to the next statement below
                go = false; // stop input validation loop
                // continue with the program
            }
            catch(NumberFormatException e)  // handle the exception below
            {
                System.out.println("The string you entered failed to parse into double");
                System.out.println(e.getMessage());
            }
        }
        return n;
    }
}
