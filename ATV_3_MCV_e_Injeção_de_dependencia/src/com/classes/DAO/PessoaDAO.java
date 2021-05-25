package com.classes.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.classes.DTO.Pessoa;
import com.classes.conexao.Conexao;

public class PessoaDAO {

	// ATRIBUTOS
	final static String NOMEDOBANCO = "alunos";
	final static String NOMEDATABELA = "pessoa";
		
	// METODOS
	public static boolean insert(Pessoa pessoa) {	
		Connection conn = Conexao.getConexao();
		String sql = "INSERT INTO `"+ NOMEDOBANCO +"`.`"+ NOMEDATABELA +"` "
				+ "(`nome`) "
				+ "VALUES ('"+ pessoa.getNome() +"');";
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
		
	public static boolean delete(Pessoa pessoa) {
		if(pessoa == null || pessoa.getId() == null) {
			System.out.println("Não foi possivel apagar o registro!");
			return false;
		}
		Connection conn = Conexao.getConexao();
		String sql = "DELETE FROM `"+ NOMEDOBANCO +"`.`"+ NOMEDATABELA +"` "
				+ "WHERE (`idPessoa` = '"+ pessoa.getId() +"');";
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
		
	public static boolean update(Pessoa pessoa) {
		if(pessoa == null || pessoa.getId() == null) {
			System.out.println("Não foi possivel atualizar o registro!");
			return false;
		}
		Connection conn = Conexao.getConexao();
		String sql = "UPDATE `"+ NOMEDOBANCO +"`.`"+ NOMEDATABELA +"` "
				+ "SET `nome` = '"+ pessoa.getNome() +"' "
				+ "WHERE (`idPessoa` = '"+ pessoa.getId() +"');";
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
		
	public static boolean exist(Pessoa pessoa) {
		if(pessoa == null || pessoa.getNome() == null) {
			return false;
		}
		Connection conn = Conexao.getConexao();
		String sql = "SELECT * FROM "+ NOMEDOBANCO +"."+ NOMEDATABELA
				+ " where nome = "+ pessoa.getNome() +";";	
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
		
	public static Pessoa selectIdPessoa(Pessoa pessoa) {
		if(pessoa == null || pessoa.getId() == 0) {
			return null;
		}
		Connection conn = Conexao.getConexao();
		String sql = "SELECT * FROM "+ NOMEDOBANCO +"."+ NOMEDATABELA
				+ " WHERE idPessoa = " + pessoa.getId() + ";";
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			if(rs.next()) {
					Pessoa aux = new Pessoa();
					aux.setId(rs.getInt(1));
					aux.setNome(rs.getString(2));
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
		
	public static List<Pessoa> selectAll() {
		Connection conn = Conexao.getConexao();
	    String sql = "SELECT * FROM " + NOMEDOBANCO +"."+ NOMEDATABELA + ";";
	    try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			List<Pessoa> list_pessoa = buildList(rs);
			Conexao.close(conn, stmt, rs);
			return list_pessoa;
		} catch (SQLException e) {
	        System.err.println("Erro: " + e.toString());
	        e.printStackTrace();
	        return null;
		}
	}

	private static List<Pessoa> buildList(ResultSet rs) {
		List<Pessoa> list_pessoa = new ArrayList<Pessoa>();
		try {
			while(rs.next()) {
				Pessoa pessoa = new Pessoa();
				list_pessoa.add(pessoa);
			}
			return list_pessoa;
		} catch (SQLException e) {
	        System.err.println("Erro: " + e.toString());
	        e.printStackTrace();
	        return null;
		}
	}
}
