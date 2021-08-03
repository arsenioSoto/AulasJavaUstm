package ficheirosobjectos;

import java.io.Serializable;

public class Conta implements Serializable {
	public static int numero = 0;
	public int numConta;
	private String titular;
	private double saldo;
	
	public Conta( String titular) {
		this.numConta = numero++; 
		this.titular = titular;
		this.saldo = 0;
	}
	
	
	public int getNumConta() {
		return this.numConta;
	}
	public double getSaldo() {
		return this.saldo;
	}
	
	public String getTitular() {
		return this.titular;
	}
	
	public void setNumero(int numero) {
		this.numConta = numero;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public boolean levantar(double valor) {
		if(saldo < valor) {
			return false;
		}
		else {
			this.saldo = this.saldo - valor;
			return true;
		}
	}
	
	public boolean transferencia(Conta contaDestino, double valor) {
		if(saldo < valor) {
			return false;
		}
		else {
			contaDestino.depositar(valor);
			this.levantar(valor);
			return true;
		}
	}
	public String toString() {
		String descrisao = "Numero: " + numConta + "\nTitular: " + titular + "\nSaldo: " + saldo;
		return descrisao;
	}

}
