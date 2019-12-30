/**
 * 
 */
package com.br.projetoimob.domain;

/**
 * @author Christian
 *
 */
public class Endereco extends Bairro {
	//Atributos
	private int idEndereco;
	private String tipoLogradouro;
	private String logradouro;
	private String numeroLogradouro;
	private String complemento;
	private String cep;
	private double latitude;
	private double longitude;
	/**
	 * @return the idEndereco
	 */
	public int getIdEndereco() {
		return idEndereco;
	}
	/**
	 * @param idEndereco the idEndereco to set
	 */
	public void setIdEndereco(int idEndereco) {
		this.idEndereco = idEndereco;
	}
	/**
	 * @return the tipoLogradouro
	 */
	public String getTipoLogradouro() {
		return tipoLogradouro;
	}
	/**
	 * @param tipoLogradouro the tipoLogradouro to set
	 */
	public void setTipoLogradouro(String tipoLogradouro) {
		this.tipoLogradouro = tipoLogradouro;
	}
	/**
	 * @return the logradouro
	 */
	public String getLogradouro() {
		return logradouro;
	}
	/**
	 * @param logradouro the logradouro to set
	 */
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	/**
	 * @return the numeroLogradouro
	 */
	public String getNumeroLogradouro() {
		return numeroLogradouro;
	}
	/**
	 * @param numeroLogradouro the numeroLogradouro to set
	 */
	public void setNumeroLogradouro(String numeroLogradouro) {
		this.numeroLogradouro = numeroLogradouro;
	}
	/**
	 * @return the complemento
	 */
	public String getComplemento() {
		return complemento;
	}
	/**
	 * @param complemento the complemento to set
	 */
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	/**
	 * @return the cep
	 */
	public String getCep() {
		return cep;
	}
	/**
	 * @param cep the cep to set
	 */
	public void setCep(String cep) {
		this.cep = cep;
	}
	/**
	 * @return the latitude
	 */
	public double getLatitude() {
		return latitude;
	}
	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	/**
	 * @return the longitude
	 */
	public double getLongitude() {
		return longitude;
	}
	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
	
}
