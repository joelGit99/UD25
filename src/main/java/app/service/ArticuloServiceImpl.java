package app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.dao.IArticuloDAO;
import app.dto.Articulo;

@Service
public class ArticuloServiceImpl implements IArticuloService {
	
	@Autowired
	IArticuloDAO iArticuloDAO;
	
	@Override
	public List<Articulo> listarArticulos() {
		return iArticuloDAO.findAll();
	}

	@Override
	public Articulo guardarArticulo(Articulo articulo) {
		return iArticuloDAO.save(articulo);
	}

	@Override
	public Articulo articuloXID(Integer id) {
		return iArticuloDAO.findById(id).get();
	}

	@Override
	public Articulo actualizarArticulo(Articulo articulo) {
		return iArticuloDAO.save(articulo);
	}

	@Override
	public void eliminarArticulo(Integer id) {
		iArticuloDAO.deleteById(id);
	}

}
