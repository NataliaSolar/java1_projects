
package geometry;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author Natalia Solar
 */
public class Geometry {

    public static void main(String[] args) {
        
        int choice; //declare the variable to store user's choice 
        double radius; //declare the variable to store the value of the radius of a circle
        double circ_area; // declare the variable to store the value of the area of the circle
        double length; // declare the variable to store the vallue of the rectangle's length
        double width; // declare the variable to store the value of the rectangle's width
        double rec_area; // declare the variable to store the value of the rectangle's area
        double base; // declare the variable to store the value of the triangle's base  
        double heigth; // deslare the variable to store the value of the triangle's heigth
        double trian_area; // declare the variable to store the value of the triangle's area
        // create scanner object to read input
        Scanner keyboard = new Scanner(System.in);  
        // Display the menu and prompt the user to enter the choice.
        System.out.print("Geometery Calculator:\n" +
                "1. Calculate the Area of a Circle\n"+
                "2. Calculate the Area of a Rectangle\n"+
                "3. Calculate the Area of a Triangle\n"+
                "4. Quit\n" +
                "Enter your choice (1-4):");
        // input the choice
        choice = keyboard.nextInt();
            // determine the choice entered
            switch (choice)
            {
                case 1: // if choice equals to 1 then the following statements execute:
                    // prompt the user to enter the radius
                    System.out.println("Enter the radius of the circle:");
                    //input the radius
                    radius=keyboard.nextDouble();
                    //calculate the area of the circle
                    circ_area = Math.pow(radius, 2)*Math.PI;
                    //output the area of te circle
                    System.out.println("The area of the circe is " + circ_area);
                    // at this point the program jumps out of the switch statement
                    break;
                case 2: // if choice equals to 2 then the following statements execute:
                    //prompt the user to enter the length of the rectangle
                    System.out.println("Enter the  length of the rectangle: ");
                    // input the length
                    length=keyboard.nextDouble();
                    //prompt the user to enter the width of the rectangle
                    System.out.println("Enter the  width of the rectangle: ");
                    //input the width
                    width = keyboard.nextDouble();
                    //calculate the area of the rectangle
                    rec_area = length*width;
                    //output the area
                    System.out.println("The area of the rectangle is "+ rec_area);
                    // at this point the program jumps out of the switch statement
                    break;
                case 3:// if choice equals to 3 then the following statements execute:
                    //prompt the user to enter the length of the tringle's base
                    System.out.println("Enter the length of the tringle's base: ");
                    //input the length
                    base = keyboard.nextDouble();
                    //prompt the user to enter the height of the triangle
                    System.out.println("Enter the heigth of the tringle: ");
                    //input the triangle
                    heigth = keyboard.nextDouble();
                    //calculate the area
                    trian_area = base*heigth*0.5;
                    //output the area
                    System.out.println("The area of the tringle is "+ trian_area);
                    // at this point the program jumps out of the switch statement
                    break;
                case 4:// if choice equals to 4 then the following statements execute:
                    //output the message
                    System.out.println("You chose to quit.");
                    // at this point the program jumps out of the switch statement
                    break;
                default://if the choice doen't match any of case values, the program branches here, and following statements execute:
                    // output the message
                    System.out.println(choice + " is not an option.");
            }                
        }   
}
