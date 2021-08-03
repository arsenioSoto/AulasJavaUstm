package classesObjectos;

import java.util.Scanner;

public class GestaoDePauta {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o codigo do estudante: ");
		int codigo = ler.nextInt();
		ler.nextLine();
		System.out.println("Digite o nome do estudante: ");
		String nome = ler.nextLine();
		System.out.println("Digite a nota do primeiro teste: ");
		double teste1 = ler.nextDouble();
		System.out.println("Digite a nota do segundo teste: ");
		double teste2 = ler.nextDouble();
		
		Estudante est1 = new Estudante(codigo, nome, teste1, teste2);
		
		System.out.println("Digite o codigo do estudante: ");
		int codi = ler.nextInt();
		ler.nextLine();
		System.out.println("Digite o nome do estudante: ");
		String nom = ler.nextLine();
		System.out.println("Digite a nota do primeiro teste: ");
		double test1 = ler.nextDouble();
		System.out.println("Digite a nota do segundo teste: ");
		double test2 = ler.nextDouble();
		
		Estudante est2 = new Estudante(codi, nom, test1, test2);
		
		est1.calculaMedia();
		est2.calculaMedia();
		
		System.out.println(est1 + "\n" + est2);
		System.out.println(est1.equals(est2));

	}

}
