package br.com.fiap.dao.naoImplementado;

import br.com.fiap.connect.ConexaoFactory;
import br.com.fiap.except.Excecao;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by vinylimaz on
 * 27/09/15 ... 13:03.
 */
public class PessoaDAO {
    private Connection c;

    public PessoaDAO() throws Excecao {

        c = new ConexaoFactory().getConnection();
        try {
            c.close();
        } catch (SQLException e) {
            throw new Excecao(e);
        }
    }

}
