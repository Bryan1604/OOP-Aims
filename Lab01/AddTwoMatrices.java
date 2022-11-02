/*Bài 6.6 : Add two Matrices
 * Vũ Đức Lương - 20205099
 */

import java.util.Scanner;

public class AddTwoMatrices {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the row in matrics: ");
        int rows = input.nextInt();
        System.out.println("Enter the columns in matrics: ");
        int columns = input.nextInt();

        int[][] m1 = new int[rows][columns];
        int[][] m2 = new int[rows][columns];
        System.out.println("Enter the first matrix: ");
        for(int i=0; i<rows;i++){
            for(int j = 0; j<columns;j++){
                m1[i][j] = input.nextInt();
            }
            System.out.println();
        }
        System.out.println("Enter the second matrix");

        for(int i=0; i<rows;i++){
            for(int j = 0; j<columns;j++){
                m2[i][j] = input.nextInt();
            }
            System.out.println();
        }

        input.close() ;  // close the Scanner

		// print both matrices
		System.out.println("First Matrix:\n");
		printMatrix(m1);

		System.out.println("\nSecond Matrix:\n");
		printMatrix(m2);

		// sum of matrices
        System.out.println("\nSum of two matric:\n");
		sum(m1, m2);
	}

    private static void printMatrix(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static void sum(int[][] m1, int[][] m2) {
        int[][] result = new int[m1.length][m1[0].length];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++) {
                result[i][j] = m1[i][j] + m2[i][j];
            }
        }

        printMatrix(result);
    }

}
