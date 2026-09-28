/*
 *	Author: Karen Avagyan
 *  Date: 9/27
 * 	Collaborator:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("The goal of the game is to guess a word with two hints!");
		System.out.println("");

		String answer1 = "earth";
		String answer2 = "apple";
		String answer3 = "cat";

		int run = (int) (Math.random() * 3) + 1;

		// Question 1
		
		if(run == 1){
			System.out.println("It's a planet in our solar system?");
			System.out.print("What is your guess? ");
			String first = sc.nextLine();

			if(first.toLowerCase().equals(answer1) ){
				System.out.println("You got it!");
			}
			else{
				System.out.println("You didn't guess right, here's another hint!");
				System.out.print("It's the only one with humans on it! ");
				String first2 = sc.nextLine();

				if(first2.toLowerCase().equals(answer1)){
					System.out.println("You got it!");
				}
				else{
					System.out.println("The answer was "+ answer1 +", better luck next time!");
				}
			}
		}


		// Question 2


		if(run == 2){
			System.out.println("It's a fruit!");
			System.out.print("What is your guess? ");
			String second = sc.nextLine();

			if(second.toLowerCase().equals(answer2) ){
				System.out.println("You got it!");
			}
			else{
				System.out.println("You didn't guess right, here's another hint!");
				System.out.print("It's a red fruit! ");
				String second2 = sc.nextLine();

				if(second2.toLowerCase().equals(answer2)){
					System.out.println("You got it!");
				}
				else{
					System.out.println("The answer was "+ answer2 +", better luck next time!");
				}
			}
		}


		// Question 3

		
		if(run == 3){
			System.out.println("It's a furry? animal");
			System.out.print("What is your guess? ");
			String third = sc.nextLine();

			if(third.toLowerCase().equals(answer3) ){
				System.out.println("You got it!");
			}
			else{
				System.out.println("You didn't guess right, here's another hint!");
				System.out.print("It's a feline friend! ");
				String third2 = sc.nextLine();

				if(third2.toLowerCase().equals(answer3)){
					System.out.println("You got it!");
				}
				else{
					System.out.println("The answer was "+ answer3 +", better luck next time!");
				}
			}
		}

	}
}
