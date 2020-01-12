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
	
}
