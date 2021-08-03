package classesObjectos;

import java.util.Scanner;

public class GestaoBancaria {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o numero da conta: ");
		int numConta = ler.nextInt();
		ler.nextLine();
		System.out.println("Digite o nome da conta: ");
		String nome =  ler.nextLine();
		
		Conta conta = new Conta(numConta,nome);
		
		System.out.println("Digite o valor a depositar");
		double valor = ler.nextDouble();
		conta.depositar(valor);
		System.out.println("O saldo da conta apos o deposito e de: "+conta.getSaldo());
		
		System.out.println("Digite o valor de levantamento: ");
		double val = ler.nextDouble();
		conta.levantar(val);
		System.out.println("O saldo da conta apos o levantamento e de: "+conta.getSaldo());
	}
}
