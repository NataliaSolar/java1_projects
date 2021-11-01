/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoegame;

import java.util.Scanner;

/**
 *
 * @author Natalia Solar
 */
public class TicTacToe {
    private char[] board = new char[16];
    private boolean status;//stores game status. There are 2 possibilities here – either still playing or done (game came to an end, someone won)
    private char winner;//stores the info about winning/losing the game. There are 3 possible states here: X won, O won, tie
    private char whoseTurn;//stores who’s turn it is to play now
    
    /*
    No-argument constructor that creates the initial setting on the board and gives initial values to all fields.
    */
    public TicTacToe()
    {
       
        char[] board = {'1','2','3','4','5','6','7','8','9','a','b','c','d','e','f','g'};
        this.board = board;
        status = false; //true = done, false = playing
        winner = 'T'; //T = tie, X = X won, O = O won 
        whoseTurn = 'X'; // X = X's turn, O = O's turn
    }
    
    
    /**
     * prints the current board
     */   
    public void printBoard()
    {        
        System.out.println("Current board =>");
        for (int i = 0; i < board.length; i++)
        {
            System.out.printf("%c  ",board[i]);                
           if (i==3||i==7||i==11||i==15) System.out.println();
        }
    }
    
    /**
     * method to search for a character in the array of of characters
     * @param array to look for in
     * @param input the char to look for
     * @return the index of found character, if not found return -1
     */
    private int findChar(char[] array, char input)
    {
        int index = -1;
        for (int i = 0; i<array.length;i++)
        {
            if (array[i]==input) return i;
        }
        return index;
    }
    
    
    /**
     * method to switch the player
     * @param whoseTurn the player whose turn is current
     */
    private void switchWhoseTurn(char whoseTurn)
    {
        if (whoseTurn == 'X') this.whoseTurn='O';
        else this.whoseTurn='X';
    }
    
    
    /**
     * provides the prompt and gathers input from the user
     */
    public void input()
    {
        boolean go = true;
        printBoard();
        while(go){
            try{
                if (whoseTurn == 'X')
                {
                    System.out.println("Player 1, make your move=> ");
                    Scanner keyboard = new Scanner(System.in);
                    // input the choice
                    char input = keyboard.next().charAt(0);
                    int index = findChar(board, input);
                    if(index<0)throw new IllegalArgumentException("You entered invalid character or this position is already taken, choose another position.");
                    board[index]='X';
                    switchWhoseTurn(whoseTurn);
                    go=false;
                }else
                {
                   System.out.println("Player 2, make your move=> ");
                    Scanner keyboard = new Scanner(System.in);
                    // input the choice
                    char input = keyboard.next().charAt(0);
                    int index = findChar(board, input);
                    if(index<0)throw new IllegalArgumentException("You entered invalid character or this position is already taken, choose another position.");
                    board[index]='O';
                    switchWhoseTurn(whoseTurn);
                    go=false;
                }
            }catch (IllegalArgumentException e)
            {
                System.out.println("Exception caught!" + e.getMessage());
            }
        }
    }      
       
    
    /**
     * It simulates a move of a user.
     * @param player specifies the player (X or O)
     * @param letter specifies the move (as a character)
     */
    public void simulateInput(char player, char letter)
    {
        printBoard();
        if (whoseTurn != player)throw new IllegalArgumentException("It is now "+whoseTurn + " player's turn!");
        if (findChar(board, letter)<0) throw new IllegalArgumentException("You entered invalid character or this position is already taken, choose another position.");
        System.out.printf("Player %c, make your move => %c\n",player,  letter);
        board[findChar(board, letter)]=player;
        switchWhoseTurn(whoseTurn);
    }
    
    /**
     * method to analyze if there is a tie
     * @return true if there is a tie
     */
    private boolean lookForTie()
    {
        for (int i=0; i<board.length; i++)
        {
            if(board[i]!='X'||board[i]!='O') return false;
        }
        return true;
    }
    
    /**
     * analyzes the current board and determines if there is a winning position present or if it is a tie
     */
    public void analyzeBoard()
    {        
        char c;
        if (whoseTurn=='X') c= 'O';
        else c ='X';
        
        if ((board[0]==c&&board[1]==c&&board[2]==c) || (board[1]==c&&board[2]==c&&board[3]==c)||//rows
            (board[4]==c&&board[5]==c&&board[6]==c) || (board[5]==c&&board[6]==c&&board[7]==c)||
            (board[8]==c&&board[9]==c&&board[10]==c) || (board[9]==c&&board[10]==c&&board[11]==c)||
            (board[12]==c&&board[13]==c&&board[14]==c) || (board[13]==c&&board[14]==c&&board[15]==c)||
            (board[0]==c&&board[4]==c&&board[8]==c) || (board[4]==c&&board[8]==c&&board[12]==c)||//columns   
            (board[1]==c&&board[5]==c&&board[9]==c) || (board[5]==c&&board[9]==c&&board[13]==c)||
            (board[2]==c&&board[6]==c&&board[10]==c) || (board[6]==c&&board[10]==c&&board[14]==c)||   
            (board[3]==c&&board[7]==c&&board[11]==c) || (board[7]==c&&board[11]==c&&board[15]==c)||
            (board[4]==c&&board[9]==c&&board[14]==c) || (board[1]==c&&board[6]==c&&board[11]==c)||//diagonals
            (board[0]==c&&board[5]==c&&board[10]==c) || (board[5]==c&&board[10]==c&&board[15]==c)||
            (board[2]==c&&board[5]==c&&board[8]==c) || (board[7]==c&&board[10]==c&&board[13]==c)||    
            (board[3]==c&&board[6]==c&&board[9]==c) || (board[6]==c&&board[9]==c&&board[12]==c)) 
        {            
            winner = c;
            status = true;
        }
        if (lookForTie()==true)
        {
            winner = 'T';
            status = true;
        }
    }
    
    /**
     * accessor for status field
     * @return the status
     */
    public boolean done()
    {    
       return status;
    }
    
    /**
     * accessor foe winner field
     * @return returns a character (X, O or T – for tie), a value of the winner field
     */
    public char whoWon()
    {
        return winner;
    }
}
