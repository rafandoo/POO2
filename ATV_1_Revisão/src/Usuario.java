import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;

public class Usuario {

	//CONSTRUTORES
	public Usuario(String usuario, String senha) {
		addUsuario(usuario, senha);
	}
	//ATRIBUTOS
	private String usuario;
	private String senha;
	
	//GETTERS E SETTERS
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		if(usuario.length() > 0) {
			this.usuario = usuario;
		}
	}
	
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		if(senha.length() > 0) {
			this.senha = senha;
		}
	}
	
	//METODOS
	public boolean addUsuario(String usuario, String senha) {
		if(usuario.equals(senha)) {
			System.out.println("Usuario não pode ser igual a senha!");
			return false;
		} else {
			setUsuario(usuario);
			setSenha(senha);
			return true;
		}
		
	}
	public String crip_senha() throws NoSuchAlgorithmException {
		MessageDigest algotithm = MessageDigest.getInstance("SHA1");
		byte messageDigest[] = algotithm.digest(getSenha().getBytes());
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < messageDigest.length; i++) {
			sb.append(Integer.toString((messageDigest[i] & 0xff) + 0x100, 16).substring(1));
		}
		return sb.toString();
	}
	
}
