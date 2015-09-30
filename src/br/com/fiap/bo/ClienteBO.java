package br.com.fiap.bo;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Telefone;
import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.except.Excecao;


/**
 * 
 * @author Jardel
 * @version 0.5
 */
public class ClienteBO {
	
	/**
	 * Metodo para insercao do Cliente, ele faz valida��es de tamanho de nome, senha, cpf e rg.
     * @param cliente
     * @throws Excecao
	 */
    //TODO JARDEL Adicionar verificações para as classes Endereço e Telefone q são necessarias ao cadastro
    public void inserirCliente(Cliente cliente, Endereco end, Telefone tel) throws Excecao {
        if (cliente.getNome().toUpperCase().length() <= 3) {
            System.out.println("O nome deve ter mais que 3 letras");
		}

        if (cliente.getSenha().length() < 6) {
            System.out.println("A senha deve conter no minimo 6 caracteres");
        }

        String cpf = String.valueOf(cliente.getCpf());
        if(cpf.length() < 10){
			System.out.println("CPF Invalido");
		}

        if (cliente.getRg().length() < 9) {
            System.out.println("RG invalido");
		}
        //Assinatura correta!
        new ClienteDAO().cadCliente(cliente, end, tel);

    }

	/**
	 * M�todo para apagar o objeto Cliente, ele faz a verificacao com o m�todo verfiPassw na classe LoginBO 
	 * se a senha for v�lida, � deletado o objeto do banco de dados
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
     * Met�do para listar o objeto Cliente
     * @param idPessoa
     * @return
     * @throws Excecao
     */

    public Cliente listarCliente(int idPessoa) throws Excecao {
        return new ClienteDAO().consultarCliente(idPessoa);
    }
}
