package santo.rafael.t1projectthree.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import santo.rafael.t1projectthree.model.Comida;

import java.util.ArrayList;

@RestController
public class ComidaControle {

    @GetMapping("/comida")

    public Object getComida(){

        Comida comida = new Comida();

        comida.setNome("Pizza");
        comida.setTipo("Massas");
        comida.setPreco(20);
        comida.setR$(" R$ ");

        return comida.toString();
    }

    @GetMapping("/comidas")

    public String getRegistrations(){
        Comida comida1 = new Comida();

        comida1.setNome("Pizza");
        comida1.setTipo("Massas");
        comida1.setPreco(20);
        comida1.setR$(" R$ ");

        Comida comida2 = new Comida();

        comida2.setNome("Calzone");
        comida2.setTipo("Massas");
        comida2.setPreco(15);
        comida2.setR$(" R$ ");


        ArrayList<Comida> register = new ArrayList<>();
        register.add(comida1);
        register.add(comida2);
        return comida1.toString() + comida2.toString();
    }
}
