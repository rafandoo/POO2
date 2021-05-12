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

	// SAIDA
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Nome: ");
		builder.append(nome);
		return builder.toString();
	}
}