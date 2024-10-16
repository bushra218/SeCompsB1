/*AIM:Write a program to print following pattern using Forloop
 *Name:Ansari Bushra
 *UIN:231P046
 *Roll No:03  */

package BUSH_JAVA;

import java.util.Scanner;

public class Pattern_Forloop {

	public static void main(String[] args) {
		{
			int i, j, n;
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter number of Rows or Column: ");
			n = sc.nextInt();
			for (i = 0; i < n; i++) // outer loop for number of rows(n)
			{
				for (j = 0; j <= i; j++) // inner loop for columns
				{
					System.out.print("* "); // print star
				}
				System.out.println(); // ending line after each row
			}

		}

		System.out.println("\nThank You \nName: Ansari Bushra \nUIN:231P046 \nRoll no:03 \n ");

	}
}

