<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Reclame</title>
</head>
<body>
<div class="divbody">
    <%@ include file="header.jsp" %>
    <div class="containerform">
        <form method="post" action="reclamar.pqp">
            <h2 class="titulos" style="width: 988px;">Reclame aqui</h2>
            <br>

            <div>
                <%--Linha:
                <select name="tlinha" value="flinha">
                    <option value="fselec" selected>Selecione...</option>
                    <optgroup label="Região Norte">
                        <option value="fazul"> Azul </option>
                        <option value="famarela"> Amarela </option>
                        <option value="fverde"> Verde </option>
                        <option value="fvermelha"> Vermelha </option>
                    </optgroup>
                    <optgroup label="Região Sul">
                        <option value="fazul"> Azul </option>
                        <option value="famarela"> Amarela </option>
                        <option value="fverde"> Verde </option>
                        <option value="fvermelha"> Vermelha </option>
                    </optgroup>
                    <optgroup label="Região Leste">
                        <option value="fazul"> Azul </option>
                        <option value="famarela"> Amarela </option>
                        <option value="fverde"> Verde </option>
                        <option value="fvermelha"> Vermelha </option>
                    </optgroup>
                    <optgroup label="Região Oeste">
                        <option value="fazul"> Azul </option>
                        <option value="famarela"> Amarela </option>
                        <option value="fverde"> Verde </option>
                        <option value="fvermelha"> Vermelha </option>
                    </optgroup>
                </select>--%>
                <p>

                <div>Codigo da Linha: <input type="text" name="fcodlin" id="tcodlin" placeholder="xx-xxxx" size="5">
                </div>
                <br></p>

                <p>

                <div>Dia: <input type="date" name="tdata" id="fdata">
                    Hora: <input type="time" name="thora" id="ftime">

                    <div>
                        <br>

                        <p>

                        <div> Sentido da viagem:
                            <p>

                            <p><span>Bairro</span><input type="radio" value="b" name="sentidoViagem"></p>

                            <p><span>Centro</span><input type="radio" value="t" name="sentidoViagem"></p>

                            <p><span>Metro/CPTM</span><input type="radio" value="m" name="sentidoViagem"></p>

                            <p><span>Circular</span><input type="radio" value="c" name="sentidoViagem"></p>
                </p>
            </div>
            <br>

            <p>

            <div>Nota: <select name="tnota" id="fnota">
                <option value="fselec" selected> Selecione...</option>
                <option value="0"> Péssimo</option>
                <option value="1"> Ruim</option>
                <option value="2"> Razoável</option>
                <option value="3"> Bom</option>
                <option value="4"> Ótimo</option>
            </select>
                <br>
            </div>
            <br>

            <p>

            <div>Detalhes do ocorrido:<br>
							<textarea name="tdesc" id="fdesc" cols="45" rows="11" >

							</textarea><br></div><br>
            <input type="hidden" name="veioDe" value="reclamacao">
            <input type="submit" value="Finalizar"> <input type="reset" value="Limpar">

    </div>
</div>
</div>
</form>
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