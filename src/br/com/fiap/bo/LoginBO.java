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
    public boolean loginSite(String user, String passwd) throws Excecao {
        String passwdBD = new LoginDAO().loginSite(user.toUpperCase());

        return passwdBD.equals(passwd);
    }


}
