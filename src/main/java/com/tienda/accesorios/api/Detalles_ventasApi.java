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

import com.tienda.accesorios.dao.Detalles_ventasDao;
import com.tienda.accesorios.model.Detalles_ventas;


@RestController
@RequestMapping
public class Detalles_ventasApi {

		@Autowired
		private Detalles_ventasDao Detalles_ventasDao;
		
		@PostMapping("/guardar")
		public void guardar(@RequestBody Detalles_ventas detalles_ventas) {
			Detalles_ventasDao.save(detalles_ventas);
		}
		
		@GetMapping("/listar")
		public List<Detalles_ventas> listar(){
			return Detalles_ventasDao.findAll();
		}
		
		@DeleteMapping("/eliminar/{id}")
		public void eliminar (@PathVariable ("id") Integer id) {
			Detalles_ventasDao.deleteById(id);
		}
		
		@PutMapping("/actualizar")
		public void actualizar (@RequestBody Detalles_ventas detalles_ventas) {
			Detalles_ventasDao.save(detalles_ventas);
		}
		
}
