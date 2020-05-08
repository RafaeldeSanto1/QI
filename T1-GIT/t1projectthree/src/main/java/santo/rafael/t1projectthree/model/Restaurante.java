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

public class Restaurante {

    private String nome;
    private String endereco;
    private int numero;
    private String email;
    private int ddd;
    private long telefone;

    @Override
    public String toString() {
        return "\nRestaurante : " +
                " \nNome: " + nome +
                "\nEndereco : " + endereco +
                "\nNumero: " + numero +
                "\nE-mail : " + email +
                "\nTelefone : " + ddd + telefone;
    }
}
