/*
 *	Author: Karen Avagyan
 *  Date: 10/11
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Each player starts with $100.");
		System.out.println("2. Input a wager less than your total amount of money.");
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
		System.out.println("   a. If two numbers match, you double your money.");
		System.out.println("   b. If three numbers match, you triple your money.");
		System.out.println("   c. If none match, you lose your money.");

		int money = 100;
		int wager = 0;

			while(money > 0){
			System.out.println("---------------------------------------------------------");
			System.out.println("");
			System.out.print("Would you like to play slots (Yes/yes/Y/y): ");
			String a = sc.nextLine();

			if(a.equalsIgnoreCase("yes") || a.equalsIgnoreCase("y")){
			
				System.out.print("You have $"+money+". How much would you like to wager: ");
				wager = sc.nextInt();
				sc.nextLine();

				while(true){
					if (wager <= money && wager > 0){
						money = money - wager;
						int num1 = (int)(Math.random() * 10) + 1;
						int num2 = (int)(Math.random() * 10) + 1;
						int num3 = (int)(Math.random() * 10) + 1;
						System.out.println("");
						System.out.println("Let's play!!!");
						System.out.println("Your rolls are:");
						System.out.println("------------------");
						System.out.print(" | ");
						System.out.print(num1);
						System.out.print(" | ");
						System.out.print(num2);
						System.out.print(" | ");
						System.out.print(num3);
						System.out.println(" | ");
						System.out.println("------------------");

						if(num1 == num2 && num1 == num3){
							System.out.println("It's a jackpot!!! Your wager has ben tripled.");
							money = money + wager*3;
							System.out.println("Now you have $"+money);
						}
						else if(num1 == num2 || num1 == num3 || num2 == num3){
							money = money + wager*2;
							System.out.println("You won! Your wager has been doubled.");
							System.out.println("Now you have $"+money);
						}
						else{
							System.out.println("Didn't win this time, better luck next time!");
							System.out.println("Now you have $"+money);
						}
						break;
					}
					else if (wager > money){
						System.out.print("You only have $"+money+". Try again: ");
						wager = sc.nextInt();
						sc.nextLine();
					}
					else{
						System.out.print("No negatives or 0: ");
						wager = sc.nextInt();
						sc.nextLine();
					}

				}
					
			}	
			else if(a.equalsIgnoreCase("no") || a.equalsIgnoreCase("n")){
				System.out.print("You still have $"+money+" left.");
				System.out.println(" Come again soon!");
				break;
			}
			else{
				System.out.println("This wasn't the correct answer. Try again.");
			}

		}
		if(money == 0){
			System.out.println("");
			System.out.println("You've run out of money! Thanks for coming! Come back soon!");
			
		}
		}
		
	}

