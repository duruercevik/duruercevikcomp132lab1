package main;


import java.util.Scanner;
/* *********** Pledge of Honor ************************************************ *

I hereby certify that I have completed this lab assignment on my own
without any help from anyone else. I understand that the only sources of authorized
information in this lab assignment are (1) the course textbook, (2) the
materials posted on the course website, and (3) any study notes handwritten by myself.
I have not used, accessed, or received any information from any other unauthorized
source in taking this lab assignment. The effort in the assignment thus belongs
completely to me.
READ AND SIGN BY WRITING YOUR NAME SURNAME, AND STUDENT ID
SIGNATURE: <Duru Erçevik, 0086602>
********************************************************************************/

import game.ElementalClash;

public class Main {

	public static void main(String[] args) {
        
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the name of player 1: ");
        String player1Name = scanner.nextLine();
        
        System.out.print("Enter the name of player 2: ");
        String player2Name = scanner.nextLine();
        
        System.out.print("Enter the number of rounds of the game: ");
        int numRounds = scanner.nextInt();
        
        System.out.print("Enter the score difference of the game: ");
        int scoreDif = scanner.nextInt();
        
   ////////////////// in-lab test code 1 ///////////////////////////////////////////
        // The code for this part will be given to you during the lab on Friday
        
   ///////////////////////////////////////////////////////////////////////////////       
        scanner.close();
        
        ElementalClash game = new ElementalClash(player1Name, player2Name, numRounds);
        game.runGame();
        game.printWinner();
        
        System.out.print("\n\n------------------------ In lab ------------------------\n");
        ElementalClash gameInLab = new ElementalClash(player1Name, player2Name,
        numRounds, scoreDif);
        gameInLab.runInLabGame();
        gameInLab.printWinner();
        
        
   /////////////////// in-lab test code 2 //////////////////////////////////////////
        // The code for this part will be given to you during the lab on Friday
   ///////////////////////////////////////////////////////////////////////////////       
		

	}

}
