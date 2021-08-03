package ficheirosobjectos;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class GestaoBanco {

	public static void main(String[] args) throws IOException {
	int opc = 6;
	
	do {
		opc = menu();
		switch(opc){
		case 1: registrarContas(); break;
		case 2: depositar(); break;
		case 3: transferir(); break;
		case 4: levantar(); break;
		case 5: visualizarContas(); break;
		}
	} while(opc != 6);

	}
	
	public static void registrarContas() throws IOException {
		Scanner ler = new Scanner(System.in);
		Banco [] contasNaBD = recuperarContas();
		FileOutputStream file = new FileOutputStream ("contas.bin");
		ObjectOutputStream out = new ObjectOutputStream(file);
		
		int i = 0;
		while(contasNaBD[i] != null) {
			out.writeObject(contasNaBD[i]);
			i++;
		}
		
		ler.nextLine();
		System.out.println("Titular: ");
		String titular = ler.nextLine();
		
		Banco novaconta = new Banco( titular);
		
		out.writeObject(novaconta);
		out.close();
		file.close();
		
		
	}
	
	private static Banco [] recuperarContas() throws IOException   {
		Banco [] contas = new Banco[100];
		
		FileInputStream file = new FileInputStream("contas.bin");
		ObjectInputStream inp =  new ObjectInputStream(file);
		
		
		try {
		for(int i = 0; i < 100; i++) {
			contas[i] = (Banco)inp.readObject();
		}
		
		inp.close();
		file.close();
		}catch(Exception e) {
		}
		return contas;
	}
	
	public static void depositar() throws IOException {
		Scanner ler = new Scanner(System.in);
		Banco [] depositar = recuperarContas();
		
		FileOutputStream file = new FileOutputStream ("contas.bin");
		ObjectOutputStream out = new ObjectOutputStream(file);
	
		
		System.out.println("Digite o numero de conta: ");
		int numero = ler.nextInt();
		
		
		for( int i = 0; i < depositar.length ; i++) {
			if(depositar[i].getNumero() == numero) {
				
				System.out.println("Digite o valor que pretende depositar: ");
				double valor = ler.nextDouble();
				depositar[i].depositar(valor);
				break;
				}
			}
		int j = 0;
		while(depositar[j] != null) {
			out.writeObject(depositar[j]);
			j++;
		
		}
	out.close();
	file.close();
	}
	
	private static int contaTrans(Banco [] numeros, int num1){

		for(int j = 0; j < numeros.length; j ++) {
			if(numeros[j].getNumero() == num1) {
				return j;
			}
		}
			return 0;
	}
	
	private static int contaDest(Banco [] numeros, int num1){

		for(int i = 0; i < numeros.length; i ++) {
			if(numeros[i].getNumero() == num1) {
				return i;
			}
		}
			return 0;
	}
	
	public static void transferir() throws IOException {
		Scanner ler = new Scanner(System.in);
		Banco[] transferencia = recuperarContas();
		FileOutputStream file = new FileOutputStream ("contas.bin");
		ObjectOutputStream out = new ObjectOutputStream(file);
		
		
		System.out.println("Digite o numero de conta transferida: ");
		int numero = ler.nextInt();
		int i = contaTrans(transferencia, numero); 
		Banco conta = transferencia[i];
		
		
		System.out.println("Digite o numero de conta destino: ");
		int numero1 = ler.nextInt();
		int j = contaDest(transferencia, numero1);
		Banco conta1 = transferencia[j];
		
		System.out.println("Digite o valor: ");
		double valor = ler.nextDouble();
		
		conta.transferencia(conta1, valor);
		
		int k = 0;
		while(transferencia[k] != null) {
			out.writeObject(transferencia[k]);
			k++;
		
		}
	out.close();
	file.close();


	}
	
	public static void levantar() throws IOException {
		Scanner ler = new Scanner(System.in);
		Banco[] levantar = recuperarContas();
		FileOutputStream file = new FileOutputStream ("contas.bin");
		ObjectOutputStream out = new ObjectOutputStream(file);
		
		System.out.println("Digite o numero da conta: ");
		int numero = ler.nextInt();
				
		for(int i = 0; i < levantar.length; i++) {
			if(levantar[i].getNumero() == numero) {
				System.out.println("Digite o valor: ");
				double valor = ler.nextDouble();
				levantar[i].levantar(valor);
				break;
			}
		}
		
		
		int j = 0;
		while(levantar[j] != null) {
			out.writeObject(levantar[j]);
			j++;
		}
		
		out.close();
		file.close();
		
	}

	
	public static void visualizarContas() throws IOException  {
		Banco[] contasNaBD = recuperarContas();
           int i = 0;
		
		while(contasNaBD[i] != null) {
			System.out.println(contasNaBD[i]);
			i++;
		}
	}
	
	public static int menu() {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite 1 para criar contas: \nDigite 2 para fazer algum deposito: \nDigite 3 para transferir algum valor: \nDigite 4 se pretende levantar algum valor: \nDigite 5 para visualizar as contas \nDigite 6 para sair do sistema");
		int numero = ler.nextInt();
		return numero;
	}

}
