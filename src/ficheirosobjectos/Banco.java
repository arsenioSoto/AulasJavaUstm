package ficheirosobjectos;

import java.io.Serializable;

public class Banco implements Serializable{
	private int numero;
	private String titular;
	private double saldo;
	private static int conta;
	
	public Banco(String titular) {
		this.numero = conta++;
		this.titular = titular;
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
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double depositar(double valor) {
		return this.saldo = this.saldo + valor;
	}
	
	public double depositar(Banco conta, double valor) {
		return this.saldo = this.saldo + valor;
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
	
	public boolean transferencia(Banco contaDestino, double valor) {
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
		String descrisao = "Numero: " + numero + "\nTitular: " + titular + "\nSaldo: " + this.saldo;
		return descrisao;
	}
	public boolean equals(Banco objc) {
		if(this.numero == objc.numero) {
			return true;
		}else {
			return false;}
		}
	


}
