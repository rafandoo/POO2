import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

public class Main {

	public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		
		Funcionario f = new Funcionario("rafael", "2002", "Rafael", "rafaelcamargo.inf@gmail.com");
		f.addGeral(10.1f, 5);
		f.addGeral(2.22f, 6);
		
		System.out.println(f);
	}

}
