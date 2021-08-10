package mathtutor;

import java.util.Scanner;
import java.util.Random; // to generste random nubmers

/**
 *
 * @author Natalia Solar
 */
public class MathTutor {

    public static void main(String[] args) {

        int answer; // declare a variable to store the value of the correct answer
        int userAnswer;// declare a variableto store the value of user's answer
        int choice; //declare a variable to store the value of user's choice
        boolean go = true; // declare a variable
        Random randomNumbers = new Random();//set up an object to generate random nubmers 
        // start a loop to repeat executing following statements while go = true
        do {
            // Display the menu and prompt the user to enter the choice.
            System.out.print("Math Tutor:\n"
                    + "1. Addition problem\n"
                    + "2. Subtraction problem\n"
                    + "3. Quit\n"
                    + "Enter your choice (1-3):");
            // set two random integer numbers in the range from 0 to 999
            int a = randomNumbers.nextInt(1000);
            int b = randomNumbers.nextInt(1000);
            // create scanner object to read input
            Scanner keyboard = new Scanner(System.in);
            // input the choice
            choice = keyboard.nextInt();
            // determine the choice entered
            switch (choice) {
                case 1:  // if choice equals to 1 then the following statements execute:              
                    if (a > b) //check which number is larger                        
                    {
                        //output the problem so the top position is occupied by number a 
                        System.out.printf("%6d\n %s %3d\n %s\n", a, "+", b, "-----");
                    } else {
                        //output the problem so the top position is occupied by number b
                        System.out.printf("%6d\n %s %3d\n %6s\n", b, "+", a, "-----");
                    }
                    //calculation
                    answer = a + b;
                    //prompt the user to enter the answer
                    System.out.println("Enter your answer: ");
                    //input the answer
                    userAnswer = keyboard.nextInt();
                    //check if the correct answer matches the user's answer
                    if (answer == userAnswer) {
                        //if they match output the message:
                        System.out.println("Correct!");
                    } else {
                        //if answers don't match then output the message and the correct answer
                        System.out.printf("Oops... The correct answer is %d \n", answer);
                    }
                    // at this point the program jumps out of the switch statement
                    break;
                case 2:// if choice equals to 2 then the following statements execute:
                    if (a > b)//check which number is larger
                    {
                        // output the supstraction problem, so the top position is occupied bu the number a
                        System.out.printf("%6d\n %s %3d\n %s\n", a, "-", b, "-----");
                        //make the substraction
                        answer = a - b;
                    } else {
                        //output the substraction problem, so the top position is occupied by the number b
                        System.out.printf("%6d\n %s %3d\n %3s\n", b, "-", a, "-----");
                        //make the substraction
                        answer = b - a;
                    }
                    //prompt the user to enter the answer
                    System.out.println("Enter your answer: ");
                    //input the anwer
                    userAnswer = keyboard.nextInt();
                    //check if user's answer match the correct answer
                    if (answer == userAnswer) {
                        //if answers match the output the message:
                        System.out.println("Correct!");
                    } else {
                        //if answers don't match, output the message and the correct answer
                        System.out.printf("Oops... The correct answer is %d \n", answer);
                    }
                    // at this point the program jumps out of the switch statement
                    break;
                case 3: // if choice equals to 3 then the following statements execute:
                    //output the message
                    System.out.println("Quitting");
                    //change go to false (to exit the loop)
                    go = false;
                    // at this point the program jumps out of the switch statement
                    break;
                default://if the choice doen't match any of case values, the program branches here, and following statements execute:
                    // output the message
                    System.out.println(choice + " is not an option,try again!");
            }
        } while (go);
    }
}
