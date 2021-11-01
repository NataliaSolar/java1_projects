
package restaurantbill;
import java.util.Scanner;
/**
 *
 * @author Natalia Solar
 */
public class RestaurantBill {


    public static void main(String[] args) {
       
       //declare the variables
       double billAmount, tipPercent, tip, mealCost, taxAmount, totalBill;
       //declare the constant
       final double TAX= 0.1;
        // create scanner object to read input
       Scanner keyboard = new Scanner(System.in);
       // Prompt user to enter the bill amount.
        System.out.print("Enter the bill amount:");
        // input the bill amount
        billAmount = keyboard.nextDouble();
        // Prompt user to enter the tip persentage.
        System.out.print("Enter the tip persentage:");
        // input the tip persentage
        tipPercent = keyboard.nextDouble();
        //calculate the tax amount
        taxAmount = TAX*billAmount;
        //calculate the meal cost
        mealCost = billAmount + taxAmount;
        //calculate tip
        tip = mealCost*tipPercent/100;
        //calculate the total bill
        totalBill = mealCost + taxAmount + tip;
        //output the values
        System.out.println("Meal cost: $" + mealCost );
        System.out.println("Tax amount: $" + taxAmount);
        System.out.println("Tip amount: $" + tip);
        System.out.println("Total bill: $llll" + totalBill );  
    }
    
}
