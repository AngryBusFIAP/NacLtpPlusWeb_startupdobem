/*
package br.com.fiap.bo;

import br.com.fiap.beans.Pessoa;
import br.com.fiap.dao.naoImplementado.PessoaDAO;
import br.com.fiap.except.Excecao;

*/
/**
 * Classe das regras de negócio da Pessoa
 * @deprecated
 * @author Jardel
 *
 *//*


public class PessoaBO {
	
	public void inserirPessoa(Pessoa p) throws Excecao{
			
		if(p.getNome().length() < 3){
			System.out.println("O nome inserido deve ter mais que 3 letras");
		}
		
		if(p.getEmail().length() < 5){
			System.out.println("email invalido");
		}	
		new PessoaDAO().cadPessoa(p);
	}
	
	public int atualizarNomePessoa(Pessoa pessoa)throws Excecao{
		if(pessoa.getNome().length() < 3){
            System.out.println("Falha na atualizacao: o nome inserido deve ter mais de 3 letras");
        }else{
			System.out.println("Nome atualizado com sucesso!");
		}
		return new PessoaDAO().atualizarNome(pessoa);
	}
	
	public int deletarPessoa(int pessoa)throws Excecao{
		return new PessoaDAO().apagarPessoa(pessoa);
	}
	
	

}
*/
