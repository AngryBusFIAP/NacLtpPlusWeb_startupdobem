package br.com.fiap.beans;
/**
 *Classe beans do objeto Telefone
 *
 *@see br.com.fiap.bo.ClienteBO;
 */
public class Telefone {

    private int idTel;
    private byte ddd;
    private int numero;
    private int tipo;
    private int idPessoa;

    public Telefone(int idTel, byte ddd, int numero, int ramal, int tipo, int idPessoa) {
        this.idTel = idTel;
        this.ddd = ddd;
        this.numero = numero;
        this.tipo = tipo;
        this.idPessoa = idPessoa;
    }

    public Telefone() {
    }

    public int getIdTel() {
        return idTel;
    }

    public void setIdTel(int idTel) {
        this.idTel = idTel;
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

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }
}
