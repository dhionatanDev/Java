package aplication;

import java.util.Scanner;

import utilitis.Client;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double saldo = 0;
		double saque = 0;
		System.out.println("Informe o numero da conta: ");
		int conta = sc.nextInt();
		System.out.println("Informe o nome do titular");
		String name = sc.next();
		sc.nextLine();
		System.out.println("Voc� vai fazer o deposito Inicial ? (y/n)");
		char tipo = sc.next().charAt(0);
		
		
		
		if(tipo == 'y') {
			System.out.println("Informe o valor do deposito inicial: ");
			saldo = sc.nextDouble();
			
			Client cliente = new Client(name, conta, saldo, saque);
		}
		Client cliente = new Client(name, conta, saldo, saque);
		

		System.out.println("Dados da conta: ");
		System.out.println(cliente);
		System.out.println();
		System.out.println("Informe o novo valor: ");
		double deposit = sc.nextDouble();
		cliente.setDeposit(deposit);
		System.out.println("Update accont data: ");
		System.out.println(cliente);
		System.out.println();
		System.out.println("Informe o valor que deseja sacar: ");
		double saquee = sc.nextDouble();
		cliente.saque(saquee);
		System.out.println("Update accont data: ");
		System.out.println(cliente);
	}

}
