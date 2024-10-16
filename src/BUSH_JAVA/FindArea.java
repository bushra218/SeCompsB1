/*AIM:  Write a program to find Area of Circle using constructor overloading.
 *Name:Ansari Bushra
 *UIN:231P046
 *Roll No:03*/

package BUSH_JAVA;

import java.util.Scanner;

class AreaOf {
	double r;

	AreaOf() {
		r = 0;
	}

	AreaOf(double radious) {
		r = radious;
	}

	AreaOf(int radious) {
		r = radious;
	}

	void display() {
		System.out.println(" Area of Circle : " + (3.14 * r * r));
	}
}

public class FindArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r1;
		int r2;

		Scanner sc = new Scanner(System.in);
		AreaOf a1 = new AreaOf();
		System.out.print("Enter Radius 01:");
		r1 = sc.nextDouble();
		AreaOf b1 = new AreaOf(r1);
		System.out.print("Enter Radius 02:");
		r2 = sc.nextInt();
		AreaOf c1 = new AreaOf(r2);
		System.out.print("Area of Circle ----- Radius=0 :");

		a1.display();

		System.out.print("Area of Circle ----- Radius= :" + r1);
		b1.display();
		System.out.print("Area of Circle ----- Radius= :" + r2);
		c1.display();

		System.out.println("\nThank You \nName: Ansari Bushra \nUIN:231P046 \nRoll no:03 \n ");
	}

}

