package santo.rafael.t1projecttwo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // rotas
    @GetMapping("/")
    public String index(){
        return "Olá! Iniciando a aplicação";
    }
}
