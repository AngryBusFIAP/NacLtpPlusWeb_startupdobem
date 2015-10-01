package br.com.fiap.dao.naoImplementado;

import br.com.fiap.connect.ConexaoFiap2;
import br.com.fiap.except.Excecao;

import java.sql.Connection;

/**
 * <i>AngryBusServlet de respostas às reclamações</i>
 * Created by
 *
 * @author vinylimaz
 *         on
 *         28/09/15 ... 00:39.
 * @version 0.5
 * @see br.com.fiap.beans.Resposta;
 * @since 0.1
 */
public class RespostaDAO {

    private Connection c;

    public RespostaDAO() throws Excecao {
        c = new ConexaoFiap2().getConnection();

        try {
            c.close();
        } catch (Exception e) {
            throw new Excecao(e);
        }
    }

}
