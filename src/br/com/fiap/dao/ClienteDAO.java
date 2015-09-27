package br.com.fiap.dao;

import br.com.fiap.beans.Cliente;
import br.com.fiap.connect.ConexaoFactory;
import br.com.fiap.except.Excecao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by vinylimaz on
 * 27/09/15 ... 05:29.
 */
public class ClienteDAO {
    private Connection c;

    public ClienteDAO() throws Excecao {
        c = new ConexaoFactory().getConnection();

        try {
            c.close();
        } catch (Exception e) {
            throw new Excecao(e);
        }
    }

    public String cadCliente(Cliente cliente) throws Excecao {

        String sql = "INSERT INTO T_SCN_PESSOA VALUES (?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement statement = c.prepareStatement(sql);
            statement.setInt(1, cliente.getIdPessoa());
            statement.setString(2, cliente.getNome());
            statement.setString(3, cliente.getDtNasc());
            statement.setString(4, cliente.getEmail());
            statement.setString(5, cliente.getL().getUsuario());
            statement.setString(6, cliente.getL().getSenha());
            statement.setDate(7, new java.sql.Date(new java.util.Date().getTime()));
            statement.setByte(8, (byte) 1);
            statement.execute();

            sql = "INSERT INTO T_SCN_CLIENTE VALUES (?,?,?)";

            statement = c.prepareStatement(sql);
            statement.setLong(1, cliente.getCpf());
            statement.setString(2, cliente.getRg());
            statement.setString(3, cliente.getSexo());
            statement.execute();
            System.out.println("Cadastro realizado com sucesso");
        } catch (SQLException e) {
            throw new Excecao(e);
        }
        return null;
    }
}
