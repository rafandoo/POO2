

public class Aluno extends Pessoa {

	//INSTANCIAS
	
	
	//CONSTRUTORES
	public Aluno() {
		
	}
	
	public Aluno(String nome) {
		super(nome);
	}
	
	public Aluno(String nome, int matricula, String cpf, String email) {
		super(nome);
		setMatricula(matricula);
		setCpf(cpf);
		setEmail(email);
	}
	
	//ATRIBUTOS
	private int matricula;
	private String cpf;
	private String email;
	
	//GETTERS E SETTERS
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	//SAIDA
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Aluno [matricula=");
		builder.append(matricula);
		builder.append(", cpf=");
		builder.append(cpf);
		builder.append(", email=");
		builder.append(email);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
