package com.tienda.accesorios.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tienda.accesorios.model.Proveedores;

public interface ProveedoresDao extends JpaRepository<Proveedores, Integer> {

}
