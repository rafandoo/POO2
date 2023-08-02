package com.classes.service;
import com.classes.DTO.Aluno;
import com.classes.DTO.Matricula;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MatriculaService {
    private Map<Aluno, List<Matricula>> matriculasPorAluno = new HashMap<>();

    // Método para adicionar uma matrícula
    public void addMatricula(Matricula matricula) {
        Aluno aluno = matricula.getAluno();
        matriculasPorAluno.computeIfAbsent(aluno, k -> new ArrayList<>()).add(matricula);
    }

    // Método para obter as matrículas do aluno
    public List<Matricula> getMatriculasDoAluno(Aluno aluno) {
        return matriculasPorAluno.getOrDefault(aluno, new ArrayList<>());
    }
}
