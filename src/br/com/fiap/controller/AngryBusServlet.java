package br.com.fiap.controller;
import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Login;
import br.com.fiap.beans.Pessoa;
import br.com.fiap.beans.Telefone;
import br.com.fiap.bo.LoginBO;
import br.com.fiap.bo.ReclamacaoBO;

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
    /* Login */
    	LoginBO loginBo = new LoginBO();
    	request.getRequestDispatcher(loginBo.verifPasswd(request.getParameter("email"), 
    			request.getParameter("password"))).forward(request, response);
    if(loginBo.verifPasswd == true){
    	/*
    	 	index deverá mostrar os dados do cadastro no lugar do campo de login
    	 */
    }else if (loginBo.verifPasswd == false){
    	JOptionPane.showMessageDialog(null, "Cadastro incorreto");
    }
    
    public void insereCliente(HttpServletRequest request, HttpServletResponse response)throws Exception, ServletException, SQLException{
		
    
    /* cadastro cliente */
    Cliente cli = new Cliente();
    Endereco endereco = new Endereco();
    Login login = new Login();
    Telefone tel = new Telefone();
    Pessoa pessoa = new Pessoa();
    
    
    
    cli.setNome(request.getParameter("nome"));
    cli.setRg(request.getParameter("rg"));
    cli.setSexo(request.getParameter("sexo"));
    login.setSenha(request.getParameter("password"));
    
    login.setEmail(request.getParameter("email"));
    login.setSenha = request.getRequestDispatcher(request.getParameter("password")).forward(request, response);
    cli.setSexo = request.getRequestDispatcher(request.getParameter("sexo").forward(request, response);
    cli.setCpf = request.getRequestDispatcher(request.getParameter("cpf").forward(request, response);
    endereco.setLogradouro = request.getRequestDispatcher(request.getParameter("endereco")).forward(request, response);
    endereco.setNum = request.getRequestDispatcher(request.getParameter("cep")).forward(request, response);
    endereco.setComplemento = request.getRequestDispatcher(request.getParameter("complemento")).forward(request, response);
    
    if(ClienteBo.inserirCliente == true){
    	JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");
    }else if(ClienteBo.inserirCliente == false){
    	JOptionPane.showMessageDialog(null, "Ocorreu uma falha no cadastro");
    }
    
    ReclamacaoBO RecBo = new ReclameBO();
    request.getRequestDispatcher(ReclamacaoBO.)
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
