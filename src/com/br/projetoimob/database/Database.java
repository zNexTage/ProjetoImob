/**
 * 
 */
package com.br.projetoimob.database;

import java.sql.*;

/**
 * @author Christian
 *
 */
public interface Database {
	//Conexao
	public Connection conectar(String conexaoDriver);
	
	//Desconectar
	public void desconectar(Connection conexao);
}
