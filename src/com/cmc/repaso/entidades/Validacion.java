package com.cmc.repaso.entidades;

public class Validacion {
    
	
	public Boolean validarMonto(double monto){
	   boolean estado = false;
			if(monto > 0){
				estado = true;
			}
		return estado;
	}
	
	
	
	
}
