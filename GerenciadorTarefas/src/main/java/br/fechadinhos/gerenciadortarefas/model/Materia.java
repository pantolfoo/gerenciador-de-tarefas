package br.fechadinhos.gerenciadortarefas.model;

import jakarta.persistence.*;

@Table
@Entity

public class Materia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMateria;
    @Column
    private String nomeMateria;
    @Column
    private String descricaoMateria;
    @Column
    private int corMateria;

    public Materia (){}

    public Materia(String nomeMateria, String descricaoMateria, int corMateria) {
        this.nomeMateria = nomeMateria;
        this.descricaoMateria = descricaoMateria;
        this.corMateria = corMateria;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNomeMateria() {
        return nomeMateria;
    }

    public void setNomeMateria(String nomeMateria) {
        this.nomeMateria = nomeMateria;
    }

    public String getDescricaoMateria() {
        return descricaoMateria;
    }

    public void setDescricaoMateria(String descricaoMateria) {
        this.descricaoMateria = descricaoMateria;
    }

    public int getCorMateria() {
        return corMateria;
    }

    public void setCorMateria(int corMateria) {
        this.corMateria = corMateria;
    }

    @Override
    public String toString() {
        return "Materia{" +
                "idMateria=" + idMateria +
                ", nomeMateria='" + nomeMateria + '\'' +
                ", descricaoMateria='" + descricaoMateria + '\'' +
                ", corMateria=" + corMateria +
                '}';
    }
}
