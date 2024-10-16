package BUSH_JAVA;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		int n, product = 1, sum = 0, lastdigit;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check:");
		n = sc.nextInt();
		int m = n;

		while (n > 0) {
			lastdigit = n % 10;
			sum = sum + lastdigit;
			product = product * lastdigit;
			n = n / 10;
		}
		if (sum == product) {
			System.out.println("Entered number " + m + " is a Spy Number");
		} else {
			System.out.println("Enterd number " + m + " is not a Spy Number");
		}
		System.out.println("\nThank You \nName: Ansari Bushra \nUIN:231P046 \nRoll no:03 \n ");

	}

}

