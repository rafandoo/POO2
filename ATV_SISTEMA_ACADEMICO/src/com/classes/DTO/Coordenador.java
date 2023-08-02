package com.classes.DTO;

public class Coordenador {

    public Coordenador() {
    }

    public Coordenador(Professor professor, Curso curso) {
        this.professor = professor;
        this.curso = curso;
    }

    private Professor professor;
    private Curso curso;

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Coodenador: {" +
                "professor='" + professor + '\'' +
                ", curso='" + curso + '\'' +
            '}';
    }
}