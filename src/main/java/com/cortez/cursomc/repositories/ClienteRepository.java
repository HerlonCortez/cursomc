package com.cortez.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cortez.cursomc.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
