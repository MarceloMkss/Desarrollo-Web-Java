package com.mkss.formacion.aplicacion.repository;

import org.springframework.beans.factory.annotation.Autowired;

import com.mkss.formacion.aplicacion.entity.Cliente;

 // si quiero usar el otro clienteDaoJdbcTemplate, tengo que poner esa anotacion(@repository)
public class ClienteDaoJpa implements Dao<Cliente> {
	
	@Autowired
	private ClienteRepository repo;

	@Override
	public Iterable<Cliente> obtenerTodos() {
		return repo.findAll();
	}

	@Override
	public Cliente obtenerPorId(Long id) {
		return repo.findById(id).orElse(null);
	}

	@Override
	public Cliente insertar(Cliente cliente) {
		return repo.save(cliente);
	}

	@Override
	public Cliente modificar(Cliente cliente) {
		repo.save(cliente);
		return cliente;
	}

	@Override
	public void borrar(Long id) {
		repo.deleteById(id);
	}

}
