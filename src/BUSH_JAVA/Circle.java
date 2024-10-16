/*AIM: Write an object oriented program to make a class called as circle. It should have 
three methods namely: accept radius, calculate area and display area.
*Name:Ansari Bushra
*UIN:231P046
*Roll No:03*/

package BUSH_JAVA;

import java.util.Scanner;

public class Circle {
	private double radius;
	private double area;

	// Method to accept the radius
	public void acceptRadius() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the radius of the circle: ");
		this.radius = scanner.nextDouble();
	}

	// Method to calculate the area
	public void calculateArea() {
		this.area = Math.PI * Math.pow(this.radius, 2);
	}

	// Method to display the area
	public void displayArea() {
		System.out.println("\nThe area of the circle with radius " + this.radius + " is " + this.area);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle();
		circle.acceptRadius();
		circle.calculateArea();
		circle.displayArea();

		System.out.println("\nThank You \nName: Ansari Bushra \nUIN:231P046 \nRoll no:03 \n ");
	}

}


