/*
 *	Author: Karen Avagyan 
 *  Date: 11/13
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int x = (int)(Math.random() * 150) + 51;
		int [] arr = new int[x];
		int min = 101;
		int max = 0;
		int avg = 0;

		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random() * 100) + 1;
			if(arr[i] < min){
				min = arr[i];
			}
			if(arr[i] > max){
				max = arr[i];
			}
			avg = avg + arr[i];
		}
		avg = avg / arr.length;

		System.out.println("Minimum: " + min);
		System.out.println("Maximum: " + max);
		System.out.println("Average: " + avg);
		System.out.println("There are " + arr.length + " elements!");
		
	}
}
