package br.com.fiap.bo;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Telefone;
import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.except.Excecao;


/**
 * Classe das regras de neg�cio do objeto Cliente
 * @author Jardel
 * @version 0.5
 * @see br.com.fiap.beans.Cliente;
 * @see br.com.fiap.dao.ClienteDAO;
 */
public class ClienteBO {
	
	/**
	 * Metodo para inser��o/valida��o do Cliente,
	 *  ele faz valida��es de tamanho de nome,
	 *   senha, cpf e rg e ap�s isso envia para o DAO.
	 * @param cliente - Cliente
	 * @return void
	 * @throws Excecao
	 * @see br.com.fiap.dao.ClienteDAO
	 */

    //TODO JARDEL Adicionar verificações para as classes Endereço e Telefone q são necessarias ao cadastro
    public String inserirCliente(Cliente cliente, Endereco end, Telefone tel) throws Excecao {
        String resp;
        if (cliente.getNome().toUpperCase().length() <= 3) {
            return resp = "O nome deve ter mais que 3 letras";
        }

        if (cliente.getSenha().length() < 6) {
            return resp = "A senha deve conter no minimo 6 caracteres";
        }

        String cpf = String.valueOf(cliente.getCpf());
        if(cpf.length() < 10){
            return resp = "CPF Invalido";
        }

        if (cliente.getRg().length() < 9) {
            return resp = "RG invalido";
        }
        //Assinatura correta!
        if (new ClienteDAO().cadCliente(cliente, end, tel)) {
            resp = "Cadastro realizado com sucesso";
        } else {
            resp = "Cadastro não realizado! Verificar as informações";
        }
        return resp;
    }

	/**
     * Método para apagar o objeto Cliente,
     * ele faz a verificacao com o método verfiPassw na classe LoginBO
     * se a senha for válida, é então deletado o objeto do banco de dados
     * @param userName - Nome de Usuário do Cliente
     * @param passwd   - Senha do Cliente
	 * @param idPessoa - Identificador da Pessoa
     * @return int     - quantas linhas foram afetadas no banco se >= 1 == sucesso, se < 1 == falha
     * @throws Excecao
     * @see br.com.fiap.bo.LoginBO
     * @see br.com.fiap.dao.ClienteDAO
	 */
	
    public int apagarCliente(String userName, String passwd, int idPessoa) throws Excecao {
        if (new LoginBO().verifPasswd(userName.toUpperCase(), passwd)) {
            return new ClienteDAO().deletarCliente(idPessoa);
        } else {
            return 0;
        }
    }
    
    /**
     * Met�do para listar os Clientes cadastrados
     * @param idPessoa - Identificador da Pessoa
     * @return Cliente
     * @throws Excecao
     * @See br.com.fiap.dao.ClienteDAO
     */

    public Cliente listarCliente(int idPessoa) throws Excecao {
        return new ClienteDAO().consultarCliente(idPessoa);
    }
}
