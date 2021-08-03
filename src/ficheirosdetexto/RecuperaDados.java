package ficheirosdetexto;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

public class RecuperaDados {
	public static void main(String[] args) throws IOException {
		FileReader file = new FileReader("myFile.txt");
		BufferedReader buffer = new BufferedReader(file);
		
		String nome1 = buffer.readLine();
		String nome2 = buffer.readLine();
		String nome3 = buffer.readLine();
		
		System.out.println(nome1);
		System.out.println(nome2);
		System.out.println(nome3);
		
		buffer.close();
		file.close();
	}
}
