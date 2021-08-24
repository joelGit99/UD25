package app.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="articulos")
public class Articulo {
	
	// Atributos de la entidad articulos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name="nombre")
	private String nombre;
	@Column(name="precio")
	private int precio;
	
	@ManyToOne
	@JoinColumn(name="fabricante")
	private Fabricante fabricante;
	
	// Constructores
	public Articulo() {
		
	}
	
	/**
	 * 
	 * @param id
	 * @param nombre
	 * @param precio
	 * @param fabricante
	 */
	public Articulo(int id, String nombre, int precio, Fabricante fabricante) {
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.fabricante = fabricante;
	}
	
	// Getters y setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	@Override
	public String toString() {
		return "Articulo [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", fabricante=" + fabricante + "]";
	}
	
}
