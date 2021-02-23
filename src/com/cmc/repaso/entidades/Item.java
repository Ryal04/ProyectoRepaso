package com.cmc.repaso.entidades;

public class Item {
	
	private String nombre;
	private int productosActuales;
	private int productosDevueltos;
	private int productosVendidos;

	public void Imprimir(){
		
		System.out.println("------- Datos -------");
		System.out.println("Nombre: " + nombre);
		System.out.println("Productos Actuales: " + productosActuales);
	    System.out.println("Productos Devueltos: " + productosDevueltos);
		System.out.println("Productos Vendidos: " + productosVendidos);

	}
}
