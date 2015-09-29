package br.com.fiap.dao;

import br.com.fiap.beans.Reclamacao;
import br.com.fiap.connect.ConexaoFiap;
import br.com.fiap.except.Excecao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * <i>Camada de CRUD</i>
 * Created by
 * @author vinylimaz
 * on
 * @date 27/09/15
 * @time 05:29.
 *
 * @version 0.5
 * @since 0.1
 *
 * @see br.com.fiap.beans.Reclamacao;
 */
public class ReclamacaoDAO {

    private Connection c;

    public ReclamacaoDAO() throws Excecao {
        c = new ConexaoFiap().getConnection();
        try {
            c.close();
        } catch (Exception e) {
            throw new Excecao(e);
        }
    }

    /**
     * <i>Metodo para editar uma reclamação (somente o texto dela!)</i>
     *
     * @param id_rec (
     * @param reclam
     * @return String com o resultado da operação;
     * @throws Excecao
     * @author VinyLimaZ
     */
    public String editarReclam(int id_rec, String reclam) throws Excecao {
        String sql = "UPDATE T_SCN_RECLAMACAO SET TX_RECLAMACAO = ? WHERE ID_RECLAMACAO = ?";

        try {
            PreparedStatement statement = c.prepareStatement(sql);
            statement.setString(1, reclam);
            statement.setInt(2, id_rec);
            statement.execute();
            return "Registro atualizado com sucesso!";
        } catch (SQLException e) {
            throw new Excecao(e);
        } finally {
            try {
                c.close();
            } catch (SQLException e) {
                throw new Excecao(e);
            }
        }

    }

    public String setNotaPosReclam(int id_rec, byte n) throws Excecao {
        String sql = "UPDATE T_SCN_RECLAMACAO SET NR_NOTAPOSRECLAM = ? WHERE ID_RECLAMACAO = ?";

        try {
            PreparedStatement statement = c.prepareStatement(sql);
            statement.setByte(1, n);
            statement.setInt(2, id_rec);
            statement.execute();
            return "Nota atualizada com sucesso!";
        } catch (Exception e) {
            throw new Excecao(e);
        }
    }

    public String cadReclam(Reclamacao reclam) throws Excecao {

        String sql = "INSERT INTO T_SCN_RECLAMACAO VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement statement = c.prepareStatement(sql);
            statement.setInt(1, reclam.getId());
            statement.setString(2, reclam.getDtOcorr().toString());
            statement.setInt(3, reclam.getHrOcorr());
            statement.setString(4, reclam.getSentidoViagem());
            statement.setByte(5, reclam.getNotaPreReclam());
            statement.setString(6, reclam.getDtReclam());
            statement.setString(7, reclam.getReclamacao());
            statement.setString(8, reclam.getObservacao());
            statement.setInt(9, reclam.getRegiao().getIdReg());
            statement.setInt(10, reclam.getCliente().getIdPessoa());
            statement.setInt(11, reclam.getEmpresa().getIdPessoa());
            statement.setString(12, reclam.getItinerario().getIdItinerario());
            statement.execute();

            return "Reclamacao cadastrada com sucesso!";
        } catch (SQLException e) {
            throw new Excecao(e);
        }
    }

}
