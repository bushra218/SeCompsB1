/*AIM:Write a program for delete method of StringBuffer class.
 *NAME:Ansari Bushra
 *UIN:231P046
 *ROLL NO:03
 *DIV:A*/

package BUSH_JAVA;

public class StrBuffDelete {
	 public static void main(String[] args) 
	    { 
	  
	        StringBuffer sbf = new StringBuffer("Ansari Bushra Zaheeruddin"); 
	        System.out.println("string = " + sbf); 
	  
	        sbf.delete(2, 4); //index position range where elements will be deleted
	        
	        System.out.println("After deletion string is = " + sbf); 
	        
			 System.out.println("\nThank You \nName: Ansari Bushra \nUIN:231P046 \nRoll no:03 \n ");

	    } 
}

