package heranca;

public class ContaPrazo extends Banco {
	
	public ContaPrazo(int numero, String titular, double saldo) {
		super(numero, titular, saldo);
	}
	
	public double deposita(double valor) {
		double acres = valor * 0.03; 
		saldo = saldo + valor + acres ;
		return saldo;
	}
	
	public String toString() {
		return super.toString();
	}

}
