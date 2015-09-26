
package br.com.fiap.connect;

import br.com.fiap.except.Excecao;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 * Created by vinylimaz on
 * 26/09/15 ... 13:17.
 */

public class ConexaoFiap {

    public Connection getConnection() throws Excecao {

        Class.forName("oracle.jdbc.driver.OracleDriver");

        String url = "jdbc:oracle:thin:/:@192.168.60.15:1521:ORCL";
        Connection c = DriverManager.getConnection("url");
        c.close();
    }
}

