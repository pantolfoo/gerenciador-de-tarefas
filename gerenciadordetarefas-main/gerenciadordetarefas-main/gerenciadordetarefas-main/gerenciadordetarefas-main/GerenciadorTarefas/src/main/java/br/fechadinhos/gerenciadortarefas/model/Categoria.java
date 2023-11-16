package br.fechadinhos.gerenciadortarefas.model;

import jakarta.persistence.*;

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
    private int corCategoria;

    public Categoria() {}

    public Categoria(String nomeCategoria, String descricaoCategoria, int corCategoria) {
        this.nomeCategoria = nomeCategoria;
        this.descricaoCategoria = descricaoCategoria;
        this.corCategoria = corCategoria;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
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

    public int getCorCategoria() {
        return corCategoria;
    }

    public void setCorCategoria(int corCategoria) {
        this.corCategoria = corCategoria;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "idCategoria=" + idCategoria +
                ", nomeCategoria='" + nomeCategoria + '\'' +
                ", descricaoCategoria='" + descricaoCategoria + '\'' +
                ", corCategoria=" + corCategoria +
                '}';
    }
}
