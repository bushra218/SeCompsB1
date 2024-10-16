/*Aim:interface Matrix:
             {
               Final static int M=5, N=5;
               Void readMatrix();
               Void displayMatrix();
               Void sum_Diagonal_Matrix();
             }
Implement above interface using suitable java class program and also develop the main program.
 *NAME:Ansari Bushra
 *UIN:231P046
 *ROLL NO:03
 *DIV:A*/

package BUSH_JAVA;

import java.util.Scanner;

interface MatrixTwo {
	final static int M = 5, N = 5;

	Void readMatrix();

	Void displayMatrix();


	Void sum_Diagonal_Matrix();
}

class MatrixTwoImpl implements MatrixTwo {

	int add[][] = new int[M][N];
	int set1[][] = new int[M][N];
	Scanner sc = new Scanner(System.in);
	int i, j, d1, d2;

	@Override
	public Void readMatrix() {
		// TODO Auto-generated method stub

		System.out.println("Enter the " + M + "x" + N + " matrix:");
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				set1[i][j] = sc.nextInt();
			}
		}
		return null;
	}

	@Override
	public Void displayMatrix() {
		System.out.println("The first " + M + "x" + N + " matrix is : ");
		for (i = 0; i < M; i++) {
			for (j = 0; j < N; j++) {
				System.out.print(set1[i][j] + "\t");
			}
			System.out.println(" ");
		}
		return null;
	}

	@Override
	public Void sum_Diagonal_Matrix() {
		
		for (i = 0; i < M; i++) {
			for (j = 0; j < N; j++) {
				if (i == j) {
					d1 = d1 + set1[i][j];
				}

			}
		}
		for (i = 0; i < M; i++) {
			for (j = 0; j < M; j++) {
				if ((i + j) == (set1.length - 1)) {
					d2 = d2 + set1[i][j];
				}

			}
		}
		System.out.println("The sum of first diagonal is : " + d1);
		System.out.println("The sum of second diagonal is : " + d2);
		return null;
	}
}

public class InterfaceImplTwo {

	public static void main(String[] args) {
		
		MatrixTwoImpl matrixTwoImpl = new MatrixTwoImpl();
		matrixTwoImpl.readMatrix();
		matrixTwoImpl.displayMatrix();
		matrixTwoImpl.sum_Diagonal_Matrix();
		
		System.out.println("\nThank You \nName: Ansari Bushra \nUIN:231P046 \nRoll no:03 \n ");


	}

}


