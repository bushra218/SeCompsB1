/* Aim: WAP for displaying personalized greeting for user
 * Name:Ansari Bushra
 * UIN:231P046
 * DIV:A
 */




package BUSH_JAVA;

import java.util.*;

public class Year_of_Birth {

	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  int year;
	  System.out.println("Enter your first name:");
	  String name=sc.nextLine();
	  System.out.println("Enter your last name:");
	  String last_name=sc.nextLine();
	  System.out.println("Enter your year of birth:");
	  year=sc.nextInt();
	  System.out.println("Hello,"+(name)+(last_name));
	  System.out.println("you are "+(2024-year)+" years old"); 
	  
	  
	  

	}

}
