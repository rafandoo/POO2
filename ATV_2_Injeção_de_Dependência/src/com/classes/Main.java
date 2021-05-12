package com.classes;

import com.persistencias.Persistencia_xml;

import java.io.IOException;
import com.persistencias.Persistencia_json;
import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {

		List<Aluno> lista = new ArrayList<Aluno>();
		
		Aluno aluno = new Aluno();
		aluno.setNome("Rafa");
		aluno.setCpf("10875511961");
		aluno.setMatricula(6);
		aluno.setData_nascimento("05/06/2002");
		aluno.setEmail("rafaelcamargo.inf@gmail.com");
		
		
		Aluno al2 = new Aluno("Tulio", 5, "10153297999", "01/03/1996", "tuliosouzanascimento@hotmail.com");

		lista.add(aluno);
		lista.add(al2);
		
		Persistencia_json pjson = new Persistencia_json();
		pjson.addListaJson(aluno);
		pjson.addListaJson(al2);
		pjson.gerarJson();

		Persistencia_xml pxml = new Persistencia_xml();
		
		pxml.gravarXML(lista);
		
		System.out.println(aluno);
		System.out.println(al2);
		System.out.println("\n\n");
		System.out.println(pjson.saida());
		System.out.println("\n");
		System.out.println(pjson.lerJson());

	}

}
