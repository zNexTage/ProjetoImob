package com.br.projetoimob;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		Pane pRoot;
		try {			
			pRoot = FXMLLoader.load(this.getClass().getResource("view/FrmPrincipal.fxml"));			
			Scene scene = new Scene(pRoot);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
