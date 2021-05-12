package com.classes;

import com.persistencias.Persistencia_xml;

import java.io.IOException;
import com.persistencias.Persistencia_json;
import java.util.List;

import java.util.Iterator;

public class Main {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws IOException {

		ListAlunos lista = new ListAlunos();
		
		Aluno aluno = new Aluno();
		aluno.setNome("Rafa");
		aluno.setCpf("10875511961");
		aluno.setMatricula(6);
		aluno.setData_nascimento("05/06/2002");
		aluno.setEmail("rafaelcamargo.inf@gmail.com");
		
		
		Aluno al2 = new Aluno("Tulio", 5, "10153297999", "01/03/1996", "tuliosouzanascimento@hotmail.com");

		Aluno al3 = new Aluno("Natalia", 16, "111.111.111-11", "10/05/2002", "naty.hang@gmail.com");
		lista.inserir(aluno);
		lista.inserir(al2);
		lista.inserir(al3);
		
		Persistencia_json pjson = new Persistencia_json();
		pjson.gerarJson(lista.getLista());
		

		Persistencia_xml.gravarXML(lista.getLista());
		
		List<Aluno> list = Persistencia_xml.lerXML();
		
		for(Iterator iter = list.iterator(); iter.hasNext();) {
			Aluno element = (Aluno) iter.next();
			System.out.println(element.toString() + "\n---");
		}
		
		System.out.println(aluno);
		System.out.println(al2);
		System.out.println("\n\n");
		//System.out.println(pjson.saida());
		System.out.println("\n");
		System.out.println(pjson.lerJson());

	}

}
