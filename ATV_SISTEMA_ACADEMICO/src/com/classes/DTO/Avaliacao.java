package com.classes.DTO;

public class Avaliacao {

    public Avaliacao() {
    }

    public Avaliacao(String data, Professor professor) {
        this.data = data;
        this.nota = 0;
        this.professor = professor;
        this.matricula = null;
    }

    public Avaliacao(String data, double nota, Professor professor, Matricula matricula) {
        this.data = data;
        this.nota = nota;
        this.professor = professor;
        this.matricula = matricula;
    }

    private String data;
    private double nota;
    private Professor professor;
    private Matricula matricula;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
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
        return "Avaliacao: {" +
                "data=" + data +
                ", nota=" + nota +
                ", professor=" + professor +
                ", matricula=" + matricula +
                '}';
    }
}