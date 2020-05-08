package santo.rafael.t1projecttwo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import santo.rafael.t1projecttwo.model.Person;

import java.util.ArrayList;

@RestController
public class PersonController {
    @GetMapping("/person")
    public String getPerson(){

        Person person = new Person();

        person.setNome("Rafael");
        person.setSobrenome("Santo");
        person.setEmail("rafaeldesanto@yahoo.com.br");
        person.setDdd(51);
        person.setTelefone(991280692);

        return person.toString();
    }

    @GetMapping("/persons")
    public Object getRegistrations(){
        Person person1 = new Person();
        person1.setNome("João");
        person1.setSobrenome("Silva");
        person1.setEmail("joaozinho@gmail.com");
        person1.setDdd(51);
        person1.setTelefone(32569874);

        Person person2 = new Person();
        person2.setNome("Marcelo");
        person2.setSobrenome("Antunes");
        person2.setEmail("marca@gmail.com");
        person2.setDdd(51);
        person2.setTelefone(999832659);

        ArrayList<Person> register = new ArrayList<>();
        register.add(person1);
        register.add(person2);
        return person1.toString() + person2.toString();
    }
}