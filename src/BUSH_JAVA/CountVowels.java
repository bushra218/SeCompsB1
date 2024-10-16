/*Aim : Write a program in java to count frequency of vowels in a String.
 *NAME:Ansari Bushra
 *UIN:231P046
 *ROLL NO:03
 *DIV:A*/

package BUSH_JAVA;

import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int len, count=0;
		
		String str = new String();
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a String :");
		str = sc.nextLine();
		
		System.out.println("String is : "+str);
		
		len = str.length();
		
		for(int i = 0; i<=len-1; i++)
		
		
		
		if(str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o'|| str.charAt(i)=='u')
		{
			count=count+1;
		}
		
		System.out.println("Frequency of vowel is :"+count);
		
		System.out.println("\nThank You \nName: Ansari Bushra \nUIN:231P046 \nRoll no:03 \n ");
	}

}



