import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	System.out.println("Informe a quantidade de linhas:");
	int n = sc.nextInt();
	System.out.println("Informe a quantidade de colunas: ");
	int c = sc.nextInt();
	
	int [][] mat = new int[n][c];
	
	for(int i = 0; i< mat.length; i++) {
		for(int j = 0; j<mat[i].length; j++) {
			mat[i][j] = sc.nextInt();
			
		}
	}
	
	System.out.println("Numero da consulta: ");
	int x = sc.nextInt();
	
	for(int i = 0; i< mat.length; i++) {
			for(int j = 0; j<mat[i].length; j++) {
			if(mat[i][j] == x) {
				System.out.println(i + ", " + j);
				if(j > 0) {
					System.out.println("Left: " + mat[i][j-1]);
				}
				if (i>0) {
					System.out.println("Up: " + mat[i-1][j]);
				}
				if(j < mat[i].length-1) {
					System.out.println("Right: " + mat[i][j+1]);
				}
				if(i < mat.length-1) {
					System.out.println("Down: " + mat[i+1][j]);
				}
			}
			
		}
	}
	
	
	}

	private static char[] indexOf(int[][] mat) {
		// TODO Auto-generated method stub
		return null;
	}

}
