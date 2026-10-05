/*
 *	Author: Karen Avagyan
 *  Date: 10/4
 * 	Collaborator:
 */

import java.util.*;

public class starter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		String  bm = "BMW";
		String mb = "Mercedes-Benz";
		String p = "Porsche";

        int points = 60;

        String chip;
        String wheels;
        String sd;

		System.out.print("Would you like to tun a BMW, Porsche, or Mercedes? ");
		String car = sc.nextLine();

		if(car.toLowerCase().equals(bm.toLowerCase())){
			System.out.println("You have chosen the "+ bm);
		}
		else if(car.toLowerCase().equals(mb.toLowerCase())){
			System.out.println("You have chosen the "+ mb);
		}
		else if(car.toLowerCase().equals(p.toLowerCase())){
			System.out.println("You have chosen the "+ p);
		}
		else{
			System.out.println("You have not chose a car. Rerun program");
            car = "unknown";
		}

		System.out.println("You have 60 points to tune the car.");

		System.out.print("Chip tuning: Stage1 - 10pts, Stage2 - 20pts: ");
		int st = sc.nextInt();
		if (st == 10 || st == 20){
			points = points - st;
		}
		else{
			System.out.println("Please input accurate value. (10 or 20): ");
			st = sc.nextInt();
		}

        if( st == 10){
            chip = "Stage 1";
            points = points - st;
        }
        else if(st == 20){
            chip = "Stage 2";
            points = points - st;
        }
        else{
            chip = "unknoown";
        }
		System.out.println("You have "+points+" left to spend");
		

		System.out.print("Exhaust:How loud it is (1-5): ");
		int de = sc.nextInt();
		if (de >= 1 && de <= 5){
			points = points - de;
		}
		else{
			System.out.println("Please input accurate value. (1-5): ");
			de = sc.nextInt();
		}
        if( de <= 1 || de >= 5) {
            de = 0;
        }
        else{
            points = points - de;
        }

		System.out.println("You have "+points+" left to spend");
		
		System.out.print("Rims: Forged wheels - 15 pts, Paint the originals - 5pts: ");
		int in = sc.nextInt();
		if (in == 5 || in == 15){
			points = points - in;
		}
		else{
			System.out.println("Please input accurate value. (5 or 15): ");
			in = sc.nextInt();
		}

        if( in == 5){
            wheels = "painted";
            points = points - in;
        }
        else if(in == 15){
            wheels = "forged";
            points = points - in;
        }
        else{
            wheels = "unkown";
        }
		System.out.println("You have "+points+" left to spend");

		System.out.print("Sound System: HK - 10 pts, BW - 20 pts: ");
		int ch = sc.nextInt();
		if (ch == 10 && ch == 20){
			points = points - ch;
		}
		else{
			System.out.println("Please input accurate value: ");
			ch = sc.nextInt();
			
		}
         if( in == 10){
            sd = "Harman Kardon";
            points = points - ch;
        }
        else if(in == 20){
            sd = "Bowers and Wilkins";
            points = points - ch;
        }
        else{
            sd = "unknown";
        }

		if( points > 0){
			System.out.println("You have "+points+" to spend for next time.");
		}
		

		System.out.println("");
		System.out.println("---------------------------------------------------");
		System.out.println("Your car is "+car);
		System.out.println("Your car has following mods:");
		System.out.println("Chip tuning: "+chip);
        System.out.println("Loudness of Exhaust: "+de);
		System.out.println("Wheels: "+ wheels);
		System.out.println("Sound System: "+sd);

        
    }
}
