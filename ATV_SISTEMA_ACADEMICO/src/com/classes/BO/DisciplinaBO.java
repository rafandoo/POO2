package com.classes.BO;

import com.classes.DTO.Disciplina;

public class DisciplinaBO {

    public Disciplina criar(int codigo, String nome) {
        Disciplina disciplina = new Disciplina(codigo, nome);
        return disciplina;
    }
}
