package BUSH_JAVA;

import java.util.Scanner;

public class ProblemSolving02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch;
		ProblemSolving02 p = new ProblemSolving02();
		do {

			System.out.println("---MENU--- :");
			System.out.println(
					"\n1.numberGuessingGame \n 2.factorial \n 3.firstTenEvenNumber\n 4.nameMonth\n 5.numberIsPositiveNegative\n");
			System.out.println("Enter a Choice :");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				p.numberGuessingGame(sc);
				break;
			case 2:
				p.factorial(sc);
				break;
			case 3:
				p.firstTenEvenNumber(sc);
				break;
			case 4:
				p.nameMonth(sc);
				break;
			case 5:
				p.numberIsPositiveNegative(sc);
				break;
			default:
				System.out.println("Wrong Choice!!!!:");
			}
			System.out.println("Thank You \n Name: Ansari Bushra \n UIN:231P046 \n Roll no:03 \n ");
		} while (ch != 0);

	}

	void numberGuessingGame(Scanner sc) {
		int secretNumber = 42;

		int numberOfTries = 0;

		System.out.println("Guess a number between 1 and 100!");
		do {
			System.out.print("Guess number " + (numberOfTries + 1) + ": ");
			int guess = sc.nextInt();

			if (guess < 1 || guess > 100) {
				System.out.println("Guess should be between 1 and 100. Try again.");
			} else {

				if (guess == secretNumber) {
					System.out.println(" Congratulations! You guessed the number in " + numberOfTries + " tries.");
					break;
				} else {

					if (guess < secretNumber) {
						System.out.println("Your guess is too low. Try again.");
					} else {
						System.out.println("Your guess is too high. Try again.");
					}
					numberOfTries++;
				}
			}
		} while (true);

		// sc.close();
	}

	void factorial(Scanner sc) {
		System.out.println("Enter a number whose factorial is to be found:");

		int num = sc.nextInt();
		int fact = 1;
		int i = 1;
		while (i <= num) {
			fact = fact * i;
			i++;
		}
		System.out.println(" factorial of " + num + " is:" + fact);

	}

	void firstTenEvenNumber(Scanner sc) {

		int i = 20;
		System.out.println("List of  first 10 even numbers:");
		for (i = 1; i <= 20; i++)
			if (i % 2 == 0) {
				System.out.println(i + "");

			}
	}

	void nameMonth(Scanner sc) {
		System.out.print("Enter month's number: ");

		int monthNumber = sc.nextInt();

		if (monthNumber == 1)

			System.out.println("January");

		else if (monthNumber == 2)

			System.out.println("February");

		else if (monthNumber == 3)

			System.out.println("March");

		else if (monthNumber == 4)

			System.out.println("April");

		else if (monthNumber == 5)

			System.out.println("May");

		else if (monthNumber == 6)

			System.out.println("June");

		else if (monthNumber == 7)

			System.out.println("July");

		else if (monthNumber == 8)

			System.out.println("August");

		else if (monthNumber == 9)

			System.out.println("September");

		else if (monthNumber == 10)

			System.out.println("October");

		else if (monthNumber == 11)

			System.out.println("November");

		else if (monthNumber == 12)

			System.out.println("December");

		else

			System.out.println("Invalid month.");

	}

	void numberIsPositiveNegative(Scanner sc) {
		System.out.print("Enter a number that is  positive, negative, or zero ");
		int input = sc.nextInt();
		if (input > 0) {
			System.out.print("Number is  positive");
		} else if (input < 0) {
			System.out.print("Number is  negative");
		} else {
			System.out.print("Number is  zero");
		}
	}

}



