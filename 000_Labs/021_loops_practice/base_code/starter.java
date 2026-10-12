/*
 *	Author: Karen Avagyan 
 *  Date: 10/8
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int y = (int)(Math.random() * 1000) + 1;

		System.out.print("Guess a number: ");
		int x = sc.nextInt();

		while(true){
			if (x == y){
				System.out.println("You got the number!");
				break;
			}
			else if(x < y){
				System.out.println("The number is higher");
				System.out.print("Guess a number: ");
				x = sc.nextInt();
			}
			else{
				System.out.println("The number is lower");
				System.out.print("Guess a number: ");
				x = sc.nextInt();
			}
				
		}
		
	}
}
