package br.fechadinhos.gerenciadortarefas.Controller;

import br.fechadinhos.gerenciadortarefas.HelloApplication;
import br.fechadinhos.gerenciadortarefas.model.Usuario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.hibernate.Session;

public class ControleLogin {
    @FXML
    private Label avisoUser;
    @FXML
    private TextField campoUser;

    @FXML
    void entrar(ActionEvent event) {
        //session.createQuery("from Usuarios", Usuario.class);

//        if(campoUser.getText().equals(.createQuery("from Usuarios", Usuario.class)));
//            HelloApplication.mudarTela("lista");
//        else {
//            avisoUser.setText("Usuario incorreto");
//            campoUser.setStyle("-fx-border-color: red; -fx-border-radius: 50; -fx-background-radius: 50");
//        }

    }
    @FXML
    void irTelaCadastro(ActionEvent event) {
        HelloApplication.mudarTela("cadastro");
    }
}

pu