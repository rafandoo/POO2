package com.classes.BO;

import java.util.List;

import com.classes.DAO.AlunoDAO;
import com.classes.DTO.Aluno;

public class AlunoBO {

	public boolean inserir(Aluno aluno) {
		try {
			if(existe(aluno) != true) {
				AlunoDAO.insert(aluno);
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
	
	public Aluno procurarMatricula(Aluno aluno) {
		return AlunoDAO.selectMatricula(aluno);
	}

	public List<Aluno> mostrarTodos() {
		return AlunoDAO.selectAll();
	}	
}
