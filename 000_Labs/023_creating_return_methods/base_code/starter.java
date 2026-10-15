/*
 *	Author:  Karen Avagyan
 *  Date: 10/15
*/

import java.util.Scanner;

class starter {
	public static int pow(int a, int b){
		int a1 = 1;
		while(b > 0){
			a1 = a1 * a;
			b = b - 1; 
		}
		return a1;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your base number: ");
		int x = sc.nextInt();
		System.out.println("Enter your exponent number:");
		int y = sc.nextInt();
		
		System.out.print("Your answer is: ");
		System.out.println(pow(x,y));
	}
}
