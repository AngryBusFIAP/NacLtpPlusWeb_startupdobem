package br.com.fiap.dao.naoImplementado;

import br.com.fiap.beans.Pessoa;
import br.com.fiap.connect.ConexaoFiap;
import br.com.fiap.except.Excecao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by vinylimaz on
 * 27/09/15 ... 05:29.
 */
public class PessoaDAO {
    private Connection c;

    public PessoaDAO() throws Excecao {
        c = new ConexaoFiap().getConnection();
        try {
            
        } catch (Exception e) {
            throw new Excecao(e);
        }
    }

    public boolean cadPessoa(Pessoa pessoa) throws Excecao {
        String sql = "INSERT INTO T_SCN_PESSOA VALUES (?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement statement = c.prepareStatement(sql);
            statement.setInt(1, pessoa.getIdPessoa());
            statement.setString(2, pessoa.getNome());
            statement.setString(3, pessoa.getDtNasc());
            statement.setString(4, pessoa.getEmail());
            statement.setString(5, pessoa.getUser());
            statement.setString(6, pessoa.getSenha());
            statement.setDate(7, new java.sql.Date(new java.util.Date().getTime()));
            statement.setByte(8, (byte) 1);
            boolean result = statement.execute();
            return result;
        } catch (SQLException e) {
            throw new Excecao(e);
        }       
    }
    	
    public int atualizarNome(Pessoa pessoa) throws Excecao{
    	String sql = "UPDATE T_SCN_PESSOA set NM_PESSOA = ?";
    	try{
    		PreparedStatement statement = c.prepareStatement(sql);
    		statement.setString(1, pessoa.getNome());
    		int saida = statement.executeUpdate();
    		statement.close();
    		return saida;
    	}catch (SQLException e){
    		throw new Excecao(e);
    	}
    }
    
    public int apagarPessoa(int pessoa) throws Excecao{
    	String sql = "delete from T_SCN_PESSOA where ID_PESSOA=?";
    	try{
    		PreparedStatement statement = c.prepareStatement(sql);
    		statement.setInt(1, pessoa);
    		int saida = statement.executeUpdate();
    		statement.close();
    		return saida;
    	}catch (SQLException e){
    		throw new Excecao(e);
    	}
    }
}
