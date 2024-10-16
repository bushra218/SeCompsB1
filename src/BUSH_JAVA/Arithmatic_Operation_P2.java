/*AIM:Write a program in java to perform Menu driven arithmetic operation 
 accepting choice as character.
 * Name:Ansari Bushra
 * UIN:231P046
 * DIV:A*/

package BUSH_JAVA;
import java.util.*;
public class Arithmatic_Operation_P2 {
	public static void main(String[] args) {
		

		
		Scanner sc= new Scanner(System.in);  
		     int x,y;
		     char choice;
		     
		    
		     System.out.println("MENU");
		     System.out.println("+");
		     System.out.println("-");
		     System.out.println("/");
		     System.out.println("*");
		     System.out.println("%");
		     System.out.println("&");
		   do {  
			   System.out.println("Enter your choice:");  
			   choice= sc.next().charAt(0);
		 switch(choice)
		      {
		 case '+':System.out.println("Input: Addition \n");
			    System.out.println("Enter first number:");
		        x= sc.nextInt();
		        
		        System.out.println("Enter second number:");
		        y= sc.nextInt();
		        
		        System.out.println("Addition of "+x+" and "+y+" :" +(x+y));
		        
		        break;
		        
		 case '-':System.out.println("Input: Subtraction \n");
			    System.out.println("Enter first number:");
		        x= sc.nextInt();
		 
		        System.out.println("Enter second number:");
		        y= sc.nextInt();
		 
		        System.out.println("Subtraction of "+x+" and "+y+" :" +(x-y));
		 
		        break;
		         
		 case '/':System.out.println("Input: Division \n");
			    System.out.println("Enter first number:");
		        x= sc.nextInt();
		 
		        System.out.println("Enter second number:");
		        y= sc.nextInt();
		 
		        System.out.println("Division of "+x+" and "+y+" :" +(x/y));
		 
		        break;
		        
		 case '*':System.out.println("Input: Multiplication \n");
			    System.out.println("Enter first number:");
		        x= sc.nextInt();
		 
		        System.out.println("Enter second number:");
		        y= sc.nextInt();
		 
		        System.out.println("Multiplication of "+x+" and "+y+" :" +(x*y));
		 
		        break;
		        
		 case '%':System.out.println("Input: Modulus \n");
			    System.out.println("Enter first number:");
		        x= sc.nextInt();
		 
		        System.out.println("Enter second number:");
		        y= sc.nextInt();
		 
		        System.out.println("Modulus of "+x+" and "+y+" :" +(x%y));
		 
		        break;
		 
		 case '&':System.out.println("Program is Ended");
			      System.out.println("\nThank You \nName: Ansari Bushra \nUIN:231P046 \nRoll no:03 \n ");

		 
		        System.exit(0);
		 default:System.out.println("Wrong Choice!!");
		         

		      }
		   }while(choice!='&');
	}

}



