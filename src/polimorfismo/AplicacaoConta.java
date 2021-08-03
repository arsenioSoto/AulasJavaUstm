package polimorfismo;

public class AplicacaoConta {
	public static void main(String[] args) {
		
		ContaOrdem conta1 = new ContaOrdem(1234, "Cleive Chambule", "Individual");
		ContaPrazo conta2 = new ContaPrazo(5678, "Denise Mussepe");
		
		conta1.deposita(10000);
		conta2.deposita(100);
		
		System.out.println("O saldo da conta 1 e de: " +conta1.getSaldo() + "\nO saldo da conta 2 e de: " + conta2.getSaldo());
		
		Conta cont1 = conta1;
		Conta cont2 = conta2;
		
		cont1.deposita(10000);
		cont2.deposita(10000);
		System.out.println("O saldo da conta 1 e de: " +cont1.getSaldo() + "\nO saldo da conta 2 e de: " + cont2.getSaldo());
		
		conta1.saldoReal();
		System.out.println(conta1);
		System.out.println(conta2.saldoReal());
	}
}
