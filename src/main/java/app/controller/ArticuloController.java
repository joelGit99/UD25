package app.controller;

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

import app.dto.Articulo;
import app.service.ArticuloServiceImpl;

@RestController
@RequestMapping("/api")
public class ArticuloController {
	
	@Autowired
	ArticuloServiceImpl articuloServImpl;
	
	@GetMapping("/articulos")
	public List<Articulo> listarArticulos() {
		return articuloServImpl.listarArticulos();
	}
	
	@PostMapping("/articulos")
	public Articulo guardarArticulos(@RequestBody Articulo articulo) {
		return articuloServImpl.guardarArticulo(articulo);
	}
	
	@GetMapping("/articulos/{id}")
	public Articulo articuloXID(@PathVariable(name="id") Integer id) {
		return articuloServImpl.articuloXID(id);
	}
	
	@PutMapping("/articulos/{id}")
	public Articulo actualizarArticulo(@PathVariable(name = "id") Integer id, Articulo articulo) {
		Articulo articulo_seleccionado = new Articulo();
		Articulo articulo_actualizado = new Articulo();
		
		articulo_seleccionado = articuloServImpl.articuloXID(id);
		articulo_seleccionado.setFabricante(articulo.getFabricante());
		articulo_seleccionado.setNombre(articulo.getNombre());
		articulo_seleccionado.setPrecio(articulo.getPrecio());
		
		articulo_actualizado = articuloServImpl.actualizarArticulo(articulo_seleccionado);
		
		System.out.println(articulo_actualizado);
		return articulo_actualizado;
	}
	
	@DeleteMapping("/articulos/{id}")
	public void eliminarArticulos(@PathVariable(name="id") Integer id) {
		articuloServImpl.eliminarArticulo(id);
	}
}
