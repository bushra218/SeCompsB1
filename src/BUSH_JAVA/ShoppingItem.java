/*Aim:Write a program to implement a Vector that accepts five items from the command line
  and store them in a Vector and display the objects stored in a Vector.
 *NAME:Ansari Bushra
 *UIN:231P046
 *ROLL NO:03
 *DIV:A*/

package BUSH_JAVA;

import java.util.Vector;

public class ShoppingItem {

	public static void main(String[] args) {
		Vector list = new Vector();
		int len = args.length;
		System.out.println();
		for (int i = 0; i < len; i++) {
			list.addElement(args[i]);
		}
		int size = list.size();
		String str[] = new String[size];
		list.copyInto(str);
		for (int i = 0; i < size; i++) {
			System.out.println("Element of Vector at position " + i + ":" + str[i]);
		}

		 System.out.println("\nThank You \nName: Ansari Bushra \nUIN:231P046 \nRoll no:03 \n ");

	}

}


