package br.com.fiap.beans;

/**
 * Classe beans do objeto Reclamacao
 * Reclamacao está relacionada com Cliente,
 * Empresa, Itinerario e Regiao
 * 
 * @see br.com.fiap.beans.Regiao;
 * @see br.com.fiap.beans.Itinerario;
 * @see br.com.fiap.beans.Empresa;
 * @see br.com.fiap.beans.Cliente;
 * @see br.com.fiap.bo.ReclamacaoBO;
 */

public class Reclamacao {

    private int id;
    private String dtOcorr;
    private int hrOcorr;
    private String sentidoViagem;
    private byte notaPreReclam;
    private byte notaPosReclam;
    private String dtReclam;
    private String reclamacao;
    private String observacao;
    private Regiao regiao;
    private Cliente cliente;
    private Empresa empresa;
    private Itinerario itinerario;

    public Reclamacao(int id, String dtOcorr, int hrOcorr, String sentidoViagem, byte notaPreReclam,
                      byte notaPosReclam, String dtReclam, String reclamacao, String observacao, Regiao regiao,
                      Cliente cliente, Empresa empresa, Itinerario itinerario) {
        this.id = id;
        this.dtOcorr = dtOcorr;
        this.hrOcorr = hrOcorr;
        this.sentidoViagem = sentidoViagem;
        this.notaPreReclam = notaPreReclam;
        this.notaPosReclam = notaPosReclam;
        this.dtReclam = dtReclam;
        this.reclamacao = reclamacao;
        this.observacao = observacao;
        this.regiao = regiao;
        this.cliente = cliente;
        this.empresa = empresa;
        this.itinerario = itinerario;
    }

    public Reclamacao() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDtOcorr() {
        return dtOcorr;
    }

    public void setDtOcorr(String dtOcorr) {
        this.dtOcorr = dtOcorr;
    }

    public int getHrOcorr() {
        return hrOcorr;
    }

    public void setHrOcorr(int hrOcorr) {
        this.hrOcorr = hrOcorr;
    }

    public String getSentidoViagem() {
        return sentidoViagem;
    }

    public void setSentidoViagem(String sentidoViagem) {
        this.sentidoViagem = sentidoViagem;
    }

    public byte getNotaPreReclam() {
        return notaPreReclam;
    }

    public void setNotaPreReclam(byte notaPreReclam) {
        this.notaPreReclam = notaPreReclam;
    }

    public byte getNotaPosReclam() {
        return notaPosReclam;
    }

    public void setNotaPosReclam(byte notaPosReclam) {
        this.notaPosReclam = notaPosReclam;
    }

    public String getDtReclam() {
        return dtReclam;
    }

    public void setDtReclam(String dtReclam) {
        this.dtReclam = dtReclam;
    }

    public String getReclamacao() {
        return reclamacao;
    }

    public void setReclamacao(String reclamacao) {
        this.reclamacao = reclamacao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Regiao getRegiao() {
        return regiao;
    }

    public void setRegiao(Regiao regiao) {
        this.regiao = regiao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Itinerario getItinerario() {
        return itinerario;
    }

    public void setItinerario(Itinerario itinerario) {
        this.itinerario = itinerario;
    }
}
