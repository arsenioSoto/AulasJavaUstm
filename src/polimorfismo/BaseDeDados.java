package polimorfismo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BaseDeDados {
	public static void main (String[] args) throws Exception{
		ContaOrdem conta1 = new ContaOrdem(1234, "Cleive Chambule", "Individual");
		ContaPrazo conta2 = new ContaPrazo(5678, "Denise Mussepe");
		conta1.deposita(10000);
		conta2.deposita(500);
		conta1.saldoReal();
		conta2.saldoReal();
		
		escreveNoFicheiro(conta1);
		escreveNoFicheiro(conta2);
		
	}
	
	public static void escreveNoFicheiro(Conta a) throws Exception {
		Scanner ler = new Scanner(System.in);
		FileWriter file = new FileWriter("BaseConta.txt", true);
		BufferedWriter buffer = new BufferedWriter(file);
		String linha = a.getNumero() + " - " + a.getTitular() + " - " + a.getSaldo() + " - " + a.getSaldoReal();
		
		buffer.write(linha);
		buffer.newLine();
		buffer.close();
		file.close();
		
	}
}
