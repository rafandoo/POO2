package com.classes.BO;

import com.classes.DTO.Disciplina;
import com.classes.DTO.DisciplinaOfertada;
import com.classes.DTO.Professor;

public class DisciplinaOfertadaBO {

    public DisciplinaOfertada criar(Disciplina disciplina) {
        DisciplinaOfertada disciplinaOfertada = new DisciplinaOfertada(disciplina);
        return disciplinaOfertada;
    }

    public void adicionarProfessor(DisciplinaOfertada disciplinaOfertada, Professor professor) {
        disciplinaOfertada.addProfessor(professor);
    }

    public void mostrarProfessores(DisciplinaOfertada disciplinaOfertada) {
        System.out.println(
                "Disciplina: " +
                disciplinaOfertada.getDisciplina().getCodigo() +
                " - " +
                disciplinaOfertada.getDisciplina().getNome()
        );
        for (int i = 0; i < disciplinaOfertada.getProfessores().size(); i++) {
                    System.out.println("    Professor: " +
                            disciplinaOfertada.getProfessores().get(i).getMatricula() +
                            " - " +
                            disciplinaOfertada.getProfessores().get(i).getNome() +
                            " - " +
                            disciplinaOfertada.getProfessores().get(i).getEmail());
        }
    }
}