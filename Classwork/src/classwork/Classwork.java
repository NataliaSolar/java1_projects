/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classwork;
import java.util.Scanner;
import java.util.Random; // to generste random nubmers
/**
 *
 * @author User Account
 */
public class Classwork {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      /*// 04/10  
       int a=5;
       int b=6;
       int c= a+++b;
       System.out.printf("a=%d; b=%d; c=%d\n",a,b,c); 
        
       
       
       int d=5;
       int f=6;
       int h= d+ ++f;
       System.out.printf("a=%d; b=%d; c=%d\n",d,f,h);
       
       Scanner keyboard = new Scanner(System.in);
       //System.out.println("How many iterations do we need?");
       //int count = keyboard.nextInt();
       boolean go=true;
       int count = 0;
       
       while( go)
       {
           System.out.println("How many iterations do we need?");
           count = keyboard.nextInt();
           if (count<=0) System.out.println("please enter a positive value");
           else go = false;
       }
       int total = 0;
       for (int i =1; i<= count; i++)
       {
           total+=1; //total = total+i
       }
       System.out.printf("The total of all integers in the range [0, %d] is %d\n", count, total);
       
       
       
       System.out.printf("%-10s %-5s \n", "Hex Number", "Number");
       for (int i =1; i<= count; i++)
       {
           if (i>17) break;
           if (i%5==0) continue;//all numbers that are devisible by 5 won't be printed in the output
           System.out.printf("%-10x %-5d \n", i,i);
       }
       
       Random randomNumbers = new Random();//set up an object to generate random nubmers
       //int r = randomNumbers.nextInt(2);
       total = 0;
       for (int i =1; i<= count; i++)
       {
        
           int r = randomNumbers.nextInt(2);
           System.out.println(r);
           total+=r; 
       }
       // [0,N] r = randomNumber.nextInt(N+1)
       // [n,m] r = randomNumber.nextInt((M-N) + 1)+N*/
      /*Random randomNumbers = new Random();//set up an object to generate random nubmers
     
       for(int i=0; i<45; i++)
       {
        int r = randomNumbers.nextInt(99);  
       System.out.println(r);
      
      
       }*/
      
      
      
      
      //09/10/18
      Scanner keyboard = new Scanner(System.in);
      boolean go =true;
      int count  = 0;
     /* while (go)
      {
          System.out.println("how many iterations do we want?");
          count = keyboard.nextInt();
          if (count<=0) System.out.println("Please enter a positive ");
          else go = false;
          
      }*/ //will crash
      
      while (go)
      {
          System.out.println("Please enter an integer?");
          String input  = keyboard.nextLine();
          try {
            count = Integer.parseInt(input); //converts string into an integer                    
            if (count<=0) System.out.println("Please enter a positive value");
            else go = false;
          }
          catch (NumberFormatException e)
          {
              System.out.println("The string you entered failed to parse into integer");
              System.out.println(e.getMessage());
          }
      }
              
     /* try 
      {
          //method calls that throw exeptions
      }
      catch(Exception e)///* Type of exeptions that we are catching
    {

    }*/
      while (go)
      {
          System.out.println("Please enter a floating point number");
          String input  = keyboard.nextLine();
          try {
            double num = Double.parseDouble(input); //converts string into an integer                    
            if (num<=0 || num > 99.5) System.out.println("Please enter a value in range ]0, 99.5[");
            else go = false;
          }
          catch (NumberFormatException e)
          {
              System.out.println("The string you entered failed to parse into integer");
              System.out.println(e.getMessage());
          }
          int x;
          x = keyboard.nextInt();
          int N = 50;
          //1 + x + x/2! + x/3! + ... + x/n!
          //1+2+3+4+...+50
          //1+2/x + 3/x +4/x + ...+ x/N          
          //1 + x/1! + x/2! + ...+ 
          //double currentTerm = x/1!
          //double nextTerm = currentTerm * 1/2
          //currentTerm = nextTurm
          //nextTerm = currentTerm*1/3
          double total = 1;
          double currentTerm = x;
          total = 1;
          for (int n = 1; n<=N; n++)
          {
              total = total + currentTerm;
              double nextTerm = currentTerm * 1/(n+1);
              currentTerm = nextTerm;
              
          }
          
          
      }


    }
    
}
