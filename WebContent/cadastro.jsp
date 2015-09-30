<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
  	<meta charset="UTF-8">
  	<title>Cadastro</title>
  	<link href="css/cssDefault.css" type="text/css" rel="stylesheet">
</head>
<body>

	<div class="divbody">
 <%@ include file="header.jsp" %>

<h1>${msg}</h1>
  <div class="containerform">
    <form action="cadastroServlet" method="post">
      <div class="inpesq">
        <br>
        <h1 id="QS">Dados Pessoais</h1>
        <br>
        <label>
          <span>Nome completo:</span>
          <br>
          <input type="text" name="nome" value="" class="tam" maxlength="40" minlength="2" maxlength="30" required/></label>
          <br><br>
          <label>
            <span>RG:</span>
            <br>
            <input type=text name="rg" value="" class="tam" minlength="8" maxlength="9" placeholder="Digite apenas números"/>
          </label>
          <br><br>
          <label>
            <span>Data de nascimento:</span>
            <br>
            <input type="date" min="1915-12-31" max="2015-12-31" name="data" value="">
          </label>
          <br><br>
          <br><br>  
          <label><span>CEP:</span>
            <input type="numeric" name="cep" value="" id="cep" value="cep" placeholder="00000" required/>
          </label>
          
          <br>

          <div class="inpdir">
            <label>
              <span>CPF:</span>
              <br>
              <input type="text" name="cpf" class="tam" placeholder="Digite apenas números" maxlength="11" minlength="11" required value=""/>
            </label>
            <br><br>

            <label>
              <span>Telefone:</span>  
              <br>
              <input type="numeric" name="telefone" value="" class="tam" maxlength="15" placeholder="00-0000-0000" minlength="12"/>
            </label>
            <br><br>
            <label>
              <span>
                Sexo:
              </span><br>
              <input type="radio" name="sexo" value=""/>Masculino
              <input type="radio" name="sexo" value=""/>Feminino
            </label>
            <br><br>
            <br>
          </div>
          <br>
          <div class="container-conta">
            <h1 id="QS">Dados da Conta</h1>
            <br>
            <div class="ddconta">

              Usuario:<br><input type="email" name="user" id="email" placeholder="exemplo123@321.com.br" minlength="2" maxlength="25" required/> 

              <br><br>
              <label><span>Senha:</span><br>
                <input type="password" placeholder="*******" minlength="6" maxlength="20" required name="senha"/>
              </label>
              <br><br>

            </div>
            <div class="ddconta2">
              <label><span>Confirme a senha:</span><br>
                <input type="password" placeholder="*******" minlength="6" maxlength="20" required/>
              </label>
            </div>
            <input type="submit" value="Enviar">
            <br>
          </div>
        </div>
        </form>
      </div>

    
    <br>
    
    <footer id="rodape">
    <div class="mapasite">
      <ul class="menurodape">
        <li><a href="index.jsp">Home</a></li>
        <li><a href="reclame.jsp">Reclame</a></li>
        <li><a href="cadastro.jsp">Cadastre-se</a></li>
      </ul>
    </div>
  </footer>
  </div>
  </div>
</body>
</html>
