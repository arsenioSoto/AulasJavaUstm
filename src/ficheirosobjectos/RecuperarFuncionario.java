package ficheirosobjectos;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class RecuperarFuncionario {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream file = new FileInputStream("funcionarios.bin");
		ObjectInputStream in = new ObjectInputStream(file);
		
		Funcionario fu = (Funcionario)in.readObject();
		
		System.out.println(fu);
		in.close();
		file.close();
	}

}
