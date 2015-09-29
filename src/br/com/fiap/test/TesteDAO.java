package br.com.fiap.test;

import br.com.fiap.beans.Cliente;
import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.except.Excecao;

/**
 * Created by vinylimaz on
 * 27/09/15 ... 03:06.
 */
public class TesteDAO {

    public static void main(String[] args) throws Excecao {


//        ReclamacaoDAO reclamDAO = new ReclamacaoDAO();

//        System.out.println(reclamDAO.editarReclam(00001, "TESTE TESTETESTE TESTETESTE TESTETESTE TESTETESTE TESTETESTE TESTETESTE TESTETESTE TESTETESTE TESTETESTE TESTETESTE TESTETESTE TESTETESTE TESTETESTE TESTETESTE TESTETESTE TESTE"));

        Cliente cliente = new Cliente();

        cliente.setNome("Vinicius");
        cliente.setCpf(12312312312l);
        cliente.setRg("1231231231");
        //cliente.setIdCliente(1);
        cliente.setSenha("vini123");
        cliente.setSexo("M");
        cliente.setActTermos((byte) 1);
        cliente.setDtCadastro("21/12/2013");
        cliente.setDtNasc("23/1/1987");
        cliente.setIdPessoa(1);
        cliente.setUser("VinyLimaZ");
        cliente.setEmail("viny@viny.com");

        ClienteDAO cDAO = new ClienteDAO();

        System.out.println(cDAO.cadCliente(cliente));

    }

}

