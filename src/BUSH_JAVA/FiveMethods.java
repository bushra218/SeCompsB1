/*Aim : Write a program in java to implement at least 5 methods of a string.
 *NAME:Ansari Bushra
 *UIN:231P046
 *ROLL NO:03
 *DIV:A*/

package BUSH_JAVA;

import java.util.Scanner;

public class FiveMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
		
		int ch;
		
		String str = new String();
		
		String str1 = "JAVA PROGRAMMING";
		String str2 = " Is Fun";
		do {
		System.out.println("---MENU--- :");
		System.out.println("\n1.Lower case\n 2.Upper case\n 3.Length\n 4.Concate\n 5.Equals\n");
		System.out.println("Enter a Choice :");
		ch = sc.nextInt();

		switch(ch)
		{
		case 1 : System.out.println("string in lowercase is  :");
		         System.out.println(str1.toLowerCase());
			     break;
		case 2 : System.out.println("string in uppercase  is  :");
				 System.out.println(str1.toUpperCase());
				 break;
		case 3 : System.out.println("string length is  :"); 
		         System.out.println(str1.length());
				 break;
		case 4 : System.out.println("the concanated string is  :"); 
				 System.out.println(str1.concat(str2));
				 break;
		case 5 : System.out.println("string1 is equal to string2 :");
				 System.out.println(str1.equals(str2));
				 break;
	  default  : System.out.println("Wrong Choice!!!!:");

		}
	
		
		System.out.println("\nThank You \nName: Ansari Bushra \nUIN:231P046 \nRoll no:03 \n ");
	}while(ch!=0);


	}

}



