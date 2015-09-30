package br.com.fiap.bo;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Telefone;
import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.except.Excecao;


/**
 * Classe das regras de negocio do objeto Cliente
 * @author Jardel
 * @version 0.5
 * @see br.com.fiap.beans.Cliente;
 * @see br.com.fiap.dao.ClienteDAO;
 */
public class ClienteBO {

	/**
	 * Metodo para insercao/validacao do Cliente,
	 *  ele faz validacoes de tamanho de nome,
	 *   senha, cpf e rg e aposs isso envia para o DAO.
	 * @param cliente - Cliente
	 * @return void
	 * @throws Excecao
	 * @see br.com.fiap.dao.ClienteDAO
	 */

    //TODO JARDEL Adicionar verificacoes para as classes Endereco e Telefone q sao necessarias ao cadastro
    public String inserirCliente(Cliente cliente, Endereco end, Telefone tel) throws Excecao {
        String resp;
        if (cliente.getNome().toUpperCase().length() <= 3) {
            return resp = "O nome deve ter mais que 3 letras";
        }

        if(cliente.getUser().toUpperCase().length() <=4){
            return resp ="O usuario deve ter mais que 4 letras";
        }

        if(cliente.getSexo().toUpperCase() != "M" && cliente.getSexo().toUpperCase() != "F"){
            return resp = "O sexo dever ser M ou F";
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

        if(tel.getDdd() <= 2){
            return resp = "DD invalido";
        }

        if(tel.getNumero() <= 7){
            return resp = "Número inválido";
        }

        if(end.getLogradouro().toUpperCase().length() <= 5){
            return resp = "A rua deve ter no minimo 5 caracteres";
        }

        if(end.getNum() >= 8){
            return resp = "Número invalido";
        }

        if(end.getBairro().toUpperCase().length() < 3){
            return resp  = "Bairro inválido";
        }

        if(end.getCep() <= 8 || end.getCep() >= 9){
            return resp = "Cep inválido";
        }

        if(end.getCidade().toUpperCase().length() <= 3){
            return resp = "Cidade inválida";
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
     * Metodo para apagar o objeto Cliente,
     * ele faz a verificacao com o metodo verfiPassw na classe LoginBO
     * se a senha for valida, � entao deletado o objeto do banco de dados
     * @param userName - Nome de Usuario do Cliente
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
     * Metodo para listar os Clientes cadastrados
     * @param idPessoa - Identificador da Pessoa
     * @return Cliente
     * @throws Excecao
     * @See br.com.fiap.dao.ClienteDAO
     */


    public Cliente listarCliente(int idPessoa) throws Excecao {
        return new ClienteDAO().consultarCliente(idPessoa);
    }

    public String atualizarCliente(String userName, String passwd, Cliente cliente) throws Excecao {
        String resp;
        if (new LoginBO().verifPasswd(userName.toUpperCase(), passwd)){
            new ClienteDAO().updateCliente(cliente);
        resp = "Cadastro atualizado com sucesso";
    }  else {
            resp = "Cadastro nao realizado! Verificar informacoes";
        }
        return resp;
    }
}
