package com.classes.BO;

import java.util.List;

import com.classes.DAO.AlunoDAO;
import com.classes.DTO.Aluno;
import com.persistencias.Persistencia;

public class AlunoBO implements Persistencia{

	public boolean gerarArquivo(List<Aluno> aluno) {
		try {
			for(int i = 0; i < aluno.size(); i++) {
				if(existe(aluno.get(i)) != true) {
					AlunoDAO.insert(aluno.get(i));
				}
			}
			return true;
		} catch (Exception e) {
            System.err.println("Erro: " + e.toString());
            e.printStackTrace();
			return false;
		}
	}
	
	public boolean alterar(Aluno aluno) {
		return AlunoDAO.update(aluno);
	}
	
	public boolean excluir(Aluno aluno) {
		return AlunoDAO.delete(aluno);
	}
	
	public boolean existe(Aluno aluno) {
		return AlunoDAO.exist(aluno);
	}

	
}
