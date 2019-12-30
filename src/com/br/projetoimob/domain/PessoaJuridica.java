package com.br.projetoimob.domain;

import java.sql.Date;

public class PessoaJuridica extends PesquisaCadastral
{
	//Atributos
	private int idPessoaJ;
	private int idCodigoPessoa;
	private String razaoSocial;
	private String nomeFantasia;
	private String cnpj;
	private String inscricaoEstadual;
	private String insentoInscricaoE;
	private String atividadePrincipal;
	private String atividadesSecundarias;
	private Date dataAberturaEmpresa;
	private String anotacoes;
	private String statusCadastro;
	/**
	 * @return the idPessoaJ
	 */
	public int getIdPessoaJ() {
		return idPessoaJ;
	}
	/**
	 * @param idPessoaJ the idPessoaJ to set
	 */
	public void setIdPessoaJ(int idPessoaJ) {
		this.idPessoaJ = idPessoaJ;
	}
	/**
	 * @return the idCodigoPessoa
	 */
	public int getIdCodigoPessoa() {
		return idCodigoPessoa;
	}
	/**
	 * @param idCodigoPessoa the idCodigoPessoa to set
	 */
	public void setIdCodigoPessoa(int idCodigoPessoa) {
		this.idCodigoPessoa = idCodigoPessoa;
	}
	/**
	 * @return the razaoSocial
	 */
	public String getRazaoSocial() {
		return razaoSocial;
	}
	/**
	 * @param razaoSocial the razaoSocial to set
	 */
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	/**
	 * @return the nomeFantasia
	 */
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	/**
	 * @param nomeFantasia the nomeFantasia to set
	 */
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	/**
	 * @return the cnpj
	 */
	public String getCnpj() {
		return cnpj;
	}
	/**
	 * @param cnpj the cnpj to set
	 */
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	/**
	 * @return the inscricaoEstadual
	 */
	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}
	/**
	 * @param inscricaoEstadual the inscricaoEstadual to set
	 */
	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}
	/**
	 * @return the insentoInscricaoE
	 */
	public String getInsentoInscricaoE() {
		return insentoInscricaoE;
	}
	/**
	 * @param insentoInscricaoE the insentoInscricaoE to set
	 */
	public void setInsentoInscricaoE(String insentoInscricaoE) {
		this.insentoInscricaoE = insentoInscricaoE;
	}
	/**
	 * @return the atividadePrincipal
	 */
	public String getAtividadePrincipal() {
		return atividadePrincipal;
	}
	/**
	 * @param atividadePrincipal the atividadePrincipal to set
	 */
	public void setAtividadePrincipal(String atividadePrincipal) {
		this.atividadePrincipal = atividadePrincipal;
	}
	/**
	 * @return the atividadesSecundarias
	 */
	public String getAtividadesSecundarias() {
		return atividadesSecundarias;
	}
	/**
	 * @param atividadesSecundarias the atividadesSecundarias to set
	 */
	public void setAtividadesSecundarias(String atividadesSecundarias) {
		this.atividadesSecundarias = atividadesSecundarias;
	}
	/**
	 * @return the dataAberturaEmpresa
	 */
	public Date getDataAberturaEmpresa() {
		return dataAberturaEmpresa;
	}
	/**
	 * @param dataAberturaEmpresa the dataAberturaEmpresa to set
	 */
	public void setDataAberturaEmpresa(Date dataAberturaEmpresa) {
		this.dataAberturaEmpresa = dataAberturaEmpresa;
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
	 * @return the statusCadastro
	 */
	public String getStatusCadastro() {
		return statusCadastro;
	}
	/**
	 * @param statusCadastro the statusCadastro to set
	 */
	public void setStatusCadastro(String statusCadastro) {
		this.statusCadastro = statusCadastro;
	}	
}
