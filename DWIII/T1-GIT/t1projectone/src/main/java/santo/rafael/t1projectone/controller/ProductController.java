package santo.rafael.t1projectone.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import santo.rafael.t1projectone.model.Product;

import java.util.ArrayList;

@RestController
public class ProductController {
    @GetMapping("/product")
    public String getProduct(){

        Product product = new Product();

        product.setNome("Brahma");
        product.setTipo("Cerveja");
        product.setCategoria("Bebidas");
        product.setR$(" R$ ");
        product.setPreco(3);

        return product.toString();
    }

    @GetMapping("/products")
    public String getRegistrations(){

        Product product1 = new Product();

        product1.setNome("Skol Lata");
        product1.setTipo("Cerveja");
        product1.setCategoria("Bebidas");
        product1.setR$(" R$ ");
        product1.setPreco((float) 3.5);

        Product product2 = new Product();

        product2.setNome("Brahma");
        product2.setTipo("Cerveja");
        product2.setCategoria("Bebidas");
        product2.setR$(" R$ ");
        product2.setPreco(3);

        ArrayList<Product> registerproduct = new ArrayList<>();
        registerproduct.add(product1);
        registerproduct.add(product2);
        return product1.toString() + product2.toString();
    }

}