import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

public class Main {

	public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		
		Funcionario f = new Funcionario("rafael", "2002");

				
		f.addGeral(10.1f, 5);
		f.addGeral(2.22f, 6);
		
		System.out.println(f.imprime_valorH());
		System.out.println(f.imprime_HorasT());
		System.out.print(f.imprime_Salarios());
		System.out.println(f.media_salario());
		
		System.out.println(f.crip_senha());
	}

}
