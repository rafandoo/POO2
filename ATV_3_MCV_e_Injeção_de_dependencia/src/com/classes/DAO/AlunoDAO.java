package com.classes.DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.classes.DTO.Aluno;
import com.classes.conexao.Conexao;

public class AlunoDAO {

	// ATRIBUTO
	final String NOMEDATABELA = "aluno";
	
	// METODOS

	public boolean inserir(Aluno aluno) {	
		Connection conn = Conexao.getConexao();
		String sql = "INSERT INTO `alunos`.`" + NOMEDATABELA + "` "
				+ "(`matricula`, `cpf`, `dataNascimento`, `email`) "
				+ "VALUES ('"+ aluno.getMatricula() +"', '"+ aluno.getCpf() +"', '"+ aluno.getData_nascimento() +"' , '"+ aluno.getEmail() +"');";
		try {
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			Conexao.close(conn, stmt);
			return true;
		} catch (SQLException e) {
            System.err.println("Erro: " + e.toString());
            e.printStackTrace();
            return false;
		}

	}
}
//INSERT INTO `alunos`.`aluno` (`matricula`, `cpf`, `dataNascimento`, `email`) VALUES ('1', '108', '05063', 'tw');

//UPDATE `alunos`.`aluno` SET `matricula` = '202006201' WHERE (`idAluno` = '1');
