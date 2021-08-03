package interfacegraficas;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ExemploPainel {

	public static void main(String[] args) {
		JFrame janelaPrincipal = new JFrame("Interface");
		janelaPrincipal.setSize(400, 150);
		janelaPrincipal.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3,2));
		panel.add(new JLabel("Nome: "));
		panel.add(new JTextField());
		panel.add(new JLabel("Apelido: "));
		panel.add(new JTextField());
		panel.add(new JLabel("Idade: "));
		panel.add(new JTextField());
		
		
		
		Container container = janelaPrincipal.getContentPane();
		container.add(panel);
		janelaPrincipal.setVisible(true);
		

	}

}
