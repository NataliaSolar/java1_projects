package vars_consts_calculations;


import java.util.Scanner;
/**
 *
 * @author Natalia Solar
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
   double temp = firstNumber; 
    firstNumber = secondNumber; 
    secondNumber = temp;
      
    // Output the values.
    System.out.println("After swapping, the values of the two numbers are "+ firstNumber+" and " + secondNumber );
	
    // ********* End of Logic Problem code area  ********** 
    
    
    // ********* Circle Area Problem code area ***********
    
    // Implement the following step-by-step plan
    
    // 1. Declare double constant PI to hold 3.14
    final double PI = 3.14;
    // 2. Declare a double variable to store radius
    double radius;
    // 3. Declare a double variable to store area 
    double area;
    // 4. Prompt the user to enter radius. 
    System.out.print("Enter the radius:");
    // 5. Input radius and store it in variable
    radius = keyboard.nextDouble();
    // 6. Calculate circle area. Find the formula on the web if you don't remember it
    area = radius*radius*PI;
    // 7. Output the circle's radius and area values in user-friendly fashion
    System.out.println("The radius of the circle is "+ radius);
    System.out.println("The area of the circle is "+ area);
    // ********* End of Circle Area Problem code area ***********
  
    }
    
}
