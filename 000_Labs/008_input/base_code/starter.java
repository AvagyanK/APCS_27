/*
 *	Author:  Karen Avagyan
 *  Date: 9/10/2026
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("What's your name");
		String name = sc.nextLine();

		System.out.println("What's your age");
		int age = sc.nextInt();
		sc.nextLine();

		System.out.println("What's your Birthday Month");
		String bm = sc.nextLine();

		System.out.println("What's your Birthday Day");
		int bd = sc.nextInt();
		sc.nextLine();

		System.out.println("What's your Birthday Year");
		int by = sc.nextInt();

		System.out.println("How much is a buck fifty");
		double bf = sc.nextDouble();

		System.out.println("__________________________________");
		System.out.println("First Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Birthday Month: " + bm);
		System.out.println("Birthday Day: " + bd);
		System.out.println("Birthday Year: " + by);
		System.out.println("Buck fifty: $" + bf);
	
	}
}
