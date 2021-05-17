package com.persistencias;

import java.util.List;
import com.classes.Aluno;

public class Controle_persistencia {

	// ATRIBUTO
	protected Persistencia persistencia;
	
	// CONSTRUTOR
	public Controle_persistencia(Persistencia persistencia) {
		this.persistencia = persistencia;
	}
	
	// METODO
	public boolean gerarPersistencia(List<Aluno> aluno) {
		return this.persistencia.gerarArquivo(aluno);
	}
}
