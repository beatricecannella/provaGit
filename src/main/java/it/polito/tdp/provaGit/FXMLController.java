package it.polito.tdp.provaGit;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class FXMLController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label label;

    @FXML
    private Button bottone;

    @FXML
    void handleButtonAction(ActionEvent event) {
    	System.out.println("Bottone premuto");
    }

    @FXML
    void initialize() {
        assert label != null : "fx:id=\"label\" was not injected: check your FXML file 'Scene.fxml'.";
        assert bottone != null : "fx:id=\"bottone\" was not injected: check your FXML file 'Scene.fxml'.";

    }
}
