/*Aim:Program to implement user defined exception in java
 *NAME:Ansari Bushra
 *UIN:231P046
 *ROLL NO:03
 *DIV:A*/

package BUSH_JAVA;

import java.util.Scanner;

public class Month {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the month number:");
		n=sc.nextInt();
		try
		{
		if(n>12||n<1)
		throw new ArithmeticException();
		System.out.println("Month number entered is="+n);

		}
		catch(ArithmeticException ae)
		{
		System.out.println("Invalid Number!");
		}
		System.out.println("\nThank You \nName: Ansari Bushra \nUIN:231P046 \nRoll no:03 \n ");

	}

}
