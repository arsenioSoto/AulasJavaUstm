package heranca;

public class Banco {
	protected int numero;
	protected String titular; 
	protected double saldo;
	
	public Banco() {}
	public Banco(int numero, String titular, double saldo) {
		this.numero = numero;
		this.titular =  titular;
		this.saldo = saldo;
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
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String toString() {
		String descrisao = "Numero:  "+ numero + "\nTitular: "+ titular + "\nSaldo: " +saldo;
		return descrisao;
	}
	
	

}
