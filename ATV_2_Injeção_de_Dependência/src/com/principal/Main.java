package com.principal;

import com.persistencias.Persistencia_xml;
import com.persistencias.Persistencia_json;
import com.classes.Aluno;
import com.classes.ListAlunos;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
import com.persistencias.Controle_persistencia;
import com.persistencias.Persistencia;
import com.persistencias.Persistencia_csv;
import java.io.IOException;

public class Main {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws IOException, CsvDataTypeMismatchException, CsvRequiredFieldEmptyException {

		// INSTANCIAS
		ListAlunos lista = new ListAlunos();
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

		
		cp1.gerarPersistencia(lista.getLista());
		cp2.gerarPersistencia(lista.getLista());
		cp3.gerarPersistencia(lista.getLista());
		/*
		// GERAR ARQUIVO JSON
		pjson.gerarArquivo(lista.getLista());
	
		// GERAR ARQUIVO XML
		pxml.gerarArquivo(lista.getLista());
		
		
		// GERAR ARQUIVO CSV
		pcsv.gerarArquivo(lista.getLista());

		// LEITURA ARQUIVOS PERSISTENCIA
		List<Aluno> list = Persistencia_xml.lerXML();
		for(Iterator iter = list.iterator(); iter.hasNext();) {
			Aluno element = (Aluno) iter.next();
			System.out.println(element.toString() + "\n---");
		}
		/*
		System.out.println("\nalunos.json");
		System.out.println(pjson.lerJson());*/

		
	}
}
