/*Assignment01-Q1 
 *AIM:Write a Java program and compute the sum of an integer's digits.
 *NAME:Ansari Bushra
 *UIN:231P046
 *ROLL NO:03
 *Div:A*/

package BUSH_JAVA;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		int n, digit, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		n = sc.nextInt();
		while (n > 0) {
			digit = n % 10;
			sum = sum + digit;
			n = n / 10;
		}
		System.out.println("Sum of the Digits:" + sum);

		System.out.println("\nThank You \nName: Ansari Bushra \nUIN:231P046 \nRoll no:03 \n ");

	}

}

