package ficheirosdetexto;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) throws IOException {
		Scanner ler = new Scanner(System.in);
		FileWriter file = new FileWriter("temperatura.txt");
		BufferedWriter buffer = new BufferedWriter(file);
		
		String m = "MES";
		String ma= "MAX";
		String mi = "MIN";
		buffer.write(m+"<>"+ma+"<>"+mi);
		buffer.newLine();
		
		
		System.out.println("Digite o mes: ");
		int mes = ler.nextInt();
		System.out.println("Digite o temperatura maxima: ");
		int max = ler.nextInt();
		System.out.println("Digite a minima");
		int min = ler.nextInt();
		
		
		buffer.write(mes + "<>" + max + "<>" + min);
		
		buffer.close();
	    file.close();
	}

}
