package com.persistencias;

import java.util.List;
import com.classes.Aluno;

public interface Persistencia {

	public boolean gerarArquivo(List<Aluno> aluno);
	
}
