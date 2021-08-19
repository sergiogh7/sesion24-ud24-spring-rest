package app.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="trabajadores")
public class Trabajador {
	
//	Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "trabajo")
	private String trabajo;
	
	@Column (name = "salario")
	private double salario;
	
	@Column (name = "fecha")
	private Date fecha;
	
//	Constructores
/////////////////
//	1
	public Trabajador() {
		
	}
//2
	public Trabajador(Long id, String nombre, String trabajo, Date fecha) {

		this.id = id;
		this.nombre = nombre;
		this.trabajo = trabajo;
		this.fecha = fecha;
	}
	
//	Metodos
///////////
	@Override
	public String toString() {
		return "Trabajador [id=" + id + ", nombre=" + nombre + ", trabajo=" + trabajo + ", salario=" + salario
				+ ", fecha=" + fecha + "]";
	}
	
//	Getters & Setters
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getTrabajo() {
		return trabajo;
	}
	
	public void setTrabajo(String trabajo) {
		
//		Evitar errores de escritura.
		trabajo = trabajo.toUpperCase();
		
//		Indica si esta dentro del enum.
		boolean validaTrabajo = false;
		
		for (Trabajos validTrabajo : Trabajos.values()) {
			
//			Comprueba si el trabajo es igual a uno de los del enum.
			if (validTrabajo.name().equals(trabajo)) {
				validaTrabajo = true;
				
			}
		}
		
		if (validaTrabajo) {
			this.trabajo = trabajo.toLowerCase(); //setea el parametro en minusculas
			this.setSalario(trabajo.toLowerCase());
			
		} else {
			this.trabajo = Trabajos.UNDEFINED.name(); //setea el valor UNDEFINED
			this.setSalario("undefinded");
			
		}
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(String trabajo) {
		
		if (trabajo.equals("encargado")) {
			this.salario = 20000.0;
			
		} else if (trabajo.equals("coordinador")) {
			this.salario = 30000.0;
			
		} else if (trabajo.equals("peon")) {
			this.salario = 17000.0;
			
		} else if (trabajo.equals("director")) {
			this.salario = 35000.0;
			
		} else {
			this.salario = 0.0;
			
		}
		
	}
	
	public Date getFecha() {
		return fecha;
		
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
		
	}
}