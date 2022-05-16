package aulaAlgoritimo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		Scanner lerTeclado = new Scanner(System.in);
		System.out.println("Informe o n");
		numero = lerTeclado.nextInt();
		for (float n =1; n<=numero;n++) {
			if((n%2)==0) {
				System.out.println(n);
			}
		}
	}

}
