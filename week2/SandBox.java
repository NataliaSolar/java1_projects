/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sandbox;

import java.util.Scanner;

/**
 *
 * @author alexandra.vaschillo
 */
public class SandBox {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           // Create a Scanner object for keyboard input.
      //double k = 6.7;
     // int n = k;
 /*      Scanner keyboard = new Scanner(System.in);    
      System.out.print("Please enter a number\n=>");
      double a = keyboard.nextDouble();
      /* Boolean expressions */
    /*  boolean k = (a>10);
      
        if(a>0)
        {
            System.out.println("Value "+a+" is greater than 0");
        }
        if(a<0)
        {
            System.out.println("Value "+a+" is less than 0");
        }
        if(a==0)
        {
            System.out.println("Value "+a+" is a ZERO");
        }
        System.out.println("Outside of the branch");
*/
 /*
         if(a>0)
        {
            System.out.println("Value "+a+" is greater than 0");
        }
        else
        {
            if(a==0)
            {
             System.out.println("Value "+a+" is a ZERO");
            }
            else
             System.out.println("Value "+a+" is less than 0");
        }

        System.out.println("Outside of the branch");
  */  
 
    String strA = "Hello World!";
    String strC = "Hello World";
     Scanner keyboard = new Scanner(System.in);    
     System.out.print("Please enter a string\n=>");
    String strB = keyboard.nextLine();
    if(strA==strC)
    {
        System.out.println("Strings are the same!!");
    }
    else
        System.out.println("Strings are NOT the same!!");
    }
    
}
