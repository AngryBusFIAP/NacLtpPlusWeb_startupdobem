package br.com.fiap.bo;

import br.com.fiap.dao.LoginDAO;
import br.com.fiap.except.Excecao;

/**
 * Classe das regras de negócio do Login
 * @author vinylimaz
 *         on
 *         27/09/15 ... 14:32.
 * @version 0.5
 * @see br.com.fiap.beans.Login;
 * @see br.com.fiap.dao.LoginDAO;
 * @see br.com.fiap.except.Excecao;
 * @since 0.1
 */
public class LoginBO {
    /**
     * Metodo unico a tratar a senha, sendo assim, para se alterar chama-se esse metodo, que retornando true
     * (senha digitada Ã© igual a senha do banco de dados) realiza a operação, ou false impedindo-a
     *
     * @param userName - Nome do usuário
     * @param passwd - Senha do usuário
     * @return boolean 
     * @throws Excecao
     * @author VinyLimaZ
     * @see br.com.fiap.dao.LoginDAO
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
     * @param userName  - Nome do Usuário
     * @param passwd    - Senha antiga
     * @param newPasswd - Senha nova
     * @return boolean
     * @throws Excecao
     * @see br.com.fiap.dao.LoginDAO
     */
    public boolean alterPasswd(String userName, String passwd, String newPasswd) throws Excecao {
        if (verifPasswd(userName.toUpperCase(), passwd)) {
            return new LoginDAO().alterSenha(userName.toUpperCase(), newPasswd);
        } else {
            return false;
        }
    }

}
