/* AIM:Write a program to perform Menu Driven Arithmetic operations.
 * Name:Ansari Bushra
 * UIN:231P046
 * DIV:A
 */

package BUSH_JAVA;

import java.util.*;

public class Arithmatic_Operations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice, x, y;
		System.out.println("MENU");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Division");
		System.out.println("4.Multiplication");
		System.out.println("5.Modulus");
		System.out.println("6.Exit");
		do {
			System.out.println("Enter your choice:");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Input: Addition \n");
				System.out.println("Enter first number:");
				x = sc.nextInt();

				System.out.println("Enter second number:");
				y = sc.nextInt();

				System.out.println("Addition of " + x + " and " + y + " :" + (x + y));

				break;

			case 2:
				System.out.println("Input: Subtraction \n");
				System.out.println("Enter first number:");
				x = sc.nextInt();

				System.out.println("Enter second number:");
				y = sc.nextInt();

				System.out.println("Subtraction of " + x + " and " + y + " :" + (x - y));

				break;

			case 3:
				System.out.println("Input: Division \n");
				System.out.println("Enter first number:");
				x = sc.nextInt();

				System.out.println("Enter second number:");
				y = sc.nextInt();

				System.out.println("Division of " + x + " and " + y + " :" + (x / y));

				break;

			case 4:
				System.out.println("Input: Multiplication \n");
				System.out.println("Enter first number:");
				x = sc.nextInt();

				System.out.println("Enter second number:");
				y = sc.nextInt();

				System.out.println("Multiplication of " + x + " and " + y + " :" + (x * y));

				break;

			case 5:
				System.out.println("Input: Modulus \n");
				System.out.println("Enter first number:");
				x = sc.nextInt();

				System.out.println("Enter second number:");
				y = sc.nextInt();

				System.out.println("Modulus of " + x + " and " + y + " :" + (x % y));

				break;

			case 6:
				System.out.println("Program is Ended");
				System.out.println("\nThank You \nName: Ansari Bushra \nUIN:231P046 \nRoll no:03 \n ");

				System.exit(0);
			default:
				System.out.println("Wrong Choice!!");

			}

		} while (choice != 6);

	}

}
