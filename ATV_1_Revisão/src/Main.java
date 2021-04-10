import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

public class Main {

	public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		
		Funcionario f = new Funcionario();
		Usuario u = new Usuario("Rafael", "2002");
				
		
		f.addValorHora(1);
		f.addValorHora(5);
		f.imprime_lista();

		System.out.println(u.crip_senha());
	}

}
