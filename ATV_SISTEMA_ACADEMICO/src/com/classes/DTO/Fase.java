package com.classes.DTO;

import java.util.ArrayList;
import java.util.List;

public class Fase {

    public Fase() {
    }

    public Fase(int codigo) {
    	this.codigo = codigo;
    	this.disciplinasOfertadas = new ArrayList<>();
    }

    private int codigo;
    private List<DisciplinaOfertada> disciplinasOfertadas;

    public int getCodigo() {
    	return codigo;
    }

    public void setCodigo(int codigo) {
    	this.codigo = codigo;
    }

    public List<DisciplinaOfertada> getDisciplinas() {
    	return disciplinasOfertadas;
    }

    public void addDisciplinaOfertada(DisciplinaOfertada disciplinaOfertada) {
    	this.disciplinasOfertadas.add(disciplinaOfertada);
    }

    @Override
    public String toString() {
    	return "Fase: {" +
    			"codigo=" + codigo +
    			", disciplinas ofertadas=" + disciplinasOfertadas +
                '}';
    }
}