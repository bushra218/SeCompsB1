/*Aim:Write a program to print following pattern using BreakCountinue.
 *Name:Ansari Bushra
 *UIN:231P046
 *Roll No:03 */

package BUSH_JAVA;

public class Pattern_BreakContinue {

	public static void main(String[] args) {
		stop: {

			nextRow: for (int row = 1; row <= 7; row++) {
				if (row == 6)
					break stop;
				System.out.println();
				for (int column = 1; column <= 10; column++) {
					if (column > row)
						continue nextRow;
					System.out.print(" * ");
				}
			}

		}
		System.out.println("\n\nThank You \nName: Ansari Bushra \nUIN:231P046 \nRoll no:03 \n ");

	}

}

