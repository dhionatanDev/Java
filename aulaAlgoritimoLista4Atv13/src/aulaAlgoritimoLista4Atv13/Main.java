package aulaAlgoritimoLista4Atv13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long qnt, g, i;
		qnt = 0;
		g = 1;
		
		Scanner lerTeclado = new Scanner(System.in);
		
		for (i = 0; i <60; i++) {
			qnt = qnt+ g;
			g = g *2;
			
		}
		System.out.println(qnt);
	}

}
