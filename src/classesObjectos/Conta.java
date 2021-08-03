package classesObjectos;

public class Conta {
	private int numConta;
	private String nome;
	private double saldo;
	
	public Conta() {
	}
	
	public Conta(int numConta, String nome) {
		this.numConta = numConta;
		this.nome = nome;
		this.saldo = 0;
	}
	
	public int getNumConta() {return numConta;}
	public String getNome() {return nome;}
	public double getSaldo() {return saldo;}
	public void setNumConta(int numConta) {this.numConta = numConta;}
	public void setNome(String nome) {this.nome = nome;}
	public void setSaldo(double saldo) {this.saldo = saldo;}
	
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
		return "Numero de Conta: " +numConta+ "\nNome: " +nome+ "\nSaldo: " +saldo;
	}
	
	public boolean equals(Conta obj) {
		if(this.numConta == obj.numConta) return true;
		else return false;
	}
}
