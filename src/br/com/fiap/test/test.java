package br.com.fiap.test;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Telefone;
import br.com.fiap.bo.ClienteBO;
import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.except.Excecao;

/**
 * Created by Jardel on 04/10/2015.
 */
public class test {

    public static void main(String[] args )throws Excecao{

        Cliente cliente = new Cliente("Testedoi12", "21/10/1976", "teste@testando.com.br", "Testeee", "teste", 12345678910l, "46464644666", "M");
        Endereco end = new Endereco("Rua do pessoa", (short) 1222, "", "05844000", "Limoeiro", "Sampa", "SP");
        Telefone tel = new Telefone((byte) 11, 999999999, cliente.getIdPessoa());


        ClienteBO cliBO = new ClienteBO();
        cliBO.inserirCliente(cliente,end,tel);

        //ClienteDAO cliDAO = new ClienteDAO();
        //cliDAO.cadCliente(cliente,end,tel);

        System.out.println(cliente.getNome());

    }

}
