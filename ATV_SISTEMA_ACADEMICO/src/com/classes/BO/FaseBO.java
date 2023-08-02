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
}
