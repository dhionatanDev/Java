package mediaPonderada;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero, vlrA, vlrB, vlrC;
		numero = 0;
		vlrA = 0;
		vlrB =0;
		vlrC= 0;
		double media = 0;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um numero: ");
		numero = sc.nextInt();
		for(int i = 0; i < numero; i++) {
			vlrA = vlrA + numero;
			vlrB = numero + vlrA;
			vlrC = numero + vlrB;
			
		System.out.println("Valores: " + vlrA + " , " + vlrB + " , " + vlrC);
			media = (double) ((vlrA * 2) + (vlrB* 3) + (vlrC * 5)) / 10;
		System.out.println("� m�dia ponderada �: " + media);
			vlrA = (int) (vlrA * numero);
			
		}
		
	}

}
