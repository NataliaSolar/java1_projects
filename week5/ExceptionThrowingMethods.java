/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filereading;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author alexandra.vaschillo
 */
public class FileReading {

      public static void main(String[] args) 
   {
      double s = 0.0;   

      // Open the file for reading.
      try{
          s = sumNumsInFile("..\\..\\Number.txt");

      // Display the sum of the numbers.
      System.out.println("The sum of the numbers in " +
                         "Numbers.txt is " + s);
      }
      catch (IOException e)
      {
          System.out.println("Cannot open the file! "+e.getMessage());
      }
      boolean go = true;
      Scanner keyboard = new Scanner(System.in);
      
      // Get the number of friends.
  
      while(go)
      {
        System.out.println("Enter length please");
      int l = keyboard.nextInt();
        System.out.println("Enter length please");
        int w = keyboard.nextInt();
        try
        {
         System.out.println("The area is "+rectangleArea(l, w));
         go = false;
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
      }
      
      
   }
      /**
       * Reads all floating point numbers from the file with the given name. Calculates the sum of all the numbers read.
       * Assumption: each number is placed on a separate line in the file
       * @param filename the name of the file to read from
       * @return the sum of numbers read from file
       * @throws IOException when the file fails to open
       */
   public static double sumNumsInFile(String filename) throws IOException
      {
            //"..\\..\\Numbers.txt"
        File file = new File(filename);
        Scanner inputFile = new Scanner(file);
        double sum = 0;
        while (inputFile.hasNext())
        {
           double number = inputFile.nextDouble();
           sum = sum + number;
        }

        inputFile.close();
        return sum;
      }
   
   public static double rectangleArea(double length, double width) throws IllegalArgumentException
   {
       if(length <= 0) throw new IllegalArgumentException("length value "+length+" is negative!!"); 
       if(width <= 0) throw new IllegalArgumentException("width value "+width+" is negative!!");
       return length*width;
   }
   
}
