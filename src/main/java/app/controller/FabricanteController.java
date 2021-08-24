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

import app.dto.Fabricante;
import app.service.FabricanteServiceImpl;

@RestController
@RequestMapping("/api")
public class FabricanteController {
	
	@Autowired
	FabricanteServiceImpl fabricanteServImpl;
	
	@GetMapping("/fabricantes")
	public List<Fabricante> listarFabricantes() {
		return fabricanteServImpl.listarFabricantes();
	}
	
	@PostMapping("/fabricantes")
	public Fabricante guardarFabricantes(@RequestBody Fabricante fabricante) {
		return fabricanteServImpl.guardarFabricante(fabricante);
	}
	
	@GetMapping("/fabricantes/{id}")
	public Fabricante fabricanteXID(@PathVariable(name="id") Integer id) {
		Fabricante fabricante_xid = new Fabricante();
		fabricante_xid = fabricanteServImpl.fabricanteXID(id);
		
		return fabricante_xid;
	}
	
	@PutMapping("/fabricantes/{id}")
	public Fabricante actualizarFabricante(@PathVariable(name="id") Integer id, @RequestBody Fabricante fabricante) {
		
		Fabricante fabricante_seleccionado = new Fabricante();
		Fabricante fabricante_actualizado = new Fabricante();
		
		fabricante_seleccionado = fabricanteServImpl.fabricanteXID(id);
		
		fabricante_seleccionado.setNombre(fabricante.getNombre());
		
		fabricante_actualizado = fabricanteServImpl.actualizarFabricante(fabricante_seleccionado);
		
		return fabricante_actualizado;
	}
	
	@DeleteMapping("/fabricantes/{id}")
	public void eliminarFabricantes(@PathVariable(name="id") Integer id) {
		fabricanteServImpl.eliminarFabricante(id);
	}
}
