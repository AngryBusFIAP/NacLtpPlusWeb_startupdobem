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
 * <i>Camada de acesso aos dados de Login</i>
 * Created by
 *
 * @author vinylimaz
 *         on
 *         27/09/15 ... 14:28.
 * @version 0.5
 * @see br.com.fiap.beans.Login;
 * @see br.com.fiap.connect.ConexaoFiap ;
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

    /**
     * Metodo para verificar a senha do usu�rio atrav�s do banco de dados
     * @param userName - Nome do Usu�rio
     * @return String com a senha do usu�rio
     * @throws Excecao
     */

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
            return passwdBD;

        } catch (SQLException e) {
            throw new Excecao(e);
        }
    }

    /**
     * Metodo para alterar a senha
     * @param userName - Nome de usu�rio
     * @param passwdNew - Nova senha do usu�rio
     * @return boolean = true caso consiga alterar, false caso falha
     * @throws Excecao
     */
    public boolean alterSenha(String userName, String passwdNew) throws Excecao {
        String sql = "UPDATE T_SCN_PESSOA SET TX_SENHA = ? WHERE NM_USER = ?";

        try {
            PreparedStatement statement = c.prepareStatement(sql);
            statement.setString(1, passwdNew);
            statement.setString(2, userName);
            boolean resp = statement.execute();
            statement.close();
            c.close();
            return resp;
        } catch (SQLException e) {
            throw new Excecao(e);
        }
    }
}
