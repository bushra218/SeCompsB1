/*AIM:Write a program in java to display following pattern:
          1
          1 2
          1 2 3.
          
 *Name:Ansari Bushra
 *UIN:231P046
 *Roll No:03 
 */

package BUSH_JAVA;

public class DisplayPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, n = 3;

		for (i = 0; i < n; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print(j + 1);
			}
			System.out.println();
		}
		System.out.println("\nThank You \nName: Ansari Bushra \nUIN:231P046 \nRoll no:03 \n ");
	}

}

