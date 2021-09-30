package com.tienda.accesorios.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tienda.accesorios.model.Clientes;

public interface ClientesDao extends JpaRepository<Clientes, Integer> {

}
