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
import com.tienda.accesorios.dao.ProductosDao;
import com.tienda.accesorios.model.Productos;

@RestController
@RequestMapping("productos")
public class ProductosApi {

	@Autowired
	private ProductosDao ProductosDao;
	
	@PostMapping("/guardar")
	public void guardar(@RequestBody Productos productos) {
		ProductosDao.save(productos);
	}
	
	@GetMapping("/listar")
	public List<Productos> listar(){
		return ProductosDao.findAll();
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar (@PathVariable ("id") Integer id) {
		ProductosDao.deleteById(id);
	}
	
	@PutMapping("/actualizar")
	public void actualizar (@RequestBody Productos productos) {
		ProductosDao.save(productos);
	}
	
	
}
