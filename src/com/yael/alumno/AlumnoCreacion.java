package com.yael.alumno;

public class AlumnoCreacion {
	private String nombre;
	private double califacion;
	
	public AlumnoCreacion(String nombre,double calificacion) {
		this.nombre = nombre;
		setCalifacion(calificacion);
	}

	// Getter y Setter para nombre
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	// Getter y Setter para calificacion
	public double getCalifacion() {
		return califacion;
	}

	public void setCalifacion(double califacion) {
		if(califacion >= 0 && califacion <=10) {
			this.califacion = califacion;
		}
		
	}
	
	public String toString() {
		return "Alumno: "+ nombre +" \nSu calificacion es de: "+ califacion;
	}
	
	
}
