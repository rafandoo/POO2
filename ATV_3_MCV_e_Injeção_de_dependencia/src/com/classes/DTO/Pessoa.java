package com.classes.DTO;

public class Pessoa {
	
	// CONSTRUTORES
	public Pessoa() {
		
	}
	
	public Pessoa(String nome) {
		setNome(nome);
	}
	
	// ATRIBUTO
	private String nome;
	
	// GET E SET
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome.length() > 0) {
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
