/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodsandexceptions;
import java.util.Scanner;        // For the Scanner class
import java.io.*;                // For file I/O classes

/**
 *
 * @author Alexandra Vaschillo
 */
public class MethodsAndExceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
       // Testing triangleArea method
       try
       {
         // test 1. -- regular data, must produce 100
        System.out.printf("triangleArea() Test 1 ----------\n");
        double b = 10;
        double h = 20;
        double a = triangleArea(b, h);
        System.out.printf("Base: %.2f, Height %.2f; Area: %.2f\n", b, h, a);
      
        // test 2. -- exception-producing data: base is negative or 0
        System.out.printf("triangleArea() Test 2 ----------\n");
        b = 0;
        h = 20;
        a = triangleArea(b, h);
        System.out.printf("Base: %.2f, Height %.2f; Area: %.2f\n", b, h, a);  
        
        // test 3. -- exception-producing data: height is negative or 0
        // This test will not run unless I comment out the previous one
        System.out.printf("triangleArea() Test 3 ----------\n");
        b = 10;
        h = -20;
        a = triangleArea(b, h);
        System.out.printf("Base: %.2f, Height %.2f; Area: %.2f\n", b, h, a);
       }
       catch(IllegalArgumentException e)
       {
           System.out.println(e.getMessage());
       }
       // Testing getTotal method
       try
       {
           // test 1. -- opening file that exists (no exceptions expected.
           // the sum of numbers in file is 10.5
           System.out.printf("getTotal() Test 1 ----------\n");
           String fileName = "test01.txt";
           double t = getTotal(fileName);
           System.out.printf("File name: %s; Total is: %.2f\n",fileName, t );
           
           // test 2. -- opening file that dooes not exist - exception is expected
           
           System.out.printf("getTotal() Test 1 ----------\n");
           fileName = "Nonexistent.txt";
           t = getTotal(fileName);
           System.out.printf("File name: %s; Total is: %f.2\n",fileName, t );
       }
       catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
    /**
     * Method calculates area of triangle with given height and base.
     * The method code shows how to generate and throw exception from method
     * @param base  triangle base measurement
     * @param height  triangle height measurement
     * @return Returns area of triangle with given measurements
     * @throws IllegalArgumentException  Exception is thrown when base or height are not positive numbers. 
     */
    public static double triangleArea(double base, double height) throws IllegalArgumentException 
    {
        if (base <=0 ) throw new IllegalArgumentException("Base measurement must be a positive number. You provided "+ base); // if this branch is taken, the execution returns from function at once
        if (height <= 0) throw new IllegalArgumentException("Height measurement must be a positive number. You provided "+ height); // if this branch is taken, the execution returns from function at once
        
        return base*height/2; // this statement will be reached ONLY if both height and base are positive
    }
   
    /**
     * The method opens a text file filled with numbers and calculates the sum of all numbers.
     * The numbers are stored in file in file in specific format: one number per line.
     * This method demonstrates how propagate a standard exception up to the calling code.
     * @param filename  the name of the file to be opened
     * @return  the total of all numbers found in the file
     * @throws IOException when the file fails to open
     */
    
    public static double getTotal(String filename)throws IOException
   {
      double total = 0.0;  // Accumulator
      double number;        // number

      // Open the file. At this point an exception may be thrown
      File file = new File(filename);
      Scanner inputFile = new Scanner(file);
      
      // This loop processes the lines read from the file,
      // until the end of the file is encountered.
      while (inputFile.hasNext())
      {
         // Read a double from the file.
         number = inputFile.nextDouble();
         
         // Add number to the value already in total.
         total += number;
      }
      
      // Close the file.
      inputFile.close();
      
      // Return the total.
      return total;
   }
    
}
