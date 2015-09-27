package br.com.fiap.beans;

public class Empresa extends Pessoa {

    private Regiao regiaoAtendida;
    private long cnpj;
    private long inscEst;
    private String contato;

    public Empresa(Regiao regiaoAtendida, long cnpj, long inscEst, String contato) {
        this.regiaoAtendida = regiaoAtendida;
        this.cnpj = cnpj;
        this.inscEst = inscEst;
        this.contato = contato;
    }

    public Empresa() {
    }

    public Regiao getRegiaoAtendida() {
        return regiaoAtendida;
    }

    public void setRegiaoAtendida(Regiao regiaoAtendida) {
        this.regiaoAtendida = regiaoAtendida;
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

    public void cadastrar() {

    }

    public void editarCadastro() {

    }

}
