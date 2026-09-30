/*
 *	Author:  Karen Avagyan
 *  Date: 9/29
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Pick a number between 1 - 1000: ");
		int x = sc.nextInt();

		int y = (int)(Math.random() * 1000) + 1;

		if(x == y){
			System.out.println("You guessed it!!");
		}
		else if( x > y){
			System.out.print("Your number is larger. ");
			System.out.println("The number was "+y);

		}
		else{
			System.out.print("Your number is smaller. ");
			System.out.println("The number was "+y);
		}
	}
}
