package br.com.fiap.except;

import java.sql.SQLException;

/**
 * Created by vinylimaz on
 * 26/09/15 ... 13:13.
 */
public class Excecao extends Exception {

    public Excecao(Exception e) {
        if (e.getClass().toString().equals
                ("class java.lang.NumberFormatException")) {
            System.out.println("Numero inválido" + e.toString());
        } else if (e.getClass().toString().equals
                ("class java.lang.ArithmeticException")) {
            System.out.println("Divisão por 0" + e.toString());
        } else if (e.getClass().toString().equals
                ("class java.lang.NullPointerException")) {
            System.out.println("Valor inválido" + e.toString());
        } else if (e.getClass().toString().equals
                ("class java.lang.FileNotFoundException")) {
            System.out.println("Arquivo não encontrado" + e.toString());
        } else if (e.getClass().toString().equals
                ("class java.lang.ArrayIndexOutofBounds")) {
            System.out.println("Valor inválido" + e.toString());
        } else if (e.getClass().toString().equals
                ("class java.lang.IllegalArgumentException")) {
            System.out.println("Valor inválido" + e.toString());
        } else {
            System.out.println("Erro desconhecido " + e.toString());
        }
    }

    public Excecao(SQLException e) {
        System.out.println("Problema com o BD. " + e.toString());
    }

    public Excecao(ClassNotFoundException e) {
        System.out.println("Driver JDBC não encontrado! " + e.toString());
    }
}
