/*
 *	Author: Karen Avagyan
 *  Date: 9/17
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 2 numbers to create a range for your random number");
		System.out.print("Please enter an integer: ");
		int x = sc.nextInt();

		System.out.print("Please enter another integer (bigger than the first): ");
		int y = sc.nextInt();

		System.out.println("Your range is " + x + " to " + y);
		System.out.println("Here are 5 numbers generated in that range.");
		System.out.print((int) (Math.random() * (y-x)) + x + ",");
		System.out.print((int) (Math.random() * (y-x)) + x + ",");
		System.out.print((int) (Math.random() * (y-x)) + x + ",");
		System.out.print((int) (Math.random() * (y-x)) + x + ",");
		System.out.println((int) (Math.random() * (y-x)) + x);
	}
}
