/*
 *	Author: Karen Avagyan
 *  Date: 10/21
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {

		Employee dwight = new Employee(1987,"Dwight", "Schrutte",4416.66 );
		dwight.raiseSalary(5);
		dwight.employeeToString();
		System.out.println("Annual salary: "+dwight.getAnnualSalary());

		Employee jim = new Employee(2474,"Jim", "Halpert",4416.66 );
		jim.raiseSalary(7);
		jim.employeeToString();
		System.out.println("Annual salary: "+jim.getAnnualSalary());

		Employee pam = new Employee(2011,"Pam", "Beesly",2250 );
		pam.raiseSalary(5);
		pam.employeeToString();
		System.out.println("Annual salary: "+pam.getAnnualSalary());

		Employee john = new Employee(1987,"John", "Smith",6650 );
		john.raiseSalary(10);
		john.employeeToString();
		System.out.println("Annual salary: "+john.getAnnualSalary());
		
	}
}
