import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;

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
	private List<Float> valorHora = new ArrayList<Float>();
	private List<Integer> horas_trab = new ArrayList<Integer>();
	private List<Double> salarios = new ArrayList<Double>();
	
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
	
	public List<Float> getValorHora() {
		return valorHora;
	}
	public void setValorHora(List<Float> valorHora) {
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
	DecimalFormat df = new DecimalFormat("R$ #,##0.00");
	SimpleDateFormat sdf = new SimpleDateFormat("y");
	
	Calendar data = new GregorianCalendar();
	
	//METODOS
	public void data_nasc(int ano, int mes, int dia) {
		data.set(ano, (mes-1), dia);
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
	
	public void teste() {
		System.out.println(sdf.format(data.getTime()));
	}
	
	
}
