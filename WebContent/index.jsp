
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>

<!DOCTYPE html>
<html lang="pt-br">
<head>
  <title>Home - AngryBus - O terminal solução para seu problema no transporte publico!</title>
    <link href="css/cssDefault.css" type="text/css" rel="stylesheet">
  <meta charset="UTF-8">
</head>
<body>


  <div class="divbody">
  <%@ include file="header.jsp" %>
    
      <section>
        <article>
          <div id="conteudo">
            <div id="mapa">
              <div>
                <h2 class="titulos">Regiões com maior indice de reclamações:</h2>
              </div>
              <img alt="#" id="norte" src="img/norte.png"
              onMouseOver="this.src = 'img/nortehover.png'"  
              onMouseOut="this.src = 'img/norte.png'"  
              onClick="location = 'https://www.google.com.br/maps/place/Zona+Norte+de+S%C3%A3o+Paulo,+SP/@-23.4802776,-46.670833,15z/data=!3m1!4b1!4m2!3m1!1s0x94cef9d5f9f7f791:0xeedda6f6445061e1'"> 
              <img alt="#" id="leste" src="img/leste.png"
              onMouseOver="this.src = 'img/lestehover.png'"  
              onMouseOut="this.src = 'img/leste.png'"  
              onClick="location = 'https://www.google.com.br/maps/place/Zona+Leste+de+S%C3%A3o+Paulo,+SP/@-23.5338886,-46.503333,15z/data=!3m1!4b1!4m2!3m1!1s0x94ce60b11c2730c9:0x8f5329071a441cd'"> 
              <img alt="#" id="centro" src="img/centro.png"
              onMouseOver="this.src = 'img/centrohover.png'"  
              onMouseOut="this.src = 'img/centro.png'"  
              onClick="location = 'https://www.google.com.br/maps/place/Zona+Central+de+S%C3%A3o+Paulo,+SP/@-23.545,-46.638333,17z/data=!3m1!4b1!4m2!3m1!1s0x94ce5853d96a1441:0xebba5cad95ff31bb'"> 
              <img alt="#" id="oeste" src="img/oeste.png"
              onMouseOver="this.src = 'img/oestehover.png'"  
              onMouseOut="this.src = 'img/oeste.png'"  
              onClick="location = 'https://www.google.com.br/maps/place/Zona+Oeste+de+S%C3%A3o+Paulo,+SP/@-23.5719436,-46.700833,15z/data=!3m1!4b1!4m2!3m1!1s0x94ce570793129ed9:0xd15fc37c5a1cdb32'"> 
              <img alt="#" id="sul" src="img/sul.png"
              onMouseOver="this.src = 'img/sulhover.png'"  
              onMouseOut="this.src = 'img/sul.png'"  
              onClick="location = 'https://www.google.com.br/maps/place/Zona+Sul+de+S%C3%A3o+Paulo,+SP/@-23.6600486,-46.6587164,14z/data=!4m2!3m1!1s0x94ce5abd1c9c3ff5:0xb64ad2f9fa54c2ea'"> 
            </div>
          </div>

        </article>
      </section>
      <div id="status-transito">
        <aside>
          <h2 class="titulos">Trânsito Agora:</h2>
          <table id="tbtran">
            <tr>
              <td>Norte</td>
              <td>10Km</td>
            </tr>
            <tr>
              <td>Leste</td>
              <td>10Km</td>
            </tr>
            <tr>
              <td>Centro</td>
              <td>10Km</td>
            </tr>
            <tr>
              <td>Oeste</td>
              <td>10km</td>
            </tr>
            <tr>
              <td>Sul</td>
              <td>10Km</td>
            </tr>
          </table>
          
        </aside>

      </div>

      <div class="boxranking">
        <div class="boxempresa">
          <h1 class="tit-ranking">Ranking de Empresas mais reclamadas:</h1>
          <ul class="cada">
            <li>Consorcio Via Azul 
              <span class="nr">20</span> <img alt="#" class="emt" src="img/otimo.png">
            </li>
            <br>
            <li>Consorcio Via Azul 
              <span class="nr">20</span> <img alt="#" class="emt" src="img/otimo.png">
            </li>
            <br>	
            <li>Consorcio Via Azul 
              <span class="nr">20</span> <img alt="#" class="emt" src="img/otimo.png">
            </li>
            <br>
            <li>Consorcio Via Azul 
              <span class="nr">20</span> <img alt="#" class="emt" src="img/otimo.png">
            </li>
            <br>
            <li>Consorcio Via Azul 
              <span class="nr">20</span> <img alt="#" class="emt" src="img/otimo.png">
            </li>
          </ul>
          <div class="boxreclamacao">
            <h1 class="tit-ranking">Ranking de Empresas mais reclamadas:</h1>
            <ul class="cada">
              <li>
                <a>Via Azul</a>
                <p>Muita demora para a chegada do onibus no terminal Santo Amaro</p>
              </li>
              <br>
              <li>
                <a>Via Azul</a>
                <p>Muita demora para a chegada do onibus no terminal Santo Amaro</p>
              </li>
              <br>
              <li>
                <a>Via Azul</a>
                <p>Muita demora para a chegada do onibus no terminal Santo Amaro</p>
              </li>

            </ul>
          </div>
        </div>				
      </div>
      
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
 </body>
 </html>