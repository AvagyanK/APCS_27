/*
 *	Author:  Karen Avagyan
 *  Date: 10/27
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

	public void checkBalance(){
		System.out.print("Current balance is: $");
		System.out.println(balance);
		return;
	}

	public void displayAccountInfo(){
		System.out.println("");
		System.out.println("---------------------------------");
		System.out.println("Owner:" + owner);
		System.out.println("Account number:" + accnumber);
		System.out.println("Balance:" + balance);
		if(isActive){
			System.out.println("The account is active");
		}
		else{
			System.out.println("The account is not active");
		}
		return;
	}


	public String getOwner(){
		return owner;
	}
	public void setOwner(String n){
		owner = n;
		return;
	}

	public double getBalance(){
		return balance;
	}

	public void closeAccount(){
		isActive = false;
		return;
	}

	public void deposit(double d){
		if(isActive){
			balance = d;
		}
		else{
			System.out.println(owner + "'s account is not active");
		}
		return;
	}

	public void withdraw(double w){
		if(isActive && w <= balance){
			balance = balance - w;
		}
		else{
			System.out.println("The balance is not enough or the account is not active!!!");
		}
	}
}