/**
 * 
 */
package com.br.projetoimob.domain;

import java.sql.Date;

/**
 * @author Christian
 *
 */
public class Funcionario extends PessoaFisica{

	//Atributos
	private int idFuncionario;
	private int idCodigoFuncionario;
	private String cargo;
	private Date dataAdmissao;
	private Date dataDemissao;
	private double salarioInicial;
	private double salarioAtual;
	private double comissao;
	private String anotacoes;
	
	//Getters e Setters
	/**
	 * @return the idFuncionario
	 */
	public int getIdFuncionario() {
		return idFuncionario;
	}
	/**
	 * @param idFuncionario the idFuncionario to set
	 */
	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}
	/**
	 * @return the idCodigoFuncionario
	 */
	public int getIdCodigoFuncionario() {
		return idCodigoFuncionario;
	}
	/**
	 * @param idCodigoFuncionario the idCodigoFuncionario to set
	 */
	public void setIdCodigoFuncionario(int idCodigoFuncionario) {
		this.idCodigoFuncionario = idCodigoFuncionario;
	}
	/**
	 * @return the cargo
	 */
	public String getCargo() {
		return cargo;
	}
	/**
	 * @param cargo the cargo to set
	 */
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	/**
	 * @return the dataAdmissao
	 */
	public Date getDataAdmissao() {
		return dataAdmissao;
	}
	/**
	 * @param dataAdmissao the dataAdmissao to set
	 */
	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	/**
	 * @return the dataDemissao
	 */
	public Date getDataDemissao() {
		return dataDemissao;
	}
	/**
	 * @param dataDemissao the dataDemissao to set
	 */
	public void setDataDemissao(Date dataDemissao) {
		this.dataDemissao = dataDemissao;
	}
	/**
	 * @return the salarioInicial
	 */
	public double getSalarioInicial() {
		return salarioInicial;
	}
	/**
	 * @param salarioInicial the salarioInicial to set
	 */
	public void setSalarioInicial(double salarioInicial) {
		this.salarioInicial = salarioInicial;
	}
	/**
	 * @return the salarioAtual
	 */
	public double getSalarioAtual() {
		return salarioAtual;
	}
	/**
	 * @param salarioAtual the salarioAtual to set
	 */
	public void setSalarioAtual(double salarioAtual) {
		this.salarioAtual = salarioAtual;
	}
	/**
	 * @return the comissao
	 */
	public double getComissao() {
		return comissao;
	}
	/**
	 * @param comissao the comissao to set
	 */
	public void setComissao(double comissao) {
		this.comissao = comissao;
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
}
