/**
 * 
 */
package com.br.projetoimob.domain;

import java.sql.Date;

/**
 * @author Christian
 *
 */
public class Deposito extends Pagamento {
	
	//Atributos
	private int idDeposito;
	private int idCodigoDeposito;
	private int idCliente;
	private Date dataDeposito;
	private String codigoIdentificacao;
	private String tipoDeposito;
	private double valorDeposito;
	private String anotacoes;
	private String confirmacaoDeposito;
	private String depositoRealizado;
	/**
	 * @return the idDeposito
	 */
	public int getIdDeposito() {
		return idDeposito;
	}
	/**
	 * @param idDeposito the idDeposito to set
	 */
	public void setIdDeposito(int idDeposito) {
		this.idDeposito = idDeposito;
	}
	/**
	 * @return the idCodigoDeposito
	 */
	public int getIdCodigoDeposito() {
		return idCodigoDeposito;
	}
	/**
	 * @param idCodigoDeposito the idCodigoDeposito to set
	 */
	public void setIdCodigoDeposito(int idCodigoDeposito) {
		this.idCodigoDeposito = idCodigoDeposito;
	}
	/**
	 * @return the idCliente
	 */
	public int getIdCliente() {
		return idCliente;
	}
	/**
	 * @param idCliente the idCliente to set
	 */
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	/**
	 * @return the dataDeposito
	 */
	public Date getDataDeposito() {
		return dataDeposito;
	}
	/**
	 * @param dataDeposito the dataDeposito to set
	 */
	public void setDataDeposito(Date dataDeposito) {
		this.dataDeposito = dataDeposito;
	}
	/**
	 * @return the codigoIdentificacao
	 */
	public String getCodigoIdentificacao() {
		return codigoIdentificacao;
	}
	/**
	 * @param codigoIdentificacao the codigoIdentificacao to set
	 */
	public void setCodigoIdentificacao(String codigoIdentificacao) {
		this.codigoIdentificacao = codigoIdentificacao;
	}
	/**
	 * @return the tipoDeposito
	 */
	public String getTipoDeposito() {
		return tipoDeposito;
	}
	/**
	 * @param tipoDeposito the tipoDeposito to set
	 */
	public void setTipoDeposito(String tipoDeposito) {
		this.tipoDeposito = tipoDeposito;
	}
	/**
	 * @return the valorDeposito
	 */
	public double getValorDeposito() {
		return valorDeposito;
	}
	/**
	 * @param valorDeposito the valorDeposito to set
	 */
	public void setValorDeposito(double valorDeposito) {
		this.valorDeposito = valorDeposito;
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
	/**
	 * @return the confirmacaoDeposito
	 */
	public String getConfirmacaoDeposito() {
		return confirmacaoDeposito;
	}
	/**
	 * @param confirmacaoDeposito the confirmacaoDeposito to set
	 */
	public void setConfirmacaoDeposito(String confirmacaoDeposito) {
		this.confirmacaoDeposito = confirmacaoDeposito;
	}
	/**
	 * @return the depositoRealizado
	 */
	public String getDepositoRealizado() {
		return depositoRealizado;
	}
	/**
	 * @param depositoRealizado the depositoRealizado to set
	 */
	public void setDepositoRealizado(String depositoRealizado) {
		this.depositoRealizado = depositoRealizado;
	}
	
	
}
