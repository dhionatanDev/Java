package atv2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dia;
		float valor = 0;
		char tipo;
		dia = 0;

		Scanner lerTeclado = new Scanner(System.in);

		do {
			System.out.println("Informe o dia da Loca??o: domingo = 1, Segunda = 2, ter?a = 3, quarta = 4, quinta = 5"
					+ "sexta = 6, sabado = 7");
			dia = lerTeclado.nextInt();
			if (dia >= 1 && dia <= 7) {
				do {
					System.out.println("Informe o tipo de fita: N = Normal, L = Lan?amento");
					tipo = lerTeclado.next().charAt(0);
				} while (!(tipo == 'N' || tipo == 'L'));
				System.out.println("Informe o valor da Fita: ");
				valor = lerTeclado.nextFloat();
				if ((dia == 2 || dia == 5 || dia == 3 ) && tipo == 'N') {

					valor = (float) (valor - (valor * 0.4));
								} 
				
				if ((dia == 2 || dia == 5 || dia == 3 ) && tipo == 'L') {

					valor = (float) (valor - (valor * 0.25));
				

				} 
				if ((!(dia == 2 || dia == 5 || dia == 3 )) && tipo == 'L'){
					valor = (float) (valor*0.15+valor);
					
				}

			} else {
				System.out.println("Informe o dia correto: ");
			}
		} while (!(dia >= 1 && dia <= 7));
		
		System.out.println("Total a pagar: R$ " + valor);
	}

}
