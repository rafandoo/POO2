package com.classes.BO;

import com.classes.DTO.Avaliacao;
import com.classes.DTO.Matricula;
import com.classes.DTO.Professor;

public class AvaliacaoBO {

    public Avaliacao criar(String data, Professor professor) {
        Avaliacao avaliacao = new Avaliacao(data, professor);
        return avaliacao;
    }

    public void lancarNota(Avaliacao avaliacao, double nota, Matricula matricula) {
        avaliacao.setNota(nota);
        avaliacao.setMatricula(matricula);
    }

    public void mostrarAvaliacao(Avaliacao avaliacao) {
        System.out.println("Avaliação: " + avaliacao.getMatricula().getDisciplinaOfertada().getDisciplina().getNome());
        System.out.println("    Nota: " + avaliacao.getNota());
        System.out.println("    Data: " + avaliacao.getData());
        System.out.println("    Professor: " + avaliacao.getProfessor().getMatricula() + " - " + avaliacao.getProfessor().getNome() + " - " + avaliacao.getProfessor().getEmail());
        System.out.println("    Aluno: " + avaliacao.getMatricula().getAluno().getMatricula() + " - " + avaliacao.getMatricula().getAluno().getNome() + " - " + avaliacao.getMatricula().getAluno().getEmail());
    }
}
