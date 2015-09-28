package br.com.fiap.bo;

import br.com.fiap.beans.Cliente;
import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.except.Excecao;

public class ClienteBO {
	
	public void inserirCliente(Cliente c) throws Excecao{
		String cpf = String.valueOf(c.getCpf()); 
		if(cpf.length() < 10){
			System.out.println("CPF Invalido");
		}
		
		if(c.getRg().length() < 9){
			System.out.println("RG invalido");
		}
		
		new ClienteDAO().cadCliente(c);
		
	}
	
	public int apagarCliente(int cpf) throws Excecao{
		return new ClienteDAO().deletarCliente(cpf);
	}
}
