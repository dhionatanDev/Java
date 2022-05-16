package entites;

public class alunos {
	public String aluno;
	public double n1;
	public double n2;
	public double n3;
		
	public double medi1(){
	return n1 + n2 + n3;
				
		}	
	public double falta() {
		if (medi1()<60) {
			return 60 - medi1();
		}
		else {
			return 0;
		}
	}
	
		
	
	public String toString() {
		return "FINAL GRADE = " + medi1() ;
	}

}
