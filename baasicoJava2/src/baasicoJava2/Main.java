package baasicoJava2;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	double raio, pi, area;
	raio = 0;
	pi =  3.14159;
	area = 0;
	
	Scanner lerTeclado = new Scanner(System.in);
	
	System.out.println("Informe o valor do raio do circulo: ");
	raio = lerTeclado.nextDouble();
	
	area = pi * Math.pow(raio,2);
	System.out.printf("A aréa do triângulo é de : %.4f", area);
	
	}

}
