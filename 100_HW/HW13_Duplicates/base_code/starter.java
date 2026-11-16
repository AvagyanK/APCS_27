/*
 *	Author: Karen Avagyan
 *  Date: 11/15
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		int [] arr = new int [20];

		System.out.println("These are the 20 numbers");
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random() * 10) + 1;
			System.out.print(arr[i]);
			System.out.print(" ");
		}
		System.out.println("");
		System.out.println("------------------------------------------------");

		int x = (int)(Math.random() * 10) + 1;
		System.out.println("The random number is " + x);

		int total = 0;
		for(int y = 0; y < arr.length; y++){
			if(x == arr[y]){
				System.out.println("Duplicate found at index " + y);
				total++;
			}
		}
		System.out.println("Total number of duplicates for " + x + " is " + total);
		System.out.println("------------------------------------------------");

		System.out.println("Looking for two in a row:");
		for(int z = 0; z < arr.length - 1; z++){
			if(arr[z] == arr[z + 1]){
				System.out.print("Two in a row found at index " + z + " and " + (z+1));
				System.out.println(". The number is " + arr[z]);
			}
		}	
	}
}

