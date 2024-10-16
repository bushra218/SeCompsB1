/*AIM:Write a program to implement Multithreading in java.
 *Name:Ansari Bushra
 *Roll no:03
 *UIN:231P046
 *DIV:A*/

package BUSH_JAVA;

public class Mythread1 extends Thread {

	public static void main(String args[]) // main method
	{
		Mythread1 ex = new Mythread1(); // creating object of main class
		ex.create(); // creating main thread
		System.out.println("this is the main thread!"); // displaying string
	}

	public void create() // creating another thread
	{
		Thread t = new Thread(this); // creating object of Thread class
		t.start(); // starting a thread
	}

	public void run() // running a thread
	{
		while (true) // while terminate
		{
			try {
				System.out.println("this is the child thread!"); // displaying string
				Thread.sleep(500); // sleep for 500 ms
			} catch (InterruptedException e) {
			}

		}


	}

}
