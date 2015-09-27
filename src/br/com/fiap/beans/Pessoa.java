package br.com.fiap.beans;

public class Pessoa {

    private int idPessoa;
    private String nome;
    private String dtNasc;
    private String email;
    //TODO Verificar sobre associação de dependencia
    private Login l;


    public Pessoa() {
    }

    public Pessoa(int idPessoa, String nome, String dtNasc, String email, Login l) {
        this.idPessoa = idPessoa;
        this.nome = nome;
        this.dtNasc = dtNasc;
        this.email = email;
        this.l = l;
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

    public String getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(String dtNasc) {
        this.dtNasc = dtNasc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Login getL() {
        return l;
    }

    public void setL(Login l) {
        this.l = l;
    }

    public void cadastrar() {

    }

    public void editarCadastro() {

    }

}
