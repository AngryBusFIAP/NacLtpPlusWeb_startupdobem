package br.com.fiap.dao;

import br.com.fiap.beans.Empresa;
import br.com.fiap.connect.ConexaoFactory;
import br.com.fiap.except.Excecao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by vinylimaz on
 * 27/09/15 ... 08:29.
 */
public class EmpresaDAO {

    private Connection c;

    public EmpresaDAO() throws Excecao {
        c = new ConexaoFactory().getConnection();
        try {
            c.close();
        } catch (Exception e) {
            throw new Excecao(e);
        }
    }

    public String cadEmpresa(Empresa empresa) throws Excecao {

        String sql = "INSERT INTO T_SCN_PESSOA VALUES (?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement statement = c.prepareStatement(sql);
            statement.setInt(1, empresa.getIdPessoa());
            statement.setString(2, empresa.getNome());
            statement.setString(3, empresa.getDtNasc());
            statement.setString(4, empresa.getEmail());
            statement.setString(5, empresa.getL().getUsuario());
            statement.setString(6, empresa.getL().getSenha());
            statement.setDate(7, new java.sql.Date(new java.util.Date().getTime()));
            statement.setByte(8, (byte) 1);
            statement.execute();

            sql = "INSERT INTO T_SCN_CLIENTE VALUES (?,?,?)";

            statement = c.prepareStatement(sql);
            statement.setLong(1, empresa.getCnpj());
            statement.setLong(2, empresa.getInscEst());
            statement.setString(3, empresa.getContato());
            statement.execute();
            System.out.println("Cadastro realizado com sucesso");
        } catch (SQLException e) {
            throw new Excecao(e);
        }
        return null;
    }


}
