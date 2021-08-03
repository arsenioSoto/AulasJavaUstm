package ficheirosdetexto;
import java.io.File;

public class fileCleive {
	private static final String DIR = "D:\\trabalho\\java";

	public static void main(String[] args) {
		File file = new File(DIR);
		
		if(file.isDirectory()) {
			if(file.list().length > 0) {
				System.out.println("Directorio nao esta vazio");
			}
			else  {
				System.out.println("Directorio esta vazio");
			} 
			
		}
		

	}
}
