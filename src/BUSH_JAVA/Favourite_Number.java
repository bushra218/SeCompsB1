/* Aim: WAP for displaying personalized greeting for user
 * Name:Ansari Bushra
 * UIN:231P046
 * DIV:A
 */




package BUSH_JAVA;
import java.util.*;
public class Favourite_Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	   int Age,Favourite_number;
	   String name=sc.nextLine();
	   System.out.println("Enter your Age:");
	   Age=sc.nextInt();
	   System.out.println("Enter your Favourite number:");
	   Favourite_number=sc.nextInt();
	   System.out.println("Hello,"+(name));
	   System.out.println("You are "+(Age)+" years old");
	   System.out.println("Your Favoutite number is "+(Favourite_number));
	   System.out.println("By the way, your favourite number doubled is "+(Favourite_number*2));
	   
	   

	}

}
