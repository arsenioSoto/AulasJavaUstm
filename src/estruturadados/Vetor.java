package estruturadados;

public class Vetor {
	
	private Object[] objectos = new Aluno[100];
	private int totalDeObjectos = 0;
	
	public void adiciona(Object objecto) {
		this.garantaEspaco();
		this.objectos[totalDeObjectos] = objecto;
		this.totalDeObjectos++;
		}
		
		
	
	
	public void adiciona(int posicao, Aluno aluno) {
		this.garantaEspaco();
		if(!this.posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posicao invalida");
		}
		
		for(int i = this.totalDeObjectos - 1; i >= posicao; i--) {
			this.objectos[i + 1] = this.objectos[i];
		}
		
		this.objectos[posicao] = aluno;
		this.totalDeObjectos++;
	}
	
	private boolean posicaoValida(int posicao) {
		return posicao >= 0 && posicao <= this.totalDeObjectos;
	}
	
	public Object pega(int posicao) {
		if(!this.posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posicao invalida");
		}
		return this.objectos[posicao];
	}
	
	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < this.totalDeObjectos;
	}
	
	public void remove(int posicao) {
		if (!this.posicaoOcupada(posicao)) { 
			throw new IllegalArgumentException("Posicao inválida"); 
			} 
		for (int i = posicao; i < this.totalDeObjectos - 1; i++) {
			this.objectos[i] = this.objectos[i + 1]; }
		this.totalDeObjectos--;
	}
	
	public boolean contem(Aluno aluno) {
		for(int i = 0; i < this.totalDeObjectos; i++) {
			if(aluno.equals(this.objectos[i]));
			return true;
		}
		return false;
		
	}
	
	public int tamanho() {
		return this.totalDeObjectos;
		
	}
	
	private void garantaEspaco() { 
		if (this.totalDeObjectos == this.objectos.length) { 
			Object [] novaArray = new Aluno[this.objectos.length * 2]; 
			for (int i = 0; i < this.objectos.length; i++) { 
				novaArray[i] = this.objectos[i]; } 
			this.objectos = novaArray; } 
	}
	
	public String toString() {
		if(this.totalDeObjectos == 0) {
			return "[]";
		}
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		
		for(int i = 0; i < this.totalDeObjectos - 1; i++) {
			builder.append(this.objectos[i]);
			builder.append(",");
		}
		
		builder.append(this.objectos[this.totalDeObjectos - 1]);
		builder.append("]");
		return builder.toString();
	}
}
