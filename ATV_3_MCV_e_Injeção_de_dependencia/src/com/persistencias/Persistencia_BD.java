package com.persistencias;

import java.util.List;

import com.classes.BO.AlunoBO;
import com.classes.DTO.Aluno;

public class Persistencia_BD implements Persistencia {

	@Override
	public boolean gerarPersistencia(List<Aluno> aluno) {
		try {
			AlunoBO aBO = new AlunoBO();
			for(int i = 0; i < aluno.size(); i++) {
				aBO.inserir(aluno.get(i));
			}
			return true;
		} catch (Exception e) {
            System.err.println("Erro: " + e.toString());
            e.printStackTrace();
			return false;
		}
	}
}
