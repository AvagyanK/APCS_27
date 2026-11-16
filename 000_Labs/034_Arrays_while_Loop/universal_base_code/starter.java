/*
 *	Author:  Karen Avagyan
 *  Date: 11/10
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int [] arr = new int[1000];
		int i = 0;
		int x = 0;

		while(i < arr.length){
			arr[i] = (int)(Math.random() * 100) + 1;
			i++;
		}

		while(x < arr.length){
			System.out.println(arr[x]);
			x ++;
		}
		
	}
}
