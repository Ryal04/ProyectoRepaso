package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestIten {

	public static void main(String[] args) {
		Item it = new Item();
		it.setProductosActuales(20);
		it.Vender(19);
		it.Imprimir();
		it.Devolver(12);
		it.Imprimir();
	}

}
