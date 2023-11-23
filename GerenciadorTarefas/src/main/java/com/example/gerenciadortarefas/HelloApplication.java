package com.example.gerenciadortarefas;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import com.example.gerenciadortarefas.model.Usuario;
import com.example.gerenciadortarefas.util.HibernateUtil;
import javafx.animation.Transition;
import javafx.stage.StageStyle;
import org.hibernate.*;

import java.io.IOException;

public class HelloApplication extends Application {
    private static Stage stage;
    private static Scene cadastroScene;
    private static Scene listaScene;
    private static Scene loginScene;

    @Override
    public void start(Stage stageInicial) throws IOException {
        stage = stageInicial;
        stage.setTitle("Gerenciador de Tarefas");

        cadastroScene = new Scene(FXMLLoader.load(getClass().getResource("cadastro.fxml")));
        listaScene = new Scene(FXMLLoader.load(getClass().getResource("lista.fxml")));
        loginScene = new Scene(FXMLLoader.load(getClass().getResource("login.fxml")));
        stage.setScene(loginScene);
        stage.show();
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

    @Override
    public void init() throws Exception {
        HibernateUtil.getSessionFactory().openSession();
    }


    public static void main(String[] args) {
        launch();
    }
}