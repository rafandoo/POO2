package com.classes.DTO;

public class Pessoa {

    public Pessoa() {
    }

    public Pessoa(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    private String nome;

    private String email;

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa: {" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}