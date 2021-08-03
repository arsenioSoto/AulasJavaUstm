package interfacegraficas;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ExemploGrid {

	public static void main(String[] args) {
		JFrame janelaPrincipal = new JFrame("Interface");
		janelaPrincipal.setSize(400, 200);
		janelaPrincipal.setLocationRelativeTo(null);
		
		Container container = janelaPrincipal.getContentPane();

		container.setLayout( new GridLayout(4, 2));
		container.add(new JLabel("Nome: "));
		container.add(new JTextField());
		container.add(new JLabel("Apelido: "));
		container.add(new JTextField());
		container.add(new JLabel("Idade: "));
		container.add(new JTextField());
		JPanel j = new JPanel();
		JPanel j1 = new JPanel();
		JButton bt1 = new JButton("Login");
		JButton bt2 = new JButton("Cancelar");
		
		
		container.add(j);
		container.add(j1);
		
		
	
		
		janelaPrincipal.setVisible(true);


	}

}
