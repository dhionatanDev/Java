package aplication;

import java.util.Scanner;

import entitites.Hotel;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many rooms will be rented? ");
		int n = sc.nextInt();
		Hotel [] vetor = new Hotel[11];
		
		for (int i = 1; i <= n; i++) {
			sc.nextLine();
			System.out.println("Informe o nome do ocupante: ");
			String name = sc.nextLine();
			System.out.println("Informe o e-mail: ");
			String email = sc.nextLine();
			System.out.println("Informe o numero do quarto (1/10): ");
			int quarto = sc.nextInt();
			vetor[quarto] = new Hotel(name,email, quarto);
			
		}
		System.out.println("Busy rooms: ");
		
		for (int i = 1; i<=10;i++) {
			if(vetor[i]!= null) {
				System.out.println(vetor[i].getQuarto()+ ": " + vetor[i].getName() + ", " + vetor[i].getEmail() );
				
			}
		}
		sc.close();
	}

}
