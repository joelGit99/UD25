package app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.dao.IFabricanteDAO;
import app.dto.Fabricante;

@Service
public class FabricanteServiceImpl implements IFabricanteService {
	
	@Autowired
	IFabricanteDAO iFabricanteDAO;
	
	@Override
	public List<Fabricante> listarFabricantes() {
		return iFabricanteDAO.findAll();
	}

	@Override
	public Fabricante guardarFabricante(Fabricante fabricante) {
		return iFabricanteDAO.save(fabricante);
	}

	@Override
	public Fabricante fabricanteXID(Integer id) {
		return iFabricanteDAO.findById(id).get();
	}

	@Override
	public Fabricante actualizarFabricante(Fabricante fabricante) {
		return iFabricanteDAO.save(fabricante);
	}

	@Override
	public void eliminarFabricante(Integer id) {
		iFabricanteDAO.deleteById(id);
	}

}
