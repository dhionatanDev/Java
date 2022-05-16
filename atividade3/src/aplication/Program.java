package aplication;

import java.util.Scanner;

import entites.alunos;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lerTeclado = new Scanner(System.in);
		alunos _alunos = new alunos();
		
		System.out.println("Informe o nome do aluno: ");
		_alunos.aluno = lerTeclado.nextLine();
		System.out.println("Informe a primeira nota do Aluno: ");
		_alunos.n1 = lerTeclado.nextDouble();
		System.out.println("Informe a segunda nota do Aluno: ");
		_alunos.n2 = lerTeclado.nextDouble();
		System.out.println("Informe a terceira nota do Aluno: ");
		_alunos.n3 = lerTeclado.nextDouble();
		
		if(_alunos.medi1()<60) {
			System.out.println(_alunos);
			System.out.println("FAILED");
			System.out.println("MISSING "+ _alunos.falta() + " POINTS");
					}
		else {
			System.out.println(_alunos);
			System.out.println("PASS");
		}
		
		
	}

}
