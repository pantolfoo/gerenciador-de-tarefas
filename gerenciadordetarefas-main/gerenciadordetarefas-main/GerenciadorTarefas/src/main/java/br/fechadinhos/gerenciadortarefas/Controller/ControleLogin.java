package br.fechadinhos.gerenciadortarefas.Controller;

import br.fechadinhos.gerenciadortarefas.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ControleLogin {
    @FXML
    private Label avisoUser;
    @FXML
    private TextField campoUser;

    @FXML
    void entrar(ActionEvent event) {
        if(campoUser.getText().equals("Igor"))
            HelloApplication.mudarTela("lista");
        else {
            avisoUser.setText("Usuario incorreto");
            campoUser.setStyle("-fx-border-color: red; -fx-border-radius: 50; -fx-background-radius: 50");
        }

    }
}
