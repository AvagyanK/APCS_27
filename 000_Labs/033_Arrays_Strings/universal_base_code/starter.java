/*
 *	Author:  Karen Avagyan
 *  Date: 11/10
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		String [] arr = new String[10];
		int i = 0;
		
		arr[0] = "And so you're back from outer space";
		arr[1] = "I just walked in to find you here with that sad look upon your face";
		arr[2] = "I should have changed that stupid lock";
		arr[3] = "I should have made you leave your key";
		arr[4] = "If I'd have known for just one second you'd be back to bother me";
		arr[5] = "Go on now, go. Walk out the door";
		arr[6] = "Just turn around now 'cause you're not welcome anymore";
		arr[7] = "Weren't you the one who tried to hurt me with goodbye?";
		arr[8] = "Did you think I'd crumble?";
		arr[9] = "Did you think I'd lay down and die?";

		while(i < arr.length){
			System.out.println(arr[i]);
			i++;
		}

	}
}	