package br.fechadinhos.gerenciadortarefas.Controller;

import br.fechadinhos.gerenciadortarefas.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class ControleLista {

    @FXML
    void irTelaLogin(ActionEvent event) {
        HelloApplication.mudarTela("login");


    }


}
