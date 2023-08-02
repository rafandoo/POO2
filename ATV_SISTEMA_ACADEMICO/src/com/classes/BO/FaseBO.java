package com.classes.BO;

import com.classes.DTO.DisciplinaOfertada;
import com.classes.DTO.Fase;

public class FaseBO {

    public Fase criar(int codigo) {
        Fase fase = new Fase(codigo);
        return fase;
    }

    public void adicionarDisciplina(Fase fase, DisciplinaOfertada disciplinaOfertada) {
    	fase.addDisciplinaOfertada(disciplinaOfertada);
    }

    public void estruturaFase(Fase fase) {
    	System.out.println("Fase: " + fase.getCodigo());
    	for (int i = 0; i < fase.getDisciplinas().size(); i++) {
    		System.out.println("    Disciplina: " +
                    fase.getDisciplinas().get(i).getDisciplina().getCodigo() +
                    " - " +
                    fase.getDisciplinas().get(i).getDisciplina().getNome());
    	}
    }
}
