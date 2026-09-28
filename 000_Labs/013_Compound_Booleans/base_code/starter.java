/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your first integer: ");
		int x = sc.nextInt();
		System.out.print("Enter your second integer: ");
		int y = sc.nextInt();
		System.out.print("Enter your third integer: ");
		int z = sc.nextInt();

		if((x > y) && (x > z)){
			System.out.println("Your first number is the largest integer of the three!");
			System.out.println("The number was: " + x);
		}
		if((y > x) && (y > z)){
			System.out.println("Your second number is the largest integer of the three!");
			System.out.println("The number was: " + y);
		}
		if((z > y) && (z > x)){
			System.out.println("Your third number is the largest integer of the three!");
			System.out.println("The number was: " + z);
		}

		if((x < y) && (x < z)){
			System.out.println("Your first number is the smallest integer of the three!");
			System.out.println("The number was: " + x);
		}
		if((y < x) && (y < z)){
			System.out.println("Your second number is the smallest integer of the three!");
			System.out.println("The number was: " + y);
		}
		if((z < y) && (z < x)){
			System.out.println("Your third number is the smallest integer of the three!");
			System.out.println("The number was: " + z);
		}

	}
}
