package br.com.fiap.test;

import br.com.fiap.connect.ConexaoFiap;
import br.com.fiap.except.Excecao;

import java.sql.Connection;

/**
 * Created by vinylimaz on
 * 27/09/15 ... 03:06.
 */
public class Main {

    public static void main(String[] args) throws Excecao {


        Connection c = null;

        try {
            c = new ConexaoFiap().getConnection();
            if (c != null) {
                System.out.println("Conexao aberta");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro de conexão!");
        } finally {
            try {
                c.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        /*Pessoa pe = new Pessoa(1, "jardel", "28-12-1993", "jardeldch@gmail.com", "jardel", "1123", "28-12-1993", (byte)1);
        new PessoaDAO().cadPessoa(pe);*/
//        ReclamacaoDAO reclamDAO = new ReclamacaoDAO();
//
//        System.out.println(reclamDAO.editarReclam(00001, "TESTE TESTETESTE TESTETESTE TESTETESTE TESTETESTE TESTETESTE TESTETESTE TESTETESTE TESTETESTE TESTETESTE TESTETESTE TESTETESTE TESTETESTE TESTETESTE TESTETESTE TESTETESTE TESTE"));

    }

}

