package com.yael.principal;
import javax.swing.JOptionPane;

import com.yael.logica.*;

public class Principal {
	public static void main(String[] args) {
		SistemaCalificaciones funciones = new SistemaCalificaciones();
		int seleccion;
		
		do {
			seleccion = Integer.parseInt(JOptionPane.showInputDialog("\tBienvenido al gestor de calificaciones "
					+ "\n1.Agregar Alumno"
					+"\n2.Mostrar Alumnos"
					+"\n3.Mostrar Promedio"
					+"\n4.Mostrar Aprobados"
					+"\n5.Salir"));
			
		
			
			switch(seleccion) {
			case 1:
				String nombre = JOptionPane.showInputDialog("Ingresa el nombre del alumno");
				double calificacion = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la calificacion"));
				funciones.agregarCalificacion(nombre, calificacion);
				break;
			case 2:
				funciones.mostrarAlumnos();
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "Promedio General de todos es: " + funciones.calcularPromedio());
				break;
			case 4:
				funciones.mostrarAprobados();
				break;
			case 5:
				JOptionPane.showMessageDialog(null, "Gracias por usar el gestor, hasta luego!",
						"Adios",JOptionPane.INFORMATION_MESSAGE);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Error, opcion no valida",
						"ERROR",JOptionPane.ERROR_MESSAGE);
				break;
			}
		}while(seleccion !=5);
	}
}
