/**
 * 
 */
package com.br.projetoimob.domain;

import java.sql.Date;

/**
 * @author Christian
 *
 */
public class PagamentoComissao extends Pagamento {
	private int idPagComissao;
	private Date dataVendaLocacao;
	private Date dataPagamento;
	private int codigoCorretorImobiliario;
	private int codigoPagadorComissao;
	private String condicao;
	private String anotacoes;
	private String status;
	private String numeroNotaRecibo;
	private String documentacaoVendaLocacao;
	/**
	 * @return the idPagComissao
	 */
	public int getIdPagComissao() {
		return idPagComissao;
	}
	/**
	 * @param idPagComissao the idPagComissao to set
	 */
	public void setIdPagComissao(int idPagComissao) {
		this.idPagComissao = idPagComissao;
	}
	/**
	 * @return the dataVendaLocacao
	 */
	public Date getDataVendaLocacao() {
		return dataVendaLocacao;
	}
	/**
	 * @param dataVendaLocacao the dataVendaLocacao to set
	 */
	public void setDataVendaLocacao(Date dataVendaLocacao) {
		this.dataVendaLocacao = dataVendaLocacao;
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
	 * @return the codigoCorretorImobiliario
	 */
	public int getCodigoCorretorImobiliario() {
		return codigoCorretorImobiliario;
	}
	/**
	 * @param codigoCorretorImobiliario the codigoCorretorImobiliario to set
	 */
	public void setCodigoCorretorImobiliario(int codigoCorretorImobiliario) {
		this.codigoCorretorImobiliario = codigoCorretorImobiliario;
	}
	/**
	 * @return the codigoPagadorComissao
	 */
	public int getCodigoPagadorComissao() {
		return codigoPagadorComissao;
	}
	/**
	 * @param codigoPagadorComissao the codigoPagadorComissao to set
	 */
	public void setCodigoPagadorComissao(int codigoPagadorComissao) {
		this.codigoPagadorComissao = codigoPagadorComissao;
	}
	/**
	 * @return the condicao
	 */
	public String getCondicao() {
		return condicao;
	}
	/**
	 * @param condicao the condicao to set
	 */
	public void setCondicao(String condicao) {
		this.condicao = condicao;
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
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the numeroNotaRecibo
	 */
	public String getNumeroNotaRecibo() {
		return numeroNotaRecibo;
	}
	/**
	 * @param numeroNotaRecibo the numeroNotaRecibo to set
	 */
	public void setNumeroNotaRecibo(String numeroNotaRecibo) {
		this.numeroNotaRecibo = numeroNotaRecibo;
	}
	/**
	 * @return the documentacaoVendaLocacao
	 */
	public String getDocumentacaoVendaLocacao() {
		return documentacaoVendaLocacao;
	}
	/**
	 * @param documentacaoVendaLocacao the documentacaoVendaLocacao to set
	 */
	public void setDocumentacaoVendaLocacao(String documentacaoVendaLocacao) {
		this.documentacaoVendaLocacao = documentacaoVendaLocacao;
	}
	
	
}
