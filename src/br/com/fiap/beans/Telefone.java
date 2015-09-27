package br.com.fiap.beans;

public class Telefone {

    private int idTel;
    private byte codPais;
    private byte ddd;
    private int numero;
    private int ramal;
    private int tipo;
    private Pessoa pessoa;

    public Telefone(int idTel, byte codPais, byte ddd, int numero, int ramal, int tipo, Pessoa pessoa) {
        this.idTel = idTel;
        this.codPais = codPais;
        this.ddd = ddd;
        this.numero = numero;
        this.ramal = ramal;
        this.tipo = tipo;
        this.pessoa = pessoa;
    }

    public Telefone() {
    }

    public int getIdTel() {
        return idTel;
    }

    public void setIdTel(int idTel) {
        this.idTel = idTel;
    }

    public byte getCodPais() {
        return codPais;
    }

    public void setCodPais(byte codPais) {
        this.codPais = codPais;
    }

    public byte getDdd() {
        return ddd;
    }

    public void setDdd(byte ddd) {
        this.ddd = ddd;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getRamal() {
        return ramal;
    }

    public void setRamal(int ramal) {
        this.ramal = ramal;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
