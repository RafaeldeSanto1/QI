package santo.rafael.t1projectone.model;

import lombok.*;

/**
 @autor  Rafael Santo
 @since 05/05/2020
 @version 1.0
 */

@AllArgsConstructor // construtor com arg
@NoArgsConstructor // construtor sem arg
@Getter
@Setter

public class Product {

    private String nome;
    private String tipo;
    private String categoria;
    private float preco;
    private String R$;

    @Override
    public String toString() {
        return "\nProduto" +
                " \nNome: " + nome +
                "\nTipo : " + tipo +
                "\nCategoria: " + categoria +
                "\nPreço : " + R$ + preco;
    }
}
