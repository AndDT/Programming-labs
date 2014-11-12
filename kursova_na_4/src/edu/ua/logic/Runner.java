package edu.ua.logic;

import java.util.Arrays;

import edu.ua.myclass.Employee;
import edu.ua.myclass.Man;

public class Runner{

	public static void main(String[] args) {
		Man[] myarray = new Man[4];
		myarray[0] = new Employee("Mykola", "Myronov");
		myarray[1] = new Employee("Evgen", "Mazek");
		myarray[2] = new Employee("Олег", "Спека");
		myarray[3] = new Employee("Олег", "Спека");
		
		for (Man variant : myarray){
			System.out.println(variant.getName()+" "+variant.getSurname());
		}
		System.out.println(Arrays.toString(myarray));
		System.out.println(myarray[2]==myarray[3]);
		System.out.println(myarray[2].equals(myarray[3]));
		System.out.println(myarray[2].hashcode());
	}

}
