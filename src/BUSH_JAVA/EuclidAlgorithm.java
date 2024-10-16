/*AIM: Write an object oriented program in java that uses Euclid’s algorithm to display Greatest
common divisor of two integer.
calculate() method to calculate the GCD and display() method to display the same.
*Name:Ansari Bushra
*UIN:231P046
*Roll No:03*/

package BUSH_JAVA;

class GCDOne {
	int number1;
	int number2;
	int gcd;
	{

		this.number1 = 50;
		this.number2 = 20;

	}

	void GCDmethod() {
		int a = number1;
		int b = number2;

		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}

		gcd = a;
	}

	public void display() {
		System.out.println("The GCD of " + number1 + " and " + number2 + " is: " + gcd);
	}
}

public class EuclidAlgorithm {

	public static void main(String[] args) {

		GCDOne obj = new GCDOne();

		obj.GCDmethod();
		obj.display();

		System.out.println("\nThank You \nName: Ansari Bushra \nUIN:231P046 \nRoll no:03 \n ");
	}

}


