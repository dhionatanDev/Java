import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner lerTeclado = new Scanner(System.in);
		String x;
		System.out.println(" Digite algo:");
		x = lerTeclado.next();
		System.out.printf("Voc� digitou %s %n",x);
		
		
		lerTeclado.close();
		
	}

}
