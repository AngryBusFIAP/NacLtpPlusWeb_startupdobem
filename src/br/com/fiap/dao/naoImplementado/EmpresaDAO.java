package br.com.fiap.dao.naoImplementado;

import br.com.fiap.beans.Empresa;
import br.com.fiap.connect.ConexaoFiap;
import br.com.fiap.except.Excecao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by vinylimaz on
 * 27/09/15 ... 08:29.
 */
public class EmpresaDAO {

    private Connection c;

    public EmpresaDAO() throws Excecao {
        c = new ConexaoFiap().getConnection();
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
            statement.setString(5, empresa.getUser());
            statement.setString(6, empresa.getSenha());
            statement.setDate(7, new java.sql.Date(new java.util.Date().getTime()));
            statement.setByte(8, (byte) 1);
            statement.execute();

            sql = "INSERT INTO T_SCN_CLIENTE VALUES (?,?,?)";

            statement = c.prepareStatement(sql);
            statement.setLong(2, empresa.getCnpj());
            statement.setLong(3, empresa.getInscEst());
            statement.setString(4, empresa.getContato());
            statement.execute();
            System.out.println("Cadastro realizado com sucesso");
        } catch (SQLException e) {
            throw new Excecao(e);
        }
        return null;
    }
    
    	public int apagarEmpresa(int empresa) throws Excecao{
    		String sql = "DELETE FROM T_SCN_EMPRESA WHERE ID_EMPRESA=?";
    			try{
    				PreparedStatement statement = c.prepareStatement(sql);
    				statement.setInt(0, empresa);
    				int saida = statement.executeUpdate();
    				statement.close();
    				return saida;
    			}catch(SQLException e){
    				throw new Excecao(e);
    			}
    	}

    	public Empresa pesquisarEmpresa(int nrCnpj) throws Excecao{
    		try{
    		Empresa em = new Empresa();
    		PreparedStatement statement = c.prepareStatement("select * from T_SCN_EMPRESA where NR_CNPJ");
    		statement.setInt(1, nrCnpj);
    		ResultSet resultado = statement.executeQuery();
    		if(resultado.next()){
    			em.setCnpj(resultado.getLong("NR_CNPJ"));
    			em.setInscEst(resultado.getLong("NR_INSCEST"));
    			em.setContato(resultado.getString("NM_CONTATO"));
    		}
    		resultado.close();
    		statement.close();
    		return em;
    		}catch(SQLException e ){
    			throw new Excecao(e);
    		}
    	}

}
