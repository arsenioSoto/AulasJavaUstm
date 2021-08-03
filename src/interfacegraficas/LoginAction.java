package interfacegraficas;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import ficheirosobjectos.Conta;

public class LoginAction extends LoginForm implements ActionListener {
	public static JButton login1;
	public static  JButton cancel ;
	public static JTextField nomeAutenticar;
	public static JPasswordField senhaAutenticar;
	
	public static void cadastrarUtilizador() throws IOException {
		Utilizador[] utilizadoresNaBD = recuperarUtilizadores();
		FileOutputStream file = new FileOutputStream("utlizadores.bin");
		ObjectOutputStream out = new ObjectOutputStream(file);
		
        int i = 0;
		
		while(utilizadoresNaBD[i] != null) {
			out.writeObject(utilizadoresNaBD[i]);
			i++;
		}
		
		String name = nome.getText();
		String senha1 = new String (senha.getPassword());
		Utilizador utili = new Utilizador(name,senha1);
		
		out.writeObject(utili);
		
		
		file.close();
		out.close();
				
	}
	
	public static void visualizarDados() {
		Utilizador[] utilizadoresNaBD = recuperarUtilizadores();
           int i = 0;
		
		while(utilizadoresNaBD[i] != null) {
			JOptionPane.showMessageDialog(null, utilizadoresNaBD[i]);
			System.out.println(utilizadoresNaBD[i]);
			i++;
		}
		
	}
	
	public  void loginUsuario(){
		JFrame janela= new JFrame("Login");
		janela.setSize(400, 150);
		janela.setLocationRelativeTo(null);
		
		Container c = janela.getContentPane();
		c.setLayout(new BorderLayout());
		
		Container c1 = new JPanel();
		c1.setLayout(new GridLayout(2,2,5,4));
		c1.add(new JLabel("Nome: "));
		nomeAutenticar = new JTextField();
		c1.add(nomeAutenticar);
		c1.add(new JLabel("Senha: "));
		senhaAutenticar = new  JPasswordField();
		c1.add(senhaAutenticar);
		
		Container c2 =new JPanel();
		login1 = new JButton ("Login");
		c2.setLayout(new FlowLayout());
		c2.add(login1);
		cancel = new JButton("Cancelar");
		c2.add(cancel);
		
		c.add(BorderLayout.NORTH, c1);
		c.add(BorderLayout.CENTER, c2);
		
		login1.addActionListener(this);
		janela.setVisible(true);
	}
	
	public static Utilizador encontrarUser(){
		String nom = nomeAutenticar.getText();
		String senh = new String (senhaAutenticar.getPassword());
		Utilizador utili1 = new Utilizador(nom,senh);
		
		String nomeEncontrado = utili1.getNome();
		
		return Utilizador.findUser(nomeEncontrado);
		
	}
	private static Utilizador[] recuperarUtilizadores() {
		Utilizador[] utilizadores = new Utilizador[10000];
		
		try {
			FileInputStream file = new FileInputStream("utlizadores.bin");
			ObjectInputStream obj =  new ObjectInputStream(file);
			
			for(int i = 0; i < 1000; i++) {
				utilizadores[i] = (Utilizador)obj.readObject();
			}
			
			obj.close();
			file.close();
		}
		catch(Exception e) {
		}
		return utilizadores;
		
	}
	
	
	
	public void login() {
		Scanner ler = new Scanner(System.in);
		
			String name = nome.getText();
			String senha1 = new String (senha.getPassword());	
			String usa = "Usuario: " + name + "\nSenha: " + senha1;
				
			JOptionPane.showMessageDialog(null, usa);	
	}
	
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == cadastrar ) {
				
				try {
					cadastrarUtilizador();
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				login();
				nome.setText("");
				senha.setText("");
			
			}else if(e.getSource() == visualizar) {
				visualizarDados();
			}else if(e.getSource() == cancelar) {
				nome.setText("");
				senha.setText("");
			}else if(e.getSource() == autenticar) {
				loginUsuario();
			}else if(e.getSource() == login1) {
				JOptionPane.showMessageDialog(null, encontrarUser());
			}
			
		
		}

	
}

