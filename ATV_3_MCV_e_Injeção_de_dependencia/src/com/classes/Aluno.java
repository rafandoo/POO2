package com.classes;

public class Aluno {

	// CONSTRUTORES
	
	
	// ATRIBUTOS
	private int matricula;
	private String cpf;
	private String data_nascimento;
	private String email;
	
	// GETTERS E SETTERS
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		if (matricula > 0) {
			this.matricula = matricula;
		}
	}

	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		if (cpf.length() > 0) {
			this.cpf = cpf;
		}
	}

	public String getData_nascimento() {
		return data_nascimento;
	}
	public void setData_nascimento(String data_nascimento) {
		if (data_nascimento.length() > 0) {
			this.data_nascimento = data_nascimento;
		}
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if (email.length() > 0) {
			this.email = email;
		}
	}
	
	// SAIDA



}
