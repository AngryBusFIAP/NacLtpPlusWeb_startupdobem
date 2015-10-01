<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link href="css/cssDefault.css" type="text/css" rel="stylesheet">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<script type="text/javascript" src="js/jquery-1.9.1.js"></script>
<script type="text/javascript" src="js/script.js"></script>
<script type="text/javascript" src="js/jquery.mask.js"></script>
<!DOCTYPE html>
<html lang="pt-br">
<head>
  <meta charset="UTF-8">
  <title>Cadastro</title>
</head>
<body>
  <div class="divbody">
    <%@ include file="header.jsp" %>
    <h1>${msg}</h1>
    <div class="containerform">
      <form action="cadastro.pqp" method="post">
        <div class="inpesq">
          <br>
          <h2 class="page-header">Dados Pessoais</h2>
          <div class="form-group">
            <div class="row">
              <br>
              <div class="col-lg-4">
                <label><span>Nome completo</span></label>
                <input type="text" name="nome" value="" class="form-control" maxlength="40" minlength="3" maxlength="60" required/></label>
              </div>
              <div class="col-lg-4">
                <label><span>CPF</span></label>
                <input type="text" name="cpf" class="form-control" placeholder="000.000.000-00" required value="" id="cpf"/>
              </div>
              <div class="col-lg-4">
                <label><span>RG</span></label>
                <input type=text name="rg" value="" class="form-control" minlength="8" maxlength="9" placeholder="Digite como está no documento"/>
              </div>
            </div>
            <div class="row">
              <div class="col-lg-4">
                <label><span>Data de nascimento</span></label>
                <input type="date" min="1932-12-31" name="dtNasc" value="" class="form-control"/>
              </div>
              <div class="col-lg-4">
                <label><span>Telefone</span></label>
                <input id="phone" type="tel" name="telefone" value="" class="form-control" placeholder="(00) 0000-0000"/>
              </div>
              <div class="col-lg-4">
                <label><span>Sexo</span></label>
                <select class="form-control" name="sexo">
                  <option>Selecione</option>
                  <option value="masculino">Masculino</option>
                  <option value="feminino">Feminino</option>
                </select>
              </div>
            </div>
            <div class="row">
              <div class="col-lg-2">
                <label><span>CEP</span></label>
                <input class="form-control" id="cep" type="numeric" name="cep" value="" placeholder="00000-000" required/>
              </div>
              <div class="col-lg-4">
                <label><span>Logradouro</span></label>
                <input type="text" name="logradouro" class="form-control" value="" id="logradouro">
              </div>
              <div class="col-lg-2">
                <label><span>Nº</span></label>
                <input name="numLog" class="form-control" value="" type="number" id="numero">
              </div>
              <div class="col-lg-4">
                <label><span>Bairro</span></label>
                <input type="text" name="bairro" class="form-control" value="" id="bairro">
              </div>
            </div>
            <div class="row">
              <div class="col-lg-4">
                <label><span>Cidade</span></label>
                <input type="text" id="cidade" name="cidade" value="" class="form-control">
              </div>
              <div class="col-lg-4">
                <label><span>Estado</span></label>
                <select class="form-control" name="estado" id="estado">
                  <option>Selecione o Estado</option>
                  <option value="ac">Acre</option>
                  <option value="al">Alagoas</option>
                  <option value="am">Amazonas</option>
                  <option value="ap">Amapá</option>
                  <option value="ba">Bahia</option>
                  <option value="ce">Ceará</option>
                  <option value="df">Distrito Federal</option>
                  <option value="es">Espírito Santo</option>
                  <option value="go">Goiás</option>
                  <option value="ma">Maranhão</option>
                  <option value="mt">Mato Grosso</option>
                  <option value="ms">Mato Grosso do Sul</option>
                  <option value="mg">Minas Gerais</option>
                  <option value="pa">Pará</option>
                  <option value="pb">Paraíba</option>
                  <option value="pr">Paraná</option>
                  <option value="pe">Pernambuco</option>
                  <option value="pi">Piauí</option>
                  <option value="rj">Rio de Janeiro</option>
                  <option value="rn">Rio Grande do Norte</option>
                  <option value="ro">Rondônia</option>
                  <option value="rs">Rio Grande do Sul</option>
                  <option value="rr">Roraima</option>
                  <option value="sc">Santa Catarina</option>
                  <option value="se">Sergipe</option>
                  <option value="sp">São Paulo</option>
                  <option value="to">Tocantins</option>
                </select>
              </div>
            </div>
          </div>
          <div class="container-conta">
            <h2 class="page-header">Dados Pessoais</h2>
              <div class="form-group">
                <div class="row">
                  <div class="col-lg-6">
                    <label><span>Usuário</span></label>
                    <input type="text" name="user" maxlength="25" required class="form-control" />
                  </div>
                  <div class="col-lg-6">
                    <label><span>Email</span></label>
                    <input type="email" name="email" required class="form-control" />
                  </div>
                </div>
                <div class="row">
                  <div class="col-lg-6">
                    <label><span>Senha</span></label>
                    <input type="password" minlength="8" maxlength="25" name="senha" required class="form-control" />
                  </div>
                  <div class="col-lg-6">
                    <label><span>Confirmação de senha</span></label>
                    <input type="password" name="confirmSenha" minlength="8" maxlength="25" required class="form-control" />
                  </div>
                </div>
                <br>
                <div class="row">
                  <div class="col-lg-12">
                    <input type="hidden" value="cadastro" name="veioDe">
                    <input type="submit" value="Enviar" class="btn btn-primary">
                  </div>
                </div>
              </div>
            </div>
          </div>
        </form>
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