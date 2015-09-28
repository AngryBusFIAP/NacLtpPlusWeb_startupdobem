package br.com.fiap.beans;

public class Empresa extends Pessoa {

    private long cnpj;
    private long inscEst;
    private String contato;

    public Empresa(int idPessoa, String nome, String dtNasc, String email, String user, String passwd, long cnpj, long inscEst, String contato) {
        this.cnpj = cnpj;
        this.inscEst = inscEst;
        this.contato = contato;
    }

    public Empresa() {
    }

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    public long getInscEst() {
        return inscEst;
    }

    public void setInscEst(long inscEst) {
        this.inscEst = inscEst;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }
}
