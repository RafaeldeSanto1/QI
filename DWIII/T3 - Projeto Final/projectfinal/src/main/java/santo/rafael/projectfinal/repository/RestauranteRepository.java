package santo.rafael.projectfinal.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import santo.rafael.projectfinal.model.RestauranteEntity;

//começa a camada de persistência JPA
@Repository
public interface RestauranteRepository extends CrudRepository<RestauranteEntity, Long> { // retorno long
}