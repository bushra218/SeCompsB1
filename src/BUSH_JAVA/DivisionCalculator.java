/*AIM:Write a program to perform division of two numbers accepted from user. Handle the
 IOException, NumberFormatException and also handle the divide by exception using multiple try
 catch block.
*NAME:Ansari Bushra
*UIN:231P046
*ROLL NO:03
*DIV:A*/
package BUSH_JAVA;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DivisionCalculator {
	public static void main(String[] args) {
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                try {
            System.out.print("Enter the first number (dividend): ");
            String input1 = reader.readLine();
            double dividend = Double.parseDouble(input1);
            System.out.print("Enter the second number (divisor): ");
            String input2 = reader.readLine();
            double divisor = Double.parseDouble(input2); 
            try {
                double result = dividend / divisor; 
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Error: Division by zero is not allowed.");            }
        } catch (IOException e) {
            System.out.println("Error: An input/output error occurred.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please enter numeric values.");
        }
		System.out.println("\nThank You \nName: Ansari Bushra \nUIN:231P046 \nRoll no:03 \n ");
	}

}




