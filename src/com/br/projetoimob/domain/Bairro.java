/**
 * 
 */
package com.br.projetoimob.domain;

/**
 * @author Christian
 *
 */
public class Bairro extends Cidade{
	//Atributos
	private int idBairro;
	private String nomeBairro;
	private int idCidade;
	
	//Getters e Setters
	/**
	 * @return the idBairro
	 */
	public int getIdBairro() {
		return idBairro;
	}
	/**
	 * @param idBairro the idBairro to set
	 */
	public void setIdBairro(int idBairro) {
		this.idBairro = idBairro;
	}
	/**
	 * @return the nomeBairro
	 */
	public String getNomeBairro() {
		return nomeBairro;
	}
	/**
	 * @param nomeBairro the nomeBairro to set
	 */
	public void setNomeBairro(String nomeBairro) {
		this.nomeBairro = nomeBairro;
	}
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
	
}
