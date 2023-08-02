package com.classes.DTO;

public class Aluno extends Pessoa {

    public Aluno() {
    }

    public Aluno(int matricula, String nome, String email, Curso curso) {
        super(nome, email);
        this.matricula = matricula;
        this.curso = curso;
    }

    private int matricula;
    private Curso curso;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno: {" +
                "matricula=" + matricula +
                ", nome='" + getNome() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", curso=" + curso + '\'' +
                '}';
    }
}