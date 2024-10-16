/*AIM:Write a program to implement interface demonstrating the concept of multiple inheritance.
 *NAME:Ansari Bushra
 *UIN:231P046
 *ROLL NO:03
 *Div:A*/

package BUSH_JAVA;

class Student02 {
	int rollNumber;

	void getNumber(int n) {
		rollNumber = n;
	}

	void printNumber() {
		System.out.println("RollNo is " + rollNumber);
	}
}

class Test02 extends Student02 {
	float part1, part2;

	void getMarks(float a, float b) {
		part1 = a;
		part2 = b;
	}

	void putMarks() {
		System.out.println("Marks Part1 " + part1);
		System.out.println("Marks Part2 " + part2);
	}
}

interface Sports02 {
	float sportwt = 6.0F;

	void putwt();
}

class Results02 extends Test02 implements Sports02 {
	float total;

	public void putwt() {
		System.out.println("Sports Marks " + sportwt);
	}

	void display() {
		total = part1 + part2 + sportwt;
		System.out.println("Total marks of " + rollNumber + " is " + total);
	}
}

public class MainClass {

	public static void main(String[] args) {
		Results02 a = new Results02();
		a.getNumber(10);
		a.printNumber();
		a.getMarks(10.0F, 25.5F);
		a.putMarks();
		a.putwt();
		a.display();
		
 		 System.out.println("\nThank You \nName: Ansari Bushra \nUIN:231P046 \nRoll no:03 \n ");


	}

}
