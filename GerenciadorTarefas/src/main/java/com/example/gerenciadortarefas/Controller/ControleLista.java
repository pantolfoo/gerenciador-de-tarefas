package com.example.gerenciadortarefas.Controller;

import com.example.gerenciadortarefas.HelloApplication;
import com.example.gerenciadortarefas.model.Categoria;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import com.example.gerenciadortarefas.util.HibernateUtil;

import org.hibernate.Session;

public class ControleLista {
@FXML
private TextField NomeEvento;

@FXML
private TextField Descricao;
@FXML
private DatePicker DataEvento;


    @FXML
    void irTelaLogin(ActionEvent event) {
        HelloApplication.mudarTela("login");

    }
    @FXML
    void irTelaprincipal(ActionEvent event){
        HelloApplication.mudarTela("principal");
    }
    protected void AddEvento(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Categoria categoria = new Categoria(getNomeEvento().getText(), getDescricao().getText(), getDataEvento().getValue());
        session.beginTransaction();
        session.persist(categoria);
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


