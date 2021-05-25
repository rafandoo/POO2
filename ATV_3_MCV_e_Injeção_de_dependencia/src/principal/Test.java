package principal;

import com.classes.DAO.AlunoDAO;
import com.classes.DTO.Aluno;

public class Test {

	public static void main(String []args) {

		inserir();
	}
	
	public static void inserir() {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Rafael");
		aluno.setCpf("111.111.111-11");
		aluno.setMatricula(2020006201);
		aluno.setData_nascimento("05/06/2002");
		aluno.setEmail("rafaelcamargo.inf@gmail.com");
		System.out.println(AlunoDAO.exist(aluno));
	}
	
	public static void excluir() {
		Aluno aluno = new Aluno();
		aluno.setId(1);
		AlunoDAO.delete(aluno);
	}
	
	public static void atualizar() {
		Aluno aluno = new Aluno();
		aluno.setNome("tulio");
		aluno.setCpf("111.111.111-11");
		aluno.setMatricula(2020006202);
		aluno.setData_nascimento("05/06/2002");
		aluno.setEmail("rafaelcamargo.inf@gmail.com");
		aluno.setId(2);
		AlunoDAO.insert(aluno);
	}
}
