import br.com.fiap.beans.*;
import br.com.fiap.bo.ClienteBO;
import br.com.fiap.bo.ItinerarioBO;
import br.com.fiap.bo.LoginBO;
import br.com.fiap.bo.ReclamacaoBO;

/**
 * <i><i>
 * Created on 30/09/15...21:02
 *
 * @author vinylimaz
 * @see ;
 * @since 0.1
 */
public class testBO {
    public static void main(String[] args) {


        ClienteBO cliBO = new ClienteBO();
        ItinerarioBO itiBO = new ItinerarioBO();
        LoginBO loginBO = new LoginBO();
        ReclamacaoBO reclamBO = new ReclamacaoBO();

        Cliente cliente = new Cliente("Teste1", "21/10/1976", "teste@testando.com.br", "Testeee", "teste", 12345678910l, "46464644666", "m");
        Endereco end = new Endereco("Rua do pessoa", (short) 1222, "", 05844000l, "Limoeiro", "Sampa", "SP");
        Regiao reg = new Regiao("RegTeste", (byte) 1);
        Itinerario itinerario = new Itinerario("Iti_Teste", "1010", "695-T/10", reg);
        String lore = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris aliquet vestibulum malesuada. Vestibulum gravida, elit sit amet condimentum pretium, enim elit tempor metus, ut molestie turpis justo auctor urna. Interdum et malesuada fames ac ante ipsum primis in faucibus. Phasellus ac consectetur mauris. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Nulla ornare mauris eu nulla fermentum auctor. Vestibulum ullamcorper odio sem, sed dapibus tortor ultrices a. Pellentesque rutrum consectetur nibh ut tristique. Aliquam scelerisque ligula sed nibh fermentum, sit amet bibendum leo dapibus. Maecenas vitae augue eget neque fringilla lobortis sit amet quis dui. Phasellus non rutrum diam, ac ornare dolor. Fusce porttitor, ex et dictum ullamcorper, nunc eros gravida velit, quis molestie nibh neque vel tellus. Sed at augue orci. Nulla nec diam mollis, fermentum ante sed, scelerisque erat. Duis tincidunt ipsum at neque malesuada, eget lobortis lorem dictum. Aliquam erat volutpat.";

        Reclamacao reclam = new Reclamacao("25/09/2015", 2121, "T", (byte) 1, "23/09/2015", lore, cliente);

        cliBO.inserirCliente(cliente, end, tel);


    }

}
