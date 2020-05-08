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
public class Person {

    private String nome;
    private String sobrenome;
    private String email;
    private int ddd;
    private long telefone;

    @Override
    public String toString() {
        return "\nNome : " + nome +
                "\nSobenome : " + sobrenome +
                "\nE-mail : " + email +
                "\nTelefone : " + ddd + telefone;
    }
}
