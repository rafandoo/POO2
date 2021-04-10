
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Funcionario extends Usuario{

	//CONSTRUTORES
	public Funcionario(String usuario, String senha) {
		super(usuario, senha);
	}
	public Funcionario(String nome, String email, String usuario, String senha) {
		super(usuario, senha);
		setNome(nome);
		setEmail(email);		
	}

	//ATRIBUTOS
	private String nome;
	private String email;
	private List<Integer> valorHora = new ArrayList<>();
	private List<Integer> horas_trab = new ArrayList<>();
	private String data_nascimento; //TRABALHAR COM
	
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
	
	public List<Integer> getValorHora() {
		return valorHora;
	}
	public void setValorHora(List<Integer> valorHora) {
		this.valorHora = valorHora;
	}
	
	public List<Integer> getHoras_trab() {
		return horas_trab;
	}
	public void setHoras_trab(List<Integer> horas_trab) {
		this.horas_trab = horas_trab;
	}
	
	public String getData_nascimento() {
		return data_nascimento;
	}
	public void setData_nascimento(String data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	//INSTANCIAS
	DecimalFormat formatar = new DecimalFormat("R$ #,##0.00");
	
	//METODOS
	public boolean addValorHora(int valor) {
		return valorHora.add(valor);
	}
	
	public String imprime_valorH() {
		String msg = "Valor hora: ";
		for (Integer integer : valorHora) {
			msg += formatar.format(integer) + " | ";
		}
		return msg;
	}
	
	public boolean addHoras_trab(int horas) {
		return horas_trab.add(horas);
	}
	
	public String imprime_HorasT() {
		String msg = "Horas Trabalhadas: ";
		for (Integer integer : horas_trab) {
			msg += integer + " | ";
		}
		return msg;
	}
	
}
