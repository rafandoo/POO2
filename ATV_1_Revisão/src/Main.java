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
		

		System.out.println(f);
		System.out.println(s);
	}

}
