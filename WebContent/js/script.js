$(document).ready(function(){
	$("#cpf").mask("000.000.000-00");
	$("#phone").mask("(00) #0000-0000", {reverse: true});
	$("#cep").mask("00000-000");

  $("#cep").on('focusout', function(){
    var cep = this.value.replace(/[^0-9]/, "");
    var url = "http://viacep.com.br/ws/"+cep+"/json/";

    $.getJSON(url, function(dadosRetorno){
      try{
        $("#logradouro").val(dadosRetorno.logradouro);
        $("#bairro").val(dadosRetorno.bairro);
        $("#cidade").val(dadosRetorno.localidade);
        $("#estado").val(dadosRetorno.uf.toLowerCase());
        $("#numero").focus();
      }catch(ex){}
    });
  });
});
