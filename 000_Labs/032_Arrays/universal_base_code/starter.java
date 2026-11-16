/*
 *	Author:  Karen Avagyan
 *  Date: 11/10
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int [] arr = new int[10];

		int x = 0;
		int y = 9;

		while( x < arr.length ){
			arr[x] = y;
			System.out.println(arr[x]);
			x++;
			y--;
		}
		
	}
}
