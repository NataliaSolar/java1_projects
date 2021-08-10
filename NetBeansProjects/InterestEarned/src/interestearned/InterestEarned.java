
package interestearned;
import java.util.Scanner;
import java.lang.Math;
/**
 * @author Natalia Solar
 */
public class InterestEarned {

    public static void main(String[] args) {
        //declare the variables to store the values of principal, interest rate,
        //amount of savings,interest 
        //and the number of times the interest is compounded
        double princip, interRate, amount, interest;
        int times;
    // create scanner object to read input
    Scanner keyboard = new Scanner(System.in); 
	
    // Prompt user to enter the principal.
    System.out.print("Enter the principal:");
    // input the the principal
    princip = keyboard.nextDouble();
    
    // Prompt user to enter the interest rate.
    System.out.print("Enter the interest rate:");
    // input the interest rate
    interRate = keyboard.nextDouble();
    
    // Prompt user to enter the number of times the interest is compounded.
    System.out.print("Enter the number of times the interest is compounded:");
    // input the number of times
    times = keyboard.nextInt();
    //calculate the savings amount using formula: Amount = Principal * (1 + Rate/T)T
    amount = princip*Math.pow((1+(interRate/100)/times),times);
    //calculate the interest
    interest = amount - princip;
    //output the values
    System.out.println("Interest rate: "  + interRate + "%");
    System.out.println("Times compounded: "  + times);
    System.out.println("Principal: $"  + princip);
    System.out.println("Interest: $" + interest);
    System.out.println("Amount in Savings: $" + amount);      
    }   
}
