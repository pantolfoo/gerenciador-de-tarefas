package br.fechadinhos.gerenciadortarefas.Controller;

import br.fechadinhos.gerenciadortarefas.*;
import br.fechadinhos.gerenciadortarefas.model.Usuario;
import br.fechadinhos.gerenciadortarefas.utill.HibernateUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class ControleCadastro {
    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtSenha;

    @FXML
    private TextField txtUser;

    @FXML
    protected void irParaLogin(ActionEvent event) {

        if(salvarUsuario())
            HelloApplication.mudarTela("lista");
    }
    protected boolean salvarUsuario(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            Usuario user = new Usuario(txtNome.getText(), txtUser.getText(),txtEmail.getText(), txtSenha.getText());
            session.beginTransaction();
            session.persist(user);
            session.getTransaction().commit();
        }catch (Exception e){
            if (session.getTransaction() != null)
                session.getTransaction().rollback();
            return false;
        }
        finally {
            session.close();
        }
        return true;
    }

}
