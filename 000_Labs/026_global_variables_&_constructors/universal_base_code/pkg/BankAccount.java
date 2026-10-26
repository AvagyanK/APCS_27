/*
 *	Author:  Karen Avagyan
 *  Date: 10/22
*/

package pkg;
import java.util.*;

public class BankAccount {
	// -------GLOBAL VARIABLES-------
	private String owner;
	private int accnumber;
	private double balance;
	private boolean isActive;
	private static int nextAccountNumber = (int)(Math.random() * 951) + 50;

	// -------CONSTRUCTORS-------
	public BankAccount(){
		owner = "";
		accnumber = nextAccountNumber;
		balance = 0.0;
		isActive = true;
		nextAccountNumber ++;
	} 

	public  BankAccount(String name){
		owner = name;
		accnumber = nextAccountNumber;
		balance = 0.0;
		isActive = true;
		nextAccountNumber ++;
	}

	public BankAccount(String name, double deposit){
		owner = name;
		accnumber = nextAccountNumber;
		balance = deposit;
		isActive = true;
		nextAccountNumber ++;
	}

	// -------METHODS-------

}