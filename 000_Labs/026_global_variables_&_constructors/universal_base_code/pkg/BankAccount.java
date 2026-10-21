/*
 *	Author:  
 *  Date: 
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
		accnumber = 0;
		balance = 0.0;
		isActive = true;
		nextAccountNumber ++;
	} 

	public  BankAccount(String name)

	// -------METHODS-------

}