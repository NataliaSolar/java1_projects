/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classworkmethods;

import java.util.Scanner;   // Needed for Scanner class
import java.io.*;           // Needed for File I/O classes
import java.util.Random;    // to generate random nubmers
/**
 *
 * @author User Account
 */
public class ClassworkMethods {


    /**
     * Calculates the area of the triangle given base and height
     * @param base - base of the triangle
     * @param heigth - height of the triangle
     * @return the area calculated
     * @throws IllegalArgumentException  - when base or height are non-positive values
     */
    public static double triangleArea(double base, double heigth) throws IllegalArgumentException
    {
        if (base<0) throw new IllegalArgumentException ("Base must to be non-negative;" + base);
        if (heigth<0) throw new IllegalArgumentException ("Heigth must to be non-negative;" + heigth);
        double area  = heigth *base/2;
        return area;
    }
    /**
     * Opens file with the given name for writing and writes 100 random numbers in range [0,100] into the file
     * @param fileName - the name of the file 
     * @return - success flag
     * @throws FileNotFoundException 
     */
    public static boolean writeToFile(String fileName) throws FileNotFoundException
    {
   
      // Open the file.
      PrintWriter outputFile = new PrintWriter(fileName);

      int numbers = 100;
      Random rand = new Random();
      for (int i = 1; i <= numbers; i++)
      {
         int n = rand.nextInt(101);
         // Write the name to the file.
         outputFile.println(n);
      }

      // Close the file.
      outputFile.close();
      
    
      

        return true;
      }
      
      

   
    
    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        double a1 =0;
        double a2 = 0;
        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);
        double n=8;
        double m=9;
        try
        {
        a1  = triangleArea(n,m);
        n=-1;
        m=8;        
        a2  = triangleArea(n,m);
        //System.out.printf("a1= %.2f\na2= %.2f\n", a1, a2);
        }catch(IllegalArgumentException e)
        {
            System.out.printf("Exception caugth!\n", e.getMessage());            
        }
        System.out.printf("a1= %.2f\na2= %.2f\n", a1, a2);
        
        try
        {
        boolean a = writeToFile("someFile.txt");
        if (a) System.out.println("Data written the file");
        } catch(FileNotFoundException e)
        {
            System.out.println("Exception caught! " + e.getMessage());
        }
        
    }
    
}
