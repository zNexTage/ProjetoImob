/**
 * 
 */
package com.br.projetoimob.domain;

import java.sql.Date;

/**
 * @author Christian
 *
 */
public class Cheque extends Pagamento {
	
	//Atributos
	private int idCheque;
	private int idCodigoCheque;
	private String banco;
	private int idCliente;
	private String numeroCheque;
	private String referentePagamento;
	private String anotacoes;
	private int aVista;
	private String parcelado;
	private int quantidadeVezes;
	private String compensado;
	private Date dataCheque;
	private Date dataRecebimento;
	private Date dataAberturaConta;
	/**
	 * @return the idCheque
	 */
	public int getIdCheque() {
		return idCheque;
	}
	/**
	 * @param idCheque the idCheque to set
	 */
	public void setIdCheque(int idCheque) {
		this.idCheque = idCheque;
	}
	/**
	 * @return the idCodigoCheque
	 */
	public int getIdCodigoCheque() {
		return idCodigoCheque;
	}
	/**
	 * @param idCodigoCheque the idCodigoCheque to set
	 */
	public void setIdCodigoCheque(int idCodigoCheque) {
		this.idCodigoCheque = idCodigoCheque;
	}
	/**
	 * @return the banco
	 */
	public String getBanco() {
		return banco;
	}
	/**
	 * @param banco the banco to set
	 */
	public void setBanco(String banco) {
		this.banco = banco;
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
	 * @return the numeroCheque
	 */
	public String getNumeroCheque() {
		return numeroCheque;
	}
	/**
	 * @param numeroCheque the numeroCheque to set
	 */
	public void setNumeroCheque(String numeroCheque) {
		this.numeroCheque = numeroCheque;
	}
	/**
	 * @return the referentePagamento
	 */
	public String getReferentePagamento() {
		return referentePagamento;
	}
	/**
	 * @param referentePagamento the referentePagamento to set
	 */
	public void setReferentePagamento(String referentePagamento) {
		this.referentePagamento = referentePagamento;
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
	 * @return the aVista
	 */
	public int getaVista() {
		return aVista;
	}
	/**
	 * @param aVista the aVista to set
	 */
	public void setaVista(int aVista) {
		this.aVista = aVista;
	}
	/**
	 * @return the parcelado
	 */
	public String getParcelado() {
		return parcelado;
	}
	/**
	 * @param parcelado the parcelado to set
	 */
	public void setParcelado(String parcelado) {
		this.parcelado = parcelado;
	}
	/**
	 * @return the quantidadeVezes
	 */
	public int getQuantidadeVezes() {
		return quantidadeVezes;
	}
	/**
	 * @param quantidadeVezes the quantidadeVezes to set
	 */
	public void setQuantidadeVezes(int quantidadeVezes) {
		this.quantidadeVezes = quantidadeVezes;
	}
	/**
	 * @return the compensado
	 */
	public String getCompensado() {
		return compensado;
	}
	/**
	 * @param compensado the compensado to set
	 */
	public void setCompensado(String compensado) {
		this.compensado = compensado;
	}
	/**
	 * @return the dataCheque
	 */
	public Date getDataCheque() {
		return dataCheque;
	}
	/**
	 * @param dataCheque the dataCheque to set
	 */
	public void setDataCheque(Date dataCheque) {
		this.dataCheque = dataCheque;
	}
	/**
	 * @return the dataRecebimento
	 */
	public Date getDataRecebimento() {
		return dataRecebimento;
	}
	/**
	 * @param dataRecebimento the dataRecebimento to set
	 */
	public void setDataRecebimento(Date dataRecebimento) {
		this.dataRecebimento = dataRecebimento;
	}
	/**
	 * @return the dataAberturaConta
	 */
	public Date getDataAberturaConta() {
		return dataAberturaConta;
	}
	/**
	 * @param dataAberturaConta the dataAberturaConta to set
	 */
	public void setDataAberturaConta(Date dataAberturaConta) {
		this.dataAberturaConta = dataAberturaConta;
	}
	
	
}
