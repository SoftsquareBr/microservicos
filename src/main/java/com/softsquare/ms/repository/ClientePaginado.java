package com.softsquare.ms.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.softsquare.ms.model.Cliente;

public interface ClientePaginado extends PagingAndSortingRepository<Cliente,Long> {

}
