/**
 * 
 */
package com.br.projetoimob.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.br.projetoimob.database.Database;
import com.br.projetoimob.database.DatabaseFactory;
import com.br.projetoimob.domain.Estado;
import com.br.projetoimob.util.DatabaseType;
import com.br.projetoimob.util.DatabaseType.databaseType;

/**
 * @author Christian
 *
 */
public class EstadosDAO {
	
	public void inserir(Estado estados) 
	{
		StringBuilder sbComando;
		Connection conexao;
		DatabaseFactory dbFact;
		PreparedStatement pstComando;
		
		try {
			dbFact = new DatabaseFactory();
			sbComando = new StringBuilder();
			
			conexao = dbFact.getDatabase(databaseType.SQLSERVER);
			
			//Monta o comando
			sbComando.append(" INSERT INTO TBL_ESTADOS (ESTADO, SIGLA) ");
			sbComando.append(" VALUES(?,?) ");
			
			pstComando = conexao.prepareStatement(sbComando.toString());
			
			pstComando.setString(1, estados.getNomeEstado());
			pstComando.setString(2, estados.getSiglaEstado());
			
			pstComando.executeUpdate();
		}
		catch(SQLException sqlErr) 
		{
			
		}
	}
	
	/**
	 * Retorna todo os estados
	 * @return
	 */
	public List<Estado> selecionar()
	{
		DatabaseFactory dbFactory;
		Connection conexao;
		PreparedStatement pstComando;
		ResultSet rstEstados;
		String sComando;
		List<Estado> listEstado;
		Estado estado;
		
		dbFactory = new DatabaseFactory();
		
		//Realiza a conexao com o banco de dados
		conexao = dbFactory.getDatabase(DatabaseType.databaseType.SQLSERVER);
		
		//Monta o comando
		sComando = " SELECT * FROM TBL_ESTADOS ORDER BY ESTADO ASC";
		
		try {
			//Atribui o comando ao prepared statement
			pstComando = conexao.prepareStatement(sComando);
			
			//Executa a consulta
			rstEstados = pstComando.executeQuery();
			
			//Instancia a lista
			listEstado = new ArrayList<Estado>();
			
			//Faz um la�o pelos valores retornados 
			while(rstEstados.next()) {
				//Instancia o objeto
				estado = new Estado();
				
				//Recebe os valores retornados
				estado.setIdEstado(rstEstados.getInt("ID_ESTADO"));
				estado.setNomeEstado(rstEstados.getString("ESTADO"));
				estado.setSiglaEstado(rstEstados.getString("SIGLA"));
				
				//Atribui os valores na lista
				listEstado.add(estado);
			}
			
			//Retorna a lista
			return listEstado;
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally 
		{
			//Desconecta do banco de dados
			dbFactory.desconectar(conexao);
		}
		
		return null;
	}
	public void atualizar(Estado estado)
	{
		StringBuilder sbComandoBuilder;
		PreparedStatement pstComando;
		Connection conexao = null;
		DatabaseFactory dbFactory = null;
		
		try 
		{
			dbFactory = new DatabaseFactory();
			
			conexao = dbFactory.getDatabase(databaseType.SQLSERVER);
			
			sbComandoBuilder = new StringBuilder();
			
			sbComandoBuilder.append(" UPDATE TBL_ESTADOS ");
			sbComandoBuilder.append(" SET ESTADO = ?, SIGLA = ? ");
			sbComandoBuilder.append(" WHERE ID_ESTADO = ? ");
			
			pstComando = conexao.prepareStatement(sbComandoBuilder.toString());
			
			pstComando.setString(1, estado.getNomeEstado());
			pstComando.setString(2, estado.getSiglaEstado());
			pstComando.setInt(3, estado.getIdEstado());
			
			pstComando.executeUpdate();
			
		}catch(SQLException sqlErr) 
		{
			System.err.println(sqlErr.getMessage());
		} 
		finally 
		{
			dbFactory.desconectar(conexao);
		}
	}
	public void deletar(int iIdEstado) 
	{
		StringBuilder sbComandoBuilder;
		PreparedStatement pstComando;
		Connection conexao;
		DatabaseFactory dbFactory;
		
		dbFactory = new DatabaseFactory();
		
		conexao = dbFactory.getDatabase(databaseType.SQLSERVER);
		sbComandoBuilder = new StringBuilder();
		
		
		sbComandoBuilder.append(" DELETE FROM TBL_ESTADOS WHERE ID_ESTADO = ? ");
		
		try {
			pstComando = conexao.prepareStatement(sbComandoBuilder.toString());
			
			pstComando.setInt(1, iIdEstado);
			
			pstComando.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally 
		{
			dbFactory.desconectar(conexao);
		}
	}
	
}
