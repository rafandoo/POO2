
public class Aluno extends Pessoa {

	//INSTANCIAS
	
	
	//CONSTRUTORES
	public Aluno() {
		
	}
	
	public Aluno(String nome) {
		super(nome);
	}
	
	public Aluno(String nome, int matricula, String cpf, String data_nascimento, String email) {
		super(nome);
		setMatricula(matricula);
		setCpf(cpf);
		setData_nascimento(data_nascimento);
		setEmail(email);
	}
	
	//ATRIBUTOS
	private int matricula;
	private String cpf;
	private String data_nascimento;
	private String email;
	
	//GETTERS E SETTERS
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		if(matricula > 0) {
			this.matricula = matricula;
		}	
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		if(cpf.length() > 0) {
			this.cpf = cpf;
		}	
	}
	
	public String getData_nascimento() {
		return data_nascimento;
	}
	public void setData_nascimento(String data_nascimento) {
		if(data_nascimento.length() > 0) {
			this.data_nascimento = data_nascimento;
		}
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if(email.length() > 0) {
			this.email = email;
		}
	}

	//SAIDA
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Aluno [matricula=");
		builder.append(matricula);
		builder.append(", cpf=");
		builder.append(cpf);
		builder.append(", data_nascimento=");
		builder.append(data_nascimento);
		builder.append(", email=");
		builder.append(email);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
