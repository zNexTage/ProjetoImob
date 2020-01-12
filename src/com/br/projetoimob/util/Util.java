/**
 * 
 */
package com.br.projetoimob.util;

import java.util.Optional;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;

/**
 * @author Christian
 *
 */
public class Util {
	public static void dialogMessage(String sTitulo, String sCabecalho, String sMensagem) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle(sTitulo);
		alert.setHeaderText(sCabecalho);
		alert.setContentText(sMensagem);
		alert.showAndWait();
	}

	public static Optional<ButtonType> confirmationMessage(String sTitulo, String sCabecalho, String sMensagem) {
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle(sTitulo);
		alert.setHeaderText(sCabecalho);
		alert.setContentText(sMensagem);

		Optional<ButtonType> result = alert.showAndWait();

		return result;
	}
}
