package com.classes.DTO;

public class Frequencia {

    public Frequencia() {
    }

    public Frequencia(String data, Professor professor) {
        this.data = data;
        this.presente = false;
        this.professor = professor;
        this.matricula = null;
    }

    public Frequencia(String data, boolean presente, Professor professor, Matricula matricula) {
        this.data = data;
        this.presente = presente;
        this.professor = professor;
        this.matricula = matricula;
    }

    private String data;
    private boolean presente;
    private Professor professor;
    private Matricula matricula;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public boolean isPresente() {
        return presente;
    }

    public void setPresente(boolean presente) {
        this.presente = presente;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Matricula getMatricula() {
        return matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Frequencia: {" +
                "data='" + data + '\'' +
                ", presente='" + presente + '\'' +
                ", professor='" + professor + '\'' +
                ", matricula='" + matricula + '\'' +
                '}';
    }
}