<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <title>Reclame</title>
</head>
<body>
<div class="divbody">
  <%@ include file="header.jsp" %>
  <div class="containerform">
    <form method="post" action="reclamar.pqp">
      <h2 class="page-header">Reclame aqui</h2>
        <div class="form-group">
          <div class="row">
            <div class="col-lg-4">
              <label>Linha</label>
              <select name="tlinha" class="form-control">
                <option>Selecione</option>
                <optgroup label="Região Norte">
                    <option value="fazul">Azul</option>
                    <option value="famarela">Amarela</option>
                    <option value="fverde">Verde</option>
                    <option value="fvermelha">Vermelha</option>
                </optgroup>
                <optgroup label="Região Sul">
                    <option value="fazul">Azul</option>
                    <option value="famarela">Amarela</option>
                    <option value="fverde">Verde</option>
                    <option value="fvermelha">Vermelha</option>
                </optgroup>
                <optgroup label="Região Leste">
                    <option value="fazul">Azul</option>
                    <option value="famarela">Amarela</option>
                    <option value="fverde">Verde</option>
                    <option value="fvermelha">Vermelha</option>
                </optgroup>
                <optgroup label="Região Oeste">
                    <option value="fazul">Azul</option>
                    <option value="famarela">Amarela</option>
                    <option value="fverde">Verde</option>
                    <option value="fvermelha">Vermelha</option>
                </optgroup>
              </select>
            </div>
            <div class="col-lg-3">
              <label>Código da linha</label>
              <input type="text" name="fcodlin" id="tcodlin" placeholder="xx-xxxx" class="form-control">
            </div>
            <div class="col-lg-3">
              <label>Data</label>
              <input type="date" name="tdata" id="fdata" class="form-control">
            </div>
            <div class="col-lg-2">
              <label>Data</label>
              <input type="time" name="thora" id="ftime" class="form-control">
            </div>
          </div>
          <div class="row">
            <div class="col-lg-6">
              <label>Sentido da viagem</label>
              <select name="sentidoViagem" class="form-control">
                <option>Selecione</option>
                <option value="bairro">Bairro</option>
                <option value="centro">Centro</option>
                <option value="metroCptm">Metro/CPTM</option>
                <option value="circular">Circular</option>
              </select>
            </div>
            <div class="col-lg-6">
              <label>Nota</label>
              <select name="nota" class="form-control">
                <option>Selecione</option>
                <option value="0">Péssimo</option>
                <option value="1">Ruim</option>
                <option value="2">Razoável</option>
                <option value="3">Bom</option>
                <option value="4">Ótimo</option>
              </select>
            </div>
          </div>
          <div class="row">
            <div class="col-lg-12">
              <label>Detalhes do ocorrido</label>
              <textarea name="tdesc" class="form-control" rows="10"></textarea>
            </div>
          </div>
          <br>
          <div class="row">
            <div class="col-lg-12">
              <input type="hidden" value="reclame" name="veioDe">
              <input type="submit" value="Enviar" class="btn btn-primary">
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