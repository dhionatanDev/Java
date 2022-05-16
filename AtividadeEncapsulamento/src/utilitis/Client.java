package utilitis;

public class Client {
	private String name;
	private int conta;
	private double saldo;
	private double saque;
	

	public Client(String name, int conta, double saldoInicio, double saque) {
		this.name = name;
		this.conta = conta;
		setDeposit(saldoInicio);
		this.saque = saque;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getConta() {
		return conta;
	}

	public double getDeposit() {
		return saldo;
	}

	public void setDeposit(double deposit) {
		this.saldo = saldo + deposit;
	}
	
	public void saque(double saque) {
		this.saldo = saldo - saque -5;
	}
	
	public String toString() {
		return " Conta :  " + conta + " Holder: " + name + " Saldo: " + saldo ;
	}
}
