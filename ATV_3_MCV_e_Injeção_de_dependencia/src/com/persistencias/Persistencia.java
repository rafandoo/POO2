package com.persistencias;

import java.util.List;

import com.classes.DTO.Aluno;

public interface Persistencia {
	
	public boolean gerarPersistencia(List<Aluno> aluno);

}
