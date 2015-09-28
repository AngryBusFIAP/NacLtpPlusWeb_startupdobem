package br.com.fiap.beans;


public class Cliente extends Pessoa {

    private long cpf;
    private String rg;
    private String sexo;
    private int idCliente;

    public Cliente(int idPessoa, String nome, String dtNasc, String email, String user, String passwd, long cpf, String rg, String sexo, int idCliente) {
        super(idPessoa, nome, dtNasc, email, user, passwd);
        this.cpf = cpf;
        this.rg = rg;
        this.sexo = sexo;
        this.idCliente = idCliente;
    }

    public Cliente() {
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
}
