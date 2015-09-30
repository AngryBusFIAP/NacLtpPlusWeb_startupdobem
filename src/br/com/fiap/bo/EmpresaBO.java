package br.com.fiap.bo;

import br.com.fiap.beans.Empresa;
import br.com.fiap.dao.EmpresaDAO;
import br.com.fiap.except.Excecao;

public class EmpresaBO {
	
	public void inserirEmpresa(Empresa e) throws Excecao{
		String cnpj = String.valueOf(e.getCnpj());
		if((cnpj.length()) < 14){
			System.out.println("O cnpj esta incorreto");
		}
			
		new EmpresaDAO().cadEmpresa(e).toUpperCase(); 
	}

	public int deletarEmpresa(int empresa) throws Excecao{
		return new EmpresaDAO().apagarEmpresa(empresa);
	}
	
	public Empresa pesquisarEmpresa(int nrCnpj) throws Excecao{
		return new EmpresaDAO().pesquisarEmpresa(nrCnpj);
	}
	
	
	
}
