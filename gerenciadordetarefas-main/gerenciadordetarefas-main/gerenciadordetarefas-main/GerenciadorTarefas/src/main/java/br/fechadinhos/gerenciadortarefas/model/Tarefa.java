package br.fechadinhos.gerenciadortarefas.model;

import jakarta.persistence.*;

@Table
@Entity

public class Tarefa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTarefa;
    @Column
    private String titulo;
    @Column
    private String descricao;
    @Column
    private String dataEntrega;
    @Column
    private float nota;
    @Column
    private boolean status;

    public Tarefa (){}

    public Tarefa(String titulo, String descricao, String dataEntrega, float nota, boolean status) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataEntrega = dataEntrega;
        this.nota = nota;
        this.status = status;
    }

    public int getIdTarefa() {
        return idTarefa;
    }

    public void setIdTarefa(int idTarefa) {
        this.idTarefa = idTarefa;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(String dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "idTarefa=" + idTarefa +
                ", titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", dataEntrega='" + dataEntrega + '\'' +
                ", nota=" + nota +
                ", status=" + status +
                '}';
    }
}
