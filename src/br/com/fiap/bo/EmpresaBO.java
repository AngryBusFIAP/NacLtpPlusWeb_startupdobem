/*
package br.com.fiap.bo;

import br.com.fiap.beans.Empresa;
import br.com.fiap.dao.EmpresaDAO;
import br.com.fiap.except.Excecao;



/**
 * Classe das regras de neg�cio da Empresa
 * @version 0.5
 * @see br.com.fiap.beans.Empresa;
 * @see br.com.fiap.dao.EmpresaDAO;
 * @see br.com.fiap.except.Excecao;
 *//*

public class EmpresaBO {

/**
	 * @deprecated arrumar
	 * 	Método utilizado para verifica��o do CNPJ da Empresa antes de cadastrar
	 * @param e - Empresa
	 * @throws Excecao
	 * @return void
	 * @see br.com.fiap.dao.EmpresaDAO
	 *//*

	public void inserirEmpresa(Empresa e) throws Excecao {
		String cnpj = String.valueOf(e.getCnpj());
		if((cnpj.length()) < 14){
			System.out.println("O cnpj esta incorreto");
		}

		new EmpresaDAO().cadEmpresa(e).toUpperCase();
	}


/**
	 * M�todo para deletar a empresa do banco de dados
	 *
	 * @param idEmpresa - Identificador da Empresa
	 * @return Vazio
	 * @throws Excecao
	 * @see br.com.fiap.dao.EmpresaDAO
	 *//*

	public int deletarEmpresa(int idEmpresa) throws Excecao{
		return new EmpresaDAO().apagarEmpresa(empresa);
	}


/**
	 * Método usado para pesquisar a empresa pelo número do CNPJ
	 * @param nrCnpj - n�mero do CNPJ
	 * @return Empresa
	 * @throws Excecao
	 * @see br.com.fiap.dao.EmpresaDAO
	 */

/*

	public Empresa pesquisarEmpresa(int nrCnpj) throws Excecao{
		return new EmpresaDAO().pesquisarEmpresa(nrCnpj);
	}



}
*/

