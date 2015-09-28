package br.com.fiap.bo;

import br.com.fiap.beans.Reclamacao;
import br.com.fiap.dao.ReclamacaoDAO;
import br.com.fiap.except.Excecao;

public class ReclamacaoBO {
	
	public void cadastrarReclamacao(Reclamacao rec) throws Excecao{
		if(rec.getNotaPreReclam() > 9){
			System.out.println("Digite uma nota de 0 a 9");
		}
		if(rec.getNotaPosReclam() > 10){
			System.out.println("Digite uma nota de 0 a 10");
		}
		if(rec.getDtOcorr() == null){
			System.out.println("Selecione uma data válida");
		}
		if(rec.getSentidoViagem() != "B" && rec.getSentidoViagem() != "T" && 
				rec.getSentidoViagem() != "C" && rec.getSentidoViagem() != "M"){
			System.out.println();
		}
		new ReclamacaoDAO().cadReclam(rec);
	}
	
	

}
