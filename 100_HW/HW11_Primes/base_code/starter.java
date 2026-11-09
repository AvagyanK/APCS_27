/*
 *	Author: Karen Avagyan
 *  Date: 11/2
*/

import java.util.Scanner;

class starter {
	public static boolean checkPrime(int x){
		int y = 2;
		boolean a = true;
		while(y < x){
			if(x % y != 0){
				y++;
			}
			else{
				a = false;
				break;
			}
		}	
		return a;
	}

	public static void printPrimes(int a){
		int b = 2;
		while(true){
			if(b <= a){
				if(checkPrime(b)){
					System.out.println(b);
				}
				b++;
			}
			else{
				break;
			}
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Input a number and we will print out every prime until that number: ");
		int num = sc.nextInt();
		printPrimes(num);
		
	}
}
