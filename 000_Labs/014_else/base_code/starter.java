/*
 *	Author:  Karen Avagyan
 *  Date: 9/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int x = (int)(Math.random() * 1000) + 1;

		System.out.print("Pick a number betweeen 1 - 1000: ");
		int y = sc.nextInt();

		if(x == y){
			System.out.println("Yes, you guessed it!!!");
		}
		else{
			System.out.println("Your number was wrong!");
			System.out.println("The number was " + x);
		}
		
	}
}
