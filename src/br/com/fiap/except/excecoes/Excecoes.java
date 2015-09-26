package br.com.fiap.excecoes;

public class Excecoes extends Exception{
	public Excecoes(String mensagem, Exception e) {
		super(mensagem, e);
		if (e.getClass().toString().equals
				("class java.lang.NumberFormatException")){
			System.out.println("Número inválido");
		}else if (e.getClass().toString().equals
				("class java.lang.ArithmeticException")){
			System.out.println("Divisão por 0");
		}
		this.print();
		e.printStackTrace();
		// Envia e-mail para o responsável
	}
	public Excecoes(String mensagem) {
		//super("\n"+mensagem);
		System.out.println(mensagem);
		// Envia e-mail para o responsável
	}
	public void print() {
		System.out.println("========== Tratando Erro ===========");
		System.out.println(getMessage());
		System.out.println("PrintStackTrace:  ");
	}
}
