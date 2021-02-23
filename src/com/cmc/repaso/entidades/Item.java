package com.cmc.repaso.entidades;

public class Item {
	
	private int productosActuales;
	private int productosDevueltos;
	private int productosVendidos;

	
	
	public void setProductosActuales(int productosActuales) {
		this.productosActuales = productosActuales;
	}

	public void Vender(int CantVendidos){
		this.productosActuales = productosActuales - CantVendidos;
		this.productosVendidos = productosVendidos + CantVendidos;
		
	}
	
	public void Devolver(int CantDevueltos){
		this.productosActuales = productosActuales + CantDevueltos;
		this.productosVendidos = productosVendidos - CantDevueltos;
		this.productosDevueltos = productosDevueltos + CantDevueltos;
		
	}

	public void Imprimir(){
		System.out.println("------- Datos -------");
		System.out.println("Productos Actuales: " + productosActuales);
	    System.out.println("Productos Devueltos: " + productosDevueltos);
		System.out.println("Productos Vendidos: " + productosVendidos);
	}
	
	
}
