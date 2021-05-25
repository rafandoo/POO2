package com.classes.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexao {

	// ATRIBUTO
	final static String NOME_DO_BANCO = "alunos";
	
	// METODOS
	public static Connection getConexao() {
		String url = "jdbc:mysql://localhost:3306/" + NOME_DO_BANCO;
		String user = "root";
		String password = "root";
		
		try {
			/*Connection connection = DriverManager.getConnection(url, user, password);
			System.out.println(connection);
			return connection;*/
			return DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			System.err.println("Erro: " + e.toString());
			e.printStackTrace();
			return null;
		}
	}
	
	public static void close(Connection conn) {
		try {
			if(conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			System.err.println("Erro: " + e.toString());
			e.printStackTrace();
		}
	}
	
	public static void close(Connection conn, Statement stmt) {
		close(conn);
		try {
			if(stmt != null) {
				stmt.close();
			}
		} catch (SQLException e) {
			System.err.println("Erro: " + e.toString());
			e.printStackTrace();
		}
	}
	
	public static void close(Connection conn, Statement stmt, ResultSet rs) {
		close(conn, stmt);
		try {
			if(rs != null) {
				rs.close();
			}
		} catch (SQLException e) {
			System.err.println("Erro: " + e.toString());
			e.printStackTrace();
		}
	}
	
}
