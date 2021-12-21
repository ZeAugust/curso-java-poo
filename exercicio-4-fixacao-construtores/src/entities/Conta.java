package entities;

public class Conta {
	private int numeroConta;
	private String nomeTitular;
	private double saldoConta;
	
	public int getNumeroConta() {
		return numeroConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getSaldoConta() {
		return saldoConta;
	}

	
	public Conta() {
		
	}
	
	public Conta(int numeroConta, String nomeTitular, double valorDepositoInicial) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		deposito(valorDepositoInicial);
	}
	
	public Conta(int numeroConta, String nomeTitular) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
	}
	

	public void saque(double valorSaque) {
		this.saldoConta = this.saldoConta - (valorSaque + 5.00);
	}
	
	public void deposito(double valorDeposito) {
		this.saldoConta += valorDeposito;
	}
	
	public String toString() {
		return "Account: " + numeroConta + " , Holder: "+ nomeTitular + ", Balance: $"+ String.format("%.2f", saldoConta);
	}
}
