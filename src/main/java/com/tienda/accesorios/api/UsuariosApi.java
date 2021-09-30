package com.tienda.accesorios.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tienda.accesorios.dao.UsuariosDao;
import com.tienda.accesorios.model.Usuarios;

@RestController
@RequestMapping ("usuarios")
public class UsuariosApi {

	@Autowired
	private UsuariosDao UsuariosDao;
	
	@PostMapping("/guardar")
	public void guardar(@RequestBody Usuarios usuarios) {
		UsuariosDao.save(usuarios);
	}
	
	@GetMapping("/listar")
	public List<Usuarios> listar(){
		return UsuariosDao.findAll();
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar (@PathVariable ("id") Integer id) {
		UsuariosDao.deleteById(id);
	}
	
	@PutMapping("/actualizar")
	public void actualizar (@RequestBody Usuarios usuarios) {
		UsuariosDao.save(usuarios);
	}
	
}
