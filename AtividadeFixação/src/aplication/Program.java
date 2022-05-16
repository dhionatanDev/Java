package aplication;

import java.util.Scanner;

import calculos.Utilites;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lerTeclado = new Scanner(System.in);
		System.out.println("What is the dollar price ? ");
		Utilites.vltDolar = lerTeclado.nextDouble();
		System.out.println("How many dollars will be bought ?  ");
		Utilites.qntDolar = lerTeclado.nextDouble();
		System.out.printf("Amont to be paid in reais = %.2f%n",Utilites.converssao());
		
	}

}
