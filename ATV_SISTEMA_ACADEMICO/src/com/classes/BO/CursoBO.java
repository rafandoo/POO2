package com.classes.BO;

import com.classes.DTO.Curso;
import com.classes.DTO.Fase;

public class CursoBO {

    public Curso criar(String nome) {
        Curso curso = new Curso(nome);
        return curso;
    }

    public void adicionarFases(Curso curso, Fase fase) {
        curso.addFase(fase);
    }

    public void estruturaCurso(Curso curso) {
        System.out.println("Curso: " + curso.getNome());
    	for (Fase fase : curso.getFases()) {
    		System.out.println("Fase: " + fase.getCodigo());
    		for (int i = 0; i < fase.getDisciplinas().size(); i++) {
    			System.out.println("    Disciplina: " +
                        fase.getDisciplinas().get(i).getDisciplina().getCodigo() +
                        " - " +
                        fase.getDisciplinas().get(i).getDisciplina().getNome());
    		}
    	}
    }
}
