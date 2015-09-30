package br.com.fiap.bo;

import br.com.fiap.beans.Cliente;
import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.except.Excecao;


/**
 * Classe das regras de negócio do objeto Cliente
 * @author Jardel
 * @version 0.5
 * @see br.com.fiap.beans.Cliente;
 * @see br.com.fiap.dao.ClienteDAO;
 */
public class ClienteBO {
	
	/**
	 * Metodo para inserção/validação do Cliente,
	 *  ele faz validações de tamanho de nome,
	 *   senha, cpf e rg e após isso envia para o DAO.
	 * @param c - Cliente
	 * @return vazio
	 * @throws Excecao
	 * @see br.com.fiap.dao.ClienteDAO
	 */
	public void inserirCliente(Cliente c) throws Excecao{
		if(c.getNome().toUpperCase().length() <= 3){
			System.out.println("O nome deve ter mais que 3 letras");
		}
		
		if(c.getSenha().length() <= 4){
			System.out.println("A senha deve ter mais que 4 letras");
		}
		
		String cpf = String.valueOf(c.getCpf()); 
		if(cpf.length() < 10){
			System.out.println("CPF Invalido");
		}
		
		if(c.getRg().length() < 9){
			System.out.println("RG invalido");
		}
		
		new ClienteDAO().cadCliente(c);
		
	}

	/**
	 * Método para apagar o objeto Cliente,
	 * ele faz a verificacao com o método verfiPassw na classe LoginBO 
	 * se a senha for válida, é então deletado o objeto do banco de dados
	 * @param userName - Nome de Usuário do Cliente
	 * @param passwd   - Senha do Cliente
	 * @param idPessoa - Identificador da Pessoa
	 * @return int     - quantas linhas foram afetadas no banco,
	 *                    se 1, foi deletado com sucesso, 
	 *                    se 0/Erro ocorreu uma falha
	 * @throws Excecao
	 * @see br.com.fiap.bo.LoginBo
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
     * Metódo para listar os Clientes cadastrados
     * @param idPessoa - Identificador da Pessoa
     * @return Cliente
     * @throws Excecao
     * @See br.com.fiap.dao.ClienteDAO
     */

    public Cliente listarCliente(int idPessoa) throws Excecao {
        return new ClienteDAO().consultarCliente(idPessoa);
    }
}
