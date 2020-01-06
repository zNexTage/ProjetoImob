/**
 * 
 */
package com.br.projetoimob.controller;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTabPane;
import com.jfoenix.controls.JFXTextField;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

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
	    private JFXTextField txtSobrenome;

	    @FXML
	    private JFXTextField txtNome;

	    @FXML
	    private JFXTextField txtCpf;

	    @FXML
	    private JFXComboBox<String> cboSexo;
	    
	    @FXML
	    private JFXComboBox<String> cboEstadoCivil;

	    @FXML
	    private JFXComboBox<String> cboRegimeDeBens;

	    @FXML
	    private JFXComboBox<String> cboEstado;
	    
	    @FXML
	    private JFXComboBox<String> cboEscolaridade;
	    
	    @FXML
	    private JFXButton btnLimpar;

	    @FXML
	    private JFXTextField txtRg;
	    
	    @FXML
	    private JFXTextField txtNaturalidade;
	    
	    @FXML
	    private JFXTextField txtProfissao;
	    
	    @FXML
	    private JFXTextField txtNomePai;
	    
	    @FXML
	    private JFXTextField txtNomeMae;
	    
	    @FXML
	    private Label lblFechar;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		// TODO Auto-generated method stub
		try {		//Preenche o combobox sexo
		preencherComboBoxSexo();
		preencherComboBoxEstadoCivil();
		preencherComboBoxRegimeDeBens();
		preencherComboBoxEscolariedade();
		}
		catch(Exception err) {
			System.err.println(err.getMessage());
		}
	}
	
	/**
	 * Fecha a tela
	 * @param event
	 */
	  @FXML
	    void fecharTela(Event event) {	
		  //javafx.application.Platform.exit();
		  //Recebe a janela atual
		  Stage frmCadPessoa = (Stage)lblFechar.getScene().getWindow();
		  
		  //Fecha a janela
		  frmCadPessoa.close();
	    }
	
	/**
	 * Preenche o combobox sexo
	 */
	private void preencherComboBoxSexo() {
		ObservableList<String> listSexos = FXCollections.observableArrayList
				(
				"Masculino", "Feminino"
				);
		
		cboSexo.setItems(listSexos);
	}
	
	/**
	 * Preenche o combobox estado civil
	 */
	private void preencherComboBoxEstadoCivil() 
	{
		ObservableList<String> listEstadosCivis = FXCollections.observableArrayList
				(
				"Solteiro", "Casado", "Separado", "Divorciados", "Viúvo"
				);
		
		cboEstadoCivil.setItems(listEstadosCivis);
	}
	
	/**
	 * Preenche o combo regime de bens
	 */
	private void preencherComboBoxRegimeDeBens() {
		ObservableList<String> listRegimeDeBens = FXCollections.observableArrayList
				(
				"Comunhão parcial de bens", "Comunhão universal de bens", "Separação total de bens", "Nenhum"
				);
		
		cboRegimeDeBens.setItems(listRegimeDeBens);
	}
	
	/**
	 * Preenche o combo escolariedade
	 */
	private void preencherComboBoxEscolariedade() 
	{
		ObservableList<String> listEscolariedade = FXCollections.observableArrayList
				(
				"Fundamental - Incompleto",
				"Fundamental - Completo",
				"Médio - Incompleto",
				"Médio - Completo",
				"Superior - Incompleto",
				"Superior - Completo",
				"Pós-Graduação - Incompleto",
				"Pós-Graduação - Completo"
				);
		
		cboEscolaridade.setItems(listEscolariedade);
	}

}
