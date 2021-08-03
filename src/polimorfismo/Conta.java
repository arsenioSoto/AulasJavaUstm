package polimorfismo;

abstract class Conta {
	protected int numero;
	protected String titular; 
	protected double saldo;
	protected double saldoReal;
	
	public Conta() {}
	
	public Conta(int numero, String titular) {
		this.numero = numero;
		this.titular =  titular;
		this.saldo = 0;
	}


	public int getNumero() {
		return this.numero;
	}
	
	public String getTitular() {
		return this.titular;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	public double getSaldoReal() {
		return this.saldoReal;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public void setSaldoReal(double saldoReal) {
		this.saldoReal = saldoReal;
	}
	
	abstract double deposita(double valor);
	abstract double saldoReal();
	
	public String toString() {
		String descrisao = "Numero:  "+ numero + "\nTitular: "+ titular + "\nSaldo: " +saldo + "\nSaldo Real: " + saldoReal;
		return descrisao;
}
}
