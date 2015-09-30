package br.com.fiap.beans;
/**
 *Classe beans dos dados de Login do Objeto Cliente
 *
 *@see br.com.fiap.beans.Cliente;
 *@see br.com.fiap.dao.LoginBO;
 */
public class Login {

    private String usuario;
    private String passwd;

    public Login() {
    }

    public Login(String usuario, String passwd) {
        this.usuario = usuario;
        this.passwd = passwd;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return passwd;
    }

    public void setSenha(String passwd) {
        this.passwd = passwd;
    }
}
