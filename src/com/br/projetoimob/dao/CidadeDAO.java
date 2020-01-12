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

import com.br.projetoimob.database.DatabaseFactory;
import com.br.projetoimob.domain.Cidade;
import com.br.projetoimob.util.DatabaseType.databaseType;

/**
 * @author Christian
 *
 */
public class CidadeDAO {
	
	/**
	 * Insere uma nova cidade no banco de dados
	 * @param cidade
	 */
	public void inserir(Cidade cidade) {
		DatabaseFactory dbFactory = null;
		Connection conexao = null;
		PreparedStatement pstComando;
		StringBuilder sbComando;
		
		try 
		{
			//MOnta o comando
			sbComando = new StringBuilder();
			sbComando.append(" INSERT INTO TBL_CIDADES (NOME_CIDADE, FK_ESTADO) ");
			sbComando.append(" VALUES ( ? , ? ) ");
			
			//Instancia o banco de dados
			dbFactory = new DatabaseFactory();
			
			//Define a conexao com o banco de dados
			conexao = dbFactory.getDatabase(databaseType.SQLSERVER);
			
			//Define o comando e os parametros da consulta
			pstComando = conexao.prepareStatement(sbComando.toString());
			pstComando.setString(1, cidade.getNomeCidades());
			pstComando.setInt(2, cidade.getIdEstado());
			
			//Executa o comando
			pstComando.executeUpdate();
		}
		catch(SQLException sqlErr)
		{
			System.err.println(sqlErr.getMessage());
		} 
		finally 
		{
			//Finaliza a conexao com banco de dados
			dbFactory.desconectar(conexao);
		}
	}

	/**
	 * Retorna todas as cidades
	 * @return
	 */
	public List<Cidade> selecionar() {
		Connection conexao = null;
		StringBuilder sbComando = null;
		DatabaseFactory dbFactory = null;
		PreparedStatement pstComando = null;
		ResultSet rstCidades = null;
		Cidade cidade = null;
		List<Cidade> listCidade = null;
		
		//Instancia o objeto
		dbFactory = new DatabaseFactory();
		
		//Define a conexao com o banco de dados
		conexao = dbFactory.getDatabase(databaseType.SQLSERVER);
		
		//MOnta o comando
		sbComando = new StringBuilder();
		sbComando.append(" SELECT CIDADE.ID_CIDADE, CIDADE.NOME_CIDADE, ESTADOS.ID_ESTADO, ESTADOS.ESTADO, ESTADOS.SIGLA FROM TBL_CIDADES CIDADE INNER JOIN TBL_ESTADOS ESTADOS ON CIDADE.FK_ESTADO = ESTADOS.ID_ESTADO ");
		
		try {
			//Define o comando a ser executado
			pstComando = conexao.prepareStatement(sbComando.toString());
			
			//Executa o comando e recebe os resultados da consulta
			rstCidades = pstComando.executeQuery();
			
			//Instancia a lista para poder atribuir as cidades
			listCidade = new ArrayList<Cidade>();
			
			//Executa um laço pelos resultados retornados
			while(rstCidades.next()) 
			{
				//Instancia o objeto cidades
				cidade = new Cidade();
				
				//Atribui os valores retornados no objeto Cidade
				cidade.setIdCidade(rstCidades.getInt("ID_CIDADE"));
				cidade.setIdEstado(rstCidades.getInt("ID_ESTADO"));
				cidade.setNomeCidades(rstCidades.getString("NOME_CIDADE"));
				cidade.setNomeEstado(rstCidades.getString("ESTADO"));
				cidade.setSiglaEstado(rstCidades.getString("SIGLA"));
				
				//Adiciona na lista
				listCidade.add(cidade);
			}
			
			//Retorna a lista com as cidades
			return listCidade;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally 
		{
			//Desconecta do banco de dados
			dbFactory.desconectar(conexao);
		}
		
		return listCidade;
	}
	
	/**
	 * Atualiza a cidade no banco de dados
	 * @param cidade
	 */
	public void atualizar(Cidade cidade) 
	{
		Connection conexao = null;
		StringBuilder sbComandoBuilder = null;
		PreparedStatement pstComando;
		DatabaseFactory dbFactory = null;
		
		try
		{
			//Instancia o objeto
			dbFactory = new DatabaseFactory();
			
			//Define a conexao com o banco de dados
			conexao = dbFactory.getDatabase(databaseType.SQLSERVER);
			
			//MOnta o comando
			sbComandoBuilder = new StringBuilder();
			sbComandoBuilder.append(" UPDATE TBL_CIDADES ");
			sbComandoBuilder.append(" SET NOME_CIDADE = ?, FK_ESTADO = ? ");
			sbComandoBuilder.append(" WHERE ID_CIDADE = ? ");
			
			//Define a consulta a ser executada
			pstComando = conexao.prepareStatement(sbComandoBuilder.toString());
			
			//Define os valores dos parametros da consulta
			pstComando.setString(1, cidade.getNomeCidades());
			pstComando.setInt(2, cidade.getIdEstado());
			pstComando.setInt(3, cidade.getIdCidade());
			
			//Executa o comando
			pstComando.executeUpdate();
		}
		catch(SQLException sqlErr)
		{
			System.err.println(sqlErr.getMessage());
		} 
		finally 
		{
			//Desconecta do banco de dados
			dbFactory.desconectar(conexao);
		}
	}

	/**
	 * Deleta a cidade do banco de dados
	 * @param iCodCidade
	 */
	public void deletar(int iCodCidade) 
	{
		Connection conexao = null;
		StringBuilder sbComando = null;
		DatabaseFactory dbFactory = null;
		PreparedStatement pstComando = null;
		
		try 
		{
			//Monta o comando
			sbComando = new StringBuilder();
			sbComando.append(" DELETE FROM TBL_CIDADES ");
			sbComando.append(" WHERE ID_CIDADE = ? ");
			
			//Instancia o objeto
			dbFactory = new DatabaseFactory();
			
			//Define a conexao com o banco de dados
			conexao = dbFactory.getDatabase(databaseType.SQLSERVER);
			
			//Estabele o comando a ser executado
			pstComando = conexao.prepareStatement(sbComando.toString());
			
			//Define os parametros
			pstComando.setInt(1, iCodCidade);
			
			//Executa a consulta
			pstComando.executeUpdate();
		}
		catch(SQLException sqlErr) 
		{
			System.err.println(sqlErr.getMessage());
		} finally 
		{
			//Finaliza a conexao com o banco
			dbFactory.desconectar(conexao);
		}
	}
}
