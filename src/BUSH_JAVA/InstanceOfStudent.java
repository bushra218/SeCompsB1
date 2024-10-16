/*Assignment01-Q2
 *Aim:Create a class Student with private attributes for name and age.
  Use a constructor to initialize these attributes and provide public getter
  methods to access them.
  In the main method, an instance of Student is created, and the student's
  details are printed.
 *NAME:Ansari Bushra
 *UIN:231P046
 *ROLL NO:03
 *Div:A*/


package BUSH_JAVA;

import java.util.Scanner;

class Studento2 {
	private String name;
	private int age;

	public Studento2(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

}

public class InstanceOfStudent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = sc.next();
		System.out.println("Enter your age:");
		int age = sc.nextInt();

		Studento2 b = new Studento2(name, age);
		System.out.println("Student Name:" + b.getName());
		System.out.println("Student Age:" + b.getAge());
		
		System.out.println("\nThank You \nName:Ansari Bushra \nUIN:231P046 \nRoll no:03 \n ");


	}

}



