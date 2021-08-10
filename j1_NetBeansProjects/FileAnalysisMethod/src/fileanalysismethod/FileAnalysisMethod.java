
package fileanalysismethod;
import java.util.Scanner;        // For the Scanner class
import java.io.*;                // For file I/O classes
/**
 *
 * @author Natalia Solar
 */
public class FileAnalysisMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try // Testing patternDisplay method
        {    
            // test 1. -- regular data, must open the file, read the data and write the new data to the new file
            System.out.println(" fileAnalysis () ---------test1----------");
            String inputName = "input.txt";
            String outputName = "output.txt";
            int a = fileAnalysis(inputName, outputName);
            System.out.println("Data written to the file.");
            // test 2. -- exception-producing data
            System.out.println(" fileAnalysis () ---------test2----------");
            inputName = "notExisting.txt";
            outputName = "output.txt";
            a = fileAnalysis(inputName, outputName);
            System.out.println("Data written to the file.");
        }
        
        
        catch (IOException e)  // handle the exception below
        {
            System.out.println("File failed to open "+e.getMessage());
        }
    }
    
    /**
     * Analyzes the sequence of integers stored in a file with a given name and calculates the statistics about the data stored in file and stores it in another file.
     * @param inputFileName the name of the file that is been analyzed
     * @param outputFileName the name of the output file with the new data
     * @return the number of the integers processed
     * @throws IOException  when the files fail to open for reading and writing
     */
    public static int fileAnalysis (String inputFileName, String outputFileName) throws IOException
    {
        int number;         //to hold numbers from input file
        int total =0;       //to hold the sum of the numbers
        int counter = 0;    //counter for number
        int smallest = 1;   //to hold the smallest number
        int greatest = 0;   //to hold the greatest number 
        
        // Open the file. At this point an exception may be thrown
        File file = new File(inputFileName);
        Scanner inputFile = new Scanner(file);

        // This loop processes the lines read from the file,
        // until the end of the file is encountered.
        while (inputFile.hasNext())
        {
            // Read an integer from the file.
            number = Integer.parseInt(inputFile.nextLine());
            if (number>greatest)//check if the number is bigger than the previous number
            {
                greatest = number;//set the number to be the greatest
            }
           else if (number<smallest) //check if the number is smaller than the previous number
           {
              smallest = number; //set the number to be the smallest
           }
            // Add number to the value of total.
            total += number;
            counter ++; //increment the counter
        }
      
        // Close the file.
        inputFile.close();
        
        // Open the new file.
        PrintWriter outputFile = new PrintWriter(outputFileName);
        
        // Write the new data to the file.            
        outputFile.println("Numeric data file name: " + inputFileName);
        outputFile.println("Number of integers: " + counter);
        outputFile.println("The total of all integers in file: " +total);
        outputFile.println("The largest integer in the set: "+greatest);
        outputFile.println("The smallest integer in the set: " + smallest);
        
        // Close the file.
        outputFile.close();
        
        return counter;
    }
}
