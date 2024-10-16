package project;


import java.util.HashMap;
import java.util.Scanner;

public class VotingSystemHashMap {
    // HashMap to store candidate names and vote counts
    private static HashMap votes = new HashMap<>();

    // Method to initialize candidates
    public static void initializeCandidates() {
        votes.put("Candidate 1", 0);
        votes.put("Candidate 2", 0);
        votes.put("Candidate 3", 0);
    }

    // Method to cast a vote
    public static void castVote(String candidate) {
        if (votes.containsKey(candidate)) {
            votes.put(candidate, votes.get(candidate) + 1);  // Increment vote count
            System.out.println("Vote cast for " + candidate);
        } else {
            System.out.println("Invalid candidate. Try again.");
        }
    }

    // Method to display the vote count
    public static void displayResults() {
        for (String candidate : votes.keySet()) {
            System.out.println(candidate + ": " + votes.get(candidate) + " votes");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean voting = true;
        initializeCandidates();  // Initialize candidates

        while (voting) {
            System.out.println("Enter the candidate name to vote for (Candidate 1-3), or 'exit' to end voting:");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                voting = false;  // End voting if input is 'exit'
            } else {
                castVote(input);  // Cast a vote
            }
        }

        System.out.println("Voting has ended. Final results:");
        displayResults();  // Display final results
        scanner.close();
    }
}  
