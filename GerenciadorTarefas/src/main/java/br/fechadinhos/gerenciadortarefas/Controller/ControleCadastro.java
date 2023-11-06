package br.fechadinhos.gerenciadortarefas.Controller;

import br.fechadinhos.gerenciadortarefas.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class ControleCadastro {

    @FXML
    void alterarLista(ActionEvent event) {
        HelloApplication.mudarTela("lista");

    }


}
