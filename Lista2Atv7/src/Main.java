import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = 1;
		
		int calc = 0;
		int i = 0;
		int n1 = 0;
		int n2 = 1;
		
		while (n != 0) {
			System.out.println("Digite um numero: ");
			n = sc.nextInt();

			while (i < n) {

				while (i < n) {
					calc = n1 + n2;
					n1 = calc;
					if (calc % 3 == 0) {

						i++;
						if (i == n) {
							System.out.println(calc);
						}

					}
					calc = n1 + n2;
					n2 = calc;
					if (calc % 10 == 3) {

						i++;
						if (i == n) {
							System.out.println(calc);

						}
						
					}

				}

			}
			calc = 0;
			n1 =0;
			n2 =1;
			i = 0;

		}
	
	}
}
