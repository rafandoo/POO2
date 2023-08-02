package com.classes.DTO;

public class Matricula {

    public Matricula() {
    }

    public Matricula(Aluno aluno, DisciplinaOfertada disciplinaOfertada) {
    	this.aluno = aluno;
    	this.disciplinaOfertada = disciplinaOfertada;
    }

    private Aluno aluno;
    private DisciplinaOfertada disciplinaOfertada;

    public Aluno getAluno() {
    	return aluno;
    }

    public void setAluno(Aluno aluno) {
    	this.aluno = aluno;
    }

    public DisciplinaOfertada getDisciplinaOfertada() {
    	return disciplinaOfertada;
    }

    public void setDisciplinaOfertada(DisciplinaOfertada disciplinaOfertada) {
    	this.disciplinaOfertada = disciplinaOfertada;
    }

    @Override
    public String toString() {
    	return "Matricula: {" +
    			"aluno=" + aluno +
    			", disciplinaOfertada=" + disciplinaOfertada +
    			'}';
    }
}