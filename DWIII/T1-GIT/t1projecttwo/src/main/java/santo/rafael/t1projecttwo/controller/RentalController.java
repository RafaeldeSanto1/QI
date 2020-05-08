package santo.rafael.t1projecttwo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import santo.rafael.t1projecttwo.model.Rental;

import java.util.ArrayList;

@RestController
public class RentalController {
    @GetMapping("/rental")
    public String getRental(){

        Rental rental = new Rental();

        rental.setNome("Marco Veiculos LTDA");
        rental.setEmail("marcoveiculossa@gmail.com");
        rental.setDdd(51);
        rental.setTelefone(33789523);

        return rental.toString();
    }

    @GetMapping("/rentals")
    public String getRegistrations(){

        Rental rental1 = new Rental();

        rental1.setNome("Marco Veiculos LTDA");
        rental1.setEmail("marcoveiculossa@gmail.com");
        rental1.setDdd(51);
        rental1.setTelefone(33789523);

        Rental rental2 = new Rental();

        rental2.setNome("Vw Veiculos Usados");
        rental2.setEmail("vwusados@gmail.com");
        rental2.setDdd(51);
        rental2.setTelefone(33789523);

        ArrayList<Rental> registerproduct = new ArrayList<>();
        registerproduct.add(rental1);
        registerproduct.add(rental2);
        return rental1.toString() + rental2.toString();
    }
}
