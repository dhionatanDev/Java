import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double [][] M = new double[3][3];
		double  SOMA, cont ;
		
		cont = 0;
		SOMA = 0;
		char O;
		
		
	    
		O = sc.next().charAt(0);
	
				
		for (int i =0; i < M.length; i++) {
			
			for(int j=0; j<M.length; j++) {
				
				M[i][j] = sc.nextDouble();
				
			
				
				
				
			}
			
		}
		
		for (int i = 0; i < M.length; i++) {
			
			for(int j= 0; j<M.length; j++) {
			
				if(i>j && j < M.length-i-1) {
			
				
			
					SOMA = SOMA + M[i][j];
					
					cont ++;
				
				}
				
			}
			
		}
				
		
		
		if(O == 'S') {
			System.out.printf("%.1f%n",SOMA);
		}
			
		if(O == 'M') {
		System.out.printf("%.1f%n",SOMA/cont );
		}
	}
	
}
