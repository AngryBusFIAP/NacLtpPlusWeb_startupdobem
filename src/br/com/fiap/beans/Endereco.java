package br.com.fiap.beans;
/**
 *Classe beans do Objeto Endereco
 *Endereco está relacionado com o Objeto Pessoa
 *
 *@see br.com.fiap.beans.Pessoa;
 *@see br.com.fiap.bo.PessoaBO;
 */
public class Endereco {

    private String logradouro;
    private short num;
    private String complemento;
    private int cep;
    private String bairro;
    private String cidade;
    private String estado;
    private int idEnd;
    private Pessoa pessoa;

    public Endereco() {
    }

    public Endereco(String logradouro, short num, String complemento, int cep, String bairro, String cidade, String estado, int idEnd, Pessoa pessoa) {
        this.logradouro = logradouro;
        this.num = num;
        this.complemento = complemento;
        this.cep = cep;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.idEnd = idEnd;
        this.pessoa = pessoa;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public short getNum() {
        return num;
    }

    public void setNum(short num) {
        this.num = num;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdEnd() {
        return idEnd;
    }

    public void setIdEnd(int idEnd) {
        this.idEnd = idEnd;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
