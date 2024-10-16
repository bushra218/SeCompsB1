/*Aim:Write a program to create a class Account to perform the operation of insert, deposit and
withdrawal of single employee and make use of object.
*Name:Ansari Bushra
*UIN:231P046
*Roll No:03*/

package BUSH_JAVA;

import java.util.Scanner;

class Accounto1 {
	int acc_no;
	String name;
	float amount;

	void insert(int a, String n, float amt) {
		acc_no = a;
		name = n;
		amount = amt;
	}

	void deposit(float amt) {
		amount = amount + amt;
		System.out.println(amt + " deposited");
	}

	void withdraw(float amt) {
		if (amount < amt) {
			System.out.println("Insufficient Balance");
		} else {
			amount = amount - amt;
			System.out.println(amt + " withdrawn");
		}
	}

	void checkBalance() {
		System.out.println("Balance is: " + amount);
	}

	void display() {
		System.out.println("Account Number : " + acc_no);
		System.out.println("Customer Name : " + name);
		System.out.println("Customer Amount: " + amount);
	}
}

public class TestAccount {

	public static void main(String[] args) {

		int acc_no;
		String name;
		float amount;
		Scanner sc = new Scanner(System.in);
		Accounto1 a1 = new Accounto1();
		System.out.print("Enter account number: ");
		acc_no = sc.nextInt();
		System.out.print("Enter Customer Name: ");
		name = sc.next();
		System.out.print("Enter Customer Amount: ");
		amount = sc.nextFloat();
		a1.insert(acc_no, name, amount);
		a1.display();
		a1.checkBalance();
		System.out.print("\nEnter Amount to be deposited: ");
		float dep_amount = sc.nextFloat();
		a1.deposit(dep_amount);
		a1.checkBalance();
		System.out.print("\nEnter Amount to be withdrawn: ");
		float wit_amount = sc.nextFloat();
		a1.withdraw(wit_amount);
		a1.checkBalance();
		System.out.println("\nThank You \nName: Ansari Bushra \nUIN:231P046 \nRoll no:03 \n ");

	}

}


