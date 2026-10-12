/*
 *	Author:  Karen Avagyan
 *  Date: 10/8
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.print("What's your name?: ");
		String name = sc.nextLine();

		System.out.print("How many times do you want to print your name?: ");
		int times = sc.nextInt();

		int a = 0;
		while(true){
			if( a == times){
				break;
			}
			System.out.println(name);
			a++;
		}

	}
}
