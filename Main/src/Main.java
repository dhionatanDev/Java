import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N, X, D, F;
		D = 0;
		F = 0;

		N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			X = sc.nextInt();
			if (X >= 10 && X <= 20) {
				D++;
			} else {
				F++;
			}
		}
		System.out.println(D + " in");
		System.out.println(F + " out");

	}

}
