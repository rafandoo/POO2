package com.classes.DTO;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    public Curso() {
    }

    public Curso(String nome) {
    	this.nome = nome;
        this.fases = new ArrayList<>();
    }

    private String nome;
    private List<Fase> fases;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
    	this.nome = nome;
    }

    public List<Fase> getFases() {
        return fases;
    }

    public void addFase(Fase fase) {
    	this.fases.add(fase);
    }

    @Override
    public String toString() {
    	return "Curso: {" +
    			"nome='" + nome + '\'' +
    			", fases=" + fases +
                '}';
    }
}