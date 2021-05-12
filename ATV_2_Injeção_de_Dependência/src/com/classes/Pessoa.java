package com.classes;

public class Pessoa {

	// CONTRUTORES
	public Pessoa() {

	}

	public Pessoa(String nome) {
		setNome(nome);
	}

	// ATRIBUTOS
	private String nome;

	// GETTERS E SETTERS
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if (nome.length() > 0) {
			this.nome = nome;
		}
	}

	// TO_STRING
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [nome=");
		builder.append(nome);
		builder.append("]");
		return builder.toString();
	}
}