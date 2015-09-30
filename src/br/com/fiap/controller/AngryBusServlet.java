package br.com.fiap.controller;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Telefone;
import br.com.fiap.bo.ClienteBO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * <i><i>
 * Created by
 *
 * @author vinylimaz
 *         on
 *         28/09/15 ... 02:38
 * @see ;
 * @since 0.1
 */

public class AngryBusServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ClienteBO cBO = new ClienteBO();

    }
    	
    	
    	
    	/* Login */
    /*	LoginBO loginBo = new LoginBO();
    	request.getRequestDispatcher(loginBo.verifPasswd(request.getParameter("email"), 
    			request.getParameter("password"))).forward(request, response);
    if(loginBo.verifPasswd == true){
    	/*
    	 	index deverá mostrar os dados do cadastro no lugar do campo de login
    	 
    }else if (loginBo.verifPasswd == false){
    	JOptionPane.showMessageDialog(null, "Cadastro incorreto");
    } */

    /**
     * @param request
     * @param response
     * @throws Exception
     * @throws ServletException
     * @throws SQLException
     * @author Jardel
     */
    public void insereCliente(HttpServletRequest request, HttpServletResponse response) throws Exception, SQLException {
    
    /* cadastro cliente */
        Cliente cliente = new Cliente();
        Endereco endereco = new Endereco();
        Telefone tel = new Telefone();
//      Preenchimento do objeto Cliente
        cliente.setNome(request.getParameter("nome"));
        cliente.setRg(request.getParameter("rg"));
        cliente.setSexo(request.getParameter("sexo"));
        cliente.setCpf(Long.parseLong(request.getParameter("cpf")));
        cliente.setDtNasc(request.getParameter("data"));
        cliente.setUser(request.getParameter("user"));
        cliente.setSenha(request.getParameter("senha"));
        cliente.setEmail(request.getParameter("email"));
        cliente.setDtCadastro(request.getParameter("dtCadastro"));
        cliente.setActTermos(Byte.parseByte(request.getParameter("actTermos")));
//      Preenchimento do objeto Endereço
        endereco.setLogradouro(request.getParameter("log"));
        endereco.setNum(Short.parseShort(request.getParameter("numero")));
        endereco.setCidade(request.getParameter("cidade"));
        endereco.setCep(Integer.parseInt(request.getParameter("cep")));
//      Preenchimento do objeto Telefone
        tel.setCodPais(Byte.parseByte(request.getParameter("codPais")));
        tel.setDdd(Byte.parseByte(request.getParameter("ddd")));
        tel.setNumero(Integer.parseInt(request.getParameter("telefone")));
        tel.setRamal(Integer.parseInt(request.getParameter("ramal")));
        tel.setTipo(Integer.parseInt(request.getParameter("tipo")));

        ClienteBO cliBO = new ClienteBO();
        cliBO.inserirCliente(cliente, endereco, tel);




        /*ClienteDAO cDAO = new ClienteDAO();
        cDAO.cadCliente(cliente);

        request.setAttribute("msg", "SUCESSO, CADASTRO DE CLIENTE REALIZADO COM SUCESSO");
        request.getRequestDispatcher("cadastro.jsp").forward(request, response);

        if(ClienteBo.inserirCliente == true){
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");
        }else if(ClienteBo.inserirCliente == false){
            JOptionPane.showMessageDialog(null, "Ocorreu uma falha no cadastro");
        }

        ReclamacaoBO recBo = new ReclamacaoBO();
        request.getRequestDispatcher(recBo().);*/
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
