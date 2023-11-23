package com.example.gerenciadortarefas.Controller;

import com.example.gerenciadortarefas.HelloApplication;
import com.example.gerenciadortarefas.model.Tarefa;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import com.example.gerenciadortarefas.util.HibernateUtil;

import org.hibernate.Session;
import org.hibernate.mapping.List;

import java.util.ArrayList;

public class ControleLista  {
@FXML
private TextField NomeEvento;

@FXML
private TextField Descricao;
@FXML
private DatePicker DataEvento;

@FXML
private Button addEvento;
    @FXML
    void irTelaprincipal(ActionEvent event){
        HelloApplication.mudarTela("principal");
    }

    @FXML
    protected void addEvento(ActionEvent event){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Tarefa tarefa = new Tarefa(getNomeEvento().getText(), getDescricao().getText(), getDataEvento().getValue());
        session.beginTransaction();
        session.persist(tarefa);
        session.getTransaction().commit();

        session.close();
        System.out.println("Tarefa adicionada");
    }

    public TextField getNomeEvento() {
        return NomeEvento;
    }

    public void setNomeEvento(TextField nomeEvento) {
        NomeEvento = nomeEvento;
    }

    public TextField getDescricao() {
        return Descricao;
    }

    public void setDescricao(TextField descricao) {
        Descricao = descricao;
    }

    public DatePicker getDataEvento() {
        return DataEvento;
    }

    public void setDataEvento(DatePicker dataEvento) {
        DataEvento = dataEvento;
    }
}


