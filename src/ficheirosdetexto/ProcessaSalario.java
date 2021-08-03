package ficheirosdetexto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProcessaSalario {

	public static void main(String[] args) throws IOException {
		FileReader file = new FileReader("trabalhadores.txt");
		BufferedReader buffer = new BufferedReader(file);
		
		String nome;
		int horasTrabalh, horasAtraso, salarioDiario, salario;
		
		String[] elementosTrabalhadores;
		String linha = buffer.readLine();
		
		while(linha != null && !linha.equals("")) {
			elementosTrabalhadores = linha.split("=");
			
			nome = elementosTrabalhadores[0];
			horasTrabalh = Integer.parseInt(elementosTrabalhadores[1]);
			horasAtraso = Integer.parseInt(elementosTrabalhadores[2]);
			salarioDiario = Integer.parseInt(elementosTrabalhadores[3]);
			
			salario = (int) calculaSalario(horasTrabalh, salarioDiario, horasAtraso);
			
			System.out.println(salario);
			linha = buffer.readLine();
		}
		buffer.close();
		file.close();

	}
	public static double calculaSalario(int horasTrabalhadas, int salarioDiario, int horasAtraso ) {
		return horasTrabalhadas * salarioDiario /8 - (horasAtraso * salarioDiario/8)*0.75; 
	}

}
