package br.com.fiap.bo;

import br.com.fiap.beans.Cliente;
import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.except.Excecao;


/**
 * 
 * @author Jardel
 * @version 0.5
 */
public class ClienteBO {
	
	/**
	 * Metodo para insercao do Cliente, ele faz validações de tamanho de nome, senha, cpf e rg.
	 * @param c
	 * @throws Excecao
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
	 * Método para apagar o objeto Cliente, ele faz a verificacao com o método verfiPassw na classe LoginBO 
	 * se a senha for válida, é deletado o objeto do banco de dados
	 * @param userName
	 * @param passwd
	 * @param idPessoa
	 * @return
	 * @throws Excecao
	 */
	
    public int apagarCliente(String userName, String passwd, int idPessoa) throws Excecao {
        if (new LoginBO().verifPasswd(userName.toUpperCase(), passwd)) {
            return new ClienteDAO().deletarCliente(idPessoa);
        } else {
            return 0;
        }
    }
    
    /**
     * Metódo para listar o objeto Cliente
     * @param idPessoa
     * @return
     * @throws Excecao
     */

    public Cliente listarCliente(int idPessoa) throws Excecao {
        return new ClienteDAO().consultarCliente(idPessoa);
    }
}
