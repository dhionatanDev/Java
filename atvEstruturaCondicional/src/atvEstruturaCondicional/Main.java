package atvEstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grupo;
		float consumo;
		int conta;
		Locale.setDefault(Locale.US);
		Scanner lerTeclado = new Scanner(System.in);
		
		System.out.println(
				"Informe o tipo de consumidor: R - para Residencial, C - para comercial, I - para Industrial: ");
		grupo = lerTeclado.next().charAt(0);
	
		if(grupo == 'R' || grupo =='C'|| grupo =='I') {
		
		System.out.println("Informe o numero da conta: ");
		conta = lerTeclado.nextInt();
		System.out.println("Informe a quantidade de metros? consumidos: ");
		consumo = lerTeclado.nextFloat();

		
		if (grupo == 'R') {
			consumo = (float) (consumo * 0.55 + 5.00);
			System.out.println("Conta n?: " + conta + " Valor a ser pago: R$ " + consumo);

		} else {
			if (grupo == 'C') {
				consumo = (float) (consumo * 1.25 + 150.00);
				System.out.println("Conta n?: " + conta + " Valor a ser pago: R$ " + consumo);

			} else {
				if (grupo == 'I') {
					consumo = (float) (consumo * 2.54 + 280.00);
					System.out.println("Conta n?: " + conta + " Valor a ser pago: R$ " + consumo);

				}

			}
		}
		}
		else {
			System.out.println("Voc? digitou um grupo de contas minusculo ou inexistente");
		}

		
	}
}
