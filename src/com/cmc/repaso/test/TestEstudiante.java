package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		Estudiante es = new Estudiante("Diana");
		
		es.calificar(9);
		System.out.println("------- Datos -------");
		System.out.println("Nombre: " + es.getNombre());
		System.out.println("Nota: " + es.getNota());
		System.out.println("Resultado: " + es.getResultado());
	}

}
