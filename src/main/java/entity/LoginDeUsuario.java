package main.java.entity;

public class LoginDeUsuario {

    private String matricula;
    private String senha; // Super seguro.

    public LoginDeUsuario(String matricula, String senha) {
        this.matricula = matricula;
        this.senha = senha;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}