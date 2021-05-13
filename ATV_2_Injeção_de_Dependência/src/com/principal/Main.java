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
import java.util.List;
import java.util.Iterator;

public class Main {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws IOException, CsvDataTypeMismatchException, CsvRequiredFieldEmptyException {

		// INSTANCIAS
		ListAlunos lista = new ListAlunos();
		Aluno aluno = new Aluno();
		//Persistencia_json pjson = new Persistencia_json();
		//Persistencia_xml pxml = new Persistencia_xml();
		//Persistencia_csv pcsv = new Persistencia_csv();
		
		Persistencia p = new Persistencia_xml();
		Controle_persistencia cp = new Controle_persistencia(p);
	
		
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

		
		cp.gerarPersistencia(lista.getLista());
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
