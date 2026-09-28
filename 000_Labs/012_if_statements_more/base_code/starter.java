/*
 *	Author:  Karen Avagyan
 *  Date: 9/23
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Input your first integer: ");
		int x = sc.nextInt();

		System.out.print("Input your second integer: ");
		int y = sc.nextInt();

		if(x == y){
			System.out.println("They are equal!");
		}
		if(x != y){
			System.out.println("They are different!");
		}
	}
}
