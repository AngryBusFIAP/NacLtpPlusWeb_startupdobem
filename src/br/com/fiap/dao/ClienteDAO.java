package br.com.fiap.dao;

import br.com.fiap.beans.Cliente;
import br.com.fiap.connect.ConexaoFactory;
import br.com.fiap.except.Excecao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * <i>Camada de CRUD</i> Created by
 * 
 * @author vinylimaz on 27/09/15 ... 05:29.
 *
 * @version 0.5
 * @since 0.1
 *
 * @see br.com.fiap.beans.Cliente;
 */
public class ClienteDAO {
	private Connection c;

	public ClienteDAO() throws Excecao {
		c = new ConexaoFactory().getConnection();
	}

	/**
	 * <i>Metodo para cadastro do cliente no banco de dados</i>
	 *
	 * @param cliente
	 * @return String com o resultado da operação;
	 * @throws Excecao
	 * @author VinyLimaZ
	 */
	public boolean cadCliente(Cliente cliente) throws Excecao {

		String sql = "INSERT INTO T_SCN_PESSOA VALUES (?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement statement = c.prepareStatement(sql);
			statement.setInt(1, cliente.getIdPessoa());
			statement.setString(2, cliente.getNome());
			statement.setString(3, cliente.getDtNasc());
			statement.setString(4, cliente.getEmail());
			statement.setString(5, cliente.getUser());
			statement.setString(6, cliente.getSenha());
			statement.setDate(7,
					new java.sql.Date(new java.util.Date().getTime()));
			statement.setByte(8, (byte) 1);
			statement.execute();

			sql = "INSERT INTO T_SCN_CLIENTE VALUES (?, ?,?,?)";

			statement = c.prepareStatement(sql);
			statement.setInt(1, cliente.getIdPessoa());
			statement.setLong(2, cliente.getCpf());
			statement.setString(3, cliente.getRg());
			statement.setString(4, cliente.getSexo());
			statement.execute();
			statement.close();
			c.close();
			return true;
		} catch (SQLException e) {
			throw new Excecao(e);
		}
	}

	public int deletarCliente(int idCliente) throws Excecao {
		try {
			PreparedStatement statement = c
					.prepareStatement("DELETE FROM T_SCN_CLIENTE WHERE ID_CLIENTE = ?");
			statement.setInt(1, idCliente);
			statement.executeUpdate();

			statement = c
					.prepareStatement("DELETE FROM T_SCN_PESSOA WHERE ID_PESSOA = ?");
			statement.setInt(1, idCliente);
			int saida = statement.executeUpdate();
			statement.close();
			c.close();
			return saida;
		} catch (Exception e) {
			throw new Excecao(e);
		}
	}

	public Cliente consultarCliente(int iCliente) throws Excecao {

		try {
			Cliente cli = new Cliente();
			PreparedStatement statement = c
					.prepareStatement("SELECT * FROM T_SCN_PESSOA WHERE ID_PESSOA = ?");
			statement.setInt(1, iCliente);
			ResultSet resultado = statement.executeQuery();
			if (resultado.next()) {
				cli.setIdPessoa(resultado.getInt("ID_PESSOA"));
				cli.setNome(resultado.getString("NM_PESSOA"));
				cli.setDtNasc(resultado.getString("DT_NASC"));
				cli.setEmail(resultado.getString("TX_EMAIL"));
				cli.setUser(resultado.getString("NM_USER"));
				cli.setSenha(resultado.getString("TX_SENHA"));
				cli.setDtCadastro(resultado.getString("DT_CADASTRO"));
				cli.setActTermos(resultado.getByte("NM_ACEITATERMOS"));

			}
			resultado.close();
			statement.close();
			return cli;
		} catch (SQLException e) {
			throw new Excecao(e);
		}
	}

}
