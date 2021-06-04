package exercicio4;

public class Elemento<K, V> {

	// CONSTRUTORES
	public Elemento(K chave, V valor) {
		setChave(chave);
		setValor(valor);
	}
	
	// ATRIBUTOS
	private K chave;
	private V valor;
	
	// GETTERS E SETTERS
	public K getChave() {
		return chave;
	}
	public void setChave(K chave) {
		this.chave = chave;
	}
	
	public V getValor() {
		return valor;
	}
	public void setValor(V valor) {
		this.valor = valor;
	}
	
}
