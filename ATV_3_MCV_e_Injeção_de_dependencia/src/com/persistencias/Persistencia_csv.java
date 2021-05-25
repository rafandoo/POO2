package com.persistencias;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.classes.DTO.Aluno;
import com.opencsv.CSVWriter;

public class Persistencia_csv implements Persistencia {
	
	// ATRIBUTO
	private static final String LOCALHOST = "csv/alunos.csv";
	
	// METODO
	@SuppressWarnings("resource")
	public boolean gerarPersistencia(List<Aluno> aluno) {
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
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public String lerCsv() {
		String path = "csv/alunos.csv";
		List<Aluno> list = new ArrayList<Aluno>();
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			line = br.readLine();
			while (line != null) {
				String[] vect = line.split(",");
				String nome = vect[0];
				String aux = vect[1];
				aux = aux.replaceAll("^\"+|\"+$", "");
				Integer matricula = Integer.parseInt(aux);
				String cpf = vect[2];
				String data_nascimento = vect[3];
				String email = vect[4];
				
				Aluno aluno = new Aluno(nome, matricula, cpf, data_nascimento, email);
				list.add(aluno);
				line = br.readLine();
			}	
			
			String msg = "";
			for (Iterator<Aluno> iterator = list.iterator(); iterator.hasNext();) {
				Aluno al = (Aluno) iterator.next();
				msg += al.toString() + "\n";
			}
			return (msg);
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
			return null;
		}
	}
}
