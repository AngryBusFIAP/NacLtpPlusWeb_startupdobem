package br.com.fiap.dao;

import br.com.fiap.connect.ConexaoFactory;
import br.com.fiap.except.Excecao;

import java.sql.Connection;

/**
 * Created by vinylimaz on
 * 27/09/15 ... 05:29.
 */
public class PessoaDAO {
    private Connection c;

    public PessoaDAO() throws Excecao {
        c = new ConexaoFactory().getConnection();
        try {
            c.close();
        } catch (Exception e) {
            throw new Excecao(e);
        }
    }

    /*public boolean cadPessoa(Pessoa pessoa) throws Excecao {
        String sql = "INSERT INTO T_SCN_PESSOA VALUES (?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement statement = c.prepareStatement(sql);
            statement.setInt(1, pessoa.getIdPessoa());
            statement.setString(2, pessoa.getNome());
            statement.setString(3, pessoa.getDtNasc());
            statement.setString(4, pessoa.getEmail());
            statement.setString(5, pessoa.getL().getUsuario());
            statement.setString(6, pessoa.getL().getSenha());
            statement.setDate(7, new java.sql.Date(new java.util.Date().getTime()));
            statement.setByte(8, (byte) 1);
            boolean result = statement.execute();
            return result;
        } catch (SQLException e) {
            throw new Excecao(e);
        }
    }*/

}
