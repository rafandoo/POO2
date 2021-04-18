import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

public class Main {

	public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		
		Funcionario f = new Funcionario("rafael", "2002", "Rafael", "rafaelcamargo.inf@gmail.com");
		
		Sexo sexo = Sexo.MASCULINO;
		f.setSexo(sexo);
		f.define_dataNasc(2002, 6, 5);
		
		Salario salario = new Salario();
		salario.addSalario(10.1f, 5);
		salario.addSalario(2.22f, 6);
		salario.addSalario(25, 32);
		salario.addSalario(96.1f, 45);
		salario.addSalario(9, 1);
		salario.addSalario(100.12f, 6);
		salario.addSalario(84, 120);
		salario.addSalario(12, 12);
		salario.addSalario(16.954f, 25);
		salario.addSalario(1, 12);
		salario.addSalario(2.5f, 6);
		salario.addSalario(45, 5);
		salario.addSalario(15, 2);
		salario.addSalario(20, 30);
		f.setSalario(salario);
		
		System.out.println(f);
		System.out.println(f.getSalario().toString());
		
		System.out.println(f.getSalario().menores_salarios(2));
		System.out.println(f.getSalario().maiores_salarios(2));
	}
}
