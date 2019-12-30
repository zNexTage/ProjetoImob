/**
 * 
 */
package com.br.projetoimob.domain;

import java.sql.Date;

/**
 * @author Christian
 *
 */
public class Pagamento {
	private int idPagamento;
	private int idCodigoPagamento;
	private Date dataPagamento;
	private Date dataVencimento;
	private double jurosMensais;
	private double jurosMulta;
	private int idCodigoCliente;
	private String formaPagamento;
	private double valorPagamento;
	private double valorDesconto;
	private double valorTotalPagamento;
	private int numeroDocumentoPagamento;
	private int idCliente;
	private int idImovel;
	/**
	 * @return the idPagamento
	 */
	public int getIdPagamento() {
		return idPagamento;
	}
	/**
	 * @param idPagamento the idPagamento to set
	 */
	public void setIdPagamento(int idPagamento) {
		this.idPagamento = idPagamento;
	}
	/**
	 * @return the idCodigoPagamento
	 */
	public int getIdCodigoPagamento() {
		return idCodigoPagamento;
	}
	/**
	 * @param idCodigoPagamento the idCodigoPagamento to set
	 */
	public void setIdCodigoPagamento(int idCodigoPagamento) {
		this.idCodigoPagamento = idCodigoPagamento;
	}
	/**
	 * @return the dataPagamento
	 */
	public Date getDataPagamento() {
		return dataPagamento;
	}
	/**
	 * @param dataPagamento the dataPagamento to set
	 */
	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	/**
	 * @return the dataVencimento
	 */
	public Date getDataVencimento() {
		return dataVencimento;
	}
	/**
	 * @param dataVencimento the dataVencimento to set
	 */
	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	/**
	 * @return the jurosMensais
	 */
	public double getJurosMensais() {
		return jurosMensais;
	}
	/**
	 * @param jurosMensais the jurosMensais to set
	 */
	public void setJurosMensais(double jurosMensais) {
		this.jurosMensais = jurosMensais;
	}
	/**
	 * @return the jurosMulta
	 */
	public double getJurosMulta() {
		return jurosMulta;
	}
	/**
	 * @param jurosMulta the jurosMulta to set
	 */
	public void setJurosMulta(double jurosMulta) {
		this.jurosMulta = jurosMulta;
	}
	/**
	 * @return the idCodigoCliente
	 */
	public int getIdCodigoCliente() {
		return idCodigoCliente;
	}
	/**
	 * @param idCodigoCliente the idCodigoCliente to set
	 */
	public void setIdCodigoCliente(int idCodigoCliente) {
		this.idCodigoCliente = idCodigoCliente;
	}
	/**
	 * @return the formaPagamento
	 */
	public String getFormaPagamento() {
		return formaPagamento;
	}
	/**
	 * @param formaPagamento the formaPagamento to set
	 */
	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	/**
	 * @return the valorPagamento
	 */
	public double getValorPagamento() {
		return valorPagamento;
	}
	/**
	 * @param valorPagamento the valorPagamento to set
	 */
	public void setValorPagamento(double valorPagamento) {
		this.valorPagamento = valorPagamento;
	}
	/**
	 * @return the valorDesconto
	 */
	public double getValorDesconto() {
		return valorDesconto;
	}
	/**
	 * @param valorDesconto the valorDesconto to set
	 */
	public void setValorDesconto(double valorDesconto) {
		this.valorDesconto = valorDesconto;
	}
	/**
	 * @return the valorTotalPagamento
	 */
	public double getValorTotalPagamento() {
		return valorTotalPagamento;
	}
	/**
	 * @param valorTotalPagamento the valorTotalPagamento to set
	 */
	public void setValorTotalPagamento(double valorTotalPagamento) {
		this.valorTotalPagamento = valorTotalPagamento;
	}
	/**
	 * @return the numeroDocumentoPagamento
	 */
	public int getNumeroDocumentoPagamento() {
		return numeroDocumentoPagamento;
	}
	/**
	 * @param numeroDocumentoPagamento the numeroDocumentoPagamento to set
	 */
	public void setNumeroDocumentoPagamento(int numeroDocumentoPagamento) {
		this.numeroDocumentoPagamento = numeroDocumentoPagamento;
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
	 * @return the idImovel
	 */
	public int getIdImovel() {
		return idImovel;
	}
	/**
	 * @param idImovel the idImovel to set
	 */
	public void setIdImovel(int idImovel) {
		this.idImovel = idImovel;
	}
	
	
}
