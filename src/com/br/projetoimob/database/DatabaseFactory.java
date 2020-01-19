/**
 * 
 */
package com.br.projetoimob.database;

import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.br.projetoimob.util.DatabaseType;
import java.sql.*;

/**
 * @author Christian
 *
 */

public class DatabaseFactory implements Database {

	private final static String SQL_SERVER = "";
	private final static String MYSQL = "";
	private final static String CLASS_NAME = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private final static String URL = "";
	private static final String USER = "";
	private static final String PASSWORD = "";
	Connection conexao;

	public DatabaseFactory getInstance() {
		return new DatabaseFactory();
	}

	// Escolhe o tipo de banco de dados
	public Connection getDatabase(DatabaseType.databaseType databaseType) {
		switch (databaseType) {
		case SQLSERVER: {
			return conectar(SQL_SERVER);
		}
		case MYSQL: {
			return conectar(MYSQL);
		}
		}

		return null;
	}

	/**
	 * Realiza a conexao com o banco de dados
	 */
	@Override
	public Connection conectar(String conexaoDriver) {
		try {
			Class.forName(CLASS_NAME);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			this.conexao = DriverManager.getConnection(URL);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "Não foi possivel conectar com o banco de dados");
			e.printStackTrace();
		}

		return this.conexao;
	}

	/**
	 * Realiza a desconexao do banco de dados
	 */
	@Override
	public void desconectar(Connection conexao) {

		try {
			conexao.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "Não foi possivel desconectar");
			e.printStackTrace();
		}
	}
}
