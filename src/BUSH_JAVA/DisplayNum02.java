/*AIM:Display number between 1 to 10 except 5 using contonue.
 *Name:Ansari Bushra
 *UIN:231P046
 *Roll No:03
 *Div:A*/

package BUSH_JAVA;

public class DisplayNum02 {

	public static void main(String[] args) {
		int i;
		for (i = 1; i <= 10; i++) {
			if (i != 5) {

				System.out.println(i);
				continue;
			}
		}
		System.out.println("\nThank You \nName: Ansari Bushra \nUIN:231P046 \nRoll no:03 \n ");

	}

}
