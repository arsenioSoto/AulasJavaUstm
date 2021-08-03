package ficheirosobjectos;
import java.io.Serializable;
import java.util.Scanner;

public class Funcionario implements Serializable{
	public String nome;
	public String telefone;
	public String cargo;
	public double salario;
	
	
	public static int numFuncionarios;
	private Scanner ler;
	
	public Funcionario() {
		
	}
	public Funcionario(String nome, String telefone,String cargo) {
	this.nome = nome;
	this.telefone = telefone;
	this.cargo = cargo;
	numFuncionarios ++;
	}

	public String getNome(){
	return nome;
	}
	public String getTelefone() {
	return telefone;
	}
	public String getCargo() {
	return cargo;
	}
	public double getSalario() {
	return salario;
	}
	public void setNome(String nome) {
	this.nome = nome;
	}
	public void setTelefone(String telefone) {
	this.telefone = telefone;
	}
	public void setCargo(String cargo) {
	this.cargo = cargo;
	}
	public void setSalario(double salario) {
	this.salario = salario;
	}
	
	public double calculaSalario() {
		ler = new Scanner(System.in);
		System.out.println("Digite o Dias Trablhados: ");
		int diasTrabalhados =  ler.nextInt();
		System.out.println("Digite o Valor Diario: ");
		double valorFixoDiario = ler.nextDouble();
		return salario = diasTrabalhados * valorFixoDiario;
		
	}
	public static double calculaSalario(int diasTrabalhados, double valorFixoDiario ) {
		double salario = diasTrabalhados * valorFixoDiario;
		return salario;
		}
	
	
	public boolean equals(Funcionario obj) {
		if(this.nome == obj.nome) {
			return true;}
		else {
			return false;
		}
	}
	
	public String toString() {
	String descrisao = "Nome: "+ nome +"\nTelefone: "+telefone+"\nCargo: "+cargo;
	return descrisao;
	}
}