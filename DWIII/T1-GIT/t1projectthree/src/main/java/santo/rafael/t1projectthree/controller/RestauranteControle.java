package santo.rafael.t1projectthree.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import santo.rafael.t1projectthree.model.Restaurante;

import java.util.ArrayList;

@RestController
public class RestauranteControle {

    @GetMapping("/restaurante")

    public Object getRestaurante(){

        Restaurante restaurante = new Restaurante();

        restaurante.setNome("Restaurante do Zé");
        restaurante.setEmail("resze@hotmail.com");
        restaurante.setEndereco("Rua Alameda B");
        restaurante.setNumero(122);
        restaurante.setDdd(51);
        restaurante.setTelefone(99853625);

        return restaurante.toString();
    }

    @GetMapping("/restaurantes")

    public String getRegistrations(){

        Restaurante restaurante1 = new Restaurante();

        restaurante1.setNome("Pizzaria Mama Mia");
        restaurante1.setEmail("mamamia@gmail.com");
        restaurante1.setEndereco("Rua Antônio Prado");
        restaurante1.setNumero(1250);
        restaurante1.setDdd(51);
        restaurante1.setTelefone(33562894);

        Restaurante restaurante2 = new Restaurante();

        restaurante2.setNome("Restaurante Dom Macedo");
        restaurante2.setEmail("macedao@gmail.com");
        restaurante2.setEndereco("Rua Antônio Prado");
        restaurante2.setNumero(932);
        restaurante2.setDdd(51);
        restaurante2.setTelefone(32526395);

        ArrayList<Restaurante> register = new ArrayList<>();
        register.add(restaurante1);
        register.add(restaurante2);
        return restaurante1.toString() + restaurante2.toString();
    }
}
