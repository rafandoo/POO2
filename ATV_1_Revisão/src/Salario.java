import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Salario {

	//INSTANCIA
	DecimalFormat df = new DecimalFormat("R$ #,##0.00");
	
	//ATRIBUTOS
	private int mesesTrab;

	//LISTAS
	private List<Float> valorHora = new ArrayList<Float>();
	private List<Integer> horas_trab = new ArrayList<Integer>();
	private List<Double> salarios = new ArrayList<Double>();
	
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
		double total = valor * horas;
		salarios.add(total);
		mesesTrab++;
	}
	
	public String imprime_valorH() {
		String msg = "Valor hora: ";
		for (Float valor : valorHora) {
			msg += df.format(valor) + " | ";
		}
		return msg;
	}
	
	public String imprime_HorasT() {
		String msg = "Horas Trabalhadas: ";
		for (Integer integer : horas_trab) {
			msg += integer + " | ";
		}
		return msg;
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

	
	public int anos_trab() {
		return (int) (getMesesTrab() / 12);
	}
	
	public int fracao_meses() {
		return (getMesesTrab()%12);
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("=== Salario ===");
		builder.append("\n" + imprime_valorH());
		builder.append("\n" + imprime_HorasT());
		builder.append("\n" + imprime_Salarios());
		builder.append(media_salario());
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
