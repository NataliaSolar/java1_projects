
/**
 *This class simulates player's input 
 * catches IllegalArgumentExceprtion if input is invalid  
 * @author Alexandra Vaschillo
 */
public class TicTacToeSimulation
{
    public static void main(String[] args)
    {
        try{

            
             //test case #1
            // insert winning diagonal combitation
            // no exceptions should appear here
            TicTacToe myGame = new TicTacToe();
            myGame.printBoard();
            myGame.simulateInput('X','5');
            myGame.analyzeBoard();
            myGame.printBoard();
            myGame.simulateInput('O','2');
            myGame.printBoard();
            myGame.analyzeBoard();
            myGame.simulateInput('X','a');
            myGame.analyzeBoard();
            myGame.printBoard();
            myGame.simulateInput('O','1');
            myGame.printBoard(); 
            myGame.analyzeBoard();
            myGame.simulateInput('X','f');
            myGame.analyzeBoard();
            myGame.printBoard();
            if(myGame.done()) System.out.println("Passed test case #1, winner must be 'X'; winner is " + myGame.whoWon());
            else System.out.println("Test case #1 failed");
// Continue building your own test cases
// Make sure to test for incorrect input as well as differnt winning combinations.
            
        }
        catch(IllegalArgumentException e)
        {
            System.out.print(e.getMessage());
        }
    }
}
