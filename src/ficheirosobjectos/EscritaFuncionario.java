package ficheirosobjectos;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EscritaFuncionario {
	public static void main(String[] args) throws IOException {
		FileOutputStream file = new FileOutputStream("funcionarios.bin");
		ObjectOutputStream out = new ObjectOutputStream(file);
		
		Funcionario func1 = new Funcionario("Cleive", "849334644", "Gerente"); 
		
		out.writeObject(func1);
		
		file.close();
		out.close();
	}

}
