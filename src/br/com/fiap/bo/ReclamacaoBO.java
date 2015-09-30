package br.com.fiap.bo;

import br.com.fiap.beans.Reclamacao;
import br.com.fiap.dao.ReclamacaoDAO;
import br.com.fiap.except.Excecao;

import java.util.List;

/**
 *	Classe das regras de neg�cio da Reclama��o
 * 	@author Jardel
 *	@version 0.5
 *	@see br.com.fiap.beans.Reclamacao;
 *	@see br.com.fiap.dao.ReclamacaoDAO
 *	@see br.com.fiap.except.Excecao;
 */

public class ReclamacaoBO {

    /**
     * Metodo para insercao da Reclama��o,
     * ele faz valida��es de tamanho de nota, data.
     * Verifica tamb�m, se no campo registro
     *
     * @param rec - Reclamacao
     * @throws Excecao
     * @see br.com.fiap.dao.ReclamacaoDAO
     */

    public String cadastrarReclamacao(Reclamacao rec) throws Excecao {
        String resp;

        if (rec.getObservacao().toUpperCase().length() < 10) {
            return resp = "Digite uma observacao mais longa";
        }

        if (rec.getReclamacao().toUpperCase().length() < 30) {
            return resp = "A reclamacao deve ter no minimo 30 caracteres";
        }

        if (rec.getNotaPreReclam() > 9) {
            return resp = "Digite uma nota de 0 a 9";
        }
        if (rec.getNotaPosReclam() > 10) {
            return resp = "Digite uma nota de 0 a 10";
        }
        if (rec.getDtOcorr() == null) {
            return resp = "Selecione uma data valida";
        }
        if (rec.getSentidoViagem().toUpperCase() != "B" && rec.getSentidoViagem().toUpperCase() != "T" &&
                rec.getSentidoViagem().toUpperCase() != "C" && rec.getSentidoViagem().toUpperCase() != "M") {
            resp = "Caracter inválido";
        } else {
            resp = "Cadastrado com sucesso";
        }
        if (new ReclamacaoDAO().cadReclam(rec)) {
            resp = "Reclamacao cadastrada";
        } else {
            resp = "Reclamacao não cadastrada";
        }

        return resp;
    }

    /**
     * Método para listar as reclama��es pela data/ID
     *
     * @param id   - Identificador da Reclama��o
     * @param data - Data da reclama��o
     * @return List<Reclamacao> - Lista com as reclama��es encontradas
     * @throws Excecao
     * @see br.com.fiap.dao.ReclamacaoDAO
     **/
    public List<Reclamacao> getReclamacao(int id, String data) throws Excecao {

        new ReclamacaoDAO().editarReclam(id, data);

        return getReclamacao(id, data);
    }


    public boolean deletarReclamacao(String userName, String passwd, int idReclamacao) throws Excecao {
        if (new LoginBO().verifPasswd(userName.toUpperCase(), passwd)) {
            return new ReclamacaoDAO().deleteReclam(idReclamacao);
        } else {
            return false;
        }
    }
}
