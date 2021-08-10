
package randomsinfile;
import java.util.Scanner;   // Needed for Scanner class
import java.io.*;           // Needed for File I/O classes
import java.util.Random;    // to generste random nubmers
/**
 *
 * @author Natalia Solar
 */
public class RandomsInFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        String filename;        // File name
        int number;             // to hold random numbers
        String input;           // to hold the user's input
        int lowerLimit = 0;     // to hold the lower limit of the range
        int upperLimit = 0;     // to hold the upper limit of the range
        int temp;               // to value for swapping
        
        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);
        
        // Get the filename from the user.
        System.out.print("Enter the filename: ");
        filename = keyboard.nextLine();
        //output the message
        System.out.print("Provide the range of random integers to be generate.\nBoth numbers of the range must be positive integers.\n");
        
        //get the user's input
        boolean go = true;
        while (go) //input validation loop for lower limit
        {
            //prompt the user to enter the lower limit
            System.out.print("Enter the lower limit:");
            input = keyboard.nextLine();
            try // trying to convert string to integer, expecting exceptions
            {
                lowerLimit = Integer.parseInt(input);  // convertion. 
                // At this point exception may happen. Exception will throw execution into the "catch" block right away
                //If convertion went well, execution coninues to the next statement below
                if (lowerLimit<=0) System.out.println("Please enter a positive value");// check if lowerLimit is positive
                else go = false; // stop input validation loop
                // continue with the program
            }
            catch(NumberFormatException e)  // handle the exception below
            {
                System.out.println("The string you entered failed to parse into integer");
                System.out.println(e.getMessage());
            }
        } // end of validation loop
        
        // Get the user's input.        
        go= true;        
        while (go) //input validation loop for upper limit
        {
            //prompt the user to enter the upper limit
            System.out.print("Enter the upper limit:");
            input = keyboard.nextLine();
            try  // trying to convert string to integer, expecting exceptions
            {
                upperLimit = Integer.parseInt(input); // convertion. 
                // At this point exception may happen. Exception will throw execution into the "catch" block right away
                //If convertion went well, execution coninues to the next statement below
                if (upperLimit<=0) System.out.println("Please enter a positive value"); // check if lowerLimit is positive
                else go = false;// stop input validation loop
                // continue with the program
            }
            catch(NumberFormatException e)  // handle the exception below
            {
                System.out.println("The string you entered failed to parse into integer");
                System.out.println(e.getMessage());
            }             
        }// end of validation loop
        if (upperLimit<lowerLimit) //check if upper limit is smaller than lower limit 
        {
            //swap
            temp = lowerLimit;
            lowerLimit = upperLimit;
            upperLimit = temp;
        }
        
        try {  // trying to open a file for writing data, expecting exceptions
            // Open the file.
            PrintWriter outputFile = new PrintWriter(filename);

            // Get data and write it to the file.
            for (int i = 0; i < 100; i++)
            {
                Random randomNumber = new Random();//set up an object to generate random nubmers
                number = randomNumber.nextInt((upperLimit - lowerLimit + 1) + lowerLimit); // generate random number
                // Write the number to the file.
                outputFile.println(number);
            }
            // Close the file.
            outputFile.close();
        }
        catch (IOException e)   // handle the exception below
        {
            System.out.println("File failed to open for writing"+e.getMessage());
        }
        System.out.println("Data written to the file.");      
    }    
}
