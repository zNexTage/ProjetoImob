/**
 * 
 */
package com.br.projetoimob.domain;

/**
 * @author Christian
 *
 */
public class Estado {
	//Atributos
	private int idEstado;
	private String nomeEstado;
	private String siglaEstado;
	
	/**
	 * @return the siglaEstado
	 */
	public String getSiglaEstado() {
		return siglaEstado;
	}
	/**
	 * @param siglaEstado the siglaEstado to set
	 */
	public void setSiglaEstado(String siglaEstado) {
		this.siglaEstado = siglaEstado;
	}
	/**
	 * @return the idEstado
	 */
	public int getIdEstado() {
		return idEstado;
	}
	/**
	 * @param idEstado the idEstado to set
	 */
	public void setIdEstado(int idEstado) {
		this.idEstado = idEstado;
	}
	/**
	 * @return the nomeEstado
	 */
	public String getNomeEstado() {
		return nomeEstado;
	}
	/**
	 * @param nomeEstado the nomeEstado to set
	 */
	public void setNomeEstado(String nomeEstado) {
		this.nomeEstado = nomeEstado;
	}
	

}
