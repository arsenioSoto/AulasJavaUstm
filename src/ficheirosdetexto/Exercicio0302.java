package ficheirosdetexto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader; 
import java.io.IOException;
import java.util.Scanner;

public class Exercicio0302 {
	public static void main(String[] args) throws IOException {
		Scanner ler = new Scanner(System.in);
		
		FileReader file = new FileReader("pauta.txt");
		BufferedReader buffer = new BufferedReader(file);
		
		String nome = buffer.readLine();
		String teste1 = buffer.readLine();
		String teste2 = buffer.readLine();
		double t1 = Double.parseDouble(teste1);
		double t2 = Double.parseDouble(teste2);
		
		double med = (t1 + t2)/2;
		
		double media = Math.round(med);
		
		System.out.println(nome + " - " + t1 + " - " + t2 + " - " + media);
		
		
	}
}
