package interfacegraficas;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class User implements Serializable{
	private String nome;
	private String senha;
	
	public User() {
		
	}
	public User(String nome, String senha) {
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
	
	public static void criarUsers() {
		FileOutputStream file;
		
		try {
			file = new FileOutputStream("file.bin");
			ObjectOutputStream out = new ObjectOutputStream(file);
			User user1 = new User("Cleive","1999cleive");
			User user2 = new User("Denise","2021denise");
			out.writeObject(user1);
			out.writeObject(user2);
			out.flush();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	@SuppressWarnings("unused")
	public static User findUser(String nome) {
		boolean notFound = true;
		User user = null;
		try {
			FileInputStream file = new FileInputStream("file.bin");
			ObjectInputStream in = new ObjectInputStream(file);
			user = (User)in.readObject();
			
			for(int i = 0; notFound; i++) {
				if(user.getNome().equalsIgnoreCase(nome)){
					notFound = false;
				}else {user = (User)in.readObject();}
			}
			in.close();
			file.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		return user;
	}
	
	public String toString() {
		String usuario = "Nome: " + this.nome + "\nSenha: " + this.senha;
		return usuario;
	}

}
