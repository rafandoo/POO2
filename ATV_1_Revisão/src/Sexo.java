
public enum Sexo {

	//ENUMS
	FEMININO (1), MASCULINO(2), NAO_BINARIO(3);
	
	//CONSTRUTOR
	private Sexo(int cod) {
		this.cod = cod;
	}
	
	//ATRIBUTO
	private final int cod;
	
	//GETTER
	public int getCod() {
		return cod;
	}
}
