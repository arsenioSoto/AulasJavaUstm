package classesObjectos;

public class Estudante {
	private int codigoEstudante;
	public String nome;
	private double teste1;
	private double teste2;
	private double media;
	
	public Estudante() {	
	}
	
	public Estudante(int codigoEstudante, String nome, double teste1, double teste2) {
		this.codigoEstudante = codigoEstudante;
		this.nome = nome;
		this.teste1 = teste1;
		this.teste2 = teste2;
	}
	
	public int getCodigoEstudante() {return this.codigoEstudante;}
	public String getNome() {return this.nome;}
	public double getTeste1() {return this.teste1;}
	public double getTeste2() {return this.teste2;}
	public double getMedia() {return this.media;}
	public void setCodigoEstudante(int codigoEstudante) {this.codigoEstudante = codigoEstudante;}
	public void setNome(String nome) {this.nome = nome;}
	public void setTeste1(double teste1) {this.teste1 = teste1;}
	public void setTeste2(double teste2) {this.teste2 = teste2;}
	public void setMedia(double media) {this.media = media;}
	
	public double calculaMedia() {
		return this.media = (this.teste1 + this.teste2) / 2;
	}
	
	public String toString() {
		return "CODIGO DO ESTUDANTE: "+ codigoEstudante + "\nNOME: " + nome + "\nTESTE1: " + teste1 + "\nTESTE2: " + teste2 + "\nMEDIA: " + media;
	}
	
	public boolean equals(Estudante obj) {
		if(this.codigoEstudante == obj.codigoEstudante) {
			return true;
		}else {
			return false;}
		}
	
}
