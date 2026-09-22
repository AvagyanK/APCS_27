/*
 *	Author:  Karen Avagyan
 *  Date: 9/17
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		System.out.print("An integer between 0 and 9 inclusive of both: ");
		System.out.println((int) (Math.random() * 10));

		System.out.print("An integer between 1 and 100 inclusive of both: ");
		System.out.println((int)(Math.random() * 100 + 1));

		System.out.print("A double between 2.5 and 3.5 inclusive of 2.5: ");
		System.out.println(Math.random() + 2.5);

		System.out.print("A double between 14 and 589 inclusive of 14: ");
		System.out.println(Math.random() * (589 - 14) + 14);
	}
}
