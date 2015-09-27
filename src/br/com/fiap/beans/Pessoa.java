package br.com.fiap.beans;

import java.util.Calendar;

public class Pessoa {

    private int idPessoa;
    private String nome;
    private Calendar dtNasc;
    private String email;
    //TODO Verificar sobre associação de dependencia
    private String userName;
    private String senha;

    public Pessoa() {
    }

    public Pessoa(int idPessoa, String nome, Calendar dtNasc, String email, String userName, String senha) {
        this.idPessoa = idPessoa;
        this.nome = nome;
        this.dtNasc = dtNasc;
        this.email = email;
        this.userName = userName;
        this.senha = senha;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Calendar getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(Calendar dtNasc) {
        this.dtNasc = dtNasc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void cadastrar() {

    }

    public void editarCadastro() {

    }

}
