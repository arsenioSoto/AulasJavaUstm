package ficheirosobjectos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class AplicacaoConta {
	
	public static void main(String[] args) throws IOException {
		 
		int opc =4;
		
		do {
			opc = menu();
			switch(opc) {
			case 1: escreveNoFicheiro(); break;
			case 2: visualizarDados(); break;
			case 3: depositar(); break;
			case 4: transferir(); break;
			}
		}while(opc !=5);
	}
	
	private static void escreveNoFicheiro() throws IOException {
		Scanner ler = new Scanner(System.in);
		Conta[] contasNaBD = recuperarContas();
		FileOutputStream file = new FileOutputStream("db.bin");
		ObjectOutputStream out =  new ObjectOutputStream(file);
		
		int i = 0;
		
		while(contasNaBD[i] != null) {
			out.writeObject(contasNaBD[i]);
			i++;
		}
	
		
	    
		System.out.println();
		System.out.println("Titular: ");
		String titular = ler.nextLine(); 
		
		Conta novaconta = new Conta(titular);
		out.writeObject(novaconta);
		out.close();
		file.close();
		
	}

	public static void visualizarDados() {
		Conta[] contasNaBD = recuperarContas();
           int i = 0;
		
		while(contasNaBD[i] != null) {
			System.out.println(contasNaBD[i]);
			i++;
		}
	}

	private static Conta[] recuperarContas() {
		Conta[] contas = new Conta[10000];
		
		try {
			FileInputStream file = new FileInputStream("db.bin");
			ObjectInputStream obj =  new ObjectInputStream(file);
			
			for(int i = 0; i < 1000; i++) {
				contas[i] = (Conta)obj.readObject();
			}
			
			obj.close();
			file.close();
		}
		catch(Exception e) {
		}
		return contas;
		
	}
	
	public static void depositar() throws IOException  {
		Scanner ler = new Scanner(System.in);
		Conta[] depositar = recuperarContas();
		
		FileOutputStream file = new FileOutputStream("db.bin");
		ObjectOutputStream out =  new ObjectOutputStream(file);
		
		System.out.println("Digite o nomero de conta: ");
		int numero = ler.nextInt();
		
		for(int i = 0; i < depositar.length; i++) {
			if(depositar[i].getNumConta() == numero) {
				System.out.println("Digite o valor que pretende depositar: ");
				double valor = ler.nextDouble();
				depositar[i].depositar(valor);
				break;
			}
		}
		int i = 0;
		while(depositar[i] != null) {
			out.writeObject(depositar[i]);
			i++;
		}
		
		out.close();
		file.close();
		
	}
	
	public static void transferir() {
		Scanner ler = new Scanner(System.in);
		Conta[] transferencia = recuperarContas();
		System.out.println("Digite o nomero de conta: ");
		int numero = ler.nextInt();
		System.out.println("Digite o numero de conta destino: ");
		int numeroDestino = ler.nextInt();
		System.out.println("Digite o valor: ");
		double valor = ler.nextDouble();
		int i = 0, j = 0;
		
		while(transferencia[i] != null && transferencia[j] != null) {
			if(transferencia[i].getNumConta() == numero && transferencia[j].getNumConta() == numeroDestino) {
				transferencia[i].transferencia(transferencia[j], valor);
			}
			
		}


	}
	private static int  menu() {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite 1 para adicionar nova conta: \nDigite 2 para visualizar as contas: \nDigite 3 para fazer um deposito: \nDigite 4 para fazer uma transferencia: \nDigite 5 para fechar o sistema:");
		int numero = ler.nextInt();
		return numero;
}

}
