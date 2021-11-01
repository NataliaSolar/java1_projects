
package fileclasswork;
import java.util.Scanner; // Needed for the Scanner class
import java.io.*;         // Needed for the File class

/**
 *
 * 11/10/18
 */
public class FileClasswork {
    //methods
    /**
     * Calculates the sum of two numbers
     * @param a first number of the sum
     * @param b second number of the sum
     * @return sum of two numbers
     */
    public static double sum(double a, double b)
    {
        double s = a+b;
        return s;
    }
    public static boolean contains(String s, char c)
    {
        boolean a = true;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == c)
            {
                a = true;
                break;
            }else a = false; 
       
        }
        
        return a;
    }
    public static void main(String[] args) //throws IOException
    { 
        boolean check = contains("fast", 'c');
        System.out.print(check);
      /* 
      String filename;      // File name
      String friendName;    // Friend's name
      int numFriends;       // Number of friends
      String sampleName = "C:\\Users\\User Account\\Documents\\NetBeansProjects\\FileClasswork\\test.txt";

      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Get the number of friends.
      System.out.print("How many friends do you have? ");
      numFriends = keyboard.nextInt();

      // Consume the remaining newline character.
      keyboard.nextLine();
      
      // Get the filename.
      System.out.print("Enter the filename: ");
      filename = keyboard.nextLine();

      
      try {
      // Open the file.
      PrintWriter outputFile = new PrintWriter(filename);

      // Get data and write it to the file.
      for (int i = 1; i <= numFriends; i++)
      {
         // Get the name of a friend.
         System.out.print("Enter the name of friend " +
                          "number " + i + ": ");
         friendName = keyboard.nextLine();

         // Write the name to the file.
         outputFile.println(friendName);
      }

      // Close the file.
      outputFile.close();
      }
      catch (IOException e)
      {
          System.out.println("File failed to open for writing"+e.getMessage());

      }
      System.out.println("Data written to the file.");
      

      // Get the filename.
      System.out.print("Enter the filename: ");
      filename = keyboard.nextLine();
      try
      {
        // Open the file.
        File file = new File(sampleName);
        Scanner inputFile = new Scanner(file);

        // Read lines from the file until no more are left.
        while (inputFile.hasNext())
        {
           // Read the next name.
           friendName = inputFile.nextLine();

           // Display the last name read.
           System.out.println(friendName);
        }

        // Close the file.
        inputFile.close();
      }
      catch (IOException e)
      {
          System.out.println("File failed to open for reading "+e.getMessage());
      }
       
       //methods
       // Create a Scanner object for keyboard input.
       
       ///*
       
     //


System.out.println("Enter your first name");

String firstName = keyboard.nextLine();

System.out.println("Enter your middle name");

String middleName = keyboard.nextLine();

System.out.println("Enter your last name");

String lastName = keyboard.nextLine();

char firstInitial = firstName.charAt(0);

char middleInitial = middleName.charAt(0);

char lastInitial = lastName.charAt(0);

System.out.println(firstName);
System.out.println(middleName);
System.out.println(lastName);

System.out.println(firstInitial);
System.out.println(middleInitial);
System.out.println(lastInitial);*/
    }
    
}
