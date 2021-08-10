
package patterndisplaymethod;

/**
 *
 * @author Natalia Solar
 */
public class PatternDisplayMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        try // Testing patternDisplay method
        {
            // test 1. -- regular data, must produce the pattern
            System.out.print("PatternDisplayMethod() Test 1 ----------\n");
            patternDisplay(7, '+', true);
            // test 2. -- regular data, must produce the pattern 
            System.out.print("PatternDisplayMethod() Test 2 ----------\n");
            patternDisplay(4, '#', false);
            // test 3. -- exception-producing data: size is negative or 0
            System.out.print("PatternDisplayMethod() Test 3 ----------\n");
            patternDisplay(-1, '$', false);
        }catch(IllegalArgumentException e)  // handle the exception below
        {
            System.out.println("Exception caugth! " + e.getMessage());            
        }        
    }
    
    /**
     *  Prints patterns of symbols.
     * @param size represents size of the longest sequence of characters in the pattern
     * @param c defines the choice of character that is used to display the patter
     * @param direction defines the direction of the pattern
     * @throws IllegalArgumentException when size is negative or 0
     */
    public static void patternDisplay(int size, char c, boolean direction) throws IllegalArgumentException
    {
        //check if size is negative og 0 and throw an exception 
        if (size<=0) throw new IllegalArgumentException ("Size must to be non-negative:" + size);
        //display the pattern in the ascending pattern when direction is true
        if (direction == true)
        {
            // outer loop to handle number of rows (size)
            for(int i=0; i<=size-1; i++) 
            {   
                //  inner loop to handle number of columns 
                //  values changing acc. to outer loop     
                for(int j=0; j<=i; j++) 
                { 
                    // printing characters 
                    System.out.print(c); 
                }   
                // ending line after each row 
                System.out.println(); 
            } 
        }else //display the pattern in the descending pattern when direction is false
        {
            // outer loop to handle number of rows (size)
            for(int i=size-1; i>=0; i--) 
            {   
                //  inner loop to handle number of columns 
                //  values changing acc. to outer loop     
                for(int j=i; j>=0; j--) 
                { 
                    // printing characters 
                    System.out.print(c); 
                }   
                // ending line after each row 
                System.out.println(); 
            }
        }    
    }    
}
