package br.com.fiap.beans;

/**
 * <i></i>
 * Created by
 *
 * @author vinylimaz
 *         on
 *         28/09/15 ... 00:40.
 * @version 0.5
 * @see ;
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
