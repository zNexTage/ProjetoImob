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
public class Agendamento {
	private int idAgendamento;
	private int idCodigoAgendamento;
	private Date dataAgendamento;
	private Time horaAgendamento;
	private String tipoAgendamento;
	private String assuntoAgendamento;
	private String anotacoesAgendamento;
	private String statusAgendamento;
	private String reagendamento;
	private Date dataReagendamento;
	private Time horaReagendamento;
	private int idCliente;
	private int idImovel;
	
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
	 * @return the idImovel
	 */
	public int getIdImovel() {
		return idImovel;
	}
	/**
	 * @param idImovel the idImovel to set
	 */
	public void setIdImovel(int idImovel) {
		this.idImovel = idImovel;
	}
	/**
	 * @return the idAgendamento
	 */
	public int getIdAgendamento() {
		return idAgendamento;
	}
	/**
	 * @param idAgendamento the idAgendamento to set
	 */
	public void setIdAgendamento(int idAgendamento) {
		this.idAgendamento = idAgendamento;
	}
	/**
	 * @return the idCodigoAgendamento
	 */
	public int getIdCodigoAgendamento() {
		return idCodigoAgendamento;
	}
	/**
	 * @param idCodigoAgendamento the idCodigoAgendamento to set
	 */
	public void setIdCodigoAgendamento(int idCodigoAgendamento) {
		this.idCodigoAgendamento = idCodigoAgendamento;
	}
	/**
	 * @return the dataAgendamento
	 */
	public Date getDataAgendamento() {
		return dataAgendamento;
	}
	/**
	 * @param dataAgendamento the dataAgendamento to set
	 */
	public void setDataAgendamento(Date dataAgendamento) {
		this.dataAgendamento = dataAgendamento;
	}
	/**
	 * @return the horaAgendamento
	 */
	public Time getHoraAgendamento() {
		return horaAgendamento;
	}
	/**
	 * @param horaAgendamento the horaAgendamento to set
	 */
	public void setHoraAgendamento(Time horaAgendamento) {
		this.horaAgendamento = horaAgendamento;
	}
	/**
	 * @return the tipoAgendamento
	 */
	public String getTipoAgendamento() {
		return tipoAgendamento;
	}
	/**
	 * @param tipoAgendamento the tipoAgendamento to set
	 */
	public void setTipoAgendamento(String tipoAgendamento) {
		this.tipoAgendamento = tipoAgendamento;
	}
	/**
	 * @return the assuntoAgendamento
	 */
	public String getAssuntoAgendamento() {
		return assuntoAgendamento;
	}
	/**
	 * @param assuntoAgendamento the assuntoAgendamento to set
	 */
	public void setAssuntoAgendamento(String assuntoAgendamento) {
		this.assuntoAgendamento = assuntoAgendamento;
	}
	/**
	 * @return the anotacoesAgendamento
	 */
	public String getAnotacoesAgendamento() {
		return anotacoesAgendamento;
	}
	/**
	 * @param anotacoesAgendamento the anotacoesAgendamento to set
	 */
	public void setAnotacoesAgendamento(String anotacoesAgendamento) {
		this.anotacoesAgendamento = anotacoesAgendamento;
	}
	/**
	 * @return the statusAgendamento
	 */
	public String getStatusAgendamento() {
		return statusAgendamento;
	}
	/**
	 * @param statusAgendamento the statusAgendamento to set
	 */
	public void setStatusAgendamento(String statusAgendamento) {
		this.statusAgendamento = statusAgendamento;
	}
	/**
	 * @return the reagendamento
	 */
	public String getReagendamento() {
		return reagendamento;
	}
	/**
	 * @param reagendamento the reagendamento to set
	 */
	public void setReagendamento(String reagendamento) {
		this.reagendamento = reagendamento;
	}
	/**
	 * @return the dataReagendamento
	 */
	public Date getDataReagendamento() {
		return dataReagendamento;
	}
	/**
	 * @param dataReagendamento the dataReagendamento to set
	 */
	public void setDataReagendamento(Date dataReagendamento) {
		this.dataReagendamento = dataReagendamento;
	}
	/**
	 * @return the horaReagendamento
	 */
	public Time getHoraReagendamento() {
		return horaReagendamento;
	}
	/**
	 * @param horaReagendamento the horaReagendamento to set
	 */
	public void setHoraReagendamento(Time horaReagendamento) {
		this.horaReagendamento = horaReagendamento;
	}
	
}
