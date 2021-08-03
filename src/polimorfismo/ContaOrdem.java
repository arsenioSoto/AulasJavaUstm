package polimorfismo;

import heranca.Banco;

public class ContaOrdem extends Conta {
private String  regimeDeTitularidade;
	
	public ContaOrdem(int numero, String titular, String regimeDeTitularidade) {
	    super(numero, titular);
		this.regimeDeTitularidade = regimeDeTitularidade;
	}
	
	public String getRegimeDeTitularidade() {
		return regimeDeTitularidade;
	}
	
	public void setRegimeDeTitularidade(String regimeDeTitularidade) {
		this.regimeDeTitularidade = regimeDeTitularidade;
	}
	
	public double deposita(double valor) {
		double dim = valor - 0.01;
		this.saldo = this.saldo + dim;
		return this.saldo;
	}
	
	public double saldoReal() {
		return this.saldoReal = this.saldo + (this.saldo*1) /100;
	}
	
	public String toString() {
		String descrisao = super.toString() +"\nRegime de Titularidade: "+getRegimeDeTitularidade();
		return descrisao;
	}
}
