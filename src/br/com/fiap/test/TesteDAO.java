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
 //teste do ClienteDAO parte de cadastro
        cliente.setNome("JARDELZICA");
        cliente.setCpf(12312312312l);
        cliente.setRg("1231231231");
        //cliente.setIdCliente(1);
        cliente.setSenha("vini123");
        cliente.setSexo("M");
        cliente.setActTermos((byte) 1);
        cliente.setDtCadastro("");
        cliente.setDtNasc("23/1/1987");
        cliente.setIdPessoa(7);
        cliente.setUser("VinyLim");
        cliente.setEmail("viny@vy.com");
        ClienteDAO cDAO = new ClienteDAO();
        System.out.println(cDAO.cadCliente(cliente));
 			

   //     LoginBO lBO = new LoginBO();

/*      Teste de verificação de senha digitada positivo!
        System.out.println(lBO.verifPasswd("VinyLimaZ", "vini123"));
*/
/*        LoginDAO loginDAO = new LoginDAO();
        System.out.println(lBO.alterPasswd("VinyLimaZ", "teste", "chupa"));
	*/	
    	
     // new ClienteDAO().deletarCliente(4);
        
    	
        new ClienteDAO().consultarCliente(7);
        System.out.println(cliente.getNome());
    }

}

