package br.com.fiap.dao;

import br.com.fiap.beans.Reclamacao;
import br.com.fiap.connect.ConexaoFactory;
import br.com.fiap.except.Excecao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
 * @see br.com.fiap.connect.ConexaoFiap;
 */
public class ReclamacaoDAO {

    private Connection c;

    public ReclamacaoDAO() throws Excecao {
        c = new ConexaoFactory().getConnection();
        try {
            c.close();
        } catch (Exception e) {
            throw new Excecao(e);
        }
    }

    /**
     * <i>Metodo para editar o texto de uma reclamação já alterada</i>
     *
     * @param id_rec - Identificador da Reclamação
     * @param reclam - Descrição da reclamação;
     * @return String com o resultado da operação;
     * @throws Excecao
     * @author VinyLimaZ
     */
    public boolean editarReclam(int id_rec, String reclam) throws Excecao {
        String sql = "UPDATE T_SCN_RECLAMACAO SET TX_RECLAMACAO = ? WHERE ID_RECLAMACAO = ?";

        try {
            PreparedStatement statement = c.prepareStatement(sql);
            statement.setString(1, reclam);
            statement.setInt(2, id_rec);
            return statement.execute();
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

    /**
     * Método para dar uma nota pós reclamação
     * @param id_rec   - Identificador da reclamação
     * @param n        - Nota
     * @return boolean - True caso consiga cadastrar a nota, false caso falhe
     * @throws Excecao
     */
    public boolean setNotaPosReclam(int id_rec, byte n) throws Excecao {
        String sql = "UPDATE T_SCN_RECLAMACAO SET NR_NOTAPOSRECLAM = ? WHERE ID_RECLAMACAO = ?";

        try {
            PreparedStatement statement = c.prepareStatement(sql);
            statement.setByte(1, n);
            statement.setInt(2, id_rec);
            boolean resp = statement.execute();
            statement.close();
            c.close();
            return resp;
        } catch (Exception e) {
            throw new Excecao(e);
        }
    }

    /**
     * Método para cadastrar a reclamação no banco de dados
     * @param reclam   - Descrição da reclamação
     * @return boolean - true caso consiga cadastrar, false caso falhe
     * @throws Excecao
     */
    public boolean cadReclam(Reclamacao reclam) throws Excecao {

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
            boolean resp = statement.execute();
            statement.close();
            c.close();
            return resp;
        } catch (SQLException e) {
            throw new Excecao(e);
        }
    }

    /**
     * Metodo que retorna a lista com todas as reclamações do cliente na data selecionada.
     *
     * @param idPessoa - Codigo que representa o cliente
     * @param dtOcorr -  Data da ocorrencia, todas as ocorrencias dessa data serÃ£o recuperadas
     * @return List<Reclamacao> - Lista das reclamações que 
     * 							  atendem aos critérios de pesquisa
     * @throws Excecao
     */
    public List<Reclamacao> getReclamDtOcorrencia(int idPessoa, String dtOcorr) throws Excecao {
        List<Reclamacao> listReclam = new ArrayList<Reclamacao>();
        Reclamacao reclam;
        String sql = "SELECT * FROM T_SCN_RECLAMACAO WHERE (ID_CLIENTE = ? AND DT_OCORRENCIA = ?)";
        try {
            PreparedStatement statement = c.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            statement.setInt(1, idPessoa);
            statement.setString(2, dtOcorr);
            while (resultSet.next()) {
                reclam = new Reclamacao();
                reclam.setId(resultSet.getInt("ID_RECLAMACAO"));
                reclam.setDtOcorr(resultSet.getString("DT_OCORRENCIA"));
                reclam.setHrOcorr(resultSet.getInt("HR_OCORRENCIA"));
                reclam.setSentidoViagem(resultSet.getString("TX_SENTIDOVIAGEM"));
                reclam.setNotaPreReclam(resultSet.getByte("NR_NOTAPRERECLAM"));
                reclam.setNotaPosReclam(resultSet.getByte("NR_NOTAPOSRECLAM"));
                reclam.setDtReclam(resultSet.getString("DT_RECLAMACAO"));
                reclam.setReclamacao(resultSet.getString("TX_RECLAMACAO"));
                reclam.setObservacao(resultSet.getString("TX_OBSERVACAO"));
                listReclam.add(reclam);
            }
            c.close();
            statement.close();
            resultSet.close();
            return listReclam;

        } catch (SQLException e) {
            throw new Excecao(e);
        }
    }

    /**
     * Metodo que retorna a lista com todas as reclamaÃ§Ãµes do cliente na data selecionada.
     *
     * @param idPessoa - Codigo que representa o cliente
     * @param dtReclam - Data da reclamação, todas as reclamações 
     *                   dessa data serão recuperadas
     * @return List<Reclamacao> - Lista das reclamações que atendem ao critério de pesquisa
     * @throws Excecao
     */
    public List<Reclamacao> getReclamDtRealizada(int idPessoa, String dtReclam) throws Excecao {
        List<Reclamacao> listReclam = new ArrayList<Reclamacao>();
        Reclamacao reclam;
        String sql = "SELECT * FROM T_SCN_RECLAMACAO WHERE (ID_CLIENTE = ? AND DT_RECLAMACAO = ?)";
        try {
            PreparedStatement statement = c.prepareStatement(sql);
            statement.setInt(1, idPessoa);
            statement.setString(2, dtReclam);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                reclam = new Reclamacao();
                reclam.setId(resultSet.getInt("ID_RECLAMACAO"));
                reclam.setDtOcorr(resultSet.getString("DT_OCORRENCIA"));
                reclam.setHrOcorr(resultSet.getInt("HR_OCORRENCIA"));
                reclam.setSentidoViagem(resultSet.getString("TX_SENTIDOVIAGEM"));
                reclam.setNotaPreReclam(resultSet.getByte("NR_NOTAPRERECLAM"));
                reclam.setNotaPosReclam(resultSet.getByte("NR_NOTAPOSRECLAM"));
                reclam.setDtReclam(resultSet.getString("DT_RECLAMACAO"));
                reclam.setReclamacao(resultSet.getString("TX_RECLAMACAO"));
                reclam.setObservacao(resultSet.getString("TX_OBSERVACAO"));
                listReclam.add(reclam);
            }
            c.close();
            statement.close();
            resultSet.close();
            return listReclam;

        } catch (SQLException e) {
            throw new Excecao(e);
        }
    }

    /**
     * Método para deletar a reclamação do banco de dados usando o idReclam
     * @param idReclam - Identificador da Reclamação
     * @return boolean - true caso consiga deletar, false caso falhe
     * @throws Excecao
     */
    public boolean deleteReclam(int idReclam) throws Excecao {
        String sql = "DELETE FROM T_SCN_RECLAMACAO WHERE ID_RECLAMACAO = ?";
        try {
            PreparedStatement statement = c.prepareStatement(sql);
            statement.setInt(1, idReclam);
            boolean resp = statement.execute();
            statement.close();
            c.close();
            return resp;
        } catch (Exception e) {
            throw new Excecao(e);
        }
    }
}
