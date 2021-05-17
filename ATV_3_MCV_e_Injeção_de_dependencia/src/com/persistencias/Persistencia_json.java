package com.persistencias;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.classes.Aluno;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class Persistencia_json implements Persistencia {

	// ATRIBUTO
	private final static String LOCALHOST = "json/alunos.json";
		
	// INTANCIAS
	GsonBuilder builder = new GsonBuilder();
	Gson gson = builder.create();

	// METODOS
	public boolean gerarArquivo(List<Aluno> aluno) {
		FileWriter writer;
		try {
			writer = new FileWriter(LOCALHOST);
			writer.write(gson.toJson(aluno));
			writer.close();
			return true;
		} catch (IOException e) {
			e.printStackTrace();
		}	
		return false;
	}

	public String lerJson() throws FileNotFoundException {
		builder = new GsonBuilder();
		gson = builder.create();
		BufferedReader bufferedReader = new BufferedReader(new FileReader("json/alunos.json"));
		Type listType = new TypeToken<ArrayList<Aluno>>() {}.getType();
		List<Aluno> list = new ArrayList<Aluno>();
		list = new Gson().fromJson(bufferedReader, listType);

		String msg = "";
		for (Iterator<Aluno> iterator = list.iterator(); iterator.hasNext();) {
			Aluno al = (Aluno) iterator.next();
			msg += al.toString() + "\n";
		}
		return (msg);
	}
}
