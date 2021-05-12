package com.classes;

import com.persistencias.Persistencia_xml;
import com.persistencias.Persistencia_json;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
import com.persistencias.Persistencia_csv;

import java.io.IOException;
import java.util.List;
import java.util.Iterator;

public class Main {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws IOException, CsvDataTypeMismatchException, CsvRequiredFieldEmptyException {

		// INSTANCIAS

		
		// INSERSÂO DE DADOS
		ListAlunos lista = new ListAlunos();
		
		Aluno aluno = new Aluno();
		aluno.setNome("Rafael");
		aluno.setCpf("108.755.119-61");
		aluno.setMatricula(2020006201);
		aluno.setData_nascimento("05/06/2002");
		aluno.setEmail("rafaelcamargo.inf@gmail.com");
		lista.inserir(aluno);
		
		aluno = new Aluno();
		aluno.setNome("Tulio");
		aluno.setCpf("111.111.111-11");
		aluno.setMatricula(5);
		aluno.setData_nascimento("01/03/1996");
		aluno.setEmail("tuliosouzanascimento@hotmail.com");
		lista.inserir(aluno);

		aluno = new Aluno();
		aluno.setNome("Natalia");
		aluno.setCpf("222.222.222-22");
		aluno.setMatricula(16);
		aluno.setData_nascimento("10/05/2002");
		aluno.setEmail("naty.hang@gmail.com");
		lista.inserir(aluno);


		// GERAR ARQUIVO JSON
		Persistencia_json pjson = new Persistencia_json();
		pjson.gerarJson(lista.getLista());
		
		// GERAR ARQUIVO XML
		Persistencia_xml.gravarXML(lista.getLista());
		
		// GERAR ARQUIVO CSV
		Persistencia_csv.gerarCsv(lista.getLista());
		
		Persistencia_csv pcsv = new Persistencia_csv();
		

		// LEITURA ARQUIVOS PERSISTENCIA
		/*List<Aluno> list = Persistencia_xml.lerXML();
		for(Iterator iter = list.iterator(); iter.hasNext();) {
			Aluno element = (Aluno) iter.next();
			System.out.println(element.toString() + "\n---");
		}
		
		System.out.println("\nalunos.json");
		System.out.println(pjson.lerJson());*/

		
	}
}
