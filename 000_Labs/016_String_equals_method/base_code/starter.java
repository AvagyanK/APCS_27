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
	}
}
