/*
 *	Author:  Karen Avagyan
 *  Date: 9/16
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		// int x = Math.min(5-7*3,8%5*7);
		// System.out.println(x);

		System.out.println(Math.max(13 - 6 * 11, 30 % 7 * (-2)));
		System.out.println(Math.sqrt(3*8 + 31%7));
		System.out.println(Math.pow(37/3, 35%21));
		System.out.println(Math.max(Math.pow(2,14%3), Math.sqrt(2*6)));

///////////////////Extra Lab

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a double: ");
		double x = sc.nextDouble();

		System.out.println("Please enter another double: ");
		double y = sc.nextDouble();

		double max = Math.max(x,y);
		System.out.println("Maximum number of x and y is: "+max);

		double sqrt = Math.sqrt(y);
		System.out.println("Square root of y is: "+sqrt);

		double power = Math.pow(x, y);
		System.out.println("Power of x and y is: "+power);
	}
}
