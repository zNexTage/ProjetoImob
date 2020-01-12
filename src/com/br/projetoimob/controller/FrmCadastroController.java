/**
 * 
 */
package com.br.projetoimob.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * @author Christian
 *
 */
public class FrmCadastroController implements Initializable {
	@FXML
	private JFXButton btnImoveisRural;

	@FXML
	private JFXButton btnCadImoveisUrbanos;

	@FXML
	private JFXButton btnCadCidade;

	@FXML
	private JFXButton btnCadImobiliaria;

	@FXML
	private JFXButton btnCadLogradouro;

	@FXML
	private JFXButton btnCadBairro;

	@FXML
	private JFXButton btnCadPrestadorDeServico;

	@FXML
	private JFXButton btnCadFuncionarios;

	@FXML
	private JFXButton btnCadLogin;

	@FXML
	private JFXButton btnCadClientePF;

	@FXML
	private JFXButton btnCadEstado;

	@FXML
	private JFXButton btnCadCorretores;

	@FXML
	private JFXButton btnCadClientePJ;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}

	@FXML
	void abrirCadastroPessoaFisica(ActionEvent event) {
		try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/FrmCadastroPessoaFisica.fxml"));
			Parent root1 = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.initModality(Modality.APPLICATION_MODAL);
			stage.initStyle(StageStyle.UNDECORATED);
			stage.setScene(new Scene(root1));
			stage.show();
		} catch (IOException err) {
			System.err.println(err.getMessage());
		}
	}

	/**
	 * Abre o formulario para cadastrar os estados
	 * 
	 * @param event
	 */
	@FXML
	void abrirCadEstados(ActionEvent event) {
		try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/FrmCadEstados.fxml"));
			Parent root1 = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.initModality(Modality.APPLICATION_MODAL);
			stage.initStyle(StageStyle.UNDECORATED);
			stage.setScene(new Scene(root1));
			stage.show();
		} catch (IOException err) {
			System.err.println(err.getMessage());
		}
	}

	/**
	 * Abre o formulario para cadastrar as cidades
	 * 
	 * @param event
	 */
	@FXML
	void abrirCadCidades(ActionEvent event) {
		try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/FrmCadCidades.fxml"));
			Parent root1 = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.initModality(Modality.APPLICATION_MODAL);
			stage.initStyle(StageStyle.UNDECORATED);
			stage.setScene(new Scene(root1));
			stage.show();
		} catch (IOException err) {
			System.err.println(err.getMessage());
		}
	}
}
