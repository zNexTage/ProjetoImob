/**
 * 
 */
package com.br.projetoimob.domain;

import java.sql.Date;
import java.sql.Time;

/**
 * @author Christian
 *
 */
public class Login extends PessoaFisica {
	//Atributos
	private int idLogin;
	private String usuario;
	private String senha;
	private String permissao;
	private Date dataLogin;
	private Time horaLogin;
	
	//Getters e Setters
	/**
	 * @return the idLogin
	 */
	public int getIdLogin() {
		return idLogin;
	}
	/**
	 * @param idLogin the idLogin to set
	 */
	public void setIdLogin(int idLogin) {
		this.idLogin = idLogin;
	}
	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}
	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	/**
	 * @return the senha
	 */
	public String getSenha() {
		return senha;
	}
	/**
	 * @param senha the senha to set
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}
	/**
	 * @return the permissao
	 */
	public String getPermissao() {
		return permissao;
	}
	/**
	 * @param permissao the permissao to set
	 */
	public void setPermissao(String permissao) {
		this.permissao = permissao;
	}
	/**
	 * @return the dataLogin
	 */
	public Date getDataLogin() {
		return dataLogin;
	}
	/**
	 * @param dataLogin the dataLogin to set
	 */
	public void setDataLogin(Date dataLogin) {
		this.dataLogin = dataLogin;
	}
	/**
	 * @return the horaLogin
	 */
	public Time getHoraLogin() {
		return horaLogin;
	}
	/**
	 * @param horaLogin the horaLogin to set
	 */
	public void setHoraLogin(Time horaLogin) {
		this.horaLogin = horaLogin;
	}
	
	
}
