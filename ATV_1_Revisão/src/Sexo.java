
public enum Sexo {

	//ENUMS
	FEMININO (1), MASCULINO(2);
	
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
