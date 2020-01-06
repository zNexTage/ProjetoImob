/**
 * 
 */
package com.br.projetoimob.controller;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTabPane;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

/**
 * @author Christian
 *
 */
public class FrmCadastroPessoaFisicaController implements Initializable {

	@FXML
    private JFXTabPane tblCadastroPessoaFisica;

    @FXML
    private JFXButton btnSalvar;

    @FXML
    private Pane pneSuperior;

    @FXML
    private AnchorPane apTabela;

    @FXML
    private JFXButton btnLimpar;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		btnSalvar.setFocusTraversable(false);
	}

}
