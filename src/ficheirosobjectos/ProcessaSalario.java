package ficheirosobjectos;
import java.util.Scanner;

public class ProcessaSalario {
	
	private static Scanner ler;

	public static void main(String[] args) {
		ler = new Scanner(System.in);
		Funcionario func = null;
		System.out.println("Digite o nome: ");
		String nome = ler.nextLine();
		System.out.println("Digite o telefone: ");
		String telefone = ler.nextLine();
		System.out.println("Digite o cargo: ");
		String cargo = ler.nextLine();
		
		
		func = new Funcionario (nome,telefone,cargo); 
		
		
		
		System.out.println(func);
		System.out.println("Salario: "+Funcionario.calculaSalario(1, 10000));
		System.out.println("Segundo Salario:" +func.calculaSalario());
		
		System.out.println("Temos "+Funcionario.numFuncionarios+" funcionario(s)!");
		
	}

}
