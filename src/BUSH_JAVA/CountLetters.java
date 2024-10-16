/*Aim : Write a program in java to count frequency of a given letter in a String.
 *NAME:Ansari Bushra
 *UIN:231P046
 *ROLL NO:03
 *DIV:A*/

package BUSH_JAVA;

import java.util.Scanner;

public class CountLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='a';
		int len, count=0;
		
		String str = new String();
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a String :");
		str = sc.nextLine();
		
		System.out.println("String is : "+str);
		
		System.out.println("Enter a character to search to compare :");
		ch = sc.next().charAt(0);
		
		len = str.length();
		
		for(int i = 0; i<=len-1; i++)
			
		if(ch==str.charAt(i))
		{
			count++;
		}
		System.out.println("Frequency of character"+ch+"in string is "+count);
		
		System.out.println("\nThank You \nName: Ansari Bushra \nUIN:231P046 \nRoll no:03 \n ");
	}

}

