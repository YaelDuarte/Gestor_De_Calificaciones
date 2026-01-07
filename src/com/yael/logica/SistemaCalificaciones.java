package com.yael.logica;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.yael.alumno.*;

public class SistemaCalificaciones {
	
	// Creacion de la array list global para la clase
	private ArrayList<AlumnoCreacion> alumnos;
	public SistemaCalificaciones() {
		alumnos = new ArrayList<>();
	}
	
	// Metodo para agregar calificaciones 
	public void agregarCalificacion(String nombre,double calificacion) {
		alumnos.add(new AlumnoCreacion(nombre,calificacion));
	}
	
	// Muestra los alumnos registrados, verifica que no este vacia.
	public void mostrarAlumnos() {
		if(alumnos.isEmpty()) {
			JOptionPane.showMessageDialog(null, "No hay alumnos registrados");
			return;
		}
		
		// Si no esta vacia, itera para mostrar a los alumnos registrados
		for(int i=0;i<alumnos.size();i++) {
			JOptionPane.showMessageDialog(null, alumnos.get(i));
		}
	}
	
	// Se calcula el promedio 
	public double calcularPromedio() {
		double suma = 0;
		if(alumnos.isEmpty()) {
			JOptionPane.showMessageDialog(null, "No hay alumnos registrados");
			return 0;
		}else {
			for(AlumnoCreacion i: alumnos) {
				suma += i.getCalifacion();
			}
		}
		return suma / alumnos.size();
	}
	
	
	public void mostrarAprobados() {
		for(AlumnoCreacion i : alumnos) {
			
			if(i.getCalifacion()>=6) {
				JOptionPane.showMessageDialog(null, "Aprobados: "+" \n "+i);
			}
		}
	}
	
	
}
