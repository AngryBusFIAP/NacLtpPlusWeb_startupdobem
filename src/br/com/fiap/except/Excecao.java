package br.com.fiap.except;

/**
 * Created by vinylimaz on
 * 26/09/15 ... 13:13.
 */
public class Excecao extends Exception {
	public Excecoes(String mensagem, Exception e) {
		super(mensagem, e);
		if (e.getClass().toString().equals
				("class java.lang.NumberFormatException")){
			System.out.println("Número inválido");
		}else if (e.getClass().toString().equals
				("class java.lang.ArithmeticException")){
			System.out.println("Divisão por 0");
		}else if (e.getClass().toString().equals
				("class java.lang.NullPointerException")){
			System.out.println("Valor inválido");
		}else if (e.getClass().toString().equals
				("class java.lang.FileNotFoundException")){
			System.out.println("Arquivo não encontrado");
		}else if (e.getClass().toString().equals
				("class java.lang.ArrayIndexOutofBounds")){
			System.out.println("Valor inválido");
		}else if (e.getClass().toString().equals
				("class java.lang.IllegalArgumentException")){
			System.out.println("Valor inválido");
		}
		}this.print();
		e.printStackTrace();
	}
}
