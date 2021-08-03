package polimorfismo;

import heranca.Banco;

public class ContaPrazo extends Conta {
	
	public ContaPrazo(int numero, String titular) {
		super(numero, titular);
	}
	
	public double deposita(double valor) {
		double acres = valor * 0.03; 
		this.saldo = this.saldo + valor + acres ;
		return this.saldo;
	}
	
	public double saldoReal() {
		return this.saldoReal = this.saldo - (this.saldo*3) /100;
	}
	
	public String toString() {
		return super.toString();
	}

}
