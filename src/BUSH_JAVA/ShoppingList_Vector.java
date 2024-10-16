/* Aim:Write a program that accepts a shopping list of items and perform the following operations: Add
an item at specified location, delete an item in the list, and print the content of vector.
 * Name: Ansari Bushra 
 * Uin:231P046
 * Roll no:03
 * Div:A*/

package BUSH_JAVA;

import java.util.Scanner;
import java.util.Vector;

public class ShoppingList_Vector {

	public static void main(String[] args) {
		int input;
		Vector<String> v = new Vector<>();
		do {
			System.out.println("Enter your Choice");
			System.out.println("menu: \n1.Add an item \n2.Remove an item \n3.Print an item \n4:Exit");
			Scanner sc = new Scanner(System.in);
			input = sc.nextInt();

			switch (input) {

			case 1:
				System.out.println("Enter item name:");
				String name = sc.next();
				System.out.println("Enter Location:");
				int location = sc.nextInt();

				v.add(location, name);
				break;
			case 2:
				System.out.println("Enter an item to be removed:");
				String name1 = sc.next();
				int index = v.indexOf(name1);
				v.remove(index);
				System.out.println("Successfully Removed");
				break;
			case 3:
				System.out.println("Vector Elements are:" + v.toString());
				break;
			case 4:
				System.out.println("Program Ended!!");
				break;

			default:
				System.out.println("Wrong Choice!!");
				break;

			}
		} while (input != 4);
		System.out.println("\n Thank You \n Name: Ansari Bushra \n UIN:231P046 \n Roll no:03 \n ");

	}

}


