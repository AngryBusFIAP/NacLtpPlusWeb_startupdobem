package br.com.fiap.beans;
/**
 *Classe beans do objeto Regiao
 */
public class Regiao {

    private String nome;
    private byte idReg;

    public Regiao(String nome, byte idReg) {
        this.nome = nome;
        this.idReg = idReg;
    }

    public Regiao() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public byte getIdReg() {
        return idReg;
    }

    public void setIdReg(byte idReg) {
        this.idReg = idReg;
    }
}
