package app.dao;

import app.dto.Articulo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 
 * @author Joel
 *
 */
public interface IArticuloDAO extends JpaRepository<Articulo, Integer> {
	
}
