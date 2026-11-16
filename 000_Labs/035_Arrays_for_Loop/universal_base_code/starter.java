/*
 *	Author:  Karen Avagyan
 *  Date: 11/12
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int [] arr = new int[1000];

		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random() * 100) + 1;
		}

		for(int x = 0; x < arr.length; x++){
			System.out.println(arr[x]);
		}
	
	}
}
