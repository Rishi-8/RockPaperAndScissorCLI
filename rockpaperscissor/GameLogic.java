package com.rockpaperscissor;

import java.util.Scanner;

public class GameLogic {
	
	double computerChoice;
	String chosenElement;
	String winner;
	
	public void startGame(){
		computerChoice =  1+Math.random()*3;
		//System.out.println("computerChoice = "+computerChoice);
		int computerChoiceS = (int)computerChoice;
		//System.out.println("computerChoice = "+computerChoiceS);
		
		if (computerChoiceS == 1) {
			chosenElement = "Rock";
		}
		else if (computerChoiceS == 2) {
			chosenElement = "Paper";
		}
		else if (computerChoiceS == 3) {
			chosenElement = "Scissor";
		}
		
		Player player = new Player();
		player.choose();
			
		if(computerChoiceS == player.choice) {
			System.out.println("The game is draw");
		}
		
		else if(player.choice == 1 && computerChoiceS==2 || player.choice==2 && computerChoiceS==3 || player.choice==3 && computerChoiceS ==1) {
			winner = "Computer";
		}	
		else {
			winner = "Player";
		}
			
			
			//System.out.println("player choice = "+player.choice);
			System.out.println("The player has chosen " + player.chosenElement.toUpperCase());
			System.out.println("The Computer has chosen " + chosenElement.toUpperCase());
			if(winner!=null) {
			System.out.println("The winner is " + winner.toUpperCase() +"\n\n");
		    }
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Press \"R\" to play again"+"\n"+"Press \"E\" to end game");
			char status = sc.next().charAt(0);
			
			String userChoice = Character.toString(status);
			
			if(userChoice.toUpperCase().equals("R")) {
				startGame();
			}
			else {
				sc.close();
				System.out.println("OK, bye, you are cold :(");
			}
			
		}

}
