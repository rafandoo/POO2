package principal;

import com.classes.DAO.AlunoDAO;
import com.classes.DTO.Aluno;

public class Test {

	public static void main(String []args) {
		
		Aluno aluno = new Aluno();
		
		aluno.setNome("Rafael");
		aluno.setCpf("111.111.111-11");
		aluno.setMatricula(2020006201);
		aluno.setData_nascimento("05/06/2002");
		aluno.setEmail("rafaelcamargo.inf@gmail.com");
		
		AlunoDAO adao = new AlunoDAO();
		adao.inserir(aluno);
	}
}
