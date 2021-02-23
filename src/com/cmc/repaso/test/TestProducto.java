package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto pt = new Producto("Roidy Alvarez", 122);
		pt.setPrecio(-500);
		 
		System.out.println("------- Datos -------");
		System.out.println("Nombre: " + pt.getNombre());
		System.out.println("Promo: " + pt.calcularPrecioPromo(66));
		
	}

}
