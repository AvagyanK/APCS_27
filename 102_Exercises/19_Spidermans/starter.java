/*
	Author: Karen Avagyan
	Date: 10/26
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Spiderman a = new Spiderman();
		System.out.println(a.getActor());
		System.out.println(a.getAge());
		System.out.println(a.getVillain());

		System.out.println("-------------------------");
		Spiderman b = new Spiderman("Tobey Maguire", 48, "Green Goblin");
		System.out.println(b.getActor());
		System.out.println(b.getAge());
		System.out.println(b.getVillain());

		System.out.println("-------------------------");
		Spiderman c = new Spiderman("Andrew Garfield", 40, "Electro");
		System.out.println(c.getActor());
		System.out.println(c.getAge());
		System.out.println(c.getVillain());

		System.out.println("-------------------------");
		Spiderman d = new Spiderman("Tom Holland", 27, "The Vulture");
		System.out.println(d.getActor());
		System.out.println(d.getAge());
		System.out.println(d.getVillain());

	}
}
