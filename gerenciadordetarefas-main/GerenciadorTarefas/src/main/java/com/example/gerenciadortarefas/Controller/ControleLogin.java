package com.example.gerenciadortarefas.Controller;

import com.example.gerenciadortarefas.HelloApplication;
import com.example.gerenciadortarefas.model.Usuario;
import com.example.gerenciadortarefas.util.HibernateUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.hibernate.Session;

public class ControleLogin {
    @FXML
    private Label avisoUser;

    @FXML
    private Label avisoSenha;

    @FXML
    private TextField campoUser;

    @FXML
    private TextField campoSenha;

    protected void limparErros(){
        avisoSenha.setText("");
        avisoUser.setText("");
    }

    @FXML
    void entrar(ActionEvent event) {
        limparErros();
        verificaUser();
        if (verificaLogin())
            HelloApplication.mudarTela("principal");

    }

    protected void verificaUser(){
        Session session  = HibernateUtil.getSessionFactory().openSession();

        try {
            session.beginTransaction();

            Usuario u = session.createQuery("from Usuario where user = :u", Usuario.class)
                    .setParameter("usuario", campoUser.getText().toLowerCase())
                    .uniqueResult();

            if (u == null){
                campoUser.setText("Usuário não encontrado.");
            }

            session.getTransaction().commit();

        } catch (Exception e){
            if (session.getTransaction() != null)
                session.getTransaction().rollback();
        } finally {
            session.close();
        }
    }

    protected Boolean verificaLogin(){
        Session session  = HibernateUtil.getSessionFactory().openSession();

        try {
            session.beginTransaction();

            Usuario u = session.createQuery("from Usuario where user = :u and senha = :senha", Usuario.class)
                    .setParameter("usuario", campoUser.getText().toLowerCase())
                    .setParameter("senha", campoSenha.getText())
                    .uniqueResult();

            if (u == null){
                avisoSenha.setText("Senha incorreta");
                return false;
            }
            session.getTransaction().commit();

        } catch (Exception e){
            if (session.getTransaction() != null)
                session.getTransaction().rollback();
        } finally {
            session.close();
        }

        return true;
    }

    @FXML
    void irTelaCadastro(ActionEvent event) {
        HelloApplication.mudarTela("cadastro");
    }
}
