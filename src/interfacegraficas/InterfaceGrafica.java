package interfacegraficas;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class InterfaceGrafica {

	public static void main(String[] args) {
		JFrame janelaPrincipal = new JFrame("Interfaces Graficas");
		janelaPrincipal.setSize(400, 400);
		janelaPrincipal.setLocationRelativeTo(null);
		
		
		Container container = janelaPrincipal.getContentPane();
		
		
		container.setLayout(new BorderLayout());
		container.add(new JButton("BOTAO NO TOP"), BorderLayout.NORTH);
		container.add(new JButton("BOTAO A ESQUERDA"), BorderLayout.NORTH);
		container.add(new JButton("BOTAO A ESQUERDA"), BorderLayout.WEST);
		container.add(new JButton("BOTAO A DIREITA"), BorderLayout.EAST);
		container.add(new JButton("BOTAO NA BASE"), BorderLayout.SOUTH);
		container.add(new JButton("BOTAO NO CENTRO"), BorderLayout.CENTER);
		
		
		janelaPrincipal.setVisible(true);
	}

}
