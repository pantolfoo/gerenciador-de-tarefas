package com.example.gerenciadortarefas.Controller;

import com.example.gerenciadortarefas.HelloApplication;
import com.example.gerenciadortarefas.model.Usuario;
import com.example.gerenciadortarefas.util.HibernateUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import org.hibernate.Session;
public class ControleCadastro {

    @FXML
    private Button clickCadastro;

    @FXML
    private PasswordField campoSenha;

    @FXML
    private Label title;

    @FXML
    private Label orientacoes;

    @FXML
    private TextField campoNome;

    @FXML
    private TextField campoUser;

    @FXML
    private PasswordField confirmaSenha;

    @FXML
    protected void irParaLogin(ActionEvent event) {

        if(verificaCadastro())
             HelloApplication.mudarTela("login");
    }
    protected boolean verificaCadastro(){
        Session session = HibernateUtil.getSessionFactory().openSession();

        String s = campoSenha.getText();
        if (s.equals(confirmaSenha.getText())) {
        try {
            Usuario u = new Usuario(campoNome.getText(), campoUser.getText(), campoSenha.getText());
            session.beginTransaction();
            session.persist(u);
            session.getTransaction().commit();

        }catch (Exception e){
            if (session.getTransaction() != null)
                session.getTransaction().rollback();
            return false;
        }
        finally {
            session.close();
        }
        System.out.println("Usuário Adicionado com sucesso!");
        return true;

        } else {
            System.out.println("As senhas digitadas não são iguais. ");
            return false;
        }

    }


}
