package br.fechadinhos.gerenciadortarefas.model;
import jakarta.persistence.*;
import javafx.scene.control.TextField;

@Table
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUsuario;
    @Column
    private String primeiroNome;
    @Column
    private String sobrenome;
    @Column
    private String user;
    @Column
    private String senha;

    public Usuario(String primeiroNome, String sobrenome, String user, String senha) {
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;
        this.user = user;
        this.senha = senha;
    }

    public Usuario() {

    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "idUsuario=" + idUsuario +
                ", primeiroNome='" + primeiroNome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", user='" + user + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}

