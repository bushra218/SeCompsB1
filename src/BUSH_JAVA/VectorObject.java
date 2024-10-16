/*Aim:Write a program to create vector objects with student name. Program should perform 
  following operations based on choice:
  (i) Add student name
  (ii) Remove student name
  Display—display content of Vector using enumeration interface.
 * Name: Ansari Bushra 
 * Uin:231P046
 * Roll no:03
 * Div:A
 * */

package BUSH_JAVA;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class VectorObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input;
		Vector<String> v = new Vector<>();
		do {
			System.out.println("menu \n1.Add a name \n2.Remove a name \n3.Exit");
			Scanner sc = new Scanner(System.in);
			input = sc.nextInt();

			
			if (input == 1) {
				System.out.println("Enter your name");
				String name = sc.next();
				v.add(name);
				System.out.println("The Vector elements are: ");
				Enumeration e = v.elements();
				while (e.hasMoreElements()) {
					System.out.println(e.nextElement());
				}System.out.println(" ");
			} else if (input == 2) {
				
				System.out.println("Enter name to be removed");
				String name = sc.next();
				int index = v.indexOf(name);
				v.remove(index);
				System.out.println("The Vector elements are: ");
				Enumeration e = v.elements();
				while (e.hasMoreElements()) {
					System.out.println(e.nextElement());
				}System.out.println(" ");

			} 

		} while (input != 3);
		
		 System.out.println("\nThank You \nName: Ansari Bushra \nUIN:231P046 \nRoll no:03 \n ");


	}
}


