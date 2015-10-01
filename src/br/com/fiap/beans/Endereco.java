package br.com.fiap.beans;
/**
 *Classe beans do Objeto Endereco
 *Endereco está relacionado com o Objeto Pessoa
 *
 *@see br.com.fiap.beans.Cliente;
 *@see br.com.fiap.bo.ClienteBO;
 */
public class Endereco {

    private String logradouro;
    private short num;
    private String complemento;
    private String cep;
    private String bairro;
    private String cidade;
    private String estado;
    private int idEnd;
//    private Pessoa pessoa;

    public Endereco() {
    }

    public Endereco(String logradouro, short num, String complemento, String cep, String bairro, String cidade, String estado) {
        this.logradouro = logradouro;
        this.num = num;
        this.complemento = complemento;
        this.cep = cep;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
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

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
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

}
