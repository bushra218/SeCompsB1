package BUSH_JAVA;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, sum = 0, lastdigit;
		System.out.println("Enter a number to be checked:");
		n = sc.nextInt();
		int Square = n * n;
		while (Square != 0) {
			lastdigit = Square % 10;
			sum = sum + lastdigit;
			Square = Square / 10;

		}
		if (n == sum) {
			System.out.println("Entered number " + n + " is a Neon Number");

		} else {
			System.out.println("Entered number " + n + " is not a Neon Number");
		}

		System.out.println("\nThank You \nName: Ansari Bushra \nUIN:231P046 \nRoll no:03 \n ");

	}

}

