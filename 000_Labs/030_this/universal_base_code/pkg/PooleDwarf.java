/*
 *	Author:  Karen Avagyan
 *  Date: 10/29
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class PooleDwarf {
	public String name;
	private int age;

	public PooleDwarf() {		// Default Constructor
		name = new String("");
		age = 0;
	}

	public PooleDwarf(String name, int age){
		this.name = name;
		this.age = age;
	}

	/*	Accessor Methods */
	public String getName(){
		return name;
	}

	public int getAge(){
		return age;
	}

	/*	Mutator Methods	*/
	public void setName(String name){
		this.name = name;
		return;
	}
	
	public void setAge(int age){
		this.age = age;
	}

	public void isSameName(String name){
		if(this.name == name){
			System.out.println(true);
			return;
			
		}
		else{
			System.out.println(false);
			return;
		}
	}
}

