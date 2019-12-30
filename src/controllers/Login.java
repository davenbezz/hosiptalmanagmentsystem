package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Login{

    @FXML
    private Pane content_area;
    public void close_app(MouseEvent event){
        System.exit(0);
    }

    public void login() throws IOException {
        Parent fxml = FXMLLoader.load(getClass().getResource("Register/Register.fxml"));

        content_area.getChildren().removeAll();
        content_area.getChildren().setAll(fxml);
    }
}
