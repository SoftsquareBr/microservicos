package com.softsquare.ms.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.softsquare.ms.model.Cliente;
import com.softsquare.ms.repository.ClienteRepository;
import com.softsquare.ms.services.ClienteService;

@RestController
public class ClienteController {

	@Autowired
	private ClienteRepository repository;

	@RequestMapping("/save")
	public String process() {
		repository.save(new Cliente("Registro 1"));
		repository.save(new Cliente("Registro 2"));
		repository.save(new Cliente("Registro 3"));
		repository.save(new Cliente("Registro 4"));
		repository.save(new Cliente("Registro 5"));
		repository.save(new Cliente("Registro 6"));
		repository.save(new Cliente("Registro 7"));
		repository.save(new Cliente("Registro 8"));
		repository.save(new Cliente("Registro 9"));
		repository.save(new Cliente("Registro 10"));
		return "Done";

	}
	
	@RequestMapping("findall")
	public List<Cliente> findAll() {
		return (List<Cliente>) repository.findAll();
	}
	
	
	@RequestMapping("findbyid")
	public Cliente find(@RequestParam("id") Long id) {
		return repository.findOne(id);
	}
	
	@Autowired
	private ClienteService clienteService;
	
	@RequestMapping("listapaginada")
	public Page<Cliente> listaPaginada(Pageable pageable) {
		Page<Cliente> clientes = clienteService.listaPaginada(pageable);
		return clientes;
	}
}