package br.com.fiap.bo;

import br.com.fiap.beans.Reclamacao;
import br.com.fiap.dao.ReclamacaoDAO;
import br.com.fiap.except.Excecao;

import java.util.List;

/**
 *	Classe das regras de negócio da Reclamação
 * 	@author Jardel
 *	@version 0.5
 *	@see br.com.fiap.beans.Reclamacao;
 *	@see br.com.fiap.dao.ReclamacaoDAO
 *	@see br.com.fiap.except.Excecao;
 */

public class ReclamacaoBO {

    /**
     * Metodo para insercao da Reclamaï¿½ï¿½o,
     * ele faz validaï¿½ï¿½es de tamanho de nota, data.
     * Verifica tambï¿½m, se no campo registro
     *
     * @param rec - Reclamacao
     * @throws Excecao
     * @see br.com.fiap.dao.ReclamacaoDAO
     */

    public void cadastrarReclamacao(Reclamacao rec) throws Excecao {
        if (rec.getNotaPreReclam() > 9) {
            System.out.println("Digite uma nota de 0 a 9");
        }
        if (rec.getNotaPosReclam() > 10) {
            System.out.println("Digite uma nota de 0 a 10");
        }
        if (rec.getDtOcorr() == null) {
            System.out.println("Selecione uma data valida");
        }
        if (rec.getSentidoViagem().toUpperCase() != "B" && rec.getSentidoViagem().toUpperCase() != "T" &&
                rec.getSentidoViagem().toUpperCase() != "C" && rec.getSentidoViagem().toUpperCase() != "M"){
            System.out.println("Caracter invÃ¡lido");
        } else {
            System.out.println("Cadastrado com sucesso");
        }
        new ReclamacaoDAO().cadReclam(rec);
    }

    /**
     * MÃ©todo para listar as reclamaï¿½ï¿½es pela data/ID
     *
     * @param id   - Identificador da Reclamaï¿½ï¿½o
     * @param data - Data da reclamaï¿½ï¿½o
     * @return List<Reclamacao> - Lista com as reclamaï¿½ï¿½es encontradas
     * @throws Excecao
     * @see br.com.fiap.dao.ReclamacaoDAO
     **/
    public List<Reclamacao> getReclamacao(int id, String data) throws Excecao {

        new ReclamacaoDAO().editarReclam(id, data);

        return getReclamacao(id, data);
    }
}
