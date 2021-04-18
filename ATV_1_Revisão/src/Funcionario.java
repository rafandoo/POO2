import java.security.NoSuchAlgorithmException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;

public class Funcionario extends Usuario {

	//INSTANCIAS
	SimpleDateFormat sdf_completo = new SimpleDateFormat("dd/MM/yyyy");
	SimpleDateFormat sdf_ano = new SimpleDateFormat("y");
	Calendar data_nasc = new GregorianCalendar();
	Calendar data_atual = Calendar.getInstance();
	
	//CONSTRUTORES
	public Funcionario(String usuario, String senha) throws NoSuchAlgorithmException {
		super(usuario, senha);
	}
	
	public Funcionario(String usuario, String senha, String nome, String email) throws NoSuchAlgorithmException {
		super(usuario, senha);
		setNome(nome);
		setEmail(email);		
	}
	
	public Funcionario(String usuario, String senha, String nome, String email, Sexo sexo, Salario salario) throws NoSuchAlgorithmException {
		super(usuario, senha);
		setNome(nome);
		setEmail(email);
		setSexo(sexo);
		setSalario(salario);
	}

	//ATRIBUTOS
	private String nome;
	private String email;
	private Sexo sexo;
	private Salario salario;
	
	//GETTER E SETTERS 
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome.length() > 0) {
			this.nome = nome;
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
	
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	
	public Salario getSalario() {
		return salario;
	}
	public void setSalario(Salario salario) {
		this.salario = salario;
	}
	
	//METODOS
	public void define_dataNasc(int ano, int mes, int dia) {
		data_nasc.set(ano, (mes-1), dia);
	}
	
	public int calculaIdade() {
		int idade = 0;
		if(data_atual.get(Calendar.MONTH) >= data_nasc.get(Calendar.MONTH)) {
			if(data_atual.get(Calendar.DAY_OF_MONTH) >= data_nasc.get(Calendar.DAY_OF_MONTH)) {
				idade = (data_atual.get(Calendar.YEAR) - data_nasc.get(Calendar.YEAR));
			} else {
				idade = (data_atual.get(Calendar.YEAR) - data_nasc.get(Calendar.YEAR) - 1);
			}
		} else {
			idade = (data_atual.get(Calendar.YEAR) - data_nasc.get(Calendar.YEAR) - 1);
		}
		return idade;
	}
	
	public int ano_idadeMin() {
		int ano = data_nasc.get(Calendar.YEAR);
		if(sexo.getCod() == 1) {
			ano += 62;
		} else if(sexo.getCod() == 2) {
			ano += 65;
		}
		return ano;
	}

	public int tempo_contribuicao() {
		int ano_atual = data_atual.get(Calendar.YEAR);
		return (ano_atual - salario.anos_trab() + 35);
	}
	
	public int ano_aposentadoria() {
		if(tempo_contribuicao() > ano_idadeMin()) {
			return (tempo_contribuicao());
		} else {
			return ano_idadeMin();
		}
	}
	
	public int idade_aposentadoria() {
		return (ano_aposentadoria() - data_nasc.get(Calendar.YEAR));
	}
	
	public int anos_faltantes() {
		return(idade_aposentadoria() - calculaIdade());
	}
	
	//TO STRING
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("===   Dados funcionario   ===");
		builder.append("\nNome: ");
		builder.append(nome);
		builder.append("\nSexo: ");
		builder.append(getSexo());
		builder.append("\nEmail: ");
		builder.append(email);
		builder.append("\nData de nascimento: ");
		builder.append(sdf_completo.format(data_nasc.getTime()));
		builder.append("\nUsuário: ");
		builder.append(getUsuario());
		builder.append("\nSenha: ");
		builder.append(getSenha());
		builder.append("\n\n===   Dados previdenciarios   ===");
		builder.append("\nAno nascimento: ");
		builder.append(sdf_ano.format(data_nasc.getTime()));
		builder.append("\nAno dos 35 anos de contribuição: ");
		builder.append(tempo_contribuicao());
		builder.append("\nAno idade minima: ");
		builder.append(ano_idadeMin());
		builder.append("\nAno aposentadoria: ");
		builder.append(ano_aposentadoria());
		builder.append("\nIdade aposentadoria: ");
		builder.append(idade_aposentadoria());
		builder.append("\nIdade atual: ");
		builder.append(calculaIdade());
		builder.append("\nAnos faltantes para se aposentar: ");
		builder.append(anos_faltantes());
		return builder.toString();
	}
}
