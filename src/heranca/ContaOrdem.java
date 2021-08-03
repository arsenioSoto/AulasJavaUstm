package heranca;

public class ContaOrdem extends Banco {
	private String  regimeDeTitularidade;
	
	public ContaOrdem(int numero, String titular, double saldo, String regimeDeTitularidade) {
		super(numero, titular, saldo);
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
		saldo = saldo + dim;
		return saldo;
	}
	
	public String toString() {
		String descrisao = super.toString() +"\nRegime de Titularidade: "+getRegimeDeTitularidade();
		return descrisao;
	}

}
