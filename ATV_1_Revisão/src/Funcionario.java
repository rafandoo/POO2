
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
	//SEXO
	
	//REVER SE CLASSE A PARTE
	private List<Integer> valorHora = new ArrayList<Integer>();
	private List<Integer> horas_trab = new ArrayList<Integer>();
	private List<Double> salarios = new ArrayList<Double>();
	
	
	//TRABALHAR COM
	private String data_nascimento; 
	
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
	public void addGeral(int valor, int horas) {
		addValorHora(valor);
		addHoras_trab(horas);
		addSalario(valor, horas);
	}
	
	private boolean addValorHora(int valor) {
		return valorHora.add(valor);
	}
	
	public String imprime_valorH() {
		String msg = "Valor hora: ";
		for (Integer integer : valorHora) {
			msg += formatar.format(integer) + " | ";
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
	
	private boolean addSalario(int valor, int horas) {
		double total = valor * horas;
		return salarios.add(total);
	}
	
	
	
	
	
	
}
