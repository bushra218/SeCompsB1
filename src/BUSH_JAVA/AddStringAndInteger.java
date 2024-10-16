/*AIM: Write a program to add integer number and string using method overloading.
 *Name:Ansari Bushra
 *UIN:231P046
 *Roll No:03*/

package BUSH_JAVA;

class StrInt {

	public int add(int a, int b) {
		return a + b;
	}

	public String add(String a, String b) {
		return a + b;
	}

}

public class AddStringAndInteger {

	public static void main(String[] args) {
		
		StrInt obj = new StrInt();

		int sum = obj.add(14, 20);
		System.out.println("Sum of integers: " + sum);

		String concatenatedString = obj.add("Hello, ", "World!");
		System.out.println("Concatenated String: " + concatenatedString);

		System.out.println("\nThank You \nName: Ansari Bushra \nUIN:231P046 \nRoll no:03 \n ");
	}

}


