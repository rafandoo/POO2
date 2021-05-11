import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Aluno aluno = new Aluno();
		
		aluno.setNome("Rafa");
		aluno.setCpf("10875511961");
		aluno.setMatricula(6);
		aluno.setEmail("rafaelcamargo.inf@gmail.com");
		
		Persistencia_json pjson = new Persistencia_json(aluno);
		pjson.gerarJson();
		
		System.out.println(aluno);
		System.out.println("\n\n");
		System.out.println(pjson.saida());
		System.out.println(pjson.lerJson());

	}

}
