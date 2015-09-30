package br.com.fiap.bo;

import br.com.fiap.dao.LoginDAO;
import br.com.fiap.except.Excecao;

/**
 * <i>Projeto ${END}</i>
 * <p>
 * Created by
 *
 * @author vinylimaz
 *         on
 *         27/09/15 ... 14:32.
 * @version 0.5
 * @see br.com.fiap.beans.Login;
 * @since 0.1
 */
public class LoginBO {

    /**
     * <i>Metodo para verificação da senha do usuario</i>
     *
     * @param user
     * @param passwd
     * @return
     * @throws Excecao
     */

    /**
     * Metodo unico a tratar a senha, sendo assim, para se alterar chama-se esse metodo, que retornando true
     * (senha digitada é igual a senha do banco de dados) realiza a operação, ou false impedindo-a
     *
     * @param userName
     * @param passwd
     * @return boolean
     * @throws Excecao
     * @author VinyLimaZ
     */
    public boolean verifPasswd(String userName, String passwd) throws Excecao {
        String bdPasswd = new LoginDAO().verifPasswd(userName);
        return bdPasswd.equals(passwd);
    }

    /**
     * Metodo para troca de senha.
     * Verifica-se a senha com o metodo verifPasswd(), que retornando true, chama o LoginDAO.alterPasswd()
     * para alterar a senha no bando de dados.
     *
     * @param userName
     * @param passwd    Senha antiga
     * @param newPasswd Senha nova
     * @return boolean
     * @throws Excecao
     */
    public boolean alterPasswd(String userName, String passwd, String newPasswd) throws Excecao {
        if (verifPasswd(userName.toUpperCase(), passwd)) {
            return new LoginDAO().alterSenha(userName.toUpperCase(), newPasswd);
        } else {
            return false;
        }
    }

}
