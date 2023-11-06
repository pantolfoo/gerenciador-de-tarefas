package br.fechadinhos.gerenciadortarefas.model;

import jakarta.persistence.*;

@Table
@Entity

public class Relatorio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRelatorio;
    @Column
    private int progresso;
    @Column
    private int desempenho;

    public Relatorio(){}

    public Relatorio(int progresso, int desempenho) {
        this.progresso = progresso;
        this.desempenho = desempenho;
    }

    public int getIdRelatorio() {
        return idRelatorio;
    }

    public void setIdRelatorio(int idRelatorio) {
        this.idRelatorio = idRelatorio;
    }

    public int getProgresso() {
        return progresso;
    }

    public void setProgresso(int progresso) {
        this.progresso = progresso;
    }

    public int getDesempenho() {
        return desempenho;
    }

    public void setDesempenho(int desempenho) {
        this.desempenho = desempenho;
    }

    @Override
    public String toString() {
        return "Relatorio{" +
                "idRelatorio=" + idRelatorio +
                ", progresso=" + progresso +
                ", desempenho=" + desempenho +
                '}';
    }
}
