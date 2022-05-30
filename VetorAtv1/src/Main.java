import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] N = new int[10];
		
		
		N[0] = sc.nextInt();
		
		
		for (int i =0; i < N.length-1; i++) {
			N[i+1] = N[i]*2;
			
			
		}
		
		for (int i =0; i < N.length; i++) {
			System.out.println("N["+i+"] = "+N[i]);
			
		}
	}

}
