/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoegame;

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
            
            System.out.println("-----------------");
            //tast case #3
            //insert winning row combination
            // no exceptions should appear here
            TicTacToe myGame3 = new TicTacToe();
            myGame3.printBoard();
            myGame3.simulateInput('X','a');
            myGame3.analyzeBoard();
            myGame3.printBoard();
            myGame3.simulateInput('O','2');
            myGame3.printBoard();
            myGame3.analyzeBoard();
            myGame3.simulateInput('X','b');
            myGame3.analyzeBoard();
            myGame3.printBoard();
            myGame3.simulateInput('O','1');
            myGame3.printBoard(); 
            myGame3.analyzeBoard();
            myGame3.simulateInput('X','c');
            myGame3.analyzeBoard();
            myGame3.printBoard();
            if(myGame3.done()) System.out.println("Passed test case #3, winner must be 'X'; winner is " + myGame3.whoWon());
            else System.out.println("Test case #3 failed");
            System.out.println("-----------------");
            //tast case #4
            //insert winning column combination
            // no exceptions should appear here
            TicTacToe myGame4 = new TicTacToe();
            myGame4.printBoard();
            myGame4.simulateInput('X','2');
            myGame4.analyzeBoard();
            myGame4.printBoard();
            myGame4.simulateInput('O','6');
            myGame4.printBoard();
            myGame4.analyzeBoard();
            myGame4.simulateInput('X','b');
            myGame4.analyzeBoard();
            myGame4.printBoard();
            myGame4.simulateInput('O','a');
            myGame4.printBoard(); 
            myGame4.analyzeBoard();
            myGame4.simulateInput('X','c');
            myGame4.analyzeBoard();
            myGame4.printBoard();
            myGame4.simulateInput('O','e');
            myGame4.printBoard(); 
            myGame4.analyzeBoard();
            if(myGame4.done()) System.out.println("Passed test case #4, winner must be 'O'; winner is " + myGame4.whoWon());
            else System.out.println("Test case #4 failed");
            System.out.println("-----------------");
             //test case #2
            // insert winning diagonal combitation
            // produce an exception when X is playing out of term
            /*TicTacToe myGame2 = new TicTacToe();
            myGame2.printBoard();
            myGame2.simulateInput('X','5');
            myGame2.analyzeBoard();
            myGame2.printBoard();
            myGame2.simulateInput('X','2');
            myGame2.printBoard();
            myGame2.analyzeBoard();
            myGame2.simulateInput('X','a');
            myGame2.analyzeBoard();
            myGame2.printBoard();
            myGame2.simulateInput('O','1');
            myGame2.printBoard(); 
            myGame2.analyzeBoard();
            myGame2.simulateInput('X','f');
            myGame2.analyzeBoard();
            myGame2.printBoard();
            if(myGame2.done()) System.out.println("Passed test case #1, winner must be 'X'; winner is " + myGame2.whoWon());
            else System.out.println("Test case #1 failed");
            System.out.println("-----------------");
            //test case #5
            //insert winning row combination
            // produce an exception when user enters illegal character
            TicTacToe myGame5 = new TicTacToe();
            myGame5.printBoard();
            myGame5.simulateInput('X','v');
            myGame5.analyzeBoard();
            myGame5.printBoard();
            myGame5.simulateInput('O','2');
            myGame5.printBoard();
            myGame5.analyzeBoard();
            myGame5.simulateInput('X','b');
            myGame5.analyzeBoard();
            myGame5.printBoard();
            myGame5.simulateInput('O','1');
            myGame5.printBoard(); 
            myGame5.analyzeBoard();
            myGame5.simulateInput('X','c');
            myGame5.analyzeBoard();
            myGame5.printBoard();
            if(myGame5.done()) System.out.println("Passed test case #3, winner must be 'X'; winner is " + myGame5.whoWon());
            else System.out.println("Test case #3 failed");
            System.out.println("-----------------");*/
            //test case #5
            //insert winning row combination
            // produce an exception when user chooses position that is already taken
            TicTacToe myGame6 = new TicTacToe();
            myGame6.printBoard();
            myGame6.simulateInput('X','1');
            myGame6.analyzeBoard();
            myGame6.printBoard();
            myGame6.simulateInput('O','2');
            myGame6.printBoard();
            myGame6.analyzeBoard();
            myGame6.simulateInput('X','b');
            myGame6.analyzeBoard();
            myGame6.printBoard();
            myGame6.simulateInput('O','1');
            myGame6.printBoard(); 
            myGame6.analyzeBoard();
            myGame6.simulateInput('X','c');
            myGame6.analyzeBoard();
            myGame6.printBoard();
            if(myGame6.done()) System.out.println("Passed test case #6, winner must be 'X'; winner is " + myGame6.whoWon());
            else System.out.println("Test case #6 failed");
        }
        catch(IllegalArgumentException e)
        {
            System.out.print(e.getMessage());
        }
    }
}
