package com.classes.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.classes.DTO.Aluno;
import com.classes.conexao.Conexao;

public class AlunoDAO {

	// ATRIBUTOS
	final static String NOMEDOBANCO = "alunos";
	final static String NOMEDATABELA = "aluno";
	
	// METODOS
	public static boolean insert(Aluno aluno) {	
		Connection conn = Conexao.getConexao();
		String sql = "INSERT INTO `"+ NOMEDOBANCO +"`.`"+ NOMEDATABELA +"` "
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
	
	public static boolean delete(Aluno aluno) {
		if(aluno == null || aluno.getId() == null) {
			System.out.println("Não foi possivel apagar o registro!");
			return false;
		}
		Connection conn = Conexao.getConexao();
		String sql = "DELETE FROM `"+ NOMEDOBANCO +"`.`"+ NOMEDATABELA +"` "
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
	
	public static boolean update(Aluno aluno) {
		if(aluno == null || aluno.getId() == null) {
			System.out.println("Não foi possivel atualizar o registro!");
			return false;
		}
		Connection conn = Conexao.getConexao();
		String sql = "UPDATE `"+ NOMEDOBANCO +"`.`"+ NOMEDATABELA +"` "
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
	
	public static boolean exist(Aluno aluno) {
		if(aluno == null || aluno.getMatricula() == 0) {
			return false;
		}
		Connection conn = Conexao.getConexao();
		String sql = "SELECT * FROM "+ NOMEDOBANCO +"."+ NOMEDATABELA
				+ " where matricula = "+ aluno.getMatricula() +";";
		
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			if(rs.next()) {
					Conexao.close(conn, stmt, rs);
					return true;
			} else {
				Conexao.close(conn, stmt);
				rs.close();
				return false;
			}
		} catch (SQLException e) {
            System.err.println("Erro: " + e.toString());
            e.printStackTrace();
            return false;
		}
	}
	
	public static Aluno selectMatricula(Aluno aluno) {
		if(aluno == null || aluno.getMatricula() == 0) {
			return null;
		}
		Connection conn = Conexao.getConexao();
		String sql = "SELECT * FROM "+ NOMEDOBANCO +"."+ NOMEDATABELA
				+ " WHERE matricula = " + aluno.getMatricula() + ";";
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			if(rs.next()) {
					Aluno aux = new Aluno();
					aux.setMatricula(rs.getInt(2));
					aux.setCpf(rs.getString(3));
					aux.setData_nascimento(rs.getString(4));
					aux.setEmail(rs.getString(5));
					Conexao.close(conn, stmt, rs);
					return aux;
			} else {
				Conexao.close(conn, stmt);
				rs.close();
				return null;
			}
		} catch (SQLException e) {
            System.err.println("Erro: " + e.toString());
            e.printStackTrace();
            return null;
		}
	}
	
	public static List<Aluno> selectAll() {
		Connection conn = Conexao.getConexao();
        String sql = "SELECT * FROM " + NOMEDOBANCO +"."+ NOMEDATABELA + ";";
        try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			List<Aluno> list_aluno = buildList(rs);
			Conexao.close(conn, stmt, rs);
			return list_aluno;
		} catch (SQLException e) {
            System.err.println("Erro: " + e.toString());
            e.printStackTrace();
            return null;
		}
	}

	private static List<Aluno> buildList(ResultSet rs) {
		List<Aluno> list_aluno = new ArrayList<Aluno>();
		try {
			while(rs.next()) {
				Aluno aluno = new Aluno();
				aluno.setMatricula(rs.getInt(2));
				aluno.setCpf(rs.getString(3));
				aluno.setData_nascimento(rs.getString(4));
				aluno.setEmail(rs.getString(5));
				list_aluno.add(aluno);
			}
			return list_aluno;
		} catch (SQLException e) {
            System.err.println("Erro: " + e.toString());
            e.printStackTrace();
            return null;
		}
	}
		
}
