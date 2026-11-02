package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	String name;
	int age;
	String breed;

	public Dog() {
		name = "Clifford";
		age = 3;
		breed = "big red dog";
	}

	public Dog(String n){
		name = n;
		age = 1;
		breed = "Dog dog";
	}

	public Dog(String n, String b){
		name = n;
		age = 1;
		breed = b;
	}

	public Dog(String n, int a){
		name = n;
		age = a;
		breed = "Dog dog";
	}

	public void setName(String n){
		name = n;
		return;
	}

	public void setAge(int a){
		age = a;
		return;
	}

	public void setBreed(String b){
		breed = b;
		return;
	}

	public String getName(){
		return name;
	}

	public int getAge(){
		return age;
	}

	public String getBreed(){
		return breed;
	}

	public boolean isSleeping(){
		int sleep = (int) (Math.random() * 2) + 1;
		if( sleep == 1){
			return true;
		}
		else{
			return false;
		}
	}

	public void bark(){
		System.out.println(name + " barks!");
	}

	public void printDetails(){
		System.out.println(name + " is a " + breed + " that is " + age + " years old!");
		return;
	}

}
