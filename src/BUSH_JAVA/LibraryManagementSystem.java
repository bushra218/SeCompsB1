package BUSH_JAVA;

class Book {
	int BookId;
	String Title;
	String Authour;
	Double Price;

	void insertRecord(int b, String T, String A, Double P) {
		BookId = b;
		Title = T;
		Authour = A;
		Price = P;
	}

	void displayInformtion() {
		System.out.println("Id: " + BookId + " Title: " + Title + " Authour: " + Authour + " Price: " + Price);
	}
}

public class LibraryManagementSystem {

	public static void main(String[] args) {
		Book b1 = new Book();
		System.out.println("Details of each book:\n");
		b1.insertRecord(39, "HarryPotter", "Jk Rollin", 400.0);
		b1.displayInformtion();

		b1.insertRecord(59, "TimeMachine", "HG Wells", 540.0);
		b1.displayInformtion();

		b1.insertRecord(67, "TheTempest", "William Shakespear", 600.0);
		b1.displayInformtion();

		System.out.println("\n Thank You \n Name: Ansari Bushra \n UIN:231P046 \n Roll no:03 \n ");

	}

}

