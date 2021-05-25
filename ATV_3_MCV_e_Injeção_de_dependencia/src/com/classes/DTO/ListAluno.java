package com.classes.DTO;

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
	public boolean inserir(Aluno aluno) {
		return(lista.add(aluno));
	}
}
