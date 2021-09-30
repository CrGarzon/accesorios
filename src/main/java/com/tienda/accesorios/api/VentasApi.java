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
import com.tienda.accesorios.dao.VentasDao;

import com.tienda.accesorios.model.Ventas;

@RestController
@RequestMapping  ("ventas")
public class VentasApi {

		@Autowired
		private VentasDao VentasDao;
	
		@PostMapping("/guardar")
		public void guardar(@RequestBody Ventas ventas) {
			VentasDao.save(ventas);
		}
		
		@GetMapping("/listar")
		public List<Ventas> listar(){
			return VentasDao.findAll();
		}
		
		@DeleteMapping("/eliminar/{id}")
		public void eliminar (@PathVariable ("id") Integer id) {
			VentasDao.deleteById(id);
		}
		
		@PutMapping("/actualizar")
		public void actualizar (@RequestBody Ventas ventas) {
			VentasDao.save(ventas);
		}
		
		
		
		
}
