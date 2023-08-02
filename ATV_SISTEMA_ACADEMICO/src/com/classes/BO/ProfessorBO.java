package com.classes.BO;

import com.classes.DTO.Professor;

public class ProfessorBO {

    public Professor criar(int matricula, String nome, String email) {
        Professor professor = new Professor(matricula, nome, email);
        return professor;
    }
}
