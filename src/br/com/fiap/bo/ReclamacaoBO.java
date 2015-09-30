package br.com.fiap.bo;

import java.util.List;

import br.com.fiap.beans.Reclamacao;
import br.com.fiap.dao.ReclamacaoDAO;
import br.com.fiap.except.Excecao;

/**
 * 
 * 	@author Jardel
 *	@version 0.5
 *	@see br.com.fiap.beans.Reclamacao;
 *	@see br.com.fiap.dao.ReclamacaoDAO
 *	@see br.com.fiap.except.Excecao;
 */

public class ReclamacaoBO {
	
	/**
	 * Metodo para insercao da Reclamação, ele faz validações de tamanho de nota, data.
	 * Verifica também, se no campo registro  
	 * @param rec
	 * @throws Excecao
	 */
	
	public void cadastrarReclamacao(Reclamacao rec) throws Excecao{
		if(rec.getNotaPreReclam() > 9){
			System.out.println("Digite uma nota de 0 a 9");
		}
		if(rec.getNotaPosReclam() > 10){
			System.out.println("Digite uma nota de 0 a 10");
		}
		if(rec.getDtOcorr() == null){
            System.out.println("Selecione uma data valida");
        }
		if(rec.getSentidoViagem().toUpperCase() != "B" && rec.getSentidoViagem().toUpperCase() != "T" && 
				rec.getSentidoViagem().toUpperCase() != "C" && rec.getSentidoViagem().toUpperCase() != "M"){
			System.out.println("Caracter inválido");
		}else{
			System.out.println("Cadastrado com sucesso");
		}
		new ReclamacaoDAO().cadReclam(rec).toUpperCase();
	}
	
	public List<Reclamacao> getReclamacao(int id, String data) throws Excecao{
		
		new ReclamacaoDAO().editarReclam(id, data);
		
		return getReclamacao(id, data);
	}
	
	 

}
