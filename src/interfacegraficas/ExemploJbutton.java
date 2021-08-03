package interfacegraficas;

import java.awt.GridLayout;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ExemploJbutton {
	public static JTextField campo;
	
	public static void main(String[] args) {
		JFrame janelaPrincipal = new JFrame("Interface");
		janelaPrincipal.setSize(400, 150);
		janelaPrincipal.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel(new GridLayout(3,2));
		JButton bt1 = new JButton("Gravar");
		campo = new JTextField();
		
		panel.add(new JLabel("Introduza o texto"));
		panel.add(campo);
		panel.add(bt1);
		
		bt1.addActionListener(new GravarAction());
		
		janelaPrincipal.getContentPane().add(panel);
		janelaPrincipal.setVisible(true);
		
		
		
		

	}
	
	
}
