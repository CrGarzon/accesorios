package com.tienda.accesorios.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tienda.accesorios.model.Productos;

public interface ProductosDao extends JpaRepository<Productos, Integer> {

}
