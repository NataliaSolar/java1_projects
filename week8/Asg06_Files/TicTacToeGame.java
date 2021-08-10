
/**
 *This class runs the game until the status will change to "Done"
 * @author Alexandra Vaschillo
 */
public class TicTacToeGame
{
    public static void main(String[] args)
    {        
        TicTacToe myGame = new TicTacToe();
        myGame.printBoard();
       
        while (!myGame.done())
        {
            myGame.input();
            myGame.analyzeBoard();
            myGame.printBoard();
        }
        System.out.println("Congratulations! The winner is: "+myGame.whoWon());
    }
}
