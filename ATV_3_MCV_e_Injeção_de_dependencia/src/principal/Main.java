package principal;

import com.persistencias.Persistencia_xml;
import com.persistencias.Persistencia_json;
import com.classes.DTO.Aluno;
import com.classes.DTO.ListAluno;
import com.classes.conexao.Conexao;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
import com.persistencias.Controle_persistencia;
import com.persistencias.Persistencia;
import com.persistencias.Persistencia_csv;
import java.io.IOException;
import java.sql.Connection;

@SuppressWarnings("unused")
public class Main {

	public static void main(String[] args) throws IOException, CsvDataTypeMismatchException, CsvRequiredFieldEmptyException {

		// INSTANCIAS
		ListAluno lista = new ListAluno();
		Aluno aluno = new Aluno();
		
		Persistencia p1 = new Persistencia_xml();
		Controle_persistencia cp1 = new Controle_persistencia(p1);
		
		Persistencia p2 = new Persistencia_csv();
		Controle_persistencia cp2 = new Controle_persistencia(p2);
		
		Persistencia p3 = new Persistencia_json();
		Controle_persistencia cp3 = new Controle_persistencia(p3);
	
		
		// INSERSÂO DE DADOS
		aluno.setNome("Rafael");
		aluno.setCpf("111.111.111-11");
		aluno.setMatricula(2020006201);
		aluno.setData_nascimento("05/06/2002");
		aluno.setEmail("rafaelcamargo.inf@gmail.com");
		lista.inserir(aluno);
		
		aluno = new Aluno();
		aluno.setNome("Tulio");
		aluno.setCpf("222.222.222-22");
		aluno.setMatricula(2021001252);
		aluno.setData_nascimento("01/03/1996");
		aluno.setEmail("tuliosouzanascimento@hotmail.com");
		lista.inserir(aluno);

		aluno = new Aluno();
		aluno.setNome("Natalia");
		aluno.setCpf("333.333.333-33");
		aluno.setMatricula(2020008599);
		aluno.setData_nascimento("10/05/2002");
		aluno.setEmail("naty.hang@gmail.com");
		lista.inserir(aluno);
		
		aluno = new Aluno();
		aluno.setNome("Josiane");
		aluno.setCpf("444.444.444-44");
		aluno.setMatricula(2019017233);
		aluno.setData_nascimento("27/01/1995");
		aluno.setEmail("josi.camargo@hotmail.com");
		lista.inserir(aluno);

		// GERAR ARQUIVO XML, CSV, JSON
		cp1.gerarPersistencia(lista.getLista());
		cp2.gerarPersistencia(lista.getLista());
		cp3.gerarPersistencia(lista.getLista());

		System.out.println(lista.getLista().toString());
		
		
	}
}
