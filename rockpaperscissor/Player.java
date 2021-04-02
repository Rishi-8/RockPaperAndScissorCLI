package com.rockpaperscissor;

import java.util.Scanner;

public class Player {
	
	public int choice = 0;
	public String chosenElement;
	
	public void choose() {
		Scanner sc = new Scanner(System.in);
		System.out.println("To choose rock press 1"+"\n"+
							"To choose paper press 2" + "\n"+
				            "To choose scissor press 3" + "\n");
		System.out.println("Please choose your element : ");
		choice = sc.nextInt();
		
		while(choice>3||choice<1) {
			chosenElement = null;
			System.out.println("Please choose again : ");
			choice = sc.nextInt();
		}

		if(choice == 1) {
			chosenElement = "Rock";
		}
		else if(choice == 2) {
			chosenElement = "Paper";
		}
		else if(choice == 3) {
			chosenElement = "Scissor";
		}
		else {
			System.out.println("Please choose again");
		}
	}

}
