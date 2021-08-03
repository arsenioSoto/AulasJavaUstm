package heranca;

import java.util.Scanner;

public class AplicacaoConta {
	
	public static void main(String[] args) {
		
       int opc =3;
		
		do {
			opc = menu();
			switch(opc) {
			case 1: contaOrdem(); break;
			case 2: contaPrazo(); break;
			}
		}while(opc !=3);
	}
		
	public static void contaOrdem() {
		Scanner ler = new Scanner(System.in);
		ContaOrdem conta1;
		System.out.println("Digite o numero da conta: ");
		int numero = ler.nextInt();
		ler.nextLine();
		System.out.println("Digite o titular da conta: ");
		String titular = ler.nextLine();
		double saldo = 0.00;
		System.out.println("Digite o regime de titularidade: ");
		String regimeDeTitularidade = ler.nextLine();
		
		conta1 = new ContaOrdem(numero, titular, saldo, regimeDeTitularidade);
		System.out.println(conta1);
		ler.nextLine();
		
		System.out.println("Quer depositar algum valor?: Sim - 1 / Nao - 2");
		int resp = ler.nextInt();
		if(resp == 1) {
		System.out.println("Digite o valor a depositar: ");
		double valor = ler.nextDouble();
		conta1.deposita(valor);
		double saldoActual = conta1.getSaldo();
		System.out.println("Saldo Actual: " + saldoActual);}
		else if(resp == 2) {
			System.out.println("O seu saldo e: "+saldo);
		}
	}
	
	public static void contaPrazo() {
		Scanner ler = new Scanner(System.in);
		ContaPrazo conta2;
		System.out.println("Digite o numero da conta: ");
		int num = ler.nextInt();
		ler.nextLine();
		System.out.println("Digite o titular da conta: ");
		String titul = ler.nextLine();
		double sald = 0.00;
		
		conta2 = new ContaPrazo(num, titul, sald);
		System.out.println(conta2);
		
		System.out.println("Quer depositar algum valor?: Sim - 1 / Nao - 2");
		int resp = ler.nextInt();
		if(resp == 1) {
		System.out.println("Digite o valor a depositar: ");
		double val = ler.nextDouble();
		conta2.deposita(val);
		double saldoActual = conta2.getSaldo();
		System.out.println("Saldo Actual: " + saldoActual);}
		else if(resp == 2) {
			System.out.println("O seu saldo e: "+sald);
		}
	}
	
	private static int  menu() {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite 1 para adicionar Conta Ordem: \nDigite 2 para adiconar conta a prazo: \nDigite 3 para fechar o sistema: ");
		int numero = ler.nextInt();
		return numero;
}
	
	

}
