/*Aim: Write an object oriented program in java that uses Euclid's algorithm to display
  Greatest common divisor of two integer.
 *Name:Ansari Bushra
 *UIN:231P046
 *Roll No:03*/

package BUSH_JAVA;

public class GCD {
	public int calculateGCD(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

	public static void main(String[] args) {

		GCD gcdCalculator = new GCD();

		// Example usage
		int num1 = 30;
		int num2 = 40;
		int result = gcdCalculator.calculateGCD(num1, num2);

		System.out.println("The GCD of " + num1 + " and " + num2 + " is " + result);

		System.out.println("\nThank You \nName: Ansari Bushra \nUIN:231P046 \nRoll no:03 \n ");
	}

}

