/*AIM:write a program in java to check string is palindrome or not using string buffer object.
 *NAME:Ansari Bushra
 *UIN:231P046
 *ROLL NO:03
 *DIV:A*/

package BUSH_JAVA;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		String str, rev;
		// StringBuffer object
		StringBuffer str1 = new StringBuffer();
		// Scanner object
		Scanner sc= new Scanner(System.in);
		System.out.print ("Enter a String:");
		str=sc.nextLine(); // read String
		str1.append(str); // StringBuffer class method
		str1.reverse(); // StringBuffer class method
		rev=str1.toString(); // StringBuffer class method
		if(str.equalsIgnoreCase(rev)) // String class method
		System.out.println ("\nPalindrome");
		else
		System.out.println (" \nNot a Palindrome");
		
		System.out.println("\nThank You \nName: Ansari Bushra \nUIN:231P046 \nRoll no:03 \n ");


	}

}
