//AIM:Write a program to print alphabets and numbers using two threads.
 //Name:Ansari Bushra
 //Roll no:03 //UIN:231P046  //DIV:A
package BUSH_JAVA;
public class PrintAlphabetsAndNumbers {
		 private static final Object lock = new Object();
		    private static volatile boolean isAlphabetTurn = true;
		    public static void main(String[] args) {
		        Thread alphabetThread = new Thread(new PrintAlphabets());
		        Thread numberThread = new Thread(new PrintNumbers());
		        alphabetThread.start();
		        numberThread.start();
		        try {
		            alphabetThread.join();
		            numberThread.join(); } catch (InterruptedException e) {
		            e.printStackTrace(); }}
		    static class PrintAlphabets implements Runnable {
		        @Override
		        public void run() {
		            for (char c = 'A'; c <= 'Z'; c++) {
		                synchronized (lock) {
		                    while (!isAlphabetTurn) {
		                        try {
		           lock.wait();} catch (InterruptedException e) {
		                            e.printStackTrace();}}
		                    System.out.print(c + " ");
		                    isAlphabetTurn = false;
		                    lock.notifyAll(); } }}}
		    static class PrintNumbers implements Runnable {
		        @Override
		        public void run() {
		            for (int i = 1; i <= 26; i++) {
		                synchronized (lock) {
		                    while (isAlphabetTurn) {
		                        try {
		          lock.wait();} catch (InterruptedException e) {
		                            e.printStackTrace();}}
		                    System.out.print(i + " ");
		                    isAlphabetTurn = true;
		                    lock.notifyAll();}}}}}
