package br.com.fiap.beans;

public class Ranking {

    private Regiao regiao;
    private Empresa empresa;
    private Reclamacao reclamação;
    private Itinerario itinerario;

    public Ranking() {
    }

    public Ranking(Regiao regiao, Empresa empresa, Reclamacao reclamação, Itinerario itinerario) {
        this.regiao = regiao;
        this.empresa = empresa;
        this.reclamação = reclamação;
        this.itinerario = itinerario;
    }

    public Regiao getRegiao() {
        return regiao;
    }

    public void setRegiao(Regiao regiao) {
        this.regiao = regiao;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Reclamacao getReclamação() {
        return reclamação;
    }

    public void setReclamação(Reclamacao reclamação) {
        this.reclamação = reclamação;
    }

    public Itinerario getItinerario() {
        return itinerario;
    }

    public void setItinerario(Itinerario itinerario) {
        this.itinerario = itinerario;
    }
}
