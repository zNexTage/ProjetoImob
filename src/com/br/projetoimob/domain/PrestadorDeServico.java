/**
 * 
 */
package com.br.projetoimob.domain;

import java.sql.Date;

/**
 * @author Christian
 *
 */
public class PrestadorDeServico extends PessoaJuridica{
	//Atributos
	private int idPrestador;
	private int idCodigoPrestador;
	private int idCodigoServico;
	private String tipoServicoPrestado;
	private Date dataInicial;
	private Date dataFinal;
	private String anotacoes;
	
	//Getters e Setters
	/**
	 * @return the idPrestador
	 */
	public int getIdPrestador() {
		return idPrestador;
	}
	/**
	 * @param idPrestador the idPrestador to set
	 */
	public void setIdPrestador(int idPrestador) {
		this.idPrestador = idPrestador;
	}
	/**
	 * @return the idCodigoPrestador
	 */
	public int getIdCodigoPrestador() {
		return idCodigoPrestador;
	}
	/**
	 * @param idCodigoPrestador the idCodigoPrestador to set
	 */
	public void setIdCodigoPrestador(int idCodigoPrestador) {
		this.idCodigoPrestador = idCodigoPrestador;
	}
	/**
	 * @return the idCodigoServico
	 */
	public int getIdCodigoServico() {
		return idCodigoServico;
	}
	/**
	 * @param idCodigoServico the idCodigoServico to set
	 */
	public void setIdCodigoServico(int idCodigoServico) {
		this.idCodigoServico = idCodigoServico;
	}
	/**
	 * @return the tipoServicoPrestado
	 */
	public String getTipoServicoPrestado() {
		return tipoServicoPrestado;
	}
	/**
	 * @param tipoServicoPrestado the tipoServicoPrestado to set
	 */
	public void setTipoServicoPrestado(String tipoServicoPrestado) {
		this.tipoServicoPrestado = tipoServicoPrestado;
	}
	/**
	 * @return the dataInicial
	 */
	public Date getDataInicial() {
		return dataInicial;
	}
	/**
	 * @param dataInicial the dataInicial to set
	 */
	public void setDataInicial(Date dataInicial) {
		this.dataInicial = dataInicial;
	}
	/**
	 * @return the dataFinal
	 */
	public Date getDataFinal() {
		return dataFinal;
	}
	/**
	 * @param dataFinal the dataFinal to set
	 */
	public void setDataFinal(Date dataFinal) {
		this.dataFinal = dataFinal;
	}
	/**
	 * @return the anotacoes
	 */
	public String getAnotacoes() {
		return anotacoes;
	}
	/**
	 * @param anotacoes the anotacoes to set
	 */
	public void setAnotacoes(String anotacoes) {
		this.anotacoes = anotacoes;
	}
	
	
}
