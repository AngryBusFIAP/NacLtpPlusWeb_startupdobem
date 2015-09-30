package br.com.fiap.beans;
/**
 *Classe beans do Objeto Itiner�rio
 *Itinerario est� relacionada com o objeto Regiao
 *
 *@see br.com.fiap.beans.Regiao;
 *@see br.com.fiap.bo.ItinerarioBO;
 */
public class Itinerario {

    private String nome;
    private String horario;
    private String idItinerario;
    private Regiao regiao;

    public Itinerario() {
    }

    public Itinerario(String nome, String horario, String idItinerario, Regiao regiao) {
        this.nome = nome;
        this.horario = horario;
        this.idItinerario = idItinerario;
        this.regiao = regiao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getIdItinerario() {
        return idItinerario;
    }

    public void setIdItinerario(String idItinerario) {
        this.idItinerario = idItinerario;
    }

    public Regiao getRegiao() {
        return regiao;
    }

    public void setRegiao(Regiao regiao) {
        this.regiao = regiao;
    }
}
