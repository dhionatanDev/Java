package capicua;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double numero=0, calculo =0, ni = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um numero:");
		numero = sc.nextDouble();
		calculo = numero;
		
		while (calculo != 0) {
			ni = ni *10 + calculo % 10;
			calculo = calculo % 10;
			
		
		}
		if(numero == ni) {
		System.out.println(ni + " é capicua");
		
		}
		else {
			System.out.println("Não é capicua");
		}
	}

}
