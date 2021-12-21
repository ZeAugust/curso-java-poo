package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc =  new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int [][] mat = new int[n][m];
		
		for (int i = 0; i< mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		int numeroEscolhido = sc.nextInt();
		
		for (int i = 0; i< mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				if(mat[i][j] == numeroEscolhido) {
					System.out.printf("\nPOSITION: %d, %d\n", i, j);
					roundValues(mat, i, j);
				}
			}
		}
		
		sc.close();
	}
	
	public static void roundValues(int mat[][], int i, int j) {
			if (j > 0) {
				System.out.printf("LEFT: %d\n", mat[i][j-1]);
			}
			if (j < mat[i].length -1) {
				System.out.printf("Right: %d\n", mat[i][j +1]);
			}
			if (i > 0) {
				System.out.printf("UP: %d\n", mat[i - 1][j]);
			}
			if (i < mat.length -1) {
				System.out.printf("DOWN: %d\n", mat[i+1][j]);
			}
	}
}
