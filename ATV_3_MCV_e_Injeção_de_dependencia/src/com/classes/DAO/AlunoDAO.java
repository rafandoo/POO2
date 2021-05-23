package com.classes.DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.classes.DTO.Aluno;
import com.classes.conexao.Conexao;

public class AlunoDAO {

	// ATRIBUTO
	final static String NOMEDATABELA = "aluno";
	
	// METODOS
	public static boolean inserir(Aluno aluno) {	
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
	
	public static boolean excluir(Aluno aluno) {
		if(aluno == null || aluno.getId() == null) {
			System.out.println("Não foi possivel apagar o registro!");
			return false;
		}
		Connection conn = Conexao.getConexao();
		String sql = "DELETE FROM `alunos`.`"+ NOMEDATABELA +"` "
				+ "WHERE (`idAluno` = '"+ aluno.getId() +"');";
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
	
	public static boolean alterar(Aluno aluno) {
		Connection conn = Conexao.getConexao();
		String sql = "UPDATE `alunos`.`" + NOMEDATABELA + "` "
				+ "SET `matricula` = '"+ aluno.getMatricula() +"', "
					+ "`cpf` = '"+ aluno.getCpf() +"', "
					+ "`dataNascimento` = '"+ aluno.getData_nascimento() +"', "
					+ "`email` = '"+ aluno.getEmail() +"' "
					+ "WHERE (`idAluno` = '"+ aluno.getId() +"');";
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