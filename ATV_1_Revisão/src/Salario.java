import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Salario {

	//INSTANCIA
	DecimalFormat df = new DecimalFormat("R$ #,##0.00");
	
	//ATRIBUTOS
	private int mesesTrab;

	//LISTAS
	private List<Float> valorHora = new ArrayList<Float>();
	private List<Integer> horas_trab = new ArrayList<Integer>();
	private List<Double> salario = new ArrayList<Double>();
	private List<Double> lista_salarios = new ArrayList<Double>();
	
	//GETTER E SETTER
	public int getMesesTrab() {
		return mesesTrab;
	}
	private void setMesesTrab(int mesesTrab) {
		this.mesesTrab = mesesTrab;
	}
	
	//METODOS
	public void addSalario(float valor, int horas) {
		valorHora.add(valor);
		horas_trab.add(horas);
		salario.add((double) (valor * horas));
		lista_salarios.add((double) valor * horas);
		mesesTrab++;
	}
	
	public String imprime_valorH() {
		int i = 1;
		String msg = "";
		for (Float valor : valorHora) {
			msg += "(" + i + ") " + df.format(valor) + " | ";
			i++;
		}
		return msg;
	}
	
	public String imprime_HorasT() {
		int i = 1;
		String msg = "";
		for (Integer valor : horas_trab) {
			msg += "(" + i + ") " + valor + " | ";
			i++;
		}
		return msg;
	}
	
	public String imprime_Salarios() {
		String msg = ""; 
		for(int i = 0; i < salario.size(); i++) {
			msg += "Salário " + (i+1) + ": "+ df.format(salario.get(i)) + "\n";
		}
		return msg;
	}
	
	public double total_salario() {
		double total = 0;
		if(!salario.isEmpty()) {
			for(int i = 0; i < salario.size(); i++) {
				total += salario.get(i);
			}
		}
		return (total);
	}
	
	public double media_salario() {
		return (total_salario()/salario.size());
	}

	public int anos_trab() {
		return (int) (getMesesTrab() / 12);
	}
	
	public int fracao_meses() {
		return (getMesesTrab() % 12);
	}

	public String menores_salarios(int valor) {
		String msg = "Menores salarios: [indice de busca (" + valor + ")]: ";
		lista_salarios.sort(null);
		for(int i = 0; i < valor; i++) {
			msg += df.format(lista_salarios.get(i)) + " | ";
		}
		return (msg);
	}
	
	public String maiores_salarios(int valor) {
		String msg = "Maiores salarios: [indice de busca (" + valor + ")]: ";
		lista_salarios.sort(Collections.reverseOrder());
		for(int i = 0; i < valor; i++) {
			msg += df.format(lista_salarios.get(i)) + " | ";
		}
		return (msg);
	}
	
	//TO STRING
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n===   Dados salários   ===");
		builder.append("\n" + imprime_Salarios());
		builder.append("Valor hora: ");
		builder.append(imprime_valorH());
		builder.append("\nHoras Trabalhadas: ");
		builder.append(imprime_HorasT());
		builder.append("\nTotal de salarios: ");
		builder.append(df.format(total_salario()));
		builder.append("\nMédia salarial: ");
		builder.append(df.format(media_salario()));
		builder.append("\nMeses trabalhados: ");
		builder.append(getMesesTrab());
		builder.append("\nAnos trabalhados: ");
		builder.append(anos_trab());
		builder.append("\nFração de meses trabalhados: ");
		builder.append(fracao_meses());
		builder.append("\nAnos e meses trabalhados: ");
		builder.append(anos_trab() + " ano(s) e " + fracao_meses() + " mes(es)");
		return builder.toString();
	}
}
