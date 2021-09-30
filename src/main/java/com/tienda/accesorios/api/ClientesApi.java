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
import com.tienda.accesorios.dao.ClientesDao;
import com.tienda.accesorios.model.Clientes;


@RestController
@RequestMapping ("clientes")
public class ClientesApi {
	
	@Autowired
	private ClientesDao ClientesDao;

	@PostMapping("/guardar")
	public void guardar(@RequestBody Clientes clientes) {
		ClientesDao.save(clientes);
	}
	
	@GetMapping("/listar")
	public List<Clientes> listar(){
		return ClientesDao.findAll();
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar (@PathVariable ("id") Integer id) {
		ClientesDao.deleteById(id);
	}
	
	@PutMapping("/actualizar")
	public void actualizar (@RequestBody Clientes clientes) {
		ClientesDao.save(clientes);
	}
	
}
