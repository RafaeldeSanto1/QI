package santo.rafael.t1projectone.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import santo.rafael.t1projectone.model.Client;

import java.util.ArrayList;

@RestController
public class ClientController {

    @GetMapping("/client")
    public String getClient(){

        Client client = new Client();

        client.setNome("Rafael");
        client.setSobrenome("Santo");
        client.setEmail("rafaeldesanto@yahoo.com.br");
        client.setDdd(51);
        client.setTelefone(991280692);

        return client.toString();
    }

    @GetMapping("/clients")
    public String getRegistrations(){
        Client client1 = new Client();
        client1.setNome("Rafael");
        client1.setSobrenome("Santo");
        client1.setEmail("rafaeldesanto@yahoo.com.br");
        client1.setDdd(51);
        client1.setTelefone(991280692);

        Client client2 = new Client();
        client2.setNome("Marcos");
        client2.setSobrenome("Silva");
        client2.setEmail("marcola@gmail.com");
        client2.setDdd(54);
        client2.setTelefone(984523698);

        ArrayList<Client> register = new ArrayList<>();
        register.add(client1);
        register.add(client2);
        return client1.toString() + client2.toString();
    }
}
