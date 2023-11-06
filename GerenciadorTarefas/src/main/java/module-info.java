module br.fechadinhos.gerenciadortarefas {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.hibernate.orm.core;
    requires jakarta.persistence;
    requires java.naming;  // Java Naming and Directory Interface (JNDI) API.


    opens br.fechadinhos.gerenciadortarefas to javafx.fxml;
    opens br.fechadinhos.gerenciadortarefas.Controller to javafx.fxml;
    opens br.fechadinhos.gerenciadortarefas.model to org.hibernate.orm.core;
    exports br.fechadinhos.gerenciadortarefas;
}