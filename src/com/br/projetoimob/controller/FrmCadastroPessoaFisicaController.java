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

	/***********DADOS PESSOAIS*******************/
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

	/******************************/
	/*************ENDERECOS RESIDENCIAS******************/
    @FXML
    private JFXComboBox<String> cboTipoLogradouro;
    
    @FXML
    private JFXTextField txtLogradouro;    
    
	@FXML
    private JFXTextField txtNumero;

    @FXML
    private JFXTextField txtCidade;
    
    @FXML
    private JFXComboBox<String> cboEstadoLogradouro;
    
    @FXML
    private JFXTextField txtNumeroApartamento;
    
    @FXML
    private JFXTextField txtAndar;    

    @FXML
    private JFXTextField txtBlocoApartamento;
    
    @FXML
    private JFXTextField txtCep;	

    @FXML
    private JFXTextField txtComplemento;
    
    @FXML
    private JFXTextField txtLongitude;    

    @FXML
    private JFXTextField txtLatitude;    

    @FXML
    private JFXTextField txtReferencias;
	/*******************************/
    /*************DADOS ADICIONAIS******************/
    @FXML
    private JFXTextField txtTelefoneResidencial;
    
    @FXML
    private JFXTextField txtCelular;
    
    @FXML
    private JFXTextField txtEmail;
    
    @FXML
    private JFXTextField txtSite;
    /*******************************/
    /*************PREFERENCIA******************/
    @FXML
    private JFXComboBox<String> cboApartamento;
    
    @FXML
    private JFXComboBox<String> cboCasaTerrea;
    
    @FXML
    private JFXComboBox<String> cboSobrado;
    
    @FXML
    private JFXComboBox<String> cboCondominio;
    /*******************************/
	@FXML
	private Label lblFechar;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		// TODO Auto-generated method stub
		try { // Preenche o combobox sexo
			preencherComboBoxSexo();
			preencherComboBoxEstadoCivil();
			preencherComboBoxRegimeDeBens();
			preencherComboBoxEscolariedade();
			preencherComboBoxTipoLogradouro();
			preencheComboBoxQuestionarios(cboApartamento);
			preencheComboBoxQuestionarios(cboCasaTerrea);
			preencheComboBoxQuestionarios(cboSobrado);
			preencheComboBoxQuestionarios(cboCondominio);
		} catch (Exception err) {
			System.err.println(err.getMessage());
		}
	}

	/**
	 * Fecha a tela
	 * 
	 * @param event
	 */
	@FXML
	void fecharTela(Event event) {
		// javafx.application.Platform.exit();
		// Recebe a janela atual
		Stage frmCadPessoa = (Stage) lblFechar.getScene().getWindow();

		// Fecha a janela
		frmCadPessoa.close();
	}

	/**
	 * Preenche o combobox sexo
	 */
	private void preencherComboBoxSexo() {
		ObservableList<String> listSexos = FXCollections.observableArrayList("Masculino", "Feminino");

		cboSexo.setItems(listSexos);
	}

	/**
	 * Preenche o combobox estado civil
	 */
	private void preencherComboBoxEstadoCivil() {
		ObservableList<String> listEstadosCivis = FXCollections.observableArrayList("Solteiro", "Casado", "Separado",
				"Divorciados", "Viúvo");

		cboEstadoCivil.setItems(listEstadosCivis);
	}

	/**
	 * Preenche o combo regime de bens
	 */
	private void preencherComboBoxRegimeDeBens() {
		ObservableList<String> listRegimeDeBens = FXCollections.observableArrayList("Comunhão parcial de bens",
				"Comunhão universal de bens", "Separação total de bens", "Nenhum");

		cboRegimeDeBens.setItems(listRegimeDeBens);
	}

	/**
	 * Preenche o combo escolariedade
	 */
	private void preencherComboBoxEscolariedade() {
		ObservableList<String> listEscolariedade = FXCollections.observableArrayList("Fundamental - Incompleto",
				"Fundamental - Completo", "Médio - Incompleto", "Médio - Completo", "Superior - Incompleto",
				"Superior - Completo", "Pós-Graduação - Incompleto", "Pós-Graduação - Completo");

		cboEscolaridade.setItems(listEscolariedade);
	}
	
	/**
	 * Preenche o combo tipo de logradouro
	 */
	private void preencherComboBoxTipoLogradouro() 
	{
		ObservableList<String> listTipoLogradouros= FXCollections.observableArrayList(
				"Aeroporto",
				"Alameda",
				"Área",
				"Avenida",
				"Campo",
				"Chácara",
				"Colônia",
				"Condomínio",
				"Conjunto",
				"Distrito",
				"Esplanada",
				"Estação",
				"Favela",
				"Feira",
				"Jardim",
				"Ladeira",
				"Lago",
				"Lagoa",
				"Largo",
				"Loteamento",
				"Morro",
				"Núcleo",
				"Parque",
				"Passarela",
				"Pátio",
				"Praça",
				"Quadra",
				"Recanto",
				"Residencial",
				"Rodovia",
				"Rua",
				"Setor",
				"Sítio",
				"Travessa",
				"Trecho",
				"Trevo",
				"Vale",
				"Vereda",
				"Via",
				"Viaduto",
				"Viela",
				"Vila"
				);
		
		cboTipoLogradouro.setItems(listTipoLogradouros);
	}
	
	/**
	 * Preenche os combos que serão utilizados para o usuairo respoder sim ou não
	 * @param jfxCombobox
	 */
	void preencheComboBoxQuestionarios(JFXComboBox<String> jfxCombobox)
	{
		ObservableList<String> listQuest = FXCollections.observableArrayList("Sim", "Não");
		
		jfxCombobox.setItems(listQuest);
	}
}
