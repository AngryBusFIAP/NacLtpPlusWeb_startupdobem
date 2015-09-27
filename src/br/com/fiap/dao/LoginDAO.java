package br.com.fiap.dao;

import br.com.fiap.connect.ConexaoFactory;
import br.com.fiap.except.Excecao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * <i>Projeto ${END}</i>
 * <p>
 * Created by
 *
 * @author vinylimaz
 *         on
 *         27/09/15 ... 14:28.
 * @version 0.5
 * @see br.com.fiap.beans.Login;
 * @since 0.1
 */
public class LoginDAO {
    private Connection c;

    public LoginDAO() throws Excecao {
        c = new ConexaoFactory().getConnection();

        try {
            c.close();
        } catch (Exception e) {
            throw new Excecao(e);
        }
    }


    public String loginSite(String user) throws Excecao {

        String sql = "SELECT TX_SENHA FROM T_SCN_PESSOA WHERE NM_USER = ?";

        try {
            PreparedStatement statement = c.prepareStatement(sql);
            statement.setString(1, user);
            ResultSet result = statement.executeQuery();
            String passwdBD = (result.getString("TX_SENHA"));

            return passwdBD;

        } catch (SQLException e) {
            throw new Excecao(e);
        }
    }


}
