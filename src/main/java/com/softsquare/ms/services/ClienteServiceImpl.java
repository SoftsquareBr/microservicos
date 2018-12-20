package com.softsquare.ms.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.softsquare.ms.model.Cliente;
import com.softsquare.ms.repository.ClientePaginado;

@Service

public class ClienteServiceImpl implements ClienteService {
	
	@Autowired
	private ClientePaginado clientePaginado;

	@Override
	public Page<Cliente> listaPaginada(Pageable pageable) {
		System.out.println(clientePaginado);
		return clientePaginado.findAll(pageable);
	}
	
}
