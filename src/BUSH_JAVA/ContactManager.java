/*Assignment01-Q5 
 *AIM:Create a simple Java application that implements a stack data structure
  using an array.
 *NAME:Ansari Bushra
 *UIN:231P046
 *ROLL NO:03
 *Div:A*/


package BUSH_JAVA;

import java.util.Scanner;
import java.util.Vector;

class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Phone Number: " + phoneNumber;
    }
}
public class ContactManager {
	private Vector<Contact> contacts;

    public ContactManager() {
        contacts = new Vector<>();
    }

    public void addContact(String name, String phoneNumber) {
        contacts.add(new Contact(name, phoneNumber));
        System.out.println("Contact added: " + name);
    }

    public void removeContact(String name) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().equalsIgnoreCase(name)) {
                contacts.remove(i);
                System.out.println("Contact removed: " + name);
                return;
            }
        }
        System.out.println("Contact not found: " + name);
    }

    public void displayAllContacts() {
        if (contacts.isEmpty()) {
            System.out.println("Contact list is empty.");
        } else {
            System.out.println("Contacts:");
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }
    }

    public void searchContact(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                System.out.println("Contact found: " + contact);
                return;
            }
        }
        System.out.println("Contact not found: " + name);
    }
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        ContactManager manager = new ContactManager();
        int choice;

        do {
            System.out.println("\nContact Manager Menu:");
            System.out.println("1. Add a Contact");
            System.out.println("2. Remove a Contact");
            System.out.println("3. Display All Contacts");
            System.out.println("4. Search for a Contact");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter contact name: ");
                    String nameToAdd = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phoneToAdd = scanner.nextLine();
                    manager.addContact(nameToAdd, phoneToAdd);
                    break;
                case 2:
                    System.out.print("Enter contact name to remove: ");
                    String nameToRemove = scanner.nextLine();
                    manager.removeContact(nameToRemove);
                    break;
                case 3:
                    manager.displayAllContacts();
                    break;
                case 4:
                    System.out.print("Enter contact name to search: ");
                    String nameToSearch = scanner.nextLine();
                    manager.searchContact(nameToSearch);
                    break;
                case 5:
                    System.out.println("Exiting...");
              		 System.out.println("\nThank You \nName: Ansari Bushra \nUIN:231P046 \nRoll no:03 \n ");

                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();

	}

}



