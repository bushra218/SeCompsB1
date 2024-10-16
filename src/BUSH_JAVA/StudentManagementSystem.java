package BUSH_JAVA;

class Student {
	int studentId;
	String name;
	int age;
	char grade;
	void insertRecord(int s, String n, int a, char g ) {
		studentId=s;
		name=n;
		age=a;
		grade=g;		
	}
	void displayInformtion() {
		
		System.out.println("Id:"+ studentId+" Name: "+name+" Age: "+age+" Grade: "+grade);
	}

}

public class StudentManagementSystem {

	public static void main(String[] args) {
		System.out.println("Details of Each Students are:\n");
		Student s1=new Student();
		s1.insertRecord(7, "Bushra", 12, 'A');
		s1.displayInformtion();
		
		s1.insertRecord(8, "Sidra", 13, 'B');
		s1.displayInformtion();
		
		s1.insertRecord(9, "Kashish", 14, 'C');
		s1.displayInformtion();
		
		System.out.println("\n Thank You \n Name: Ansari Bushra \n UIN:231P046 \n Roll no:03 \n ");

	}

}


