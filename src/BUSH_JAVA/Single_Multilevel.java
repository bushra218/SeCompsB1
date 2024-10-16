/*AIM: Write a program to implement single and multilevel inheritance using super keyword.
 *NAME:Ansari Bushra
 *UIN:231P046
 *ROLL NO:03
 *DIV:A*/

package BUSH_JAVA;

class Account {
	String cust_name;
	int acc_no;

	Account(String a, int b) {
		cust_name = a;
		acc_no = b;
	}

	void display() {
		System.out.println("Customer Name: " + cust_name);
		System.out.println("Account No: " + acc_no);
	}
}

class Online extends Account {
	Online(String a, int b) {
		super(a, b);
	}

	void display() {
		System.out.println("Customer-Id: " + (cust_name + acc_no % 10));
		System.out.println("Customer Password: " + (acc_no / 10 + 8));
	}
}

class Saving_Acc extends Account {
	int min_bal, saving_bal;

	Saving_Acc(String a, int b, int c, int d) {
		super(a, b);
		min_bal = c;
		saving_bal = d;
	}

	void display() {
		super.display();
		System.out.println("Minimum Balance: " + min_bal);
		System.out.println("Saving Balance: " + saving_bal);
	}
}

class Acct_Details extends Saving_Acc {
	int deposits, withdrawals;

	Acct_Details(String a, int b, int c, int d, int e, int f) {
		super(a, b, c, d);
		deposits = e;
		withdrawals = f;
	}

	void display() {
		super.display();
		System.out.println("Deposit: " + deposits);
		System.out.println("Withdrawals: " + withdrawals);
	}
}

public class Single_Multilevel {
	public static void main(String[] args) {
		Acct_Details A = new Acct_Details("Bushra", 456, 6000, 8000, 300, 7000);
		Online ol = new Online("Bushra", 666);
		A.display();
		ol.display();
		System.out.println("\nThank You \nName: Ansari Bushra \nUIN:231P046 \nRoll no:03 \n ");
	}
}


