
package vendingmachine;
import java.util.Scanner;
/**
 *
 * @author Natalia Solar
 */
public class VendingMachine {


    public static void main(String[] args) {
        /*Write a program that determines the change to be dispensed from a vending machine. 
        An item in the machine can cost between 25 cents and 1 dollar, 
        in 5-cent increments (25, 30, 35,…, 90, 95, 100), and the machine accepts only 
        a single dollar bill to pay for the item. 
        For example, a possible sample dialog might be the following:
        Enter price of item
(from 25 cents to a dollar, in 5-cent increments):
45
You bought an item for 45 cents and gave me a dollar,
So your change is
2 quarters
0 dimes, and
1 nickels.*/
    //declare the variables
    int price, change, quarter, dimes, nickels;
    
    // create scanner object to read input
    Scanner keyboard = new Scanner(System.in); 
	
    // Prompt user to enter the price of item.
    System.out.print("Enter price of item\n" +
    "(from 25 cents to a dollar, in 5-cent increments):");
    // input the price
    price = keyboard.nextInt();
    //calculate the change
    change= 100 - price;
    //calculate the number of quarters
    quarter= change/25;
    //calculate the number of dimes
    dimes = (change-25*quarter)/10;
    //calculate the number of nickels
    nickels = (change - 25*quarter - 10*dimes)/5;
    //output the values
    System.out.println("You bought an item for " + change +
    " cents and gave me a dollar,\n" + "So your change is");
    System.out.println(quarter + " quarter(s)");
    System.out.println(dimes + " dime(s)");
    System.out.println(nickels + " nickel(s)");

    }
    
}
