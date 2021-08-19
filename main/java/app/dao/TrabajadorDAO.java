package app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import app.dto.Trabajador;

// Listara trabajadores por el nombre
public interface TrabajadorDAO extends JpaRepository<Trabajador, Long>{
	public List<Trabajador> findByNombre(String nombre);
	
}