package ficheirosdetexto;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio0301 {
	public static void main(String[] args) throws IOException {
		Scanner ler = new Scanner(System.in);
		FileWriter file = new FileWriter("pauta.txt");
		BufferedWriter buffer = new BufferedWriter(file);
		
		System.out.println("Digite o nome do estudante: ");
		String nome = ler.nextLine();
		buffer.write(nome);
		buffer.newLine();
		
		System.out.println("Digite a nota do primeiro teste: ");
		double teste1 = ler.nextDouble();
		buffer.write(String.valueOf(teste1));
		buffer.newLine();
		
		System.out.println("Digite a nota do primeiro teste: ");
		double teste2 = ler.nextDouble();
		buffer.write(String.valueOf(teste2));
		
		buffer.close();
		file.close();
		
	}

}
