import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;

public class Funcionario extends Usuario{

	//INSTANCIAS
	DecimalFormat df = new DecimalFormat("R$ #,##0.00");
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

	//ATRIBUTOS
	private String nome;
	private String email;
	private Sexo sexo;
	
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
	
	public int aposentadoria() {
		int ano = data_nasc.get(Calendar.YEAR);
		if(sexo.getCod() == 1) {
			ano += 62;
		} else if(sexo.getCod() == 2) {
			ano += 65;
		}
		return ano;
	}
	
	//ESTUDAR CLASSE SEPARADA DE SALARIO
	public void addGeral(float valor, int horas) {
		addValorHora(valor);
		addHoras_trab(horas);
		addSalario(valor, horas);
	}
	
	private boolean addValorHora(float valor) {
		return valorHora.add(valor);
	}
	
	public String imprime_valorH() {
		String msg = "Valor hora: ";
		for (Float valor : valorHora) {
			msg += df.format(valor) + " | ";
		}
		return msg;
	}
	
	private boolean addHoras_trab(int horas) {
		return horas_trab.add(horas);
	}
	
	public String imprime_HorasT() {
		String msg = "Horas Trabalhadas: ";
		for (Integer integer : horas_trab) {
			msg += integer + " | ";
		}
		return msg;
	}
	
	private boolean addSalario(float valor, int horas) {
		double total = valor * horas;
		return salarios.add(total);
	}
	
	public String imprime_Salarios() {
		String msg = ""; 
		for(int i = 0; i < salarios.size(); i++) {
			msg += "Salário " + (i+1) + ": "+ df.format(salarios.get(i)) + "\n";
		}
		return msg;
	}
	
	public String media_salario() {
		double total_salario = 0;
		if(!salarios.isEmpty()) {
			for(int i = 0; i < salarios.size(); i++) {
				total_salario += salarios.get(i);
			}
		}
		return ("Média salarial: " + df.format(total_salario/salarios.size()));
	}
	//SUPER 
	
	//TO TRING
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("=== Funcionario ===");
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
		builder.append("\n" + imprime_valorH());
		builder.append("\n" + imprime_HorasT());
		builder.append("\n" + imprime_Salarios());
		builder.append(media_salario());
		//maior salario
		//menor salario
		builder.append("\nMeses trabalhados: ");
		builder.append("\nAnos trabalhados: ");
		builder.append("\nFração de meses trabalhados: ");
		builder.append("\nAno dos 35 anos de contribuição: ");
		builder.append(aposentadoria() + 10);
		builder.append("\nAno idade minima: ");
		builder.append(aposentadoria());
		builder.append("\nAno nascimento: ");
		builder.append(sdf_ano.format(data_nasc.getTime()));
		builder.append("\nAno aposentadoria: ");
		builder.append(aposentadoria() + 10);
		builder.append("\nIdade aposentadoria: ");
		builder.append((aposentadoria() + 10) - data_nasc.get(Calendar.YEAR));
		builder.append("\nIdade atual: ");
		builder.append(calculaIdade());
		builder.append("\nAnos faltantes para se aposentar: ");
		builder.append((aposentadoria() + 10) - data_nasc.get(Calendar.YEAR) - calculaIdade());
		return builder.toString();
	}

}
