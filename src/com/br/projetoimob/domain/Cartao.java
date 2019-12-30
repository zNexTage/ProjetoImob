/**
 * 
 */
package com.br.projetoimob.domain;

import java.sql.Date;

/**
 * @author Christian
 *
 */
public class Cartao extends Pagamento {
	private int idCartao;
	private int idCodigoCartao;
	private int idCliente;
	private long numeroCartao;
	private Date dataVencimento;
	private Date dataRecebimento;
	private String tipoCartao;
	private double valorRecebimento;
	private String anotacoes;
	private String bandeira;
	/**
	 * @return the bandeira
	 */
	public String getBandeira() {
		return bandeira;
	}
	/**
	 * @param bandeira the bandeira to set
	 */
	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}
}
