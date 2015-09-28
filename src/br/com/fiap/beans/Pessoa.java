package br.com.fiap.beans;

public class Pessoa {

    private int idPessoa;
    private String nome;
    private String dtNasc;
    private String email;
    //TODO Verificar sobre associação de dependencia
    private Login l;
    private String dtCadastro;
    private byte actTermos;

    public Pessoa() {
    }

    public Pessoa(int idPessoa, String nome, String dtNasc, String email, String user, String passwd, String dtCadastro, byte actTermos) {
        this.idPessoa = idPessoa;
        this.nome = nome;
        this.dtNasc = dtNasc;
        this.email = email;
        l.setUsuario(user);
        l.setSenha(passwd);
        this.dtCadastro = dtCadastro;
        this.actTermos = actTermos;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(String dtNasc) {
        this.dtNasc = dtNasc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Login getLogin() {
        return l;
    }

    public String getUser() {
        return l.getUsuario();
    }

    public void setUser(String user) {
        l.setUsuario(user);
    }

    public String getSenha() {
        return l.getSenha();
    }

    public void setSenha(String passwd) {
        l.setSenha(passwd);
    }

	public String getDtCadastro() {
		return dtCadastro;
	}

	public void setDtCadastro(String dtCadastro) {
		this.dtCadastro = dtCadastro;
	}

	public byte getActTermos() {
		return actTermos;
	}

	public void setActTermos(byte actTermos) {
		this.actTermos = actTermos;
	}

}
