package com.classes.BO;

import com.classes.DTO.Aluno;
import com.classes.DTO.DisciplinaOfertada;
import com.classes.DTO.Matricula;

public class MatriculaBO {

    public Matricula criar(Aluno aluno, DisciplinaOfertada disciplinaOfertada) {
        Matricula matricula = new Matricula(aluno, disciplinaOfertada);
        return matricula;
    }

public void mostrar(Matricula matricula) {
        System.out.println(
                "Matricula: {" +
                "aluno=" + matricula.getAluno() +
                ", disciplinaOfertada=" + matricula.getDisciplinaOfertada() +
                '}'
        );
    }
}
