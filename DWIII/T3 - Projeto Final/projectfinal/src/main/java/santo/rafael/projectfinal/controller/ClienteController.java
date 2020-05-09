package santo.rafael.projectfinal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import santo.rafael.projectfinal.model.ClienteEntity;
import santo.rafael.projectfinal.repository.ClienteRespository;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {  //classe controladora


    @Autowired
    private ClienteRespository clienteRespository; // ClienteRepository - crud

    // salvando diversos clientes...
    //resposta da Entidade..findAll - buscar no BD todos os Clientes
    //retorna a lista

    // Resposta da entidade

    public ResponseEntity<List<ClienteEntity>> findAll (){  // get
        return new ResponseEntity<List<ClienteEntity>>(
                (List<ClienteEntity>) this.clienteRespository.findAll(),
                new HttpHeaders(), HttpStatus.OK);//error 404
    }

    // buscar um cliente
    //  /cliente/2

    @GetMapping(path = "/{id}")
    // só um objeto
    public ResponseEntity<ClienteEntity> findById(@PathVariable("id") long id) {
        if(this.clienteRespository.findById(id).isPresent()){
            return new ResponseEntity<ClienteEntity>(
                    this.clienteRespository.findById(id).get(),
                    new HttpHeaders(),
                    HttpStatus.OK);

        }
        return new ResponseEntity<ClienteEntity>(HttpStatus.NOT_FOUND);
    }


    // criando o método para salvar...enviando um novo objeto - criando um novo

    @PostMapping
    public ResponseEntity<ClienteEntity> cadastrar (@RequestBody ClienteEntity clienteEntity) {
        return new ResponseEntity<ClienteEntity> (
                this.clienteRespository.save(clienteEntity),
                new HttpHeaders(),
                HttpStatus.CREATED
        );
    }

    // criando o método para atualizar...vai analisar se existe e depois salvar
    @PutMapping(value = "/{id}")
    public ResponseEntity<ClienteEntity> atualizar (@PathVariable("id") long id,
                                                        @RequestBody ClienteEntity clienteEntity) throws Exception {

        if(id == 0 || !this.clienteRespository.existsById(id)){  // operadores lógicos - && || !
            throw  new Exception("Código não encontrado ou inexistente!");

        }
        return new ResponseEntity<ClienteEntity>(
                this.clienteRespository.save(clienteEntity),
                new HttpHeaders(),
                HttpStatus.OK);

    }

    // criando o método para deletar...

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<ClienteEntity> deletar (@PathVariable("id") long id ){
        this.clienteRespository.deleteById(id);
        return new ResponseEntity<ClienteEntity>(new HttpHeaders(), HttpStatus.OK);
    }

}// fim da classe


// HTTP - POST, GET, PUT, DELETE
// /CLIENTES CADASTRAR - ENVIAR OS DADOS.... POST
// /CLIENTES  CONSULTAR - CONSULTAR OS DADOS ....GET
