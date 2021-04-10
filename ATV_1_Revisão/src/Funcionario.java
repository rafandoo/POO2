import java.util.ArrayList;
import java.util.List;

public class Funcionario {

	//CONSTRUTORES
	
	//ATRIBUTOS
	private String nome;
	private String email;
	private List<Integer> valorHora = new ArrayList<>();
	private List<Integer> horas_trab = new ArrayList<>();
	
	
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
	

	//METODOS
	public boolean addValorHora(int hora) {
		return valorHora.add(hora);
	}
	
	public void imprime_lista() {
		for (Integer integer : valorHora) {
			System.out.println(integer);
		}
	}
	
}
