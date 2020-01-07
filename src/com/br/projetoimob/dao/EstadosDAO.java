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

/**
 * @author Christian
 *
 */
public class EstadosDAO {
	
	public void inserir(Estado estados) 
	{
		
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
		
		sComando = " SELECT * FROM TBL_ESTADOS ";
		
		try {
			pstComando = conexao.prepareStatement(sComando);
			
			rstEstados = pstComando.executeQuery();
			
			listEstado = new ArrayList<Estado>();
			
			while(rstEstados.next()) {
				estado = new Estado();
				
				estado.setIdEstado(rstEstados.getInt("ID_ESTADO"));
				estado.setNomeEstado(rstEstados.getString("ESTADO"));
				estado.setSiglaEstado(rstEstados.getString("SIGLA"));
				
				listEstado.add(estado);
			}
			
			return listEstado;
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally 
		{
			dbFactory.desconectar(conexao);
		}
		
		return null;
	}
	public void atualizar() {}
	public void deletar(int iIdEstado) {}
	
}
