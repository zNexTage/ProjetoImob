/**
 * 
 */
package com.br.projetoimob.controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import com.br.projetoimob.dao.CidadeDAO;
import com.br.projetoimob.dao.EstadosDAO;
import com.br.projetoimob.domain.Cidade;
import com.br.projetoimob.domain.Estado;
import com.br.projetoimob.util.Util;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * @author Christian
 *
 */
public class FrmCadCidadesController implements Initializable {
	// Componentes
	@FXML
	private JFXComboBox<Estado> cboEstado;

	@FXML
	private JFXButton btnSalvar;

	@FXML
	private Label lblId;

	@FXML
	private TableColumn<Cidade, Integer> colCodigoCidade;

	@FXML
	private TableColumn<Cidade, String> colCidade;

	@FXML
	private TableColumn<Cidade, String> colEstado;

	@FXML
	private TableColumn<Cidade, String> colSigla;

	@FXML
	private TableColumn<Cidade, Integer> colIdEstado;

	@FXML
	private JFXTextField txtCidade;

	@FXML
	private TableView<Cidade> tblCidades;

	@FXML
	private JFXButton btnDeletar;

	@FXML
	private JFXButton btnLimpar;

	@FXML
	private Label lblFechar;

	@FXML
	private JFXButton btnAtualizar;

	//Fim -> Componentes
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		//Preenche a tabela
		preencherTabela();
		
		//Preenche o combo de estados
		preencherComboEstados();
		
