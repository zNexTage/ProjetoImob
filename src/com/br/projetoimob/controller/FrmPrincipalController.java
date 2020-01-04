/**
 * 
 */
package com.br.projetoimob.controller;

import com.br.projetoimob.view.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;

import com.jfoenix.controls.JFXButton;
import com.sun.istack.internal.logging.Logger;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

/**
 * @author Christian
 *
 */
public class FrmPrincipalController implements Initializable {

	@FXML
	private AnchorPane apMenuPrincipal;

	@FXML
	private ImageView imgLogo;

	@FXML
	private JFXButton btnAtendimentos;

	@FXML
	private AnchorPane apDireito;

	@FXML
	private JFXButton btnCadastros;

	@FXML
	private JFXButton btnAgendamento;

	@FXML
	private JFXButton btnRelatorios;

	@FXML
	private JFXButton btnHome;

	@FXML
	private JFXButton btnPesquisas;

	@FXML
	private AnchorPane apEsquerdo;

	@FXML
	private JFXButton btnPagamentos;

	/**
	 * Inicializa o controller do fxml
	 */
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

		initFormInAnchor("FrmHome.fxml", apDireito);
	}

	/**
	 * Abre a home dentro do anchor pane esquerdo do FrmPrincipal
	 * 
	 * @param event
	 */
	@FXML
	void abrirHome(ActionEvent event) {
		// Habilita todos os botoes
		habilitaBotoes();

		// Desabilita o botão que foi clicado, no caso o btnHome
		desabilitaBotao(btnHome);

		// Inicializa o form no anchor direito do FrmPrincipal
		initFormInAnchor("FrmHome.fxml", apDireito);
	}

	/**
	 * Abre o fxml FrmAtendimentos
	 * 
	 * @param event
	 */
	@FXML
	void abrirAtendimentos(ActionEvent event) {
		// Habilita todos os botoes
		habilitaBotoes();

		// Desabilita o botão que foi clicado, no caso o btnHome
		desabilitaBotao(btnAtendimentos);

		// Inicializa o form no anchor direito do FrmPrincipal
		initFormInAnchor("FrmAtendimentos.fxml", apDireito);
	}

	/**
	 * Abre o fxml FrmAgendamentos
	 * 
	 * @param event
	 */
	@FXML
	void abrirAgendamentos(ActionEvent event) {
		// Habilita todos os botoes
		habilitaBotoes();

		// Desabilita o botão que foi clicado, no caso o btnHome
		desabilitaBotao(btnAgendamento);

		// Inicializa o form no anchor direito do FrmPrincipal
		initFormInAnchor("FrmAgendamentos.fxml", apDireito);
	}

	/**
	 * Abre o fxml FrmCadastros
	 * 
	 * @param event
	 */
	@FXML
	void abrirCadastros(ActionEvent event) {
		// Habilita todos os botoes
		habilitaBotoes();

		// Desabilita o botão que foi clicado, no caso o btnHome
		desabilitaBotao(btnCadastros);

		// Inicializa o form no anchor direito do FrmPrincipal
		initFormInAnchor("FrmCadastros.fxml", apDireito);
	}

	/**
	 * Abre o fxml FrmPesquisas
	 * 
	 * @param event
	 */
	@FXML
	void abrirPesquisas(ActionEvent event) {
		// Habilita todos os botoes
		habilitaBotoes();

		// Desabilita o botão que foi clicado, no caso o btnHome
		desabilitaBotao(btnPesquisas);

		// Inicializa o form no anchor direito do FrmPrincipal
		initFormInAnchor("FrmPesquisas.fxml", apDireito);
	}

	/**
	 * Abre o fxml FrmRelatorios
	 * 
	 * @param event
	 */
	@FXML
	void abrirRelatorios(ActionEvent event) {
		// Habilita todos os botoes
		habilitaBotoes();

		// Desabilita o botão que foi clicado, no caso o btnHome
		desabilitaBotao(btnRelatorios);

		// Inicializa o form no anchor direito do FrmPrincipal
		initFormInAnchor("FrmRelatorios.fxml", apDireito);
	}

	/**
	 * Abre o fxml FrmPagamentos
	 * 
	 * @param event
	 */
	@FXML
	void abrirPagamentos(ActionEvent event) {
		// Habilita todos os botoes
		habilitaBotoes();

		// Desabilita o botão que foi clicado, no caso o btnHome
		desabilitaBotao(btnPagamentos);

		// Inicializa o form no anchor direito do FrmPrincipal
		initFormInAnchor("FrmPagamentos.fxml", apDireito);
	}

	/**
	 * Abre o FrmHome dentro do achor pane direito do FrmPrincipal
	 */
	public void initFormInAnchor(String formName, AnchorPane apAchor) {
		AnchorPane apPrincipal;

		try {
			// Colocando o objeto apPrincipal dentro do FrmPrincipal
			apPrincipal = (AnchorPane) FXMLLoader.load(getClass().getResource("../view/" + formName));

			// Deixa o AnchorPane fluido e ancorado em todos os lados
			AnchorPane.setTopAnchor(apPrincipal, 0.0);
			AnchorPane.setLeftAnchor(apPrincipal, 0.0);
			AnchorPane.setRightAnchor(apPrincipal, 0.0);
			AnchorPane.setBottomAnchor(apPrincipal, 0.0);

			// Chama o apPrincipal dentro do anchor direito do FrmPrincipal
			apAchor.getChildren().setAll(apPrincipal);

		} catch (IOException ioErr) {
			// System.err.println(ioErr.getMessage());
			Logger.getLogger(FrmPrincipalController.class.getName(), null).log(Level.SEVERE, null, ioErr);
		}
	}

	/**
	 *  Desabilita o botao ao ser selecionado
	 * @param jfxButton
	 */
	public void desabilitaBotao(JFXButton jfxButton) {
		jfxButton.setDisable(true);
	}

	/**
	 * habilita todos os botões
	 */
	public void habilitaBotoes() {
		btnAgendamento.setDisable(false);
		btnAtendimentos.setDisable(false);
		btnCadastros.setDisable(false);
		btnHome.setDisable(false);
		btnPagamentos.setDisable(false);
		btnPesquisas.setDisable(false);
		btnRelatorios.setDisable(false);
	}

}
