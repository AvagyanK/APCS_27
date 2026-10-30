/*
 *	Author:  Karen Avagyan
 *  Date: 10/29
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		// Your code goes below here
		PooleDwarf test = new PooleDwarf(randName(), (int)(Math.random() * 70) + 10);
		PooleDwarf test2 = new PooleDwarf(randName(), (int) (Math.random() * 70) + 10);
		PooleDwarf test3 = new PooleDwarf(randName(), (int) (Math.random() * 70) + 10);
		PooleDwarf test4 = new PooleDwarf(randName(), (int) (Math.random() * 70) + 10);
		PooleDwarf test5 = new PooleDwarf(randName(), (int) (Math.random() * 70) + 10);
		PooleDwarf test6 = new PooleDwarf(randName(), (int) (Math.random() * 70) + 10);
		PooleDwarf test7 = new PooleDwarf(randName(), (int) (Math.random() * 70) + 10);

		test.isSameName(test2.name);
		test.isSameName(test3.name);
		test.isSameName(test4.name);
		test.isSameName(test5.name);
		test.isSameName(test6.name);
		test.isSameName(test7.name);
	
	}
}
