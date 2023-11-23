package com.example.gerenciadortarefas.model;
import com.example.gerenciadortarefas.util.HibernateUtil;
import jakarta.persistence.*;
import javafx.fxml.FXML;
import org.hibernate.Session;

import java.time.LocalDate;
import java.util.List;

@Table
@Entity

public class Tarefa {
    public static List<Tarefa> retornaTarefas;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCategoria;
    @Column
    private String nomeCategoria;
    @Column
    private String descricaoCategoria;
    @Column
    private LocalDate dataevento;

    public Tarefa() {}

    public Tarefa(String nomeCategoria, String descricaoCategoria, LocalDate dataevento) {
        this.nomeCategoria = nomeCategoria;
        this.descricaoCategoria = descricaoCategoria;
        this.dataevento = dataevento;
    }
    @FXML
    public static List<Tarefa> retornaTarefas (){
        Session session = HibernateUtil.getSessionFactory().openSession();
        java.util.List<Tarefa> tarefas = session.createQuery("from Tarefa ", Tarefa.class).getResultStream().toList();
        session.close();
        return tarefas;
    }

    public LocalDate getDataevento() {
        return dataevento;
    }

    public void setDataevento(LocalDate dataevento) {
        this.dataevento = dataevento;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public

    void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

    public String getDescricaoCategoria() {
        return descricaoCategoria;
    }

    public void setDescricaoCategoria(String descricaoCategoria) {
        this.descricaoCategoria = descricaoCategoria;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "idCategoria=" + idCategoria +
                ", nomeCategoria='" + nomeCategoria + '\'' +
                ", descricaoCategoria='" + descricaoCategoria + '}';
    }
}
