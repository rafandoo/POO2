package com.persistencias;

import com.classes.Aluno;
import com.opencsv.CSVWriter;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Persistencia_csv {

	// ATRIBUTOS
	private static final String LOCALHOST = "csv/alunos.csv";
	
	// METODOS
	@SuppressWarnings("resource")
	public static void gerarCsv(List<Aluno> aluno) throws IOException {
		try {
			FileWriter fileWriter = new FileWriter(LOCALHOST);
			CSVWriter csvWriter = new CSVWriter(fileWriter);
			
			String[] headers = {"nome", "matricula", "cpf", "data nascimento", "email"};
			
			List<String[]> data = new ArrayList<String[]>();
			
			data.add(headers);
			
			for (int i = 0; i < aluno.size(); i++) {
				String[] item = {aluno.get(i).getNome(), 
						Integer.toString(aluno.get(i).getMatricula()),
						aluno.get(i).getCpf(),
						aluno.get(i).getData_nascimento(),
						aluno.get(i).getEmail()};
				data.add(item);
			}
			csvWriter.writeAll(data);
			fileWriter.close();	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void testecsv(List<Aluno> aluno) throws IOException, CsvDataTypeMismatchException, CsvRequiredFieldEmptyException {
		Writer writer = Files.newBufferedWriter(Paths.get("csv/aluno.csv"));
		StatefulBeanToCsv<Aluno> beanToCsv = new StatefulBeanToCsvBuilder(writer).build();
		beanToCsv.write(aluno);
		
		writer.flush();
		writer.close();
		
	}
}
