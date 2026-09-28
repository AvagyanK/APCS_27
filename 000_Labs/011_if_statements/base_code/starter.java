/*
 *	Author:  Karen Avagyan
 *  Date: 9/22
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x = 1;
		int y = 6;

		System.out.print("Choose a value to match with 2 different integers: ");
		int var = sc.nextInt();

		if(x == var){
			System.out.println(x + " is equal to " + var);
		}
		if(x != var){
			System.out.println(x + " is not equal to " + var);
		}
		if(y == var){
			System.out.println(y + " is equal to " + var);
		}
		if(y != var){
			System.out.println(y + " is not equal to " + var);
		}

	}
}
