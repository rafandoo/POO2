package principal;

import com.persistencias.Persistencia_xml;
import com.persistencias.Persistencia_json;
import com.classes.BO.AlunoBO;
import com.classes.DTO.Aluno;
import com.classes.DTO.ListAluno;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
import com.persistencias.Controle_persistencia;
import com.persistencias.Persistencia;
import com.persistencias.Persistencia_BD;
import com.persistencias.Persistencia_csv;

import java.io.IOException;


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
	
		Persistencia p4 = new Persistencia_BD();
		Controle_persistencia cp4 = new Controle_persistencia(p4);
		
		// INSERS�O DE DADOS
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

		// GERAR ARQUIVO XML, CSV, JSON, BD
		cp1.gerarPersistencia(lista.getLista());
		cp2.gerarPersistencia(lista.getLista());
		cp3.gerarPersistencia(lista.getLista());
		cp4.gerarPersistencia(lista.getLista());

		// TESTE DE LEITURA
		System.out.println("== LISTA ALUNOS ==");
		System.out.println(lista.getLista().toString());
		System.out.print("\n");
		
		System.out.println("== PERSISTENCIA XML ==");
		Persistencia_xml pxml = new Persistencia_xml();
		System.out.print(pxml.lerXML());
		System.out.print("\n");
		
		System.out.println("== PERSISTENCIA CSV ==");
		Persistencia_csv pcsv = new Persistencia_csv();
		System.out.print(pcsv.lerCsv());
		System.out.print("\n");
		
		System.out.println("== PERSISTENCIA JSON ==");
		Persistencia_json pjson = new Persistencia_json();
		System.out.print(pjson.lerJson());
		System.out.print("\n");
		
		System.out.println("== PERSISTENCIA BD ==");
		AlunoBO aBO = new AlunoBO();
		System.out.print(aBO.mostrarTodos().toString());
		System.out.print("\n");
		
		
		
	}
}
