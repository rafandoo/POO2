package com.classes.DTO;

public class Disciplina {

    public Disciplina() {
    }

    public Disciplina(int codigo, String nome) {
    	this.codigo = codigo;
    	this.nome = nome;
    }

    private int codigo;
    private String nome;

    public int getCodigo() {
    	return codigo;
    }

    public void setCodigo(int codigo) {
    	this.codigo = codigo;
    }

    public String getNome() {
    	return nome;
    }

    public void setNome(String nome) {
    	this.nome = nome;
    }

    @Override
    public String toString() {
    	return "Disciplina: {" +
    			"codigo='" + codigo + '\'' +
    			", nome='" + nome + '\'' +
    			'}';
    }
}