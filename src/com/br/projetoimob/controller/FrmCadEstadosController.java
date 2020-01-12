/**
 * 
 */
package com.br.projetoimob.controller;

import java.awt.TrayIcon.MessageType;
import java.net.URL;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;

import javax.swing.Icon;
import javax.swing.JOptionPane;

import com.br.projetoimob.dao.EstadosDAO;
import com.br.projetoimob.domain.Estado;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import com.sun.javafx.embed.swing.Disposer;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * @author Christian
 *
 */
public class FrmCadEstadosController implements Initializable {

	@FXML
	private JFXButton btnSalvar;

	@FXML
	private TableView<Estado> tblEstados;

	@FXML
	private TableColumn<Estado, Integer> colCodigoEstado;

	@FXML
	private TableColumn<Estado, String> colEstado;

	@FXML
	private TableColumn<Estado, String> colSigla;

	@FXML
	private JFXButton btnDeletar;

	@FXML
	private JFXTextField txtEstado;

	@FXML
	private JFXButton btnLimpar;

	@FXML
	private JFXTextField txtSigla;

	@FXML
	private JFXButton btnAtualizar;

	@FXML
	private Label lblFechar;
	
    @FXML
    private Label lblId;

    static boolean isUptade = false;;
    
	// Atributos para preencher a tableview
	private List<Estado> listEstados; // Utilizamos para conversar com o banco de dados
	private ObservableList<Estado> oListEstados; // Utilizamos para conversar com o viewtable
	private final EstadosDAO estadosDAO = new EstadosDAO();

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		preencherTabela();
	}

	/**
	 * Preenche o TableView com os estados
	 */
	private void preencherTabela() {

		// Determina os atributos que irão preencher as colunas
		colCodigoEstado.setCellValueFactory(new PropertyValueFactory<>("idEstado"));
		colEstado.setCellValueFactory(new PropertyValueFactory<>("nomeEstado"));
		colSigla.setCellValueFactory(new PropertyValueFactory<>("siglaEstado"));

		// Instancia a lista
		listEstados = estadosDAO.selecionar();

		// Adiciona a lista de lista no observablearray
		oListEstados = FXCollections.observableArrayList(listEstados);

		// Adiciona o array na lista
		tblEstados.setItems(oListEstados);
	}

	/**
	 * Cadastra um novo estado
	 * 
	 * @param event
	 */
	@FXML
	void salvarEstado(ActionEvent event) {
		Estado estado;

		// Instancia o objeto
		estado = new Estado();

		// Recebe os valores dos campos de texto
		estado.setNomeEstado(txtEstado.getText());
		estado.setSiglaEstado(txtSigla.getText());

		// Verifica se o atributo está vazio
		if (estado.getNomeEstado().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o campo Estado");

			return;
		}

		// Verifica se o atributo está vazio
		if (estado.getSiglaEstado().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o campo Sigla");

			return;
		}

		// Realiza a inserção do estado
		estadosDAO.inserir(estado);

		// Preenche a tabela novamente
		preencherTabela();

		// Limpa os campos
		limparCampos();

		// Demonstra uma mensagem de sucesso ao usuário
		JOptionPane.showMessageDialog(null, "Estado cadastrado com sucesso", "Atenção", JOptionPane.INFORMATION_MESSAGE,
				null);
	}

	/**
	 * Chama o metodo para limpar os campos
	 * 
	 * @param event
	 */
	@FXML
	void limparCampos(ActionEvent event) {
		limparCampos();
	}

	/**
	 * Limpa os campos de texto
	 */
	private void limparCampos() {
		txtEstado.setText("");
		txtSigla.setText("");
	}

	/**
	 * Fecha a janela
	 * 
	 * @param event
	 */
	@FXML
	void fecharJanela(ActionEvent event) {
		Stage frmCadEstados = (Stage) lblFechar.getScene().getWindow();

		// Fecha a janela
		frmCadEstados.close();
	}
	
	/**
	 * Atualiza as informações do estado
	 * @param event
	 */
    @FXML
    void atualizarEstado(ActionEvent event) {
    	int iIndexRow;
    	Estado estado = null;
    	EstadosDAO estadosDao=null;
    	
    	estado = new Estado();
    	
    	estado.setNomeEstado(txtEstado.getText());
    	estado.setIdEstado(new Integer(lblId.getText()));
    	estado.setSiglaEstado(txtSigla.getText());
    	
    	estadosDao = new EstadosDAO();
    	
    	estadosDao.atualizar(estado);
    	
    	preencherTabela();
    }
    
    /**
     * Deleta um estado
     * @param event
     */
    @FXML
    void deletarEstado(ActionEvent event) {
    	int iIndexRow;
    	Estado estado;   	
    	Alert alert;
    	
    	//Recebe o index da linha que foi clicada
    	iIndexRow = tblEstados.getSelectionModel().getSelectedIndex();
    	
    	//Recebe os valores da linha
    	estado = tblEstados.getItems().get(iIndexRow);
    	
    	alert = new Alert(AlertType.CONFIRMATION);
    	alert.setTitle("Deletar Estado!!");
    	alert.setHeaderText("Atenção!!");
    	alert.setContentText("Você deseja apagar o estado: "+estado.getNomeEstado()+"?");

    	Optional<ButtonType> result = alert.showAndWait();
    	if (result.get() == ButtonType.OK){
    	    estadosDAO.deletar(estado.getIdEstado());
    	    preencherTabela();
    	    
    	    alert = new Alert(AlertType.WARNING);
    	    alert.setTitle("Sucesso!!");
    	    alert.setHeaderText("Estado apagado");
    	    alert.setContentText("O estado "+estado.getNomeEstado()+" foi apagado!!");

    	    alert.showAndWait();
    	    
    	}   	
    }
    
    @FXML
    void preencherCampos(Event event) {
    	int iIndexRow;
    	Estado estado;
    	
    	//Recebe o index da linha que foi clicada
    	iIndexRow = tblEstados.getSelectionModel().getSelectedIndex();
    	
    	//Recebe os valores da linha
    	estado = tblEstados.getItems().get(iIndexRow);
    	
    	lblId.setText(String.valueOf(estado.getIdEstado()));
    	txtEstado.setText(estado.getNomeEstado());
    	txtSigla.setText(estado.getSiglaEstado());
    }

}
