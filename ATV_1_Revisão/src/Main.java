import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

public class Main {

	public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		
		Funcionario f = new Funcionario("rafael", "2002", "Rafael", "rafaelcamargo.inf@gmail.com");
		Salario s = new Salario();
		Sexo sexo = Sexo.MASCULINO;
		f.setSexo(sexo);
		f.define_dataNasc(2002, 6, 5);
		
		s.addSalario(10.1f, 5);
		s.addSalario(2.22f, 6);
		s.addSalario(25, 32);
		s.addSalario(96.1f, 45);
		s.addSalario(9, 1);
		s.addSalario(100.12f, 6);
		s.addSalario(84, 120);
		s.addSalario(12, 12);
		s.addSalario(16.954f, 25);
		s.addSalario(1, 12);
		s.addSalario(2.5f, 6);
		s.addSalario(45, 5);
		s.addSalario(15, 2);
		s.addSalario(20, 30);
		
		f.setSalario(s);
		
		System.out.println(f);
		System.out.println(f.getSalario().toString());
		
		System.out.println(f.getSalario().menores_salarios(2));
		System.out.println(f.getSalario().maiores_salarios(2));
	}
}
