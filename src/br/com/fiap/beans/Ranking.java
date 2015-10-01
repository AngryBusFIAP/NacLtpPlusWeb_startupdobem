package br.com.fiap.beans;
/**
 *Classe beans do objeto Ranking
 *Classe Ranking está relacionada com o:
 *Objeto Empresa,
 *Objeto Reclamacao,
 *Objeto Itinerario e o 
 *Objeto Regiao
 *
 *@see br.com.fiap.beans.Regiao;
 *@see br.com.fiap.beans.Reclamacao;
 *@see br.com.fiap.beans.Itinerario;
 *@see br.com.fiap.beans.Empresa;
 */
public class Ranking {

    private Regiao regiao;
    private Empresa empresa;
    private Reclamacao reclamacao;
    private Itinerario itinerario;

    public Ranking() {
    }

    public Ranking(Regiao regiao, Empresa empresa, Reclamacao reclamacao, Itinerario itinerario) {
        this.regiao = regiao;
        this.empresa = empresa;
        this.reclamacao = reclamacao;
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

    public Reclamacao getReclamacao() {
        return reclamacao;
    }

    public void setReclamacao(Reclamacao reclamacao) {
        this.reclamacao = reclamacao;
    }

    public Itinerario getItinerario() {
        return itinerario;
    }

    public void setItinerario(Itinerario itinerario) {
        this.itinerario = itinerario;
    }
}
