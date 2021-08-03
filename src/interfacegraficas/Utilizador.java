package interfacegraficas;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

import ficheirosobjectos.Conta;


public class Utilizador implements Serializable{
	private String nome;
	private String senha;
	
	public Utilizador() {
		
	}
	public Utilizador(String nome, String senha) {
		this.nome = nome;
		this.senha = senha;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public String getSenha() {
		return this.senha;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String toString() {
		String dados = "Nome: " +this.nome + "\nSenha: " + this.senha;
		return dados;
	}
	
	public boolean equals(Utilizador obj) {
		if(this.nome == obj.nome) return true;
		else return false;
	}
	
	public static Utilizador findUser(String nome) {
		boolean notFound = true;
		Utilizador user = null;
		
		try {
			FileInputStream file = new FileInputStream("utlizadores.bin");
			ObjectInputStream in = new ObjectInputStream(file);
			user = (Utilizador)in.readObject();
			
			for(int i = 0; notFound; i++) {
				if(user.getNome().equalsIgnoreCase(nome)) {
					notFound = false;
				} else {
					user = (Utilizador)in.readObject();
				}
				}
			in.close();
			file.close();
			} catch(Exception e) {
				e.printStackTrace();
		}
		if(notFound)return null;
		return user;
	}
}


