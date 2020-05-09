package santo.rafael.projectfinal.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * TRABALHO FINAL DESENVOLVIMENTO WEB III QI - EUGÊNIO ESCALANTE E RAFAEL SANTO

 @autor  Rafael Santo
 @since 08/05/2020
 @version 1.0

 */

@Component
@AllArgsConstructor // construtor com arg
@NoArgsConstructor // construtor sem arg
@Getter
@Setter

// JPA - Java Persistence API
@Entity
@Table(name = "cliente") //javax.persistence

public class ClienteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private long id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "sobrenome")
    private String sobrenome;
    @Column(name = "email")
    private String email;
    @Column(name = "ddd")
    private int ddd;
    @Column(name = "telefone")
    private long telefone;

    @Override
    public String toString() {
        return "\nNome : " + nome +
                "\nSobenome : " + sobrenome +
                "\nE-mail : " + email +
                "\nTelefone : " + ddd + telefone;
    }
}//fim

// Mapeamento de JPA
// Como se fosse o DAO no PHP..
// aqui ele indica onde cada dado irá entrar...
