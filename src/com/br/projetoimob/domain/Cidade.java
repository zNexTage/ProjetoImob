/**
 * 
 */
package com.br.projetoimob.domain;

/**
 * @author Christian
 *
 */
public class Cidade extends Estado {
	//Atributo
	private int idCidade;
	private String nomeCidades;
	private int idEstados;
	/**
	 * @return the idCidade
	 */
	public int getIdCidade() {
		return idCidade;
	}
	/**
	 * @param idCidade the idCidade to set
	 */
	public void setIdCidade(int idCidade) {
		this.idCidade = idCidade;
	}
	/**
	 * @return the nomeCidades
	 */
	public String getNomeCidades() {
		return nomeCidades;
	}
	/**
	 * @param nomeCidades the nomeCidades to set
	 */
	public void setNomeCidades(String nomeCidades) {
		this.nomeCidades = nomeCidades;
	}
	/**
	 * @return the idEstados
	 */
	public int getIdEstados() {
		return idEstados;
	}
	/**
	 * @param idEstados the idEstados to set
	 */
	public void setIdEstados(int idEstados) {
		this.idEstados = idEstados;
	}
	
}
