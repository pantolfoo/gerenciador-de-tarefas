package com.example.gerenciadortarefas.Controller;

import com.example.gerenciadortarefas.HelloApplication;
import com.example.gerenciadortarefas.model.Tarefa;
import jakarta.persistence.Table;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class ControlePrincipal implements Initializable {

    @FXML
    private Button addTarefas;

    @FXML
    private TableView Table;

    //
    @FXML
    private TableColumn id;

    @FXML
    private TableColumn colNome;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        mostrarTarefas();
    }

    @FXML
    protected void irLista(ActionEvent event) {
            HelloApplication.mudarTela("lista");
    }

    @FXML
    protected void irTelaLogin(ActionEvent event) {
            HelloApplication.mudarTela("login");
    }

    private void mostrarTarefas() {
        List<Tarefa> tarefas = Tarefa.retornaTarefas();
        id.setCellValueFactory(new PropertyValueFactory<Tarefa,Integer>("idCategoria"));
        colNome.setCellValueFactory(new PropertyValueFactory<Tarefa,String>("nomeCategoria"));
        Table.getItems().addAll(tarefas);
    }

}
