/*
 *	Author:  Karen Avagyan
 *  Date: 9/30
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		String wi = "Wizard";
		String wa = "Warrior";
		String ro = "Rogue";

		int points = 20;

		System.out.println("What is your name?");
		String name = sc.nextLine();

		System.out.println("What is your title? Ex: Slayer of Dragons");
		String title = sc.nextLine();

		System.out.print("Would you like to be Wizard, Warrior, or Rogue? ");
		String role = sc.nextLine();

		if(role.toLowerCase().equals(wi.toLowerCase())){
			System.out.println("You have chosen the "+ wi);
		}
		else if(role.toLowerCase().equals(wa.toLowerCase())){
			System.out.println("You have chosen the "+ wa);
		}
		else if(role.toLowerCase().equals(ro.toLowerCase())){
			System.out.println("You have chosen the "+ ro);
		}
		else{
			System.out.println("You have decided not to chose a role. Rerun program");
		}

		System.out.println("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, and Charisma.");

		System.out.print("Strength (1 - 10): ");
		int st = sc.nextInt();
		if (st >= 1 && st <= 10){
			points = points - st;
		}
		else{
			System.out.println("Please input accurate value. (1-10): ");
			st = sc.nextInt();
			points = points - st;
		}
		System.out.println("You have "+points+" left to spend");
		

		System.out.print("Dexterity (1-10): ");
		int de = sc.nextInt();
		if (de >= 1 && de <= 10){
			points = points - de;
		}
		else{
			System.out.println("Please input accurate value. (1-10): ");
			de = sc.nextInt();
			points = points - de;
		}
		System.out.println("You have "+points+" left to spend");
		
		System.out.print("Intelligence (1 - 10): ");
		int in = sc.nextInt();
		if (in >= 1 && in <= 10){
			points = points - in;
		}
		else{
			System.out.println("Please input accurate value. (1-10): ");
			in = sc.nextInt();
			points = points - in;
		}
		System.out.println("You have "+points+" left to spend");

		System.out.print("Charisma (1 - 10): ");
		int ch = sc.nextInt();
		if (ch >= 0 && ch <= points){
			points = points - ch;
		}
		else{
			System.out.println("Please input accurate value: ");
			ch = sc.nextInt();
			points = points - ch;
		}
		if( points > 0){
			System.out.println("You have "+points+" to spend for next time.");
		}
		

		System.out.println("");
		System.out.println("---------------------------------------------------");
		System.out.println("You are "+name+", the "+title+" of CVHS");
		System.out.println("You are a "+role+" with the following stats!");
		System.out.println("Strength: "+st);
		System.out.println("Dexterity: "+de);
		System.out.println("Intelligence: "+in);
		System.out.println("Charisma: "+ch);

	}
}
