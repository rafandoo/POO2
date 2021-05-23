package com.classes.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.classes.DTO.Aluno;
import com.classes.conexao.Conexao;

import com.classes.conexao.Conexao;

public class PessoaDAO {

	// ATRIBUTO
	final String NOMEDATABELA = "aluno";
	
	// METODOS

	public boolean inserir(Aluno aluno) {		
		try {
			Connection conn = Conexao.getConexao();
			String sql = "INSERT INTO `alunos`.`" + NOMEDATABELA + "` "
					+ "(`matricula`, `cpf`, `dataNascimento`, `email`) "
					+ "VALUES (?)";
			Statement stmt = conn.prepareStatement(sql);
			
		} catch (SQLException e) {
            System.err.println("Erro: " + e.toString());
            e.printStackTrace();
            return false;
		}

	}
}
//INSERT INTO `alunos`.`aluno` (`matricula`, `cpf`, `dataNascimento`, `email`) VALUES ('1', '108', '05063', 'tw');