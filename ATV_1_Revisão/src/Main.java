import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

public class Main {

	public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		
		Funcionario f = new Funcionario("rafael", "2002");

				
		f.addValorHora(1);
		f.addValorHora(5);
		f.addHoras_trab(1);
		f.addHoras_trab(6);
		
		System.out.println(f.imprime_valorH());
		System.out.println(f.imprime_HorasT());

		System.out.println(f.crip_senha());
	}

}
