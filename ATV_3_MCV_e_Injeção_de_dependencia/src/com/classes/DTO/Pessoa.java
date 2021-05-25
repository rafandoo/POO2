package com.classes.DTO;

public class Pessoa {
	
	// CONSTRUTORES
	public Pessoa() {
		
	}
	
	public Pessoa(String nome) {
		setNome(nome);
	}
	
	public Pessoa(String nome, Integer id) {
		setNome(nome);
		setId(id);
	}
	
	// ATRIBUTOS
	private String nome;
	private Integer id;
	
	// GETTERS E SETTERS
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome.length() > 0) {
			this.nome = nome;
		}
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	// SAIDA
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Nome: ");
		builder.append(nome);
		return builder.toString();
	}
	
	// HASH CODE E EQUALS
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null || getClass() != o.getClass()) return false;
		
		Pessoa pessoa = (Aluno) o;
		
		return id != null ? id.equals(pessoa.id) : pessoa.id == null;
	}
	
	@Override
	public int hashCode() {
		return id != null ? id.hashCode() : 0;
	}
}
