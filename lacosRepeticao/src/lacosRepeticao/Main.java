package lacosRepeticao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testes;
		float quantia, qntR, qntC, qntS, total, ratos, coelhos, sapos;
		quantia = 0;
		qntR = 0;
		qntC = 0;
		qntS = 0;
		total = 0;
		ratos = 0;
		coelhos = 0;
		sapos = 0;
		char tipo;
		
		
		testes = 0;
		System.out.println("Informe quantos testes foram feitos: ");
		testes = sc.nextInt();
		
		for (int i = 1; i <= testes ; i ++) {
			System.out.println("Quantas cobaias foram usadas no teste n�:" + i);
			quantia = sc.nextFloat();
			
			while (quantia > 0 && quantia < 16) {
				
				System.out.println("Qual � o tipo de cobaia R = ratos, S = Sapos, C = Coelhos ");
				tipo = sc.next().charAt(0);
				if (tipo == 'R') {
					System.out.println("Informe a quantidade de Ratos: ");
					qntR = sc.nextFloat();
				
				}
				else {
					if (tipo == 'C') {
						System.out.println("Informe a quantidade de Coelhos: ");
						qntC = sc.nextFloat();
					}
					else {
							if (tipo == 'S') {
						System.out.println("Informe a quantidade de Sapos: ");
						qntS = sc.nextFloat();
						}
						else {
							System.out.println("Erro, voc� informou o tipo errado:");
						}
					}
				}
				quantia = quantia - qntR - qntC - qntS;
				if (quantia != 0) {
				System.out.println("faltam informar: " + quantia + " Cobaias " + " no " + i + "� teste");
				
				total = total + qntR + qntC + qntS;
				ratos = (ratos + qntR);
				sapos = (sapos + qntS);
				coelhos = (coelhos + qntC);
				qntR = 0;
				qntC = 0;
				qntS = 0;
			}
		}
		ratos = ratos/total *100;
		sapos = sapos/total * 100;
		coelhos = coelhos/total * 100;
		System.out.println("No final do ano foram utilizadas um total de: " + total + " cobaias, a porcentagem de coelhos utilizados foi de: " + coelhos + " %,  ratos " + ratos + " %  sapos  " + sapos + " %");

	}

}
