package br.com.fiap.beans;

/**
 * Classe beans do objeto Resposta
 * Resposta está relacionada a Pessoa
 * @author vinylimaz
 *         on
 *         28/09/15 ... 00:40.
 * @version 0.5
 * @see br.com.fiap.beans.Pessoa;
 * @since 0.1
 */
public class Resposta {
    private String reposta;
    private Pessoa cliente;
    private Pessoa empresa;

    public Resposta(String reposta, Pessoa cliente, Pessoa empresa) {
        this.reposta = reposta;
        this.cliente = cliente;
        this.empresa = empresa;
    }

    public Resposta() {
    }

    public String getReposta() {
        return reposta;
    }

    public void setReposta(String reposta) {
        this.reposta = reposta;
    }

    public Pessoa getCliente() {
        return cliente;
    }

    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }

    public Pessoa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Pessoa empresa) {
        this.empresa = empresa;
    }
}
