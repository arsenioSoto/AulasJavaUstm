package classesObjectos;

import java.util.Scanner;

public class AplicacaoConta {
	 
	
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o numero da conta da primeira conta: ");
		int num1 = ler.nextInt();
		ler.nextLine();
		System.out.println("Digite o nome da conta da primeira conta: ");
		String nome1 = ler.nextLine();
		
		Conta conta1 = new Conta(num1,nome1);
		
		
		System.out.println("Digite o numero da conta da segunda conta: ");
		int num2 = ler.nextInt();
		ler.nextLine();
		System.out.println("Digite o nome da conta da segunda conta: ");
		String nome2 = ler.nextLine();
		
		Conta conta2 = new Conta(num2,nome2);
		
		int opc = 8;
		
		do {
			opc = menu();
			switch(opc) {
			case 1: System.out.println("Digite o valor que pretende depositar: ");
			        double valor = ler.nextDouble();
				    conta1.depositar(valor); break;
			case 2: System.out.println("Digite o valor que pretende depositar: ");
	                double valor1 = ler.nextDouble();
		            conta2.depositar(valor1); break;
			case 3: System.out.println("Digite o valor que levantar: ");
	                double leva = ler.nextDouble();
		            conta1.levantar(leva); break;
			case 4: System.out.println("Digite o valor que levantar: ");
                    double leva1 = ler.nextDouble();
                    conta2.levantar(leva1); break;
			case 5: System.out.println("Digite o valor que pretende transferir: ");
                    double transf = ler.nextDouble();
                    conta1.transferencia(conta2, transf); break;
			case 6: System.out.println("Digite o valor que pretende transferir: ");
                    double transf1 = ler.nextDouble();
                    conta2.transferencia(conta1, transf1); break;
			case 7: System.out.println(conta1 + "\n"+"\n" + conta2); break;
			}
		}
		while(opc != 8);
	}
	
	public static int menu() {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite 1 para depositar na primrira conta: \nDigite 2 para depositar na segunda conta: \nDigite 3 se pretende efectuar algum levantamento da primeira conta: \nDigite 4 se pretende efectuar algum levantamento da segunda conta: \nDigite 5 se pretende transferir algum valor da primeira conta para segunda conta: \nDigite 6 se pretende efectuar transferir algum valor da segunda conta para primeira conta: \nDigite 7 para visualizar as contas: \nDigite 8 se pretende abandonar o sistema: ");
		int numero = ler.nextInt();
		return numero;
	}

}
