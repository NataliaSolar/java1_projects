
package randomnumsinfiles;
import java.util.Scanner;   // Needed for Scanner class
import java.io.*;           // Needed for File I/O classes
import java.util.Random;    // to generate random nubmers
/**
 *
 * @author Natalia Solar
 */
public class RandomNumsInFiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try// Testing patternDisplay method
        {
            // test 1. -- regular data, must write the data to the file
            System.out.print("randomNumsFile() Test 1 ----------\n");
            randomNumsFile("someFile.txt",10, 1, 10);
            System.out.println("Data written to the file.");
            // test 2. -- exception-producing data
            System.out.print("randomNumsFile() Test 2 ----------\n");
            randomNumsFile("C:\\Users\\User Account\\Documents\\NetBeansProjects\\RandomNumsInFiles\\someFile.txt",10, 1, 10);
            System.out.println("Data written to the file.");
            
        } catch(IOException e)  // handle the exception below
        {         
            System.out.println("File failed to open for writing "+e.getMessage());
        }
    }
    
    /**
     * Generates random integers and saves them in a file, placing each new number on a new line.
     * @param fileName File name
     * @param howMany Number of random numbers to be generated
     * @param rangeFrom the lower limit of the range of random numbers to be generate
     * @param rangeTo the upper limit of the range of random numbers to be generate
     * @throws IOException  when the file fails to open for writing
     */
    public static void randomNumsFile(String fileName, int howMany, int rangeFrom, int rangeTo) throws IOException
    {
        int temp;    //to hold temporary value for swapping
        int number;  //to hold generated random numbers
        if (rangeTo<rangeFrom) //check if upper limit is smaller than lower limit 
        {
            //swap
            temp = rangeFrom;
            rangeFrom = rangeTo;
            rangeTo = temp;
        }        
        // Open the file.
        PrintWriter outputFile = new PrintWriter(fileName);

        // Get data and write it to the file.
        for (int i = 1; i <= howMany; i++)
        {
            Random randomNumber = new Random();//set up an object to generate random nubmers
            number = randomNumber.nextInt((rangeTo - rangeFrom) + 1) + rangeFrom; // generate random number
            // Write the number to the file.
            outputFile.println(number);
        }
        // Close the file.
        outputFile.close();
    }
}
