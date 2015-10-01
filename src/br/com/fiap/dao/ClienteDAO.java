package br.com.fiap.dao;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Telefone;
import br.com.fiap.connect.ConexaoFiap2;
import br.com.fiap.except.Excecao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * <i>Camada de CRUD da tabela Cliente</i>
 Created on 27/09/15 ... 05:29.
 * @author vinylimaz
 * @version 0.5
 * @since 0.1
 * @see ConexaoFiap2 ;
 * @see br.com.fiap.beans.Cliente;
 */

public class ClienteDAO {
	private Connection c;

    public ClienteDAO() throws Excecao {
        c = new ConexaoFiap2().getConnection();
    }

    /**
     * <i>Metodo para cadastro do Cliente no banco de dados</i>
     *
     * @param cliente - Objeto do tipo Cliente que
     *                  ser� usado para inserir os dados na 
     *                  tabela T_SCN_PESSOA & T_SCN_CLIENTE
     * @return String com o resultado da opera��o;
     * @throws Excecao
     * @author VinyLimaZ
     * @see br.com.fiap.beans.Cliente;
     */

    public boolean cadCliente(Cliente cliente, Endereco end, Telefone tel) throws Excecao {

		String sql = "INSERT INTO T_SCN_PESSOA VALUES (SQ_SCN_PESSOA.NEXTVAL,?,?,?,?,?,?,?)";
		try {
            //Preenchimento da Tabela T_SCN_PESSOA
            PreparedStatement statement = c.prepareStatement(sql);
            statement.setString(1, cliente.getNome());
            statement.setString(2, cliente.getDtNasc());
            statement.setString(3, cliente.getEmail());
            statement.setString(4, cliente.getUser());
            statement.setString(5, cliente.getSenha());
            statement.setDate(6, new java.sql.Date(new java.util.Date().getTime()));
            statement.setByte(7, (byte) 1);
            boolean resp = statement.execute();

            if (resp) {
                sql = "INSERT INTO T_SCN_CLIENTE VALUES (SQ_SCN_PESSOA.CURRVAL, ?,?,?)";
                //Preenchimento da tabela T_SCN_CLIENTE
                statement = c.prepareStatement(sql);
                statement.setLong(1, cliente.getCpf());
                statement.setString(2, cliente.getRg());
                statement.setString(3, cliente.getSexo());
                resp = statement.execute();

                if (resp) {
                    sql = "INSERT INTO T_SCN_ENDERECO VALUES (SQ_SCN_PESSOA.CURRVAL, ?, ?, ?, ?, ?, ?, ?, SQ_SCN_PESSOA.CURRVAL)";
                    //Preenchimento da tabela T_SCN_ENDERECO
                    statement = c.prepareStatement(sql);
                    statement.setString(1, end.getLogradouro());
                    statement.setShort(2, end.getNum());
                    statement.setString(3, end.getComplemento());
                    statement.setString(4, end.getCep());
                    statement.setString(5, end.getBairro());
                    statement.setString(6, end.getCidade());
                    statement.setString(7, end.getEstado());
                    resp = statement.execute();

                    if (resp) {
                        sql = "INSERT INTO T_SCN_TELEFONE VALUES (SQ_SCN_PESSOA.CURRVAL, ?, ?, SQ_SCN_PESSOA.CURRVAL)";
                        //Preenchimento da tabela T_SCN_TELEFONE
                        statement = c.prepareStatement(sql);
                        statement.setByte(1, tel.getDdd());
                        statement.setInt(2, tel.getNumero());
                        resp = statement.execute();
                    }
                }
            }
            statement.close();
            c.close();
            return resp;
        } catch (SQLException e) {
			throw new Excecao(e);
		}
	}

    /**
     * <i>Metodo para deletar o Cliente do banco de dados pelo idCliente</i>
     * @param idCliente - Identificador do Cliente
     * @return valor com o n�mero de linhas afetadas
     * 		   0/Erro = Falha
     * 		   1 = Deletado com sucesso
     * @throws Excecao
     */
	public int deletarCliente(int idCliente) throws Excecao {
		try {
            PreparedStatement statement = c.prepareStatement("DELETE FROM T_SCN_CLIENTE WHERE ID_CLIENTE = ?");
            statement.setInt(1, idCliente);
            int resp = statement.executeUpdate();

            if (resp > 0) {
                statement = c.prepareStatement("DELETE FROM T_SCN_PESSOA WHERE ID_PESSOA = ?");
                statement.setInt(1, idCliente);
                resp = statement.executeUpdate();
            }
            statement.close();
			c.close();
            return resp;
        } catch (Exception e) {
			throw new Excecao(e);
		}
	}

	/**
     * <i>Metodo para consultar os clientes no banco de dados 
     * atraves de seu identificador</i>
     * @param idPessoa - Identificador da Pessoa
	 * @return Cliente - Objeto Cliente
	 * @throws Excecao
	 */
    public Cliente consultarCliente(int idPessoa) throws Excecao {

		try {
			Cliente cli = new Cliente();
            String sql = "SELECT * FROM T_SCN_PESSOA WHERE ID_PESSOA = ?";
            PreparedStatement statement = c.prepareStatement(sql);
            statement.setInt(1, idPessoa);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                cli.setIdPessoa(resultSet.getInt("ID_PESSOA"));
                cli.setNome(resultSet.getString("NM_PESSOA"));
                cli.setDtNasc(resultSet.getString("DT_NASC"));
                cli.setEmail(resultSet.getString("TX_EMAIL"));
                cli.setUser(resultSet.getString("NM_USER"));
                cli.setSenha(resultSet.getString("TX_SENHA"));
                cli.setDtCadastro(resultSet.getString("DT_CADASTRO"));
                sql = "SELECT * FROM T_SCN_CLIENTE WHERE ID_CLIENTE = ?";
                statement = c.prepareStatement(sql);
                statement.setInt(1, idPessoa);
                resultSet = statement.executeQuery();
                cli.setIdCliente(idPessoa);
                cli.setCpf(resultSet.getLong("NR_CPF"));
                cli.setRg(resultSet.getString("NR_RG"));
                cli.setSexo(resultSet.getString("TX_SEXO"));
            }
            resultSet.close();
            statement.close();
			return cli;
		} catch (SQLException e) {
			throw new Excecao(e);
		}
	}

    /**
     * <i>Atualizar o cadastro do Cliente no banco de dados atrav�s do Objeto</i> 
     * @param cliente  - Objeto Cliente
     * @return boolean - true/false dependendo se a alteração foi feita ou não
     * @throws Excecao
     * @see br.com.fiap.beans.Cliente;
     */
    public boolean updateCliente(Cliente cliente) throws Excecao {
        boolean resp = false;
        String sql = "UPDATE T_SCN_PESSOA SET NM_PESSOA = ?, DT_NASC = ?, TX_EMAIL = ? WHERE ID_PESSOA = ?";
        try {
            PreparedStatement statement = c.prepareStatement(sql);
            statement.setString(1, cliente.getNome());
            statement.setString(2, cliente.getDtNasc());
            statement.setString(3, cliente.getEmail());
            statement.setInt(4, cliente.getIdCliente());
            if (statement.execute()) {
                sql = "UPDATE T_SCN_CLIENTE SET TX_SEXO = ? WHERE ID_CLIENTE = ?";
                statement = c.prepareStatement(sql);
                statement.setString(1, cliente.getSexo());
                statement.setInt(2, cliente.getIdCliente());
                resp = statement.execute();
            }
            c.close();
            statement.close();
            return resp;
        } catch (SQLException e) {
            throw new Excecao(e);
        }
    }
}
