<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link href="css/cssDefault.css" type="text/css" rel="stylesheet">
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

                <h1 id="QS">Dados Pessoais</h1>
                <br>
                <label>
                    <span>Nome completo</span>
                    <br>

                    <p><input type="text" name="nome" value="" class="tam" maxlength="40" minlength="2" maxlength="30"
                              required/></label></p>
                <br><br>
                <label>
                    <span>RG</span>
                    <br>

                    <p><input type=text name="rg" value="" class="tam" minlength="8" maxlength="9"
                              placeholder="Digite como está no documento"/></p>
                </label>
                <br><br>
                <label>
                    <span>Data de nascimento</span>
                    <br>

                    <p><input type="date" min="1932-12-31" name="dtNasc" value=""></p>
                </label>
                <br><br>
                <br><br>

                <label for="log">
                    <span>Logradouro</span></span><span id="numLog">Nº</span>

                    <p><input id="log" type="text" name="log"><span class="space"></span><input type="number"
                                                                                                name="numLog"></p>
                </label>

                <p></p>
                <label><span>CEP</span></label><label for="cidade"><span id="spanCidade">Cidade</span></label>

                <p><input id="cep" type="numeric" name="cep" value="" id="cep" value="cep" placeholder="00000-000"
                          min-value="8" max-value="8" required/><span class="space"></span><input type="text"
                                                                                                  id="cidade"
                                                                                                  name="cidade"></p>
                <%-- select dos estados
                <label><span id="spanEstado">Estado</span>

                    <p>
                        <select name="estado">
                            <option value="null">Selecione o Estado</option>
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
                    </p>
                </label>--%>

                <br>

                <div class="inpdir">
                    <label>
                        <span>CPF</span>
                        <br>

                        <p><input type="text" name="cpf" class="tam" placeholder="Digite apenas números" maxlength="11"
                                  minlength="11" required value=""/></p>
                    </label>
                    <br><br>

                    <div class="cadTel">
                        <label>
                            <span>Telefone</span>

                            <p><input id="dddTel" type="tel" autocomplete="11" maxlength="2" minlength="1" minvalue="11"
                                      required>
                                <input id="numTel" type="tel" name="telefone" value="" class="tam" maxlength="15"
                                       placeholder="00000-0000" minlength="12"/></p>
                        </label></div>
                    <br><br>
                    <label>
              <span>
                Sexo
              </span><br>

                        <p><input type="radio" name="sexo" value=""/>Masculino</p>

                        <p><input type="radio" name="sexo" value=""/>Feminino</p>
                    </label>
                </div>

                <br>

                <div class="container-conta">
                    <h1 id="QS">Dados da Conta</h1>
                    <br>

                    <div class="ddconta">
                        <span>Usuario</span><span id="spanEmail">Email</span>

                        <p>
                            <input type="text" name="user" id="userName" minlength="4" maxlength="25" required/><span
                                class="space"></span><input type="email" name="email">
                        </p>
                        <!-- TODO JS para verificar se os dois campos contém a mesma senha -->
                        <label><span>Senha</span></label><label><span id="spanSenha">Confirme a senha</span>

                        <p>
                            <input type="password" minlength="6" maxlength="20" name="senha" required><span
                                class="space"></span>
                            <input type="password" name="confirmSenha" minlength="6" maxlength="20" required/>
                        </p>
                    </label>
                    </div>
                    <input type="hidden" value="cadastro" name="veioDe">
                    <center><input type="submit" value="Enviar"></center>
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
