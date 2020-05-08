package santo.rafael.t1projectthree.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControle {
    // rotas
    @GetMapping("/")
    public String index(){
        return "Olá! Iniciando a aplicação";
    }
}
