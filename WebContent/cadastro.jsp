<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
  <meta charset="UTF-8">
  <title>Cadastro</title>
  <link href="css/style.css" type="text/css" rel="stylesheet">
</head>
<body>
  <header>
    <div>
      <img class="logo" src="img/logo.png" alt="#"/>
      <div id="slogan"><em>O terminal solução para seus problemas de transporte publico</em></div>
    </div>
  </header>
  <nav>
    <div>
      <ul class="menu">
        <li><a href="index.html">Home</a></li>
        <li><a href="reclamar.html">Reclame</a></li>
        <li><a href="cadastro.html">Cadastre-se</a></li>
        <li><a href="about.html">Quem Somos</a></li>
        <li><a href="faq.html">Como Funciona</a></li>
      </ul>
    </div>
  </nav>

  <div class="containerform">
    <form method="post" action="cadastrar.jsp">
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
          <br>  <br>
          <div class="container-conta">
            <h1 id="QS">Dados da Conta</h1>
            <br>
            <div class="ddconta">

              E-mail:<br><input type="email" name="email" id="email" placeholder="exemplo123@321.com.br" minlength="2" maxlength="25" required/> 

              <br><br>
              <label><span>Senha:</span><br>
                <input type="password" placeholder="*******" minlength="6" maxlength="20" required/>
              </label>
              <br><br>

            </div>
            <div class="ddconta2">
              <label><span>Confirme a senha:</span><br>
                <input type="password" placeholder="*******" minlength="6" maxlength="20" required/>
              </label>
            </div>
          </div>
        </div>

        <br><br><br>

        <div class="aligncenter">                     
          <input type="submit" value="Enviar"></a>
        </div>
      </div>
    </form>
  </div>

  <footer id="rodape">
    <div class="mapasite">
      <ul class="menurodape">
        <li><a href="index.html">Home</a></li>
        <li><a href="reclamar.html">Reclame</a></li>
        <li><a href="cadastro.html">Cadastre-se</a></li>
        <li><a href="about.html">Quem Somos</a></li>
        <li><a href="faq.html">Como Funciona</a></li>
      </ul>
    </div>
  </footer>
</body>
</html>