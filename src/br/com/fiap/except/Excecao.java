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
			System.out.println("N�mero inv�lido");
		}else if (e.getClass().toString().equals
				("class java.lang.ArithmeticException")){
			System.out.println("Divis�o por 0");
		}else if (e.getClass().toString().equals
				("class java.lang.NullPointerException")){
			System.out.println("Valor inv�lido");
		}else if (e.getClass().toString().equals
				("class java.lang.FileNotFoundException")){
			System.out.println("Arquivo n�o encontrado");
		}else if (e.getClass().toString().equals
				("class java.lang.ArrayIndexOutofBounds")){
			System.out.println("Valor inv�lido");
		}else if (e.getClass().toString().equals
				("class java.lang.IllegalArgumentException")){
			System.out.println("Valor inv�lido");
		}
		}this.print();
		e.printStackTrace();
	}
}
