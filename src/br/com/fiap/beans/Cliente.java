package br.com.fiap.beans;
/**
 * Classe beans do Objeto Cliente
 * Cliente herda de pessoa
 * 
 * @see br.com.fiap.beans.Pessoa;
 * @see br.com.fiap.bo.ClienteBO;
 */

public class Cliente extends Pessoa {

    private long cpf;
    private String rg;
    private String sexo;
    private int idCliente;

    public Cliente(String nome, String dtNasc, String email, String user, String passwd, long cpf, String rg, String sexo) {
        super(nome, dtNasc, email, user, passwd);
        this.cpf = cpf;
        this.rg = rg;
        this.sexo = sexo;
    }

    public Cliente() {
        super();
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
