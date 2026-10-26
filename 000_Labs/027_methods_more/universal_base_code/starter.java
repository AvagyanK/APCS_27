/*
 *	Author:  Karen Avagyan
 *  Date: 10/22
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BankAccount x = new BankAccount();
		BankAccount y = new BankAccount("James");
		BankAccount z = new BankAccount("Leo", 3345);
		
		x.checkBalance();
		y.checkBalance();
		z.checkBalance();

		x.displayAccountInfo();
		y.displayAccountInfo();
		z.displayAccountInfo();
	}
}
