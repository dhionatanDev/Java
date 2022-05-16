import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = 1;
		double f = 0;
		double g = 0;
		double calc = 0;
		int p = 0;
		double calc1=0;
		double calc2=0;
		int i =1;
		int teste = 0;
	
		
		   
		while (n !=0) {
			p=0;
			System.out.println("Informe a posição: ");
			n = sc.nextInt();
			
			
			while(p!=n) {
				f = Math.pow(((1 + Math.sqrt(5))/2),i);
				g = Math.pow(((1 - Math.sqrt(5))/2),i);
				calc = (int) ((f - g) / Math.sqrt(5));
				
			/*- (Math.pow(((1+Math.sqrt(5))/2),i)))	/ Math.sqrt(5))*/
			calc1 = calc%3;
			calc2 = calc%10;
			if(calc1 == 0 | calc2 ==3) {
				
				teste = teste+1;
				if(teste == n) {
				System.out.println(calc);
				i=0;
				f=0;
				g=0;
				calc =0;
				teste =0;
				p=n;
				}
				
			}
			i= i +1;
			
			
			}
			
			
			
			
			
			
		}
	}

}
