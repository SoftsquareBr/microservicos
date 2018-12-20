package com.softsquare.ms.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.softsquare.ms.model.Cliente;

@Service
public interface ClienteService {
	
	public Page<Cliente> listaPaginada(Pageable pageable);

}
