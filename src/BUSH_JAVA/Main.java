/*AIM:Write a program to override area () method of Shape class into its subclasses Rectangle and
  Square. Shape is an abstract class.
 *NAME:Ansari Bushra
 *UIN:231P046
 *ROLL NO:03
 *Div:A */

package BUSH_JAVA;

import java.util.Scanner;

abstract class Shape {

	abstract double area();
}

class Rectangle extends Shape {
	private double width;
	private double height;

	Rectangle() {
		Scanner sc=new Scanner(System.in);
		System.out.println("***Rectangle***");
		System.out.println("Enter widht and height of Rectangle:");
		width=sc.nextDouble();
		height=sc.nextDouble();
	}

	@Override
	double area() {
		System.out.println("Area of rectngle:"+width * height);
		return width * height;
	}
}

class Square extends Shape {
	private double sideLength;

	 Square() {
			Scanner sc=new Scanner(System.in);
			System.out.println("\n");
			System.out.println("***Square***");
			System.out.println("Enter sideLength of square:");
			sideLength=sc.nextDouble();		
	}

	@Override
	double area() {
		System.out.println("Area of square:"+sideLength * sideLength);
		return sideLength * sideLength;
	}
}

public class Main {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.area();
		Square s = new Square();
		s.area();

		System.out.println("\nThank You \nName: Ansari Bushra \nUIN:231P046 \nRoll no:03 \n ");

	}

}


