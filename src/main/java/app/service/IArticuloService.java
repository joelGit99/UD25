package app.service;

import java.util.List;

import app.dto.Articulo;

/**
 * @author Joel
 */
public interface IArticuloService {
	
	// Métodos del CRUD
		public List<Articulo> listarArticulos(); // ListarAll
		
		public Articulo guardarArticulo(Articulo articulo); // Guardar un articulo CREATE
		
		public Articulo articuloXID(Integer id); // Leer datos de un articulo READ
		
		public Articulo actualizarArticulo(Articulo articulo); // Actualizar articulo UPDATE
		
		public void eliminarArticulo(Integer id); // Eliminar articulo DELETE
}
