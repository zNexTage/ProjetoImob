/**
 * 
 */
package com.br.projetoimob.domain;

import java.sql.Date;

/**
 * @author Christian
 *
 */
public class AVista extends Pagamento{
	//Atributos
	private int idA_Vista;
	private int idCodigoA_Vista;
	private int idCliente;
	private Date dataPagamento;
	
	//Getters e Setters
	/**
	 * @return the idA_Vista
	 */
	public int getIdA_Vista() {
		return idA_Vista;
	}
	/**
	 * @param idA_Vista the idA_Vista to set
	 */
	public void setIdA_Vista(int idA_Vista) {
		this.idA_Vista = idA_Vista;
	}
	/**
	 * @return the idCodigoA_Vista
	 */
	public int getIdCodigoA_Vista() {
		return idCodigoA_Vista;
	}
	/**
	 * @param idCodigoA_Vista the idCodigoA_Vista to set
	 */
	public void setIdCodigoA_Vista(int idCodigoA_Vista) {
		this.idCodigoA_Vista = idCodigoA_Vista;
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
	
}
