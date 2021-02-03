package com.mkss.formacion.aplicacion.repository;

public interface Dao<T> {

	Iterable<T> obtenerTodos();

	T obtenerPorId(Long id);

	T insertar(T t);

	T modificar(T t);

	void borrar(Long id);

}
