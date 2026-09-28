/*
 *	Author: Karen Avagyan
 *  Date: 9/22
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int passcode = 1111;
		
		System.out.print("Guess the passcode to unlock a fortune: ");
		int pass = sc.nextInt();

		if(passcode == pass){
			int x = (int)(Math.random() * 10) + 1;
			if(x == 1){
				System.out.println("A small step today leads to a big change tomorrow.");
			}
			if(x == 2){
				System.out.println("Your kindness will return to you in unexpected ways.");
			}
			if(x == 3){
				System.out.println("Adventure is waiting just beyond your comfort zone.");
			}
			if(x == 4){
				System.out.println("Adventure is waiting just beyond your comfort zone.");
			}
			if(x == 5){
				System.out.println("Adventure is waiting just beyond your comfort zone.");
			}
			if(x == 6){
				System.out.println("Patience will reveal an opportunity worth waiting for.");
			}
			if(x == 7){
				System.out.println("Someone is about to appreciate you more than you know.");
			}
			if(x == 8){
				System.out.println("Trust yourself—you already know more than you think.");
			}
			if(x == 9){
				System.out.println("A pleasant surprise is heading your way.");
			}
			if(x == 10){
				System.out.println("The future becomes brighter when you share your light.");
			}
		

		}
		if(passcode != pass){
			System.out.println("wrong");
		}



	}
}
