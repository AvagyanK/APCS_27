/*
 *	Author: Karen Avagyan
 *  Date: 11/1
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Dog name?");
		String dogName = sc.nextLine();
		Dog dog = new Dog(dogName);

		System.out.println("What age should " + dogName + " be?");
		int dogAge = sc.nextInt();
		dog.setAge(dogAge);

		Dog dog2 = new Dog("Rex", "German Shepherd");

		dog.printDetails();
		dog2.printDetails();

		boolean s = dog.isSleeping();
		boolean s2 = dog2.isSleeping();

		if(s){
			System.out.println(dog.getName() + " is sleeping!");
		}
		else{
			System.out.println(dog.getName() + " is awake!");
			dog.bark();
		}

		if(s2 && !s){
			System.out.println(dog2.getName() + " wakes up from hearing " + dog.getName());
			dog2.bark();
		}
		else if (!s2 && !s){
			System.out.println(dog2.getName() + " hears " + dog.getName());
			dog2.bark();
		}
		else if (s2 && s){
			System.out.println(dog2.getName() + " is sleeping too!");
		}
		else{
			System.out.println(dog2.getName() + " isn't sleeping!");
		}

	}
}
