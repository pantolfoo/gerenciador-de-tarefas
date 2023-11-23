package com.example.gerenciadortarefas.model;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Table
@Entity

public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCategoria;
    @Column
    private String nomeCategoria;
    @Column
    private String descricaoCategoria;
    @Column
    private LocalDate dataevento;

    public Categoria() {}

    public Categoria(String nomeCategoria, String descricaoCategoria, LocalDate dataevento) {
        this.nomeCategoria = nomeCategoria;
        this.descricaoCategoria = descricaoCategoria;
        this.dataevento = dataevento;
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
