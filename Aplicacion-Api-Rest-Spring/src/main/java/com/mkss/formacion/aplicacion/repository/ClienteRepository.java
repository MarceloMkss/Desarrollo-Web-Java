package com.mkss.formacion.aplicacion.repository;

import org.springframework.data.repository.CrudRepository;
import com.mkss.formacion.aplicacion.entity.Cliente;


// aqui utilizare el Dao CrudRepository que tienen en spring con todos los metodos
// eso me quita de hacer el dao, eso solo en JPA, creo un ClienteRepository
// que extends del CrudRepository de spring...
public interface ClienteRepository extends CrudRepository<Cliente, Long> {}
