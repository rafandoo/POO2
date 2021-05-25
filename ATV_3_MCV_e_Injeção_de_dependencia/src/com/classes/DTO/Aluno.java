package com.classes.DTO;

public class Aluno extends Pessoa {

	// CONSTRUTORES
	public Aluno() {
		
	}
	
	public Aluno(String nome) {
		super(nome);
	}
	
	public Aluno(String nome, int matricula, String cpf, String data_nascimento, String email) {
		super(nome);
		setMatricula(matricula);
		setCpf(cpf);
		setData_nascimento(data_nascimento);
		setEmail(email);
	}
	
	public Aluno(String nome, int matricula, String cpf, String data_nascimento, String email, Integer id) {
		super(nome);
		setMatricula(matricula);
		setCpf(cpf);
		setData_nascimento(data_nascimento);
		setEmail(email);
		setId(id);
	}
	
	// ATRIBUTOS
	private int matricula;
	private String cpf;
	private String data_nascimento;
	private String email;
	private Integer id;
	
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
		builder.append("ALUNO {");
		builder.append(super.toString());
		builder.append(", Matricula: ");
		builder.append(matricula);
		builder.append(", CPF: ");
		builder.append(cpf);
		builder.append(", Data de nascimento: ");
		builder.append(data_nascimento);
		builder.append(", Email: ");
		builder.append(email);
		builder.append("}");
		return builder.toString();
	}
	
	// HASH CODE E EQUALS
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null || getClass() != o.getClass()) return false;
		
		Aluno aluno = (Aluno) o;
		
		return id != null ? id.equals(aluno.id) : aluno.id == null;
	}
	
	@Override
	public int hashCode() {
		return id != null ? id.hashCode() : 0;
	}
}
