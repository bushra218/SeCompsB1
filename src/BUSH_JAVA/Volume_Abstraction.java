/*AIM:Write a program to display volume of sphere and Hemisphere. Make use of abstract class.
 *NAME:Ansari Bushra
 *UIN:231P046
 *ROLL NO:03
 *Div:A*/
package BUSH_JAVA;

import java.util.Scanner;

abstract class Shapeo2 {
	abstract void draw();
}

class Sphere extends Shapeo2 {
	int r;

	Sphere() {
		Scanner sc = new Scanner(System.in);
		System.out.println("******Sphere******");
		System.out.println("Enter radius of sphere:");
		r = sc.nextInt();

	}

	void draw() {
		System.out.println("Volume of sphere = " + (1.33 * 3.142 * r * r * r));
	}
}

class Hemisphere extends Shapeo2 {
	double r;

	Hemisphere() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n");
		System.out.println("******Hemisphere******");
		System.out.println("Enter Radius of a Hemisphere:");
		r = sc.nextDouble();
	}

	void draw() {
		System.out.println("Volume of Hemisphere = " + (0.66 * 3.142 * r * r * r));
	}
}

public class Volume_Abstraction {

	public static void main(String[] args) {
		Sphere s = new Sphere();
		s.draw();
		Hemisphere h = new Hemisphere();
		h.draw();
		System.out.println("\nThank You \nName: Ansari Bushra \nUIN:231P046 \nRoll no:03 \n ");

	}

}



