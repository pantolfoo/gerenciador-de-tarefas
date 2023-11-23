module com.example.gerenciadortarefas {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.naming;
    requires org.hibernate.orm.core;
    requires jakarta.persistence;


    opens com.example.gerenciadortarefas to javafx.fxml;
    opens com.example.gerenciadortarefas.Controller to javafx.fxml;
    opens com.example.gerenciadortarefas.model to org.hibernate.orm.core;
    exports com.example.gerenciadortarefas;
    exports com.example.gerenciadortarefas.util;
    opens com.example.gerenciadortarefas.util to javafx.fxml;

}