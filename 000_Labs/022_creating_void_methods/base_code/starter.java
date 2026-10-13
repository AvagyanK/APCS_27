/*
 *	Author:  Karen Avagyan
 *  Date: 10/12
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Write a sentance!");
		String b = sc.nextLine(); 

		System.out.println("Write a sentance!");
		String c = sc.nextLine(); 

		System.out.println("");
		System.out.println("This is using the methods!");
		toString(b);
		toStringCombined(b, c);
		
	}
	public static void toString(String a){
		System.out.println(a);
		return;
	}
	public static void toStringCombined(String b, String c){
		System.out.println(b +" "+c);
	}
	
}
