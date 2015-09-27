package br.com.fiap.beans;

public class Empresa extends Pessoa {

    private Regiao regiaoAtendida;
    private String cnpj;
    private int inscEst;
    private Itinerario[] itinerario;

    public Empresa(Regiao regiaoAtendida, String cnpj, int inscEst, Itinerario[] itinerario) {
        this.regiaoAtendida = regiaoAtendida;
        this.cnpj = cnpj;
        this.inscEst = inscEst;
        this.itinerario = itinerario;
    }

    public Empresa() {
    }

    public Regiao getRegiaoAtendida() {
        return regiaoAtendida;
    }

    public void setRegiaoAtendida(Regiao regiaoAtendida) {
        this.regiaoAtendida = regiaoAtendida;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getInscEst() {
        return inscEst;
    }

    public void setInscEst(int inscEst) {
        this.inscEst = inscEst;
    }

    public Itinerario[] getItinerario() {
        return itinerario;
    }

    public void setItinerario(Itinerario[] itinerario) {
        this.itinerario = itinerario;
    }

    public void cadastrar() {

    }

    public void editarCadastro() {

    }

}
