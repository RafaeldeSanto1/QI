package santo.rafael.t1projectthree.model;

import lombok.*;

/**
 @autor  Rafael Santo
 @since 07/05/2020
 @version 1.0
 */

@AllArgsConstructor // construtor com arg
@NoArgsConstructor // construtor sem arg
@Getter
@Setter

public class Comida {

    private String nome;
    private String tipo;
    private float preco;
    private String R$;

    @Override
    public String toString() {
        return "\nComida : " +
                " \nNome: " + nome +
                "\nTipo : " + tipo +
                "\nValor : " + R$ + preco;
    }
}
