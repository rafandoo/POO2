package com.classes;

import java.util.ArrayList;
import java.util.List;

public class ListAluno {

	// INSTANCIA
	List<Aluno> lista = new ArrayList<Aluno>();
	
	// GET
	public List<Aluno> getLista() {
		return lista;
	}
	
	// METODO
	public void inserir(Aluno aluno) {
		lista.add(aluno);
	}
}
