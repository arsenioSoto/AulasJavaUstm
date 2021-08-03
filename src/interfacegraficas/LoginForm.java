package interfacegraficas;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginForm {
	public static JTextField nome;
	public static JPasswordField senha;
	public static JButton visualizar;
	public static JButton cadastrar;
	public static JButton cancelar;
	public static JButton autenticar;
	
	public static void main(String[] args) {
		JFrame janelaPrincipal = new JFrame("Cadastro");
		janelaPrincipal.setSize(400, 150);
		janelaPrincipal.setLocationRelativeTo(null);
		
		Container c = janelaPrincipal.getContentPane();
		c.setLayout(new BorderLayout());
		
		Container c1 = new JPanel();
		c1.setLayout(new GridLayout(2,2,5,4));
		c1.add(new JLabel("Nome: "));
		nome = new JTextField();
		c1.add(nome);
		c1.add(new JLabel("Senha: "));
		senha = new  JPasswordField();
		c1.add(senha);
		
		Container c2 =new JPanel();
		cadastrar = new JButton ("Cadastrar");
		c2.setLayout(new FlowLayout());
		c2.add(cadastrar);
		cancelar = new JButton("Cancelar");
		c2.add(cancelar);
		
		Container c3 =new JPanel();
		visualizar = new JButton("Visualizar");
		c3.add(visualizar);
		autenticar = new JButton("Login");
		c3.add(autenticar);
		
		
		c.add(BorderLayout.NORTH, c1);
		c.add(BorderLayout.CENTER, c2);
		c.add(BorderLayout.SOUTH, c3);
		
		cadastrar.addActionListener(new LoginAction());
		visualizar.addActionListener(new LoginAction());
		cancelar.addActionListener(new LoginAction());
	    autenticar.addActionListener(new LoginAction());

		
		
		janelaPrincipal.getContentPane();
		
		janelaPrincipal.setVisible(true);
		
	}

	
}
