package com.tienda.accesorios.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tienda.accesorios.model.Usuarios;

public interface UsuariosDao extends JpaRepository<Usuarios, Integer> {

}
