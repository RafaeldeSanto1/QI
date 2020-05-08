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

public class Client {

    private String nome;
    private String sobrenome;
    private String email;
    private long telefone;
    private int ddd;

    @Override
    public String toString() {
        return "\nCliente" +
                "\nNome: " + nome +
                "\nEndereco : " + sobrenome +
                "\nE-mail : " + email +
                "\nTelefone : " + ddd + telefone;
    }
}
