/**
 * 
 */
package com.br.projetoimob.controller;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import com.br.projetoimob.dao.EstadosDAO;
import com.br.projetoimob.domain.Estado;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

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
    
    //Atributos para preencher a tableview
    private List<Estado> listEstados; //Utilizamos para conversar com o banco de dados
    private ObservableList<Estado> oListEstados; //Utilizamos para conversar com o viewtable
    private final EstadosDAO estadosDAO = new EstadosDAO();
    
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		preencherTabela();
	}
	
	/**
	 * Preenche o TableView com os estados
	 */
	private void preencherTabela() 
	{
		colCodigoEstado.setCellValueFactory(new PropertyValueFactory<>("idEstado"));
		colEstado.setCellValueFactory(new PropertyValueFactory<>("nomeEstado"));
		colSigla.setCellValueFactory(new PropertyValueFactory<>("siglaEstado"));
		
		listEstados = estadosDAO.selecionar();
		
		oListEstados = FXCollections.observableArrayList(listEstados);
		
		tblEstados.setItems(oListEstados);
	}

}
