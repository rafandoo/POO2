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
import java.util.Iterator;
import java.util.List;

public class Persistencia_csv {

	
	private static final String CSV_PATH = "csv/alunos.csv";
	
	public static void gCsv(List<Aluno> aluno) throws IOException {
		try {
			FileWriter fileWriter = new FileWriter(CSV_PATH);
			CSVWriter csvWriter = new CSVWriter(fileWriter);
			
			String[] headers = {"nome", "matricula", "cpf", "data nascimento", "email"};
			
			List<String[]> data = new ArrayList<String[]>();
			
			data.add(headers);
			
			for (int i = 0; i < aluno.size(); i++) {
				String[] item = {aluno.get(i).getNome() };
				data.add(item);
			}
			
			csvWriter.writeAll(data);
			
			fileWriter.close();
			//csvWriter.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}
	
	public void gerarCSV(List<Aluno> aluno) throws IOException, CsvDataTypeMismatchException, CsvRequiredFieldEmptyException {
		
		Writer writer = Files.newBufferedWriter(Paths.get("csv/alunos.csv"));
        StatefulBeanToCsv<Aluno> beanToCsv = new StatefulBeanToCsvBuilder(writer).build();

        beanToCsv.write(aluno);

        writer.flush();
        writer.close();

	}
	
	public void gerarCsv(List<Aluno> aluno) throws IOException {
		FileWriter csvWriter = new FileWriter("csv/alunos.csv");
		
		//nome mat cpf dt email
		csvWriter.append("Nome");
		csvWriter.append(",");
		csvWriter.append("Matricula");
		csvWriter.append(",");
		csvWriter.append("CPF");
		csvWriter.append(",");
		csvWriter.append("Data nascimento");
		csvWriter.append(",");
		csvWriter.append("email");
		csvWriter.append("\n");
	
		csvWriter.close();
	}
}
