package ficheirosdetexto;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Trabalhadores {

	public static void main(String[] args) throws IOException {
		Scanner ler = new Scanner(System.in);
		FileWriter file = new FileWriter("trabalhadores.txt");
		BufferedWriter buffer = new BufferedWriter(file);
		
		int i = 1;
		while(i > 0) {
		System.out.println("Digite 1 se quiser escrever e Digite 0 se quiser terminar");
		int numero = ler.nextInt();
		ler.nextLine();
		if(numero == 1) {
			 System.out.println("Digite o seu nome completo: ");
			 String nomeCompleto = ler.nextLine();
			 System.out.println("Digite as horas trabalhadas: ");
			 int horasTrabalh = ler.nextInt();
			 System.out.println("Digite as horas de atraso: ");
			 int horasAtraso = ler.nextInt();
			 System.out.println("Digite o salario diario: ");
			 int salarioDiario = ler.nextInt();
			 buffer.write(nomeCompleto + "=" + horasTrabalh + "=" + horasAtraso + "=" + salarioDiario);
			 buffer.newLine();
		}
		else if(numero == 0) {
			buffer.close();
			file.close();
			break;
		}
		i++;
	}
	}
}
		
		

	


