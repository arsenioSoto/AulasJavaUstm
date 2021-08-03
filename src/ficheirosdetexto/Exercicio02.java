package ficheirosdetexto;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) throws IOException {
		Scanner ler = new Scanner(System.in); 
		FileWriter file = new FileWriter("individuos.txt");
		BufferedWriter buffer = new BufferedWriter(file);
		
		int i = 0; 
		while(i < 2) {
		System.out.println("Digite o nome: ");
		String nome = ler.nextLine();
		System.out.println("Digite o ano de nascimento: ");
		int ano = ler.nextInt();
		System.out.println("Digite o ano corrente: ");
		int anoCorrente = ler.nextInt();
		int idade = anoCorrente - ano;
		buffer.write(nome + "-" + ano + "-" + idade);
		buffer.newLine();
		ler.nextLine();
		i++;
		}
		buffer.close();
		file.close();

	}

}
