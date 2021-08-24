package app.dao;

import app.dto.Fabricante;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Joel
 */
public interface IFabricanteDAO extends JpaRepository<Fabricante, Integer> {

}
