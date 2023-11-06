package br.fechadinhos.gerenciadortarefas;

import br.fechadinhos.gerenciadortarefas.model.Usuario;
import br.fechadinhos.gerenciadortarefas.utill.HibernateUtil;
import javafx.animation.Transition;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.io.IOException;

public class HelloApplication extends Application {
    private static Stage stage;
    private static Scene cadastroScene;
    private static Scene listaScene;
    private static Scene loginScene;

    @Override
    public void start(Stage stage) throws IOException {
        this.stage = stage;
        stage.setTitle("Gerenciador de Tarefas");

        cadastroScene = new Scene(FXMLLoader.load(getClass().getResource("cadastro.fxml")));
        listaScene = new Scene(FXMLLoader.load(getClass().getResource("lista.fxml")));
        loginScene = new Scene(FXMLLoader.load(getClass().getResource("login.fxml")));
        stage.setScene(loginScene);
        stage.show();

//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load());
//        stage.setTitle("Hello!");
//        stage.setScene(scene);
//        stage.show();
    }

    public static void mudarTela (String src) {
        switch (src) {
            case "cadastro":
                stage.setScene(cadastroScene);
                break;
            case "lista":
                stage.setScene(listaScene);
                break;
            case "login":
                stage.setScene(loginScene);
                break;
        }
    }

//    @Override
//    public void init() throws Exception {
//
////        Usuario user1 = new Usuario("isabella", "pantolfo", "pantolfoo","123");
////        Usuario user2 = new Usuario("leticia", "rudeli", "lele","456");
////
////
////        Session session = HibernateUtil.getSessionFactory().openSession();
////        Transaction transaction = session.beginTransaction();
////
////        session.persist(user1);
////        session.persist(user2);
////
////        transaction.commit();
////
////        Usuario usuario1 = session.get(Usuario.class, 1);
////        System.out.println(usuario1);
////
////        Usuario usuario2 = session.get(Usuario.class, 2);
////        System.out.println(usuario2);
//    }

    public static void main(String[] args) {
        launch();
    }
}