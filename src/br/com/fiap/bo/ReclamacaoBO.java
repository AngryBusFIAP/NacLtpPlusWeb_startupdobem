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
     * Metodo para insercao da Reclamação,
     * ele faz validações de tamanho de nota, data.
     * Verifica também, se no campo registro
     * @return String
     * @param rec - Reclamacao
     * @throws Excecao
     * @see br.com.fiap.dao.ReclamacaoDAO
     */

    public String cadastrarReclamacao(Reclamacao rec) throws Excecao {
        String resp;

//        if (rec.getObservacao().toUpperCase().length() < 10) {
//            return resp = "Digite uma observacao mais longa";
//        }

        if (rec.getReclamacao().toUpperCase().length() < 30) {
            return resp = "A reclamacao deve ter no minimo 30 caracteres";
        } else {
            rec.setReclamacao(rec.getReclamacao().toUpperCase());
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
            rec.setSentidoViagem(rec.getSentidoViagem().toUpperCase());
        }
        if (new ReclamacaoDAO().cadReclam(rec)) {
            resp = "Reclamacao cadastrada";
        } else {
            resp = "Reclamacao não cadastrada";
        }

        return resp;
    }

    /**
     * Método para listar as reclamações pela data/ID
     *
     * @param id   - Identificador da Reclamação
     * @param data - Data da reclamação
     * @return List<Reclamacao> - Lista com as reclamações encontradas
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
