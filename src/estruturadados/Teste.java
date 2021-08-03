package estruturadados;

public class Teste {
	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();
		
		
		a1.setNome("Cleive");
		a2.setNome("Denise");
		a3.setNome("Chambule");
		
		Vetor lista = new Vetor();
		
		lista.adiciona(a1);
		lista.adiciona(a2);
		
		
		
		
		System.out.println(lista);
		System.out.println(lista.tamanho());
		System.out.println(lista.contem(a2));
		
		lista.remove(0);
		lista.adiciona(a3);
		System.out.println(lista);
	}

}
