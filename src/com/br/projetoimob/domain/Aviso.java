/**
 * 
 */
package com.br.projetoimob.domain;

import java.sql.Date;

/**
 * @author Christian
 *
 */
public class Aviso {
	private int idAviso;
	private int idCodigoAviso;
	private Date dataAviso;
	private int idCliente;
	private String tipoAviso;
	private String assuntoAviso;
	private String mensagemAviso;
	private String respostaAviso;
	
	/**
	 * @return the respostaAviso
	 */
	public String getRespostaAviso() {
		return respostaAviso;
	}
	/**
	 * @param respostaAviso the respostaAviso to set
	 */
	public void setRespostaAviso(String respostaAviso) {
		this.respostaAviso = respostaAviso;
	}
	/**
	 * @return the idAviso
	 */
	public int getIdAviso() {
		return idAviso;
	}
	/**
	 * @param idAviso the idAviso to set
	 */
	public void setIdAviso(int idAviso) {
		this.idAviso = idAviso;
	}
	/**
	 * @return the idCodigoAviso
	 */
	public int getIdCodigoAviso() {
		return idCodigoAviso;
	}
	/**
	 * @param idCodigoAviso the idCodigoAviso to set
	 */
	public void setIdCodigoAviso(int idCodigoAviso) {
		this.idCodigoAviso = idCodigoAviso;
	}
	/**
	 * @return the dataAviso
	 */
	public Date getDataAviso() {
		return dataAviso;
	}
	/**
	 * @param dataAviso the dataAviso to set
	 */
	public void setDataAviso(Date dataAviso) {
		this.dataAviso = dataAviso;
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
	 * @return the tipoAviso
	 */
	public String getTipoAviso() {
		return tipoAviso;
	}
	/**
	 * @param tipoAviso the tipoAviso to set
	 */
	public void setTipoAviso(String tipoAviso) {
		this.tipoAviso = tipoAviso;
	}
	/**
	 * @return the assuntoAviso
	 */
	public String getAssuntoAviso() {
		return assuntoAviso;
	}
	/**
	 * @param assuntoAviso the assuntoAviso to set
	 */
	public void setAssuntoAviso(String assuntoAviso) {
		this.assuntoAviso = assuntoAviso;
	}
	/**
	 * @return the mensagemAviso
	 */
	public String getMensagemAviso() {
		return mensagemAviso;
	}
	/**
	 * @param mensagemAviso the mensagemAviso to set
	 */
	public void setMensagemAviso(String mensagemAviso) {
		this.mensagemAviso = mensagemAviso;
	}
	
	
}
