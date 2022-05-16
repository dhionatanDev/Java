package numeroPrimo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		String primo = "Primo";
		Scanner lerTeclado = new Scanner(System.in);
		numero = lerTeclado.nextInt();
		
		for (int n=2; n <= Math.sqrt(numero) ;n++) {
			
			float teste = numero % n;
			if(teste == 0) {
				primo = "Não primo";
				break;
			}
			
		}
			System.out.println(primo);
		
	}

 }

