package santo.rafael.projectfinal.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.*;

/**

 *TRABALHO FINAL DESENVOLVIMENTO WEB III QI - EUGÊNIO ESCALANTE E RAFAEL SANTO

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
@Table(name = "restaurante") //javax.persistence
public class RestauranteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_restaurante")
    private long id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "endereco")
    private String endereco;
    @Column(name = "numero")
    private int numero;
    @Column(name = "email")
    private String email;
    @Column(name = "ddd")
    private int ddd;
    @Column(name = "Telefone")
    private long telefone;

    @Override
    public String toString() {
        return "\nRestaurante" +
                " \nNome: " + nome +
                "\nEndereco : " + endereco +
                "\nNumero: " + numero +
                "\nE-mail : " + email +
                "\nTelefone : " + ddd + telefone;
    }
}
