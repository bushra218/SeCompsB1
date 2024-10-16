/*AIM:Write a program to calculate area of Circle and Rectangle using abstract class.
 *NAME:Ansari Bushra
 *UIN:231P046
 *ROLL NO:03
 *Div:A */

package BUSH_JAVA;

import java.util.Scanner;

abstract class Shapeo1 {
	abstract void draw();
}

class Rectangleo3 extends Shapeo1 {
	int l, w;

	Rectangleo3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n");
		System.out.println("******Rectangle******");
		System.out.println("Enter Length and width of Rectangle:");
		l = sc.nextInt();
		w = sc.nextInt();
	}

	void draw() {
		System.out.println("Area of Rectangle = " + (l * w));
	}
}

class Circleo2 extends Shapeo1 {
	double r;

	Circleo2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("******Circle******");
		System.out.println("Enter Radius of a Circle:");
		r = sc.nextDouble();
	}

	void draw() {
		System.out.println("Area of Circle = " + (0.5 * r * r));
	}
}

public class Area_Abstraction {

	public static void main(String[] args) {
		Circleo2 c = new Circleo2();
		c.draw();
		Rectangleo3 d = new Rectangleo3();
		d.draw();
		System.out.println("\nThank You \nName: Ansari Bushra \nUIN:231P046 \nRoll no:03 \n ");

	}

}


