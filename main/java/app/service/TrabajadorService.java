package app.service;

import app.dto.Trabajador;

import java.util.List;

public interface TrabajadorService {
	public List<Trabajador> listarTrabajadores();
	
//	Create
	public Trabajador guardarTrabajador(Trabajador trabajador);
	
//	Read
	public Trabajador trabajadorID(Long id);
	
//	Update
	public Trabajador actualizarTrabajador(Trabajador trabajador);
	
//	Delete
	public void eliminarTrabajador(Long id);
	
//	Listara trabajadores por el nombre
	public List<Trabajador> listarTrabajadorNomnbre(String nombre);
	
}