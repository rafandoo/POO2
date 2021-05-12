package com.persistencias;

import com.classes.Aluno;
import com.opencsv.CSVWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Persistencia_csv {

	// ATRIBUTOS
	private static final String CSV_PATH = "csv/alunos.csv";
	
	// METODOS
	@SuppressWarnings("resource")
	public static void gerarCsv(List<Aluno> aluno) throws IOException {
		try {
			FileWriter fileWriter = new FileWriter(CSV_PATH);
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
}
