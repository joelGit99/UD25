package app.service;

import java.util.List;
import app.dto.Fabricante;

/**
 * 
 * @author Joel
 *
 */
public interface IFabricanteService {
	
	// Métodos del CRUD
	public List<Fabricante> listarFabricantes(); // ListarAll
	
	public Fabricante guardarFabricante(Fabricante fabricante); // Guardar un fabricante CREATE
	
	public Fabricante fabricanteXID(Integer id); // Leer datos de un fabricante READ
	
	public Fabricante actualizarFabricante(Fabricante fabricante); // Actualizar fabricante UPDATE
	
	public void eliminarFabricante(Integer id); // Eliminar fabricante DELETE
}
