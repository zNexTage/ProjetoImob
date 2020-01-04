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
	private ImageView imgLogo;

	@FXML
	private JFXButton btnHome;

	@FXML
	private JFXButton btnAtendimentos;

	@FXML
	private AnchorPane apEsquerdo;

	@FXML
	private AnchorPane apDireito;

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
		initFormInAnchor("FrmHome.fxml", apDireito);
	}

	/**
	 * Abre o fxml FrmAtendimentos
	 * 
	 * @param event
	 */
	@FXML
	void abrirAtendimentos(ActionEvent event) {
		initFormInAnchor("FrmAtendimentos.fxml", apDireito);
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

}