		//Seta o valor da variavel id como 0
		lblId.setText("0");
	}

	/**
	 * Preenche a tabela com as cidades
	 */
	private void preencherTabela() {
		List<Cidade> listCidade;
		CidadeDAO cidadeDAO;
		ObservableList<Cidade> oListCidade;

		// Determina os atributos que irão preencher as colunas
		colCidade.setCellValueFactory(new PropertyValueFactory<>("nomeCidades"));
		colEstado.setCellValueFactory(new PropertyValueFactory<>("nomeEstado"));
		colSigla.setCellValueFactory(new PropertyValueFactory<>("siglaEstado"));
		colCodigoCidade.setCellValueFactory(new PropertyValueFactory<>("idCidade"));
		colIdEstado.setCellValueFactory(new PropertyValueFactory<>("idEstado"));

		// Instancia a lista de cidades e a DAO
		listCidade = new ArrayList<Cidade>();
		cidadeDAO = new CidadeDAO();

		// Chama o metodo para selecionar todas as cidades e atribuir a lista
		listCidade = cidadeDAO.selecionar();

		// Converte a lista de cidades em observablearray
		oListCidade = FXCollections.observableArrayList(listCidade);

		// Adiciona a lista na tabela
		tblCidades.setItems(oListCidade);
	}

	/**
	 * Fecha a janela
	 * @param event
	 */
	@FXML
	void fecharJanela(Event event) {
		Stage frmCadCidades = (Stage) lblFechar.getScene().getWindow();

		// Fecha a janela
		frmCadCidades.close();
	}

	/**
	 * Preenche os campos de textos, conforme o usuário clica em uma das linhas da
	 * tabela
	 * 
	 * @param event
	 */
	@FXML
	void preencherCampos(Event event) {
		Cidade cidade;
		int iIndexRow;
		Estado estado;

		// Recebe o index da linha que foi clicada
		iIndexRow = tblCidades.getSelectionModel().getSelectedIndex();

		// Recebe os valores da linha
		cidade = tblCidades.getItems().get(iIndexRow);

		// Instancia o objeot estado
		estado = new Estado();

		// Seta os atributos do estado
		estado.setIdEstado(cidade.getIdEstado());
		estado.setNomeEstado(cidade.getNomeEstado());
		estado.setSiglaEstado(cidade.getSiglaEstado());

		// Atribui os valore do campo clicado nas caixas de texto
		lblId.setText(String.valueOf(cidade.getIdCidade()));
		txtCidade.setText(cidade.getNomeCidades());

		// Utiliza o objeto estado para selecionar o valor do combobox
		cboEstado.getSelectionModel().select(estado);
	}

	@FXML
	void limparCampos(ActionEvent event) {
		limparCampos();
	}

	/**
	 * Atualiza a cidade
	 * @param event
	 */
	@FXML
	void atualizarCidade(ActionEvent event) {
		Cidade cidade;
		CidadeDAO cidadeDAO;

		// Instancia os objetos
		cidade = new Cidade();
		cidadeDAO = new CidadeDAO();

		//Seta os valores nos atributos
		cidade.setIdCidade(Integer.parseInt(lblId.getText()));
		cidade.setNomeCidades(txtCidade.getText());
		cidade.setIdEstado(cboEstado.getSelectionModel().getSelectedItem().getIdEstado());

		//Verifica se o usuário selecionou um cidade
		if (cidade.getIdCidade() == 0) {
			Util.dialogMessage("Atenção!", "", "Escolha uma cidade da tabela para atualizar!!");

			return;
		}
		
		//Verifica se o usuário digitou o nome de alguma cidade
		if (cidade.getNomeCidades().isEmpty()) {
			Util.dialogMessage("Atenção!", "Campo em Branco", "Preencha o campo Cidade, para poder atualizar");

			return;
		}
		
		//Chama o metodo da DAO para atualizar a cidade no banco de dados
		cidadeDAO.atualizar(cidade);
		
		//Demonstra uma mensagem de sucesso 
		Util.dialogMessage("Atenção!!", "Sucesso!", "A cidade foi atualizada com sucesso");
		
		//Preenche a tabela e limpa os campos
		preencherTabela();
		limparCampos();
	}

	/**
	 * Valida e chama o metodo para deletar a cidade no banco de dados
	 * @param event
	 */
	@FXML
	void deletarCidade(ActionEvent event) {
		Cidade cidade;
		CidadeDAO cidadeDAO;
		Optional<ButtonType> oResult;

		
		//Recebe os valores da linha selecionada na tabela
		cidade = tblCidades.getSelectionModel().getSelectedItem();

		//Verifica se o usuario selecionou alguma cidade na tabela
		if(cidade == null) 
		{
			Util.dialogMessage("Atenção", "Nenhuma cidade foi selecionada!", "Selecione uma cidade na tabela para poder deletá-la");
			
			return;
		}

		//Instancia o objeto
		cidadeDAO = new CidadeDAO();

		//Questiona o usuario se ele quer mesmo deletar a cidade
		oResult = Util.confirmationMessage("Atenção!!", "Deletar Cidade",
				"Deseja deletar a cidade " + cidade.getNomeCidades() + "?");

		//Verifica se ele optou por sim
		if (oResult.get() == ButtonType.OK) {
			//Chama o metodo da DAO para deletar a cidade do banco de dados
			cidadeDAO.deletar(cidade.getIdCidade());
			
			//Demonstra uma mensagem de sucesso 
			Util.dialogMessage("Atenção!!", "Sucesso",
					"A cidade " + cidade.getNomeCidades() + " foi apagada com sucesso!!");
			
			//Preenche a tabela novamente
			preencherTabela();
			
			//Limpa os campos
			limparCampos();
		}
	}

	/**
	 * Valida os campos e chama o metodo da DAO para inserir a cidade no banco de dados
	 * @param event
	 */
	@FXML
	void salvarCidade(ActionEvent event) {
		Cidade cidade;
		CidadeDAO cidadeDAO;

		// Instancia o objeto
		cidade = new Cidade();

		// Recebe os valores dos campos de texto
		cidade.setNomeCidades(txtCidade.getText());
		cidade.setIdEstado(cboEstado.getValue().getIdEstado());

		// cidade.setSiglaEstado(txtCidade.getText());

		// Verifica se o usuario preencheu os campos
		if (cidade.getNomeCidades().isEmpty()) {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Atenção!!");
			alert.setHeaderText(null);
			alert.setContentText("Preencha o campo Cidade");
			alert.showAndWait();

			return;
		}
		if (cidade.getIdEstado() == 0) {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Atenção!!");
			alert.setHeaderText(null);
			alert.setContentText("Escolha um estado!");
			alert.showAndWait();

			return;
		}

		//Caso tenha passado pelas validações
		//Instancia a dao para inserir a nova cidade
		cidadeDAO = new CidadeDAO();

		// Realiza a inserção do estado
		cidadeDAO.inserir(cidade);

		// Preenche a tabela novamente
		preencherTabela();

		// Limpa os campos
		limparCampos();

		// Demonstra uma mensagem de sucesso ao usuário
		Util.dialogMessage("Atenção!!", "Sucesso!!", "A cidade "+cidade.getNomeCidades()+" foi cadastrada com sucesso!!");
	}

	/**
	 * Limpa os campos de texto
	 */
	private void limparCampos() {
		txtCidade.setText("");
		lblId.setText("0");
		cboEstado.getSelectionModel().select(0);
	}

	/**
	 * Preenche o combo estados
	 */
	private void preencherComboEstados() {
		List<Estado> listEstado;
		ObservableList<Estado> oListEstado;
		EstadosDAO estadosDao;

		//Instancia a DAO estados
		estadosDao = new EstadosDAO();

		//Chama o metodo para listar todos os estados
		listEstado = estadosDao.selecionar();

		//Verifica se a lista de estados está vazia
		if(listEstado.isEmpty()) 
		{
			return;
		}
		//Atribui a lista retornada ao observablearray
		oListEstado = FXCollections.observableArrayList(listEstado);

		//Adiciona os itens no combobx
		cboEstado.setItems(oListEstado);

		//Seleciona o primeio item do combobox
		cboEstado.getSelectionModel().select(0);
	}
}
