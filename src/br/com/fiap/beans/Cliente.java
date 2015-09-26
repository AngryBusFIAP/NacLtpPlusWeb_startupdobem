package br.com.fiap.beans;



import br.com.fiap.excecoes.Excecoes;
import java.util.List;
public class Cliente {
	private String nome;
	private byte qtdeEstrelas;
	private long codigo;
	public Cliente(String nome, byte qtdeEstrelas, 
			long codigo)  throws Excecoes{
		this.setNome(nome);
		this.setQtdeEstrelas(qtdeEstrelas);
		this.setCodigo(codigo);
	}
	public Cliente() {}
	public void setCodigo(long codigo) {
			this.codigo = codigo;
	}
	public long getCodigo() {
		return codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public byte getQtdeEstrelas() {
		return qtdeEstrelas;
	}

	public void setQtdeEstrelas(byte qtdeEstrelas) {
		this.qtdeEstrelas = qtdeEstrelas;
	}

}
