package com.classes.DTO;

public class Professor extends Pessoa {

    public Professor() {
    }

    public Professor(int matricula, String nome, String email) {
        super(nome, email);
        this.matricula = matricula;
    }

    private int matricula;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Professor: {" +
                "matricula=" + matricula +
                ", nome='" + getNome() + '\'' +
                ", email='" + getEmail() + '\'' +
                '}';
    }

}