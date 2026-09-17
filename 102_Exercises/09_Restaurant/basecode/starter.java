/*
 *	Author:  Karen Avagyan
 *  Date: 9/14
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("What is the Restaurant's name?");
		String res = sc.nextLine();

		System.out.println("What is your name?");
		String name = sc.nextLine();
		
		System.out.println("Pick an item!");
		String item = sc.nextLine();

		System.out.println("How much is it?");
		double price = sc.nextDouble();

		System.out.println("How many do you need?");
		int qty = sc.nextInt();
		sc.nextLine();


		System.out.println("Pick a drink!");
		String drink = sc.nextLine();

		System.out.println("How much is it?");
		double dprice = sc.nextDouble();

		System.out.println("How many do you need?");
		int dqty = sc.nextInt();
		sc.nextLine();


		System.out.println("Anything else?");
		String any = sc.nextLine();

		System.out.println("How much is it?");
		double aprice = sc.nextDouble();

		System.out.println("How many do you need?");
		int aqty = sc.nextInt();


		System.out.println("What tip percentage would you like to leave?");
		double tip = sc.nextDouble();

		double subtotal = qty*price + dqty*dprice + aqty*aprice;
		double tax = subtotal / 9.75;
		double tip_am = subtotal * tip / 100;
		double total = subtotal + tax + tip_am;

		System.out.println("========================================");
		System.out.println("    " + res + " - Menu For Today");
		System.out.println("========================================");
		System.out.println("Owner: " + name);
		System.out.println("----------------------------------------");
		System.out.println("Item         Qty     Price");
		System.out.println("----------------------------------------");
		System.out.println(item + "        " + qty + "       " + price);
		System.out.println(drink + "          " + dqty + "       " + dprice);
		System.out.println(any + "         " + aqty + "       " + aprice);
		System.out.println("----------------------------------------");
		System.out.println("Subtotal:             " + subtotal);
		System.out.println("Tax (9.75%):" + "          " +  tax);
		System.out.println("Tip:                  " + tip);
		System.out.println("Tip Amount:           " + tip_am);
		
		System.out.println("========================================");
		System.out.println("TOTAL:                " + total);
		System.out.println("========================================");
	}
}
