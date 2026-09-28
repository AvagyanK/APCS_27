/*
 *	Author: Karen Avagyan
 *  Date: 9/24
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Please enter an integer: ");
		int x = sc.nextInt();

		System.out.print("Please enter another integer: ");
		int y = sc.nextInt();

		System.out.println("");

		if( x % 2 == 0){
			System.out.println(x + " is divisible by 2");
		}
		else{
			System.out.println(x + " is not divisible by 2");
		}

		if ((x % 3 == 0) || (x % 4 == 0) || (x % 5 == 0) ){
			if((x % 3 == 0)){
				System.out.println(x + " is divisible by 3");
			}
			if((x % 4 == 0)){
				System.out.println(x + " is divisible by 4");
			}
			if((x % 5 == 0)){
				System.out.println(x + " is divisible by 5");
			}
		}
		else{
			System.out.println(x +" is not divisible by 3, 4, or 5!");
		}

		System.out.println("");


		if( y % 2 == 0){
			System.out.println(y + " is divisible by 2");
		}
		else{
			System.out.println(y + " is not divisible by 2");
		}

		if ((y % 3 == 0) || (y % 4 == 0) || (y % 5 == 0) ){
			if((y % 3 == 0)){
				System.out.println(y + " is divisible by 3");
			}
			if((y % 4 == 0)){
				System.out.println(y + " is divisible by 4");
			}
			if((y % 5 == 0)){
				System.out.println(y + " is divisible by 5");
			}
		}
		else{
			System.out.println(y +" is not divisible by 3, 4, or 5!");
		}


	}
}
