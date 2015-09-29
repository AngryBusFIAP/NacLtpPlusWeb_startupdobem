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
    }


    public String verifPasswd(String userName) throws Excecao {

        String sql = "SELECT TX_SENHA FROM T_SCN_PESSOA WHERE NM_USER = ?";

        try {
            PreparedStatement statement = c.prepareStatement(sql);
            statement.setString(1, userName);
            ResultSet result = statement.executeQuery();
            result.next();
            String passwdBD = (result.getString("TX_SENHA"));
            statement.close();
            result.close();
            c.close();
            //TODO BO que recebe essa senha e verifica a igualidade com a senha digitada!
            //senha.equals(verificPasswd(userName)){...}
            return passwdBD;

        } catch (SQLException e) {
            throw new Excecao(e);
        }
    }

    public boolean alterSenha(String userName, String passwdNew) throws Excecao {
        //TODO Esse metodo no BO deve primeiramente chamar o BO.verifPasswd()!

        String sql = "UPDATE T_SCN_PESSOA SET TX_SENHA = ? WHERE NM_USER = ?";

        try {
            PreparedStatement statement = c.prepareStatement(sql);
            statement.setString(1, passwdNew);
            statement.setString(2, userName);
            statement.execute();
            statement.close();
            c.close();
            return true;
        } catch (SQLException e) {
            throw new Excecao(e);
        }
    }
}
