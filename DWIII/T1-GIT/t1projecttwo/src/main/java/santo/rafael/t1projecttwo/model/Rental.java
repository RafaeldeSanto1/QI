package santo.rafael.t1projecttwo.model;

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

public class Rental {

    private String nome;
    private String email;
    private int ddd,telefone;

    @Override
    public String toString() {
        return "\nRevenda" +
                " \nNome: " + nome +
                "\nE-mail : " + email +
                "\nTelefone : " + ddd + telefone;
    }
}
