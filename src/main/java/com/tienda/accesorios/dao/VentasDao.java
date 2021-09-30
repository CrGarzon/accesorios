package com.tienda.accesorios.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tienda.accesorios.model.Ventas;

public interface VentasDao extends JpaRepository<Ventas, Integer> {

}
