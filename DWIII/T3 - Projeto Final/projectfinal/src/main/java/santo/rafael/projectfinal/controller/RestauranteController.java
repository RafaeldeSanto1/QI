package santo.rafael.projectfinal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import santo.rafael.projectfinal.model.RestauranteEntity;
import santo.rafael.projectfinal.repository.RestauranteRepository;

import java.util.List;

@RestController
@RequestMapping("/restaurantes")
public class  RestauranteController {  //classe controladora


    @Autowired
    private RestauranteRepository restauranteRepository; // RestauranteRepository - crud

    // salvando diversos restaurantes...
    //resposta da Entidade..findAll - buscar no BD todos os Restaurantes
    //retorna a lista

    // Resposta da entidade

    public ResponseEntity<List<RestauranteEntity>> findAll (){  // get
        return new ResponseEntity<List<RestauranteEntity>>(
                (List<RestauranteEntity>) this.restauranteRepository.findAll(),
                new HttpHeaders(), HttpStatus.OK);//error 404
    }

    // buscar um restaurante
    //  /restaurante/2

    @GetMapping(path = "/{id}")
    // só um objeto
    public ResponseEntity<RestauranteEntity> findById(@PathVariable("id") long id) {
        if(this.restauranteRepository.findById(id).isPresent()){
            return new ResponseEntity<RestauranteEntity>(
                    this.restauranteRepository.findById(id).get(),
                    new HttpHeaders(),
                    HttpStatus.OK);

        }
        return new ResponseEntity<RestauranteEntity>(HttpStatus.NOT_FOUND);
    }


    // criando o método para salvar...enviando um novo objeto - criando um novo
    //@PostMapping

    public ResponseEntity<RestauranteEntity> cadastrar (@RequestBody RestauranteEntity restauranteEntity) {
        return new ResponseEntity<RestauranteEntity> (
                this.restauranteRepository.save(restauranteEntity),
                new HttpHeaders(),
                HttpStatus.CREATED
        );

    }

    // criando o método para atualizar...vai analisar se existe e depois salvar
    @PutMapping(value = "/{id}")
    public ResponseEntity<RestauranteEntity> atualizar (@PathVariable("id") long id,
                                                        @RequestBody RestauranteEntity restauranteEntity) throws Exception {

        if(id == 0 || !this.restauranteRepository.existsById(id)){  // operadores lógicos - && || !
            throw  new Exception("Código não encontrado ou inexistente!");

        }
        return new ResponseEntity<RestauranteEntity>(
                this.restauranteRepository.save(restauranteEntity),
                new HttpHeaders(),
                HttpStatus.OK);

    }

    // criando o método para deletar...

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<RestauranteEntity> deletar (@PathVariable("id") long id ){
        this.restauranteRepository.deleteById(id);
        return new ResponseEntity<RestauranteEntity>(new HttpHeaders(), HttpStatus.OK);
    }

}// fim da classe


// HTTP - POST, GET, PUT, DELETE
// /CLIENTES CADASTRAR - ENVIAR OS DADOS.... POST
// /CLIENTES  CONSULTAR - CONSULTAR OS DADOS ....GET
