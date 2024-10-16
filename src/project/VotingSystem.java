package project;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class VotingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> voterNames = new Vector<>();

		voterNames.addElement("ab01");
		voterNames.addElement("aq01");
		voterNames.addElement("amu01");
		voterNames.addElement("amh01");
		voterNames.addElement("abc01");
		voterNames.addElement("pqr01");

		Vector<String> partyList = new Vector<>();
		partyList.addElement("BJP");
		partyList.addElement("CONGRESS");
		partyList.addElement("AAP");
		partyList.addElement("SP");
		partyList.addElement("BSP");
		partyList.addElement("JDU");
		
		Vector<String> voterCasted = new Vector<>();
		Vector<String> votesReceived = new Vector<>();


		System.out.println("Welcome to Voting");
		do {
		
		System.out.println("Select on option\n 1. Register a new voter \n 2. Register a new Participant \n "
				+ "3. Accept a vote \n 4. Show Result \n 5. Exit");
		Scanner sc = new Scanner(System.in);
		int userInputInt = sc.nextInt();
		String userInputString;

		

			switch (userInputInt) {
			case 1:
				System.out.println("Enter Your Unique User Id to Register");
				userInputString = sc.next();
				if (voterNames.contains(userInputString)) {
					System.out.println("User is already registered");
				} else {
					voterNames.add(userInputString);
					System.out.println("User registered Sucessfully");
				}

				break;
			case 2:
				System.out.println("Enter Your Unique party Id");
				userInputString = sc.next();
				if (voterNames.contains(userInputString)) {
					System.out.println("Party is already registered");
				} else {
					voterNames.add(userInputString);
					System.out.println("Candidate registered Sucessfully");
				}

				break;
			case 3:
				System.out.println("Enter Your Unique voter Id to vote");
				userInputString = sc.next();
				if (voterNames.contains(userInputString) && !voterCasted.contains(userInputString)) {
					voterCasted.add(userInputString);
					System.out.println("Valid Voter, Select one of the following cadidate to vote");
					System.out.println(partyList);
					userInputString = sc.next();
					if(partyList.contains(userInputString)){
						votesReceived.add(userInputString);
						
					} else {
						System.out.println("Enter a valid Party Name from the list");
					}
				} else {
					System.out.println("User is not Registered or User already voted");
				}

				break;
			case 4:
				System.out.println("Welcome to Election Result");
				for(String str : votesReceived) {
					int occurrences = Collections.frequency(votesReceived, str);
					System.out.println("Name: "+str +"\t Count: "+occurrences);
				}			

				break;

			default:
				System.out.println("Invalid input");
				break;
			}

		} while (userInputInt != 5);

	}

}
