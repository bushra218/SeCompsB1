/*Aim:Write a program to calculate volume of sphere using multilevel inheritance.
 *NAME:Ansari Bushra
 *UIN:231P046
 *ROLL NO:03
 *DIV:A*/

package BUSH_JAVA;

import java.util.Scanner;

class Radius{
	float radius;
	
	public Radius(float r) {
		radius = r; 
	}
	
	void display() {
		System.out.println(radius);
	}
	
}

class AreaOfCircle extends Radius{

	public AreaOfCircle(float r) {
		super(r);
	}	
	
	void findArea() {
		float area = (float) (3.14 * radius * radius);
		System.out.println("Area of cirlce: "+area);
	}
}

class VolumeOfSphere extends Radius{

	public VolumeOfSphere(float r) {
		super(r);
        
	}
	
	void findVolume (){
		float volume = (float) ((4 / 3) * 3.14 * (radius * radius * radius)); 
		System.out.println("volume of sphere: "+volume);
	}	
}

public class VolumOfSphereOne {

	public static void main(String[] args) {
		System.out.println("Enter radius: ");
		Scanner sc = new Scanner(System.in);
		float in = sc.nextFloat();
		VolumeOfSphere volumeOfSphere = new VolumeOfSphere(in);
		volumeOfSphere.findVolume();
		
		System.out.println("\nThank You \nName: Ansari Bushra \nUIN:231P046 \nRoll no:03 \n ");

	}
}



