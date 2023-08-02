package com.classes.BO;

import com.classes.DTO.Aluno;
import com.classes.DTO.Curso;
import com.classes.DTO.DisciplinaOfertada;
import com.classes.DTO.Matricula;
import com.classes.service.MatriculaService;

import java.util.List;

public class AlunoBO {

    public Aluno criar(int matricula, String nome, String email, Curso curso) {
        Aluno aluno = new Aluno(matricula, nome, email, curso);
        return aluno;
    }

    public void getMatriculasDoAluno(Aluno aluno, MatriculaService ms) {
        List<Matricula> matriculasDoAluno = ms.getMatriculasDoAluno(aluno);

        System.out.println("Disciplinas matriculadas do aluno " + aluno.getNome() + ":");
        for (Matricula matricula : matriculasDoAluno) {
            DisciplinaOfertada disciplinaOfertada = matricula.getDisciplinaOfertada();
            System.out.println(
                    "   " + disciplinaOfertada.getDisciplina().getNome() +
                    " (Código: " + disciplinaOfertada.getDisciplina().getCodigo() + ")"
            );
        }
    }

    public void getCursoDoAluno(Aluno aluno) {
        System.out.print("Curso do aluno " + aluno.getNome() + ": ");
        System.out.println(aluno.getCurso().getNome());
    }
}
