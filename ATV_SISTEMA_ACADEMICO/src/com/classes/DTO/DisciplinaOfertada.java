package com.classes.DTO;

import java.util.ArrayList;
import java.util.List;

public class DisciplinaOfertada {

    public DisciplinaOfertada() {
    }

    public DisciplinaOfertada(Disciplina disciplina) {
        this.disciplina = disciplina;
        this.professores = new ArrayList<>();
    }

    private Disciplina disciplina;
    private List<Professor> professores;

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        if (disciplina == null) {
            throw new IllegalArgumentException("A disciplina ofertada deve ter uma disciplina.");
        }
        this.disciplina = disciplina;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void addProfessor(Professor professor) {
        if (professores.size() >= 4) {
            throw new IllegalArgumentException("Não é possível adicionar mais professores a esta disciplina ofertada.");
        }
        this.professores.add(professor);
    }

    @Override
    public String toString() {
        return "Disciplina Ofertada: {" +
                "disciplina='" + disciplina + '\'' +
                ", professores=" + professores +
                '}';
    }
}
