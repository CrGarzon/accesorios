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

import com.tienda.accesorios.dao.ProveedoresDao;
import com.tienda.accesorios.model.Proveedores;


@RestController
@RequestMapping("proveedores")
public class ProveedoresApi {
	
	@Autowired
	private ProveedoresDao ProveedoresDAo;
	
	@PostMapping("/guardar")
	public void guardar(@RequestBody Proveedores proveedores) {
		ProveedoresDAo.save(proveedores);
	}
	
	@GetMapping("/listar")
	public List<Proveedores> listar(){
		return ProveedoresDAo.findAll();
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar (@PathVariable ("id") Integer id) {
		ProveedoresDAo.deleteById(id);
	}
	
	@PutMapping("/actualizar")
	public void actualizar (@RequestBody Proveedores proveedores) {
		ProveedoresDAo.save(proveedores);
	}
}
