/*
 *	Author: Karen Avagyan
 *  Date: 11/9
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		int i = 0;
		int x = 0;
		int y = 1000;
		int [] arr = new int[1001];

		while(i < arr.length){
			x = x + 3;
			arr[i] = x;
			System.out.println(arr[i]);
			i++;
		}

		i = 0;

		while(y >= 0){
			arr[i] = y;
			System.out.println(arr[i]);
			y--;
		}

	}
}
