package com.softsquare.ms.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.softsquare.ms.model.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Long>{
	
	List<Cliente> findByNome(String nome);

}
