package santo.rafael.projectfinal.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import santo.rafael.projectfinal.model.ClienteEntity;

//começa a camada de persistência JPA
@Repository
public interface ClienteRespository extends CrudRepository<ClienteEntity, Long> { // retorno long
}
