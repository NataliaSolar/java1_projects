
import java.util.Scanner;
/**
 *
 * @author Your name here
 */
public class Vars_Consts_Calculations {

    
    public static void main(String[] args) {
    
    //******** Logic Problem code area ********************
    // TODO This program has a logical error. Your goal is to fix it. 
    
    double firstNumber; // to hold the first number
    double secondNumber; // to hold the second number
    // create scanner object to read input
    Scanner keyboard = new Scanner(System.in); 
	
    // Prompt user to enter the first number.
    System.out.print("Enter the first number:");
    // input the first number
    firstNumber = keyboard.nextDouble();
    
    // Promt user to enter the second number.
    System.out.print("Enter the second number:");
    // input the second number
    secondNumber = keyboard.nextDouble();       
    
    // Echo print the input.
    System.out.println("You input the numbers as "+ firstNumber+" and " + secondNumber );
    
    // Now we will swap the values.	
    firstNumber = secondNumber;
    secondNumber = firstNumber;
      
    // Output the values.
    System.out.println("After swapping, the values of the two numbers are "+ firstNumber+" and " + secondNumber );
	
    // ********* End of Logic Problem code area  ********** 
    
    
    // ********* Circle Area Problem code area ***********
    
    // Implement the following step-by-step plan
    
    // 1. Declare double constant PI to hold 3.14
    // 2. Declare a double variable to store radius
    // 3. Declare a double variable to store area   
    // 4. Prompt the user to enter radius. 
    // 5. Input radius and store it in variable
    // 6. Calculate circle area. Find the formula on the web if you don't remember it
    // 7. Output the circle's radius and area values in user-friendly fashion
    
    // ********* End of Circle Area Problem code area ***********
  
    }
    
}
