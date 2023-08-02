package com.classes.BO;

import com.classes.DTO.Frequencia;
import com.classes.DTO.Matricula;
import com.classes.DTO.Professor;

public class FrequenciaBO {

    public Frequencia criar(String data, Professor professor) {
        Frequencia frequencia = new Frequencia(data, professor);
        return frequencia;
    }

    public void adicionarFrequencia(Frequencia frequencia, boolean presente, Matricula matricula) {
        frequencia.setPresente(presente);
        frequencia.setMatricula(matricula);
    }

    public void mostrarFrequencia(Frequencia frequencia) {
        System.out.println("Presença: " + frequencia.getMatricula().getDisciplinaOfertada().getDisciplina().getNome());
        System.out.println("    Data: " + frequencia.getData());
        System.out.println("    Presente: " + frequencia.isPresente());
        System.out.println("    Professor: " + frequencia.getProfessor().getMatricula() + " - " + frequencia.getProfessor().getNome() + " - " + frequencia.getProfessor().getEmail());
        System.out.println("    Aluno: " + frequencia.getMatricula().getAluno().getMatricula() + " - " + frequencia.getMatricula().getAluno().getNome() + " - " + frequencia.getMatricula().getAluno().getEmail());
    }
}
