package ficheirosdetexto;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NomeDoEstudante {
	public static void main(String[] args) throws IOException {
		FileWriter file = new FileWriter("myFile.txt", true);
		BufferedWriter buffer = new BufferedWriter(file);
		
		Scanner ler = new Scanner(System.in);
		
		buffer.newLine();
		System.out.println("Nome completo: ");
		String nomeCompleto = ler.nextLine();
		buffer.write(nomeCompleto);
		buffer.close();
		file.close();
	}

}
