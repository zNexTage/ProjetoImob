/**
 * 
 */
package com.br.projetoimob.domain;

/**
 * @author Christian
 *
 */
public class ClientePessoaJuridica extends PessoaJuridica {
	private int idClientePj;
	private int codigoClientePj;
	private String statusComprador;
	private String statusLocatario;
	private String statusLocador;
	private String statusVendedor;
	/**
	 * @return the idClientePj
	 */
	public int getIdClientePj() {
		return idClientePj;
	}
	/**
	 * @param idClientePj the idClientePj to set
	 */
	public void setIdClientePj(int idClientePj) {
		this.idClientePj = idClientePj;
	}
	/**
	 * @return the codigoClientePj
	 */
	public int getCodigoClientePj() {
		return codigoClientePj;
	}
	/**
	 * @param codigoClientePj the codigoClientePj to set
	 */
	public void setCodigoClientePj(int codigoClientePj) {
		this.codigoClientePj = codigoClientePj;
	}
	/**
	 * @return the statusComprador
	 */
	public String getStatusComprador() {
		return statusComprador;
	}
	/**
	 * @param statusComprador the statusComprador to set
	 */
	public void setStatusComprador(String statusComprador) {
		this.statusComprador = statusComprador;
	}
	/**
	 * @return the statusLocatario
	 */
	public String getStatusLocatario() {
		return statusLocatario;
	}
	/**
	 * @param statusLocatario the statusLocatario to set
	 */
	public void setStatusLocatario(String statusLocatario) {
		this.statusLocatario = statusLocatario;
	}
	/**
	 * @return the statusLocador
	 */
	public String getStatusLocador() {
		return statusLocador;
	}
	/**
	 * @param statusLocador the statusLocador to set
	 */
	public void setStatusLocador(String statusLocador) {
		this.statusLocador = statusLocador;
	}
	/**
	 * @return the statusVendedor
	 */
	public String getStatusVendedor() {
		return statusVendedor;
	}
	/**
	 * @param statusVendedor the statusVendedor to set
	 */
	public void setStatusVendedor(String statusVendedor) {
		this.statusVendedor = statusVendedor;
	}
	
	
}
