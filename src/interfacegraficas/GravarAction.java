package interfacegraficas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class GravarAction extends ExemploJbutton implements ActionListener {
	
	
	public void gravar() {
		String texto = "Nome: " + campo.getText();
		JOptionPane.showMessageDialog(null, texto);
	}
	
	public void actionPerformed(ActionEvent e) {
		gravar();
		}
	
	
}
