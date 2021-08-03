package classesObjectos;

import java.util.Scanner;

public class Transferencias {

	public static void main(String[] args) {
		Scanner ler =  new Scanner(System.in);
		
		Conta conta1 = new Conta(1258739, "Cleive Chambule");
		Conta conta2 = new Conta(6754209, "Denise Mussepe");
		
		conta1.depositar(1000);
		System.out.println(conta1);
		ler.nextLine();
		System.out.println(conta2);
		ler.nextLine();
		
		System.out.println("As duas contas sao iguais? "+conta1.equals(conta2));
		System.out.println("Digite o valor da Transferencia: ");
		double valor = ler.nextDouble();
		conta1.transferencia(conta2, valor);
		
		System.out.println("O Saldo do " +conta1.getNome()+ " e de: "+ conta1.getSaldo()+ "\nO Saldo da " +conta2.getNome()+ " e de: "+ conta1.getSaldo());
	}

}
